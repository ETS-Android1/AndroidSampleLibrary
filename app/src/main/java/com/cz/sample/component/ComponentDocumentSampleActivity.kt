package com.cz.sample.component

import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.cz.android.sample.api.Register
import com.cz.android.sample.library.component.document.SampleDocument
import com.cz.sample.R

/**
 * This sample shows how to related to your sample document
 * Here are three different cases:
 *
 * <pre>
 * 1. @SampleDocument("DocumentSample.md") It will search the document from source code which is in current file path.
 * For example:
 * If your just write a document among the code file list.
 * //A.java B.java xxx.md.
 * You could use this Annotation:
 * @SampleDocument("xxx.md")
 *
 * and your class package was:com.cz.sample.component. I will use the plugin to put all the source codes into the assets and search the document from the AssetManager.
 *
 * 2. @SampleDocument("http://xxx.DocumentSample.md") It will use this url to load the document
 *
 * 3. @SampleDocument("assets://DocumentSample.md") It will check the file from assets
 * </pre>
 *
 * @see SampleDocument This annotation will add a additional panel to your sample.
 */
@SampleDocument("readme-cn.md")
@Register(title = "文档组件", desc = "展示如何为演示关联文档", path = "组件示例")
class ComponentDocumentSampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component_document_sample)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

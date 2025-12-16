package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class ro {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        c34 iv6Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                iv6Var = new iv6(clipData, 3);
            } else {
                d34 d34Var = new d34();
                d34Var.b = clipData;
                d34Var.c = 3;
                iv6Var = d34Var;
            }
            hfh.j(textView, iv6Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        c34 iv6Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            iv6Var = new iv6(clipData, 3);
        } else {
            d34 d34Var = new d34();
            d34Var.b = clipData;
            d34Var.c = 3;
            iv6Var = d34Var;
        }
        hfh.j(view, iv6Var.build());
        return true;
    }
}

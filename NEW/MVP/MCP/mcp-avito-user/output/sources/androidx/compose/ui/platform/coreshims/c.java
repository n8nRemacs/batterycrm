package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RestrictTo;
import j.X;

/* compiled from: ViewCompatShims.java */
@RestrictTo
/* loaded from: classes.dex */
public class c {

    /* compiled from: ViewCompatShims.java */
    @X
    public static class a {
    }

    /* compiled from: ViewCompatShims.java */
    @X
    public static class b {
        public static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* compiled from: ViewCompatShims.java */
    @X
    /* renamed from: androidx.compose.ui.platform.coreshims.c$c, reason: collision with other inner class name */
    public static class C1678c {
        public static void a(View view) {
            view.setImportantForContentCapture(1);
        }
    }

    public static androidx.compose.ui.platform.coreshims.b a(View view) {
        ContentCaptureSession contentCaptureSessionA;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = b.a(view)) == null) {
            return null;
        }
        return new androidx.compose.ui.platform.coreshims.b(contentCaptureSessionA, view);
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C1678c.a(view);
        }
    }
}

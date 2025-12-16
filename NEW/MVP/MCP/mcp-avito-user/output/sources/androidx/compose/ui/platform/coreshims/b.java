package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.graphics.layer.j;
import j.X;

/* compiled from: ContentCaptureSessionCompat.java */
@RestrictTo
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f41424a;

    /* renamed from: b, reason: collision with root package name */
    public final View f41425b;

    /* compiled from: ContentCaptureSessionCompat.java */
    @X
    public static class a {
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    @X
    /* renamed from: androidx.compose.ui.platform.coreshims.b$b, reason: collision with other inner class name */
    public static class C1677b {
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j12) {
            return contentCaptureSession.newAutofillId(autofillId, j12);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j12) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j12);
        }

        public static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
            contentCaptureSession.notifyViewTextChanged(autofillId, str);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    @X
    public static class c {
    }

    @X
    public b(ContentCaptureSession contentCaptureSession, View view) {
        this.f41424a = contentCaptureSession;
        this.f41425b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            C1677b.f(j.d(this.f41424a), this.f41425b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j12) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1677b.a(j.d(this.f41424a), this.f41425b.getAutofillId(), j12);
        }
        return null;
    }

    public final d c(AutofillId autofillId, long j12) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new d(C1677b.b(j.d(this.f41424a), autofillId, j12));
        }
        return null;
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1677b.c(j.d(this.f41424a), viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1677b.d(j.d(this.f41424a), autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1677b.e(j.d(this.f41424a), autofillId, str);
        }
    }
}

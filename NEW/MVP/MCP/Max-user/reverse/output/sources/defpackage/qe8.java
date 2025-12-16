package defpackage;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class qe8 extends bdf {
    public final /* synthetic */ rac X;
    public final /* synthetic */ oac Y;
    public final /* synthetic */ rf7 Z;
    public final /* synthetic */ CancellationSignal s0;
    public final /* synthetic */ re8 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe8(re8 re8Var, hj0 hj0Var, rac racVar, oac oacVar, rac racVar2, oac oacVar2, rf7 rf7Var, CancellationSignal cancellationSignal) {
        super(hj0Var, racVar, oacVar, "LocalThumbnailBitmapSdk29Producer");
        this.t0 = re8Var;
        this.X = racVar2;
        this.Y = oacVar2;
        this.Z = rf7Var;
        this.s0 = cancellationSignal;
    }

    @Override // defpackage.bdf
    public final void b(Object obj) {
        vc3.P((vc3) obj);
    }

    @Override // defpackage.bdf
    public final Map c(Object obj) {
        return bh7.a("createdThumbnail", String.valueOf(((vc3) obj) != null));
    }

    @Override // defpackage.bdf
    public final Object d() throws IOException {
        String strA;
        Bitmap bitmapLoadThumbnail;
        ContentResolver contentResolver = this.t0.c;
        rf7 rf7Var = this.Z;
        ynd yndVar = rf7Var.h;
        int i = yndVar != null ? yndVar.a : 2048;
        Uri uri = rf7Var.b;
        Size size = new Size(i, yndVar != null ? yndVar.b : 2048);
        try {
            strA = mwg.a(contentResolver, uri);
        } catch (IllegalArgumentException unused) {
            strA = null;
        }
        CancellationSignal cancellationSignal = this.s0;
        if (strA != null) {
            String strA2 = zb9.a(strA);
            bitmapLoadThumbnail = strA2 != null ? dnf.r(strA2, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(strA), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(strA), size, cancellationSignal);
        } else {
            bitmapLoadThumbnail = null;
        }
        if (bitmapLoadThumbnail == null) {
            bitmapLoadThumbnail = contentResolver.loadThumbnail(uri, size, cancellationSignal);
        }
        if (bitmapLoadThumbnail == null) {
            return null;
        }
        CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(bitmapLoadThumbnail, v1a.C(), fh7.d, 0);
        mk0 mk0Var = (mk0) this.Y;
        mk0Var.putExtra(HasExtraData.KEY_IMAGE_FORMAT, "thumbnail");
        closeableStaticBitmapOf.putExtras(mk0Var.X);
        return vc3.j0(closeableStaticBitmapOf);
    }

    @Override // defpackage.bdf
    public final void e() {
        super.e();
        this.s0.cancel();
    }

    @Override // defpackage.bdf
    public final void f(Exception exc) {
        super.f(exc);
        rac racVar = this.X;
        oac oacVar = this.Y;
        racVar.e(oacVar, "LocalThumbnailBitmapSdk29Producer", false);
        ((mk0) oacVar).h("local", "thumbnail_bitmap");
    }

    @Override // defpackage.bdf
    public final void g(Object obj) {
        vc3 vc3Var = (vc3) obj;
        super.g(vc3Var);
        boolean z = vc3Var != null;
        rac racVar = this.X;
        oac oacVar = this.Y;
        racVar.e(oacVar, "LocalThumbnailBitmapSdk29Producer", z);
        ((mk0) oacVar).h("local", "thumbnail_bitmap");
    }
}

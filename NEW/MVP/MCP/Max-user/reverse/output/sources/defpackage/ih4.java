package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ih4 extends ws4 {
    public final oac c;
    public final rac d;
    public final ie7 e;
    public boolean f;
    public final gu7 g;
    public int h;
    public final /* synthetic */ jh4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih4(jh4 jh4Var, hj0 hj0Var, oac oacVar, int i) {
        super(hj0Var);
        this.i = jh4Var;
        this.c = oacVar;
        mk0 mk0Var = (mk0) oacVar;
        this.d = mk0Var.c;
        this.e = mk0Var.a.g;
        this.g = new gu7(jh4Var.b, new pz1(this, jh4Var, i, 1));
        mk0Var.a(new hh4(0, this));
    }

    @Override // defpackage.ws4, defpackage.hj0
    public final void d() {
        q(true);
        this.b.c();
    }

    @Override // defpackage.ws4, defpackage.hj0
    public final void f(Throwable th) {
        p(th);
    }

    @Override // defpackage.hj0
    public final void h(int i, Object obj) {
        ce5 ce5Var = (ce5) obj;
        ml6.i();
        boolean zA = hj0.a(i);
        oac oacVar = this.c;
        if (zA) {
            if (ce5Var == null) {
                mk0 mk0Var = (mk0) oacVar;
                fni.a(mk0Var.X.get("cached_value_found"), Boolean.TRUE);
                mk0Var.v0.w.getClass();
                p(new ExceptionWithNoStacktrace("Encoded image is null."));
                return;
            }
            if (!ce5Var.Z()) {
                p(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                return;
            }
        }
        if (s(ce5Var, i)) {
            boolean zL = hj0.l(i, 4);
            if (zA || zL || ((mk0) oacVar).f()) {
                this.g.c();
            }
        }
    }

    @Override // defpackage.ws4, defpackage.hj0
    public final void j(float f) {
        super.j(f * 0.99f);
    }

    public final bh7 m(sc3 sc3Var, long j, ksc kscVar, boolean z, String str, String str2, String str3, String str4) {
        Map extras;
        Object obj;
        String string = null;
        if (!this.d.i(this.c, "DecodeProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(j);
        String strValueOf2 = String.valueOf(((fh7) kscVar).b);
        String strValueOf3 = String.valueOf(z);
        if (sc3Var != null && (extras = sc3Var.getExtras()) != null && (obj = extras.get(HasExtraData.KEY_NON_FATAL_DECODE_ERROR)) != null) {
            string = obj.toString();
        }
        if (!(sc3Var instanceof CloseableStaticBitmap)) {
            String str5 = string;
            HashMap map = new HashMap(7);
            map.put("queueTime", strValueOf);
            map.put("hasGoodQuality", strValueOf2);
            map.put("isFinal", strValueOf3);
            map.put("encodedImageSize", str2);
            map.put("imageFormat", str);
            map.put("requestedImageSize", str3);
            map.put("sampleSize", str4);
            if (str5 != null) {
                map.put(HasExtraData.KEY_NON_FATAL_DECODE_ERROR, str5);
            }
            return new bh7(map);
        }
        Bitmap underlyingBitmap = ((CloseableStaticBitmap) sc3Var).getUnderlyingBitmap();
        String str6 = string;
        String str7 = underlyingBitmap.getWidth() + "x" + underlyingBitmap.getHeight();
        HashMap map2 = new HashMap(8);
        map2.put("bitmapSize", str7);
        map2.put("queueTime", strValueOf);
        map2.put("hasGoodQuality", strValueOf2);
        map2.put("isFinal", strValueOf3);
        map2.put("encodedImageSize", str2);
        map2.put("imageFormat", str);
        map2.put("requestedImageSize", str3);
        map2.put("sampleSize", str4);
        int byteCount = underlyingBitmap.getByteCount();
        StringBuilder sb = new StringBuilder();
        sb.append(byteCount);
        map2.put("byteCount", sb.toString());
        if (str6 != null) {
            map2.put(HasExtraData.KEY_NON_FATAL_DECODE_ERROR, str6);
        }
        return new bh7(map2);
    }

    public abstract int n(ce5 ce5Var);

    public abstract fh7 o();

    public final void p(Throwable th) {
        q(true);
        this.b.e(th);
    }

    public final void q(boolean z) {
        ce5 ce5Var;
        synchronized (this) {
            if (z) {
                if (!this.f) {
                    this.b.i(1.0f);
                    this.f = true;
                    gu7 gu7Var = this.g;
                    synchronized (gu7Var) {
                        ce5Var = gu7Var.e;
                        gu7Var.e = null;
                        gu7Var.f = 0;
                    }
                    ce5.d(ce5Var);
                }
            }
        }
    }

    public final void r(ce5 ce5Var, sc3 sc3Var, int i) throws IOException {
        ce5Var.i0();
        Integer numValueOf = Integer.valueOf(ce5Var.o);
        mk0 mk0Var = (mk0) this.c;
        mk0Var.putExtra(HasExtraData.KEY_ENCODED_WIDTH, numValueOf);
        ce5Var.i0();
        mk0Var.putExtra(HasExtraData.KEY_ENCODED_HEIGHT, Integer.valueOf(ce5Var.X));
        mk0Var.putExtra(HasExtraData.KEY_ENCODED_SIZE, Integer.valueOf(ce5Var.y()));
        ce5Var.i0();
        mk0Var.putExtra(HasExtraData.KEY_COLOR_SPACE, ce5Var.s0);
        if (sc3Var instanceof CloseableStaticBitmap) {
            mk0Var.putExtra(HasExtraData.KEY_BITMAP_CONFIG, String.valueOf(((CloseableStaticBitmap) sc3Var).getUnderlyingBitmap().getConfig()));
        }
        if (sc3Var != null) {
            sc3Var.putExtras(mk0Var.X);
        }
        mk0Var.putExtra(HasExtraData.KEY_LAST_SCAN_NUMBER, Integer.valueOf(i));
    }

    public abstract boolean s(ce5 ce5Var, int i);
}

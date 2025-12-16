package defpackage;

import android.graphics.Bitmap;
import com.facebook.animated.gif.GifImage;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.IOException;

/* loaded from: classes.dex */
public final class bf implements je7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.je7
    public final sc3 a(ce5 ce5Var, int i, ksc kscVar, ie7 ie7Var) throws IOException {
        switch (this.a) {
            case 0:
                AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.b;
                if (animatedFactoryV2Impl.e == null) {
                    animatedFactoryV2Impl.e = new gf(new t9f(2, animatedFactoryV2Impl), animatedFactoryV2Impl.a, animatedFactoryV2Impl.k);
                }
                gf gfVar = animatedFactoryV2Impl.e;
                Bitmap.Config config = ie7Var.b;
                gfVar.getClass();
                if (gf.a == null) {
                    throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
                }
                vc3 vc3VarY = vc3.y(ce5Var.a);
                vc3VarY.getClass();
                try {
                    nf9 nf9Var = (nf9) vc3VarY.Z();
                    qc3 qc3VarA = gf.a(ce5Var.t0, ie7Var, nf9Var.o() != null ? GifImage.a(nf9Var.o(), ie7Var) : GifImage.b(nf9Var.w(), nf9Var.Q(), ie7Var));
                    vc3VarY.close();
                    return qc3VarA;
                } catch (Throwable th) {
                    vc3VarY.close();
                    throw th;
                }
            default:
                ce5Var.i0();
                me7 me7Var = ce5Var.b;
                kn4 kn4Var = (kn4) this.b;
                Boolean bool = Boolean.FALSE;
                ie7Var.getClass();
                if (me7Var == mn4.a) {
                    vc3 vc3VarF = kn4Var.c.f(ce5Var, ie7Var.a, i, null);
                    try {
                        vc3VarF.getClass();
                        ce5Var.i0();
                        int i2 = ce5Var.c;
                        ce5Var.i0();
                        CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(vc3VarF, kscVar, i2, ce5Var.d);
                        closeableStaticBitmapOf.putExtra(HasExtraData.KEY_IS_ROUNDED, bool);
                        vc3VarF.close();
                        return closeableStaticBitmapOf;
                    } catch (Throwable th2) {
                        vc3.P(vc3VarF);
                        throw th2;
                    }
                }
                if (me7Var == mn4.c) {
                    ce5Var.i0();
                    if (ce5Var.o != -1) {
                        ce5Var.i0();
                        if (ce5Var.X != -1) {
                            ie7Var.getClass();
                            je7 je7Var = kn4Var.a;
                            return je7Var != null ? je7Var.a(ce5Var, i, kscVar, ie7Var) : kn4Var.b(ce5Var, ie7Var);
                        }
                    }
                    throw new DecodeException("image width or height is incorrect", ce5Var);
                }
                if (me7Var == mn4.j) {
                    ie7Var.getClass();
                    je7 je7Var2 = kn4Var.b;
                    return je7Var2 != null ? je7Var2.a(ce5Var, i, kscVar, ie7Var) : kn4Var.b(ce5Var, ie7Var);
                }
                if (me7Var == mn4.m) {
                    return null;
                }
                if (me7Var != me7.c) {
                    return kn4Var.b(ce5Var, ie7Var);
                }
                throw new DecodeException("unknown image format", ce5Var);
        }
    }
}

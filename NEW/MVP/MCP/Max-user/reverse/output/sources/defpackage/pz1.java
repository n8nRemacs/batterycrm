package defpackage;

import android.graphics.Bitmap;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageWriter;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final /* synthetic */ class pz1 implements yu, fu7, pa8, oa8, gu3, y79, fu3, vvf {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pz1(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.vvf
    public Object a() {
        awg awgVar = (awg) this.c;
        awgVar.d.a((ac0) this.d, this.b + 1, false);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    @Override // defpackage.gu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz1.accept(java.lang.Object):void");
    }

    @Override // defpackage.yu
    public ha8 apply(Object obj) {
        jf7 jf7Var;
        sz1 sz1Var = (sz1) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ry1 ry1Var = sz1Var.d;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h52 h52Var = (h52) it.next();
            w30 w30Var = new w30(h52Var);
            int i = h52Var.c;
            r02 r02Var = null;
            if (i == 5) {
                x7i x7iVar = ry1Var.l;
                if (!x7iVar.d && !x7iVar.c) {
                    try {
                        jf7Var = (jf7) x7iVar.b.c();
                    } catch (NoSuchElementException unused) {
                        gri.b("ZslControlImpl", "dequeueImageFromBuffer no such element");
                        jf7Var = null;
                    }
                    if (jf7Var != null) {
                        x7i x7iVar2 = ry1Var.l;
                        x7iVar2.getClass();
                        Image imageV = jf7Var.V();
                        ImageWriter imageWriter = x7iVar2.j;
                        if (imageWriter != null && imageV != null) {
                            try {
                                imageWriter.queueInputImage(imageV);
                                qe7 imageInfo = jf7Var.getImageInfo();
                                if (imageInfo instanceof s02) {
                                    r02Var = ((s02) imageInfo).a;
                                }
                            } catch (IllegalStateException e) {
                                gri.b("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
                            }
                        }
                    }
                }
            }
            if (r02Var != null) {
                w30Var.h = r02Var;
            } else {
                int i2 = (sz1Var.a != 3 || sz1Var.f) ? (i == -1 || i == 5) ? 2 : -1 : 4;
                if (i2 != -1) {
                    w30Var.c = i2;
                }
            }
            cs0 cs0Var = sz1Var.e;
            if (cs0Var.b && this.b == 0 && cs0Var.a) {
                x8a x8aVarB = x8a.b();
                x8aVarB.n(e02.N(CaptureRequest.CONTROL_AE_MODE), 3);
                w30Var.c(new e02(9, fjb.a(x8aVarB)));
            }
            arrayList2.add(ixi.a(new xtd(sz1Var, w30Var)));
            arrayList3.add(w30Var.d());
        }
        ry1Var.z(arrayList3);
        return wsf.c(arrayList2);
    }

    @Override // defpackage.y79
    public void b(u69 u69Var) {
        z79 z79Var = (z79) this.c;
        wy8 wy8Var = (wy8) this.d;
        if (TextUtils.isEmpty(wy8Var.a)) {
            a8i.l("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        ha8 ha8VarL = z79Var.g.l(u69Var, wg7.m(i28.h(wy8Var)));
        ha8VarL.d(new yn6(ha8VarL, 0, new lk6(z79Var, u69Var, this.b)), dx4.a);
    }

    @Override // defpackage.fu7
    public void d(ce5 ce5Var, int i) throws IOException {
        long j;
        String str;
        rac racVar;
        boolean z;
        sc3 sc3Var;
        String str2;
        String str3;
        long j2;
        fh7 fh7Var;
        sc3 sc3Var2;
        sc3 sc3Var3;
        rac racVar2;
        String str4;
        fh7 fh7Var2;
        int i2;
        qk4 qk4Var;
        ih4 ih4Var = (ih4) this.c;
        jh4 jh4Var = (jh4) this.d;
        int i3 = this.b;
        oac oacVar = ih4Var.c;
        if (ce5Var == null) {
            return;
        }
        mk0 mk0Var = (mk0) oacVar;
        rf7 rf7Var = mk0Var.a;
        ce5Var.i0();
        mk0Var.putExtra(HasExtraData.KEY_IMAGE_FORMAT, ce5Var.b.a);
        Uri uri = rf7Var.b;
        ce5Var.t0 = uri != null ? uri.toString() : null;
        v25 v25Var = rf7Var.r;
        if (v25Var == null) {
            v25Var = jh4Var.e;
        }
        boolean zL = hj0.l(i, 16);
        if ((v25Var == v25.a || (v25Var == v25.b && !zL)) && (jh4Var.f || !mwg.d(rf7Var.b))) {
            ce5Var.Y = n9j.a(rf7Var.i, rf7Var.h, ce5Var, i3);
        }
        mk0Var.v0.w.getClass();
        int i4 = ih4Var.h;
        String str5 = "unknown";
        ie7 ie7Var = ih4Var.e;
        rac racVar3 = ih4Var.d;
        ce5Var.i0();
        if ((ce5Var.b != mn4.a && hj0.b(i)) || ih4Var.f || !ce5.h0(ce5Var)) {
            return;
        }
        ce5Var.i0();
        if (fni.a(ce5Var.b, mn4.c)) {
            ce5Var.i0();
            long j3 = ce5Var.o;
            ce5Var.i0();
            if (xp0.b(ie7Var.a) * ce5Var.X * j3 > 104857600) {
                ce5Var.i0();
                int i5 = ce5Var.o;
                ce5Var.i0();
                int i6 = ce5Var.X;
                Bitmap.Config config = ie7Var.a;
                StringBuilder sbK = wy1.k("Image is too big to attempt decoding: w = ", i5, ", h = ", i6, ", pixel config = ");
                sbK.append(config);
                sbK.append(", max bitmap size = 104857600");
                IllegalStateException illegalStateException = new IllegalStateException(sbK.toString());
                racVar3.d(oacVar, "DecodeProducer", illegalStateException, null);
                ih4Var.p(illegalStateException);
                return;
            }
        }
        ce5Var.i0();
        String str6 = ce5Var.b.a;
        ce5Var.i0();
        int i7 = ce5Var.o;
        ce5Var.i0();
        String str7 = i7 + "x" + ce5Var.X;
        String strValueOf = String.valueOf(ce5Var.Y);
        boolean zA = hj0.a(i);
        boolean z2 = zA && !hj0.l(i, 8);
        boolean zL2 = hj0.l(i, 4);
        ynd yndVar = mk0Var.a.h;
        if (yndVar != null) {
            str5 = yndVar.a + "x" + yndVar.b;
        }
        try {
            gu7 gu7Var = ih4Var.g;
            synchronized (gu7Var) {
                j = gu7Var.i - gu7Var.h;
            }
            String string = ((mk0) oacVar).a.b.toString();
            int iY = (z2 || zL2) ? ce5Var.y() : ih4Var.n(ce5Var);
            fh7 fh7VarO = (z2 || zL2) ? fh7.d : ih4Var.o();
            racVar3.j(oacVar, "DecodeProducer");
            try {
                try {
                    try {
                    } catch (Exception e) {
                        e = e;
                        racVar = racVar3;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = "DecodeProducer";
                    racVar = racVar3;
                }
                try {
                    sc3 sc3VarA = ih4Var.i.c.a(ce5Var, iY, fh7VarO, ih4Var.e);
                    try {
                        if (ce5Var.Y != 1) {
                            i2 = i | 16;
                            fh7 fh7Var3 = fh7VarO;
                            sc3Var3 = sc3VarA;
                            racVar2 = racVar3;
                            str4 = str6;
                            fh7Var2 = fh7Var3;
                        } else {
                            fh7 fh7Var4 = fh7VarO;
                            sc3Var3 = sc3VarA;
                            racVar2 = racVar3;
                            str4 = str6;
                            fh7Var2 = fh7Var4;
                            i2 = i;
                        }
                        racVar2.a(oacVar, "DecodeProducer", ih4Var.m(sc3Var3, j, fh7Var2, zA, str4, str7, str5, strValueOf));
                        ih4Var.r(ce5Var, sc3Var3, i4);
                        t9f t9fVar = (t9f) ih4Var.i.i.b;
                        if (sc3Var3 == null) {
                            qk4Var = null;
                        } else {
                            rha rhaVar = vc3.o;
                            t9fVar.m();
                            qk4Var = new qk4(sc3Var3, rhaVar, t9fVar, null, true);
                        }
                        try {
                            ih4Var.q(hj0.a(i2));
                            ih4Var.b.g(i2, qk4Var);
                            ce5Var.close();
                        } finally {
                            vc3.P(qk4Var);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fh7 fh7Var5 = fh7VarO;
                        sc3Var2 = sc3VarA;
                        str3 = str6;
                        fh7Var = fh7Var5;
                        str = "DecodeProducer";
                        z = zA;
                        str2 = str5;
                        j2 = j;
                        racVar = racVar3;
                        racVar.d(oacVar, str, e, ih4Var.m(sc3Var2, j2, fh7Var, z, str3, str7, str2, strValueOf));
                        ih4Var.p(e);
                        ce5Var.close();
                    }
                } catch (Exception e4) {
                    e = e4;
                    racVar = racVar3;
                    str = "DecodeProducer";
                    z = zA;
                    sc3Var = null;
                    str2 = str5;
                    str3 = str6;
                    j2 = j;
                    fh7Var = fh7VarO;
                    sc3Var2 = sc3Var;
                    racVar.d(oacVar, str, e, ih4Var.m(sc3Var2, j2, fh7Var, z, str3, str7, str2, strValueOf));
                    ih4Var.p(e);
                    ce5Var.close();
                }
            } catch (DecodeException e5) {
                str = "DecodeProducer";
                racVar = racVar3;
                z = zA;
                sc3Var = null;
                str2 = str5;
                str3 = str6;
                j2 = j;
                fh7Var = fh7VarO;
                try {
                    ce5 ce5Var2 = e5.a;
                    try {
                    } catch (Exception e6) {
                        e = e6;
                        ih4Var = ih4Var;
                        sc3Var2 = sc3Var;
                        racVar.d(oacVar, str, e, ih4Var.m(sc3Var2, j2, fh7Var, z, str3, str7, str2, strValueOf));
                        ih4Var.p(e);
                        ce5Var.close();
                    }
                    try {
                        op5.m("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e5.getMessage(), string, ce5Var2.l(), Integer.valueOf(ce5Var2.y()));
                        throw e5;
                    } catch (Exception e7) {
                        e = e7;
                        ih4Var = ih4Var;
                        sc3Var2 = null;
                        j2 = j2;
                        racVar.d(oacVar, str, e, ih4Var.m(sc3Var2, j2, fh7Var, z, str3, str7, str2, strValueOf));
                        ih4Var.p(e);
                        ce5Var.close();
                    }
                } catch (Exception e8) {
                    e = e8;
                }
            }
        } catch (Throwable th) {
            ce5Var.close();
            throw th;
        }
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case 2:
                t3c t3cVar = (t3c) this.c;
                t3c t3cVar2 = (t3c) this.d;
                r3c r3cVar = (r3c) obj;
                int i = this.b;
                r3cVar.s(i);
                r3cVar.t(t3cVar, t3cVar2, i);
                break;
            default:
                s3c s3cVar = (s3c) this.c;
                s3c s3cVar2 = (s3c) this.d;
                q3c q3cVar = (q3c) obj;
                q3cVar.getClass();
                q3cVar.D(s3cVar, s3cVar2, this.b);
                break;
        }
    }

    public /* synthetic */ pz1(f29 f29Var, int i, w69 w69Var) {
        this.a = 5;
        this.c = f29Var;
        this.b = i;
        this.d = w69Var;
    }

    public /* synthetic */ pz1(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

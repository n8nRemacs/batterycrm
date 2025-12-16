package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import one.me.sdk.transfer.domain.UploadException;

/* loaded from: classes2.dex */
public final /* synthetic */ class vtg implements tm6, gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aug b;

    public /* synthetic */ vtg(aug augVar, int i) {
        this.a = i;
        this.b = augVar;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                this.b.b((ttg) obj);
                return;
            case 6:
                aug augVar = this.b;
                ttg ttgVar = (ttg) obj;
                boolean zA = ttgVar.a();
                bug bugVar = ttgVar.a;
                if (zA) {
                    wvg wvgVar = bugVar.c;
                    wvgVar.getClass();
                    if (wvgVar == wvg.Y || bugVar.c.a()) {
                        augVar.d(bugVar);
                        return;
                    } else {
                        augVar.b(ttgVar);
                        return;
                    }
                }
                return;
            default:
                aug augVar2 = this.b;
                py4 py4Var = (py4) obj;
                synchronized (augVar2) {
                    augVar2.i.a(py4Var);
                }
                return;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        n2 y1hVar;
        int i;
        int i2 = this.a;
        jn6 jn6Var = pdf.d;
        r8j r8jVar = pdf.e;
        int i3 = 4;
        int i4 = 2;
        int i5 = 5;
        int i6 = 3;
        final int i7 = 1;
        final aug augVar = this.b;
        final int i8 = 0;
        switch (i2) {
            case 0:
                bug bugVar = (bug) obj;
                return new ds8(new fs8(new fs8(new fs8(augVar.a.d(bugVar), new o9g(22), r8jVar, jn6Var), r8jVar, new o9g(23), jn6Var), r8jVar, r8jVar, new wtg(bugVar, 0)));
            case 1:
                ttg ttgVar = (ttg) obj;
                wqi.c("aug", "prepareUploadFiles: started for upload=%s", ttgVar);
                if (!l8g.c(ttgVar.b)) {
                    return e2f.g(ttgVar);
                }
                q34 q34VarF = augVar.g.f(ttgVar.a.a);
                if (q34VarF == null) {
                    return e2f.f(new UploadException("failed to prepare upload files"));
                }
                String str = q34VarF.e;
                long j = q34VarF.b;
                if (j == 0) {
                    return e2f.f(new UploadException("content is zero length"));
                }
                if (l8g.c(str)) {
                    wqi.c("aug", "prepareUploadFiles: need copy for upload=%s", ttgVar);
                    wk3 wk3Var = new wk3(2, new nl(augVar, ttgVar, q34VarF, 29));
                    j0e j0eVar = augVar.f;
                    return wk3Var.m(j0eVar).i(j0eVar);
                }
                stg stgVarB = ttgVar.b();
                stgVarB.c = q34VarF.c;
                stgVarB.b = str;
                stgVarB.f = j;
                return e2f.g(new ttg(stgVarB));
            case 2:
                final ttg ttgVar2 = (ttg) obj;
                j0e j0eVarB = u0e.b();
                j0e j0eVar2 = augVar.f;
                wvg wvgVar = ttgVar2.a.c;
                wvgVar.getClass();
                return (wvgVar == wvg.d || wvgVar.a()) ? new wk3(5, new Callable() { // from class: xtg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i9 = i7;
                        ttg ttgVar3 = ttgVar2;
                        aug augVar2 = augVar;
                        switch (i9) {
                            case 0:
                                stg stgVarB2 = ttgVar3.b();
                                String absolutePath = ttgVar3.b;
                                tgg tggVar = augVar2.g;
                                try {
                                    wqi.c("aug", "resizeSticker: path = %s", absolutePath);
                                    File fileA = ((qx5) tggVar.e.getValue()).a("png");
                                    if (tggVar.g(absolutePath, fileA.getAbsolutePath())) {
                                        wqi.c("aug", "resizeSticker: resized for path = %s", absolutePath);
                                        absolutePath = fileA.getAbsolutePath();
                                    } else {
                                        wqi.c("aug", "resizeSticker: no resize needed for path = %s", absolutePath);
                                    }
                                } catch (IOException e) {
                                    wqi.e("aug", "resizeSticker: failed", e);
                                }
                                stgVarB2.b = absolutePath;
                                return new ttg(stgVarB2);
                            default:
                                stg stgVarB3 = ttgVar3.b();
                                String absolutePath2 = ttgVar3.b;
                                tgg tggVar2 = augVar2.g;
                                try {
                                    wqi.c("aug", "resizePhoto: path = %s", absolutePath2);
                                    q34 q34VarF2 = tggVar2.f(absolutePath2);
                                    String str2 = q34VarF2 != null ? q34VarF2.d : null;
                                    wqi.c("aug", "resizePhoto: mimeType = %s", str2);
                                    File fileA2 = ((qx5) tggVar2.e.getValue()).a("jpg");
                                    if (xe0.a(str2)) {
                                        try {
                                            wqi.c("aug", "resizePhoto: converting %s to JPEG", str2);
                                            tggVar2.e(absolutePath2, fileA2.getAbsolutePath());
                                            wqi.c("aug", "resizePhoto: successfully converted to JPEG", new Object[0]);
                                            absolutePath2 = fileA2.getAbsolutePath();
                                        } catch (IOException e2) {
                                            wqi.e("aug", "resizePhoto: convertToJpeg failed", e2);
                                        }
                                    } else {
                                        if (tfi.k(((u6b) tggVar2.f.getValue()).c, absolutePath2, fileA2.getAbsolutePath())) {
                                            wqi.c("aug", "resizePhoto: resized for path = %s", absolutePath2);
                                            absolutePath2 = fileA2.getAbsolutePath();
                                        } else {
                                            wqi.c("aug", "resizePhoto: no resize needed for path = %s", absolutePath2);
                                        }
                                    }
                                } catch (IOException e3) {
                                    wqi.e("aug", "resizePhoto: failed", e3);
                                }
                                stgVarB3.b = absolutePath2;
                                return new ttg(stgVarB3);
                        }
                    }
                }).m(j0eVarB).i(j0eVar2) : wvgVar.c() ? new wk3(5, new Callable() { // from class: xtg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i9 = i8;
                        ttg ttgVar3 = ttgVar2;
                        aug augVar2 = augVar;
                        switch (i9) {
                            case 0:
                                stg stgVarB2 = ttgVar3.b();
                                String absolutePath = ttgVar3.b;
                                tgg tggVar = augVar2.g;
                                try {
                                    wqi.c("aug", "resizeSticker: path = %s", absolutePath);
                                    File fileA = ((qx5) tggVar.e.getValue()).a("png");
                                    if (tggVar.g(absolutePath, fileA.getAbsolutePath())) {
                                        wqi.c("aug", "resizeSticker: resized for path = %s", absolutePath);
                                        absolutePath = fileA.getAbsolutePath();
                                    } else {
                                        wqi.c("aug", "resizeSticker: no resize needed for path = %s", absolutePath);
                                    }
                                } catch (IOException e) {
                                    wqi.e("aug", "resizeSticker: failed", e);
                                }
                                stgVarB2.b = absolutePath;
                                return new ttg(stgVarB2);
                            default:
                                stg stgVarB3 = ttgVar3.b();
                                String absolutePath2 = ttgVar3.b;
                                tgg tggVar2 = augVar2.g;
                                try {
                                    wqi.c("aug", "resizePhoto: path = %s", absolutePath2);
                                    q34 q34VarF2 = tggVar2.f(absolutePath2);
                                    String str2 = q34VarF2 != null ? q34VarF2.d : null;
                                    wqi.c("aug", "resizePhoto: mimeType = %s", str2);
                                    File fileA2 = ((qx5) tggVar2.e.getValue()).a("jpg");
                                    if (xe0.a(str2)) {
                                        try {
                                            wqi.c("aug", "resizePhoto: converting %s to JPEG", str2);
                                            tggVar2.e(absolutePath2, fileA2.getAbsolutePath());
                                            wqi.c("aug", "resizePhoto: successfully converted to JPEG", new Object[0]);
                                            absolutePath2 = fileA2.getAbsolutePath();
                                        } catch (IOException e2) {
                                            wqi.e("aug", "resizePhoto: convertToJpeg failed", e2);
                                        }
                                    } else {
                                        if (tfi.k(((u6b) tggVar2.f.getValue()).c, absolutePath2, fileA2.getAbsolutePath())) {
                                            wqi.c("aug", "resizePhoto: resized for path = %s", absolutePath2);
                                            absolutePath2 = fileA2.getAbsolutePath();
                                        } else {
                                            wqi.c("aug", "resizePhoto: no resize needed for path = %s", absolutePath2);
                                        }
                                    }
                                } catch (IOException e3) {
                                    wqi.e("aug", "resizePhoto: failed", e3);
                                }
                                stgVarB3.b = absolutePath2;
                                return new ttg(stgVarB3);
                        }
                    }
                }).m(j0eVarB).i(j0eVar2) : e2f.g(ttgVar2);
            case 3:
            case 6:
            default:
                return augVar.e((bug) obj);
            case 4:
                ttg ttgVar3 = (ttg) obj;
                if (!l8g.c(ttgVar3.d)) {
                    wqi.c("aug", "requestUrlSingle: already have upload url" + ttgVar3, new Object[0]);
                    return e2f.g(ttgVar3);
                }
                wqi.c("aug", "requestUrlSingle: request upload url" + ttgVar3, new Object[0]);
                hwa hwaVar = augVar.e;
                wvg wvgVar2 = ttgVar3.a.c;
                switch (wvgVar2.ordinal()) {
                    case 1:
                        y1hVar = new y1h(1);
                        break;
                    case 2:
                    case 6:
                        y1hVar = new zf8(Boolean.FALSE);
                        break;
                    case 3:
                        y1hVar = new zf8(Boolean.TRUE);
                        break;
                    case 4:
                        y1hVar = new fh2();
                        break;
                    case 5:
                        y1hVar = new y1h(3);
                        break;
                    case 7:
                        y1hVar = new zf8((xhb) null, 26);
                        break;
                    case 8:
                        y1hVar = new y1h(2);
                        break;
                    default:
                        throw new UploadException("tamRequestFromUploadType, can't request url for unknown media type= " + wvgVar2);
                }
                m2f m2fVarH = hwaVar.G(y1hVar, augVar.f).h(new ytg(ttgVar3, 1));
                d1g d1gVar = augVar.c;
                d1gVar.getClass();
                return m2fVarH.j(new b1g(d1gVar, 1, 0));
            case 5:
                ttg ttgVar4 = (ttg) obj;
                g1g g1gVar = augVar.b;
                wqi.c("aug", "uploadFileObservable: upload=%s", ttgVar4);
                wvg wvgVar3 = ttgVar4.a.c;
                wvgVar3.getClass();
                String str2 = (wvgVar3 == wvg.X || ttgVar4.a.c.c()) ? ttgVar4.c : null;
                switch (wvgVar3.ordinal()) {
                    case 1:
                    case 8:
                        i = 3;
                        break;
                    case 2:
                    case 3:
                    case 6:
                        i = 1;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 7:
                        i = 5;
                        break;
                    default:
                        throw new UploadException("unknown http type for upload type " + wvgVar3);
                }
                String str3 = ttgVar4.b;
                String str4 = ttgVar4.d;
                j0e j0eVar3 = augVar.f;
                g1gVar.getClass();
                sra sraVar = new sra(new ora(new fa7(g1gVar.a, i, str3, str2, str4, j0eVar3).p(augVar.f), new c5g(augVar, wvgVar3, ttgVar4), 5), r8jVar, new c5g(augVar, i3, ttgVar4), jn6Var);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                o9g o9gVar = new o9g(24);
                AtomicLong atomicLong = new AtomicLong();
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                yqa yqaVarG = sraVar.g(new ehg(atomicLong, o9gVar));
                ((pe8) augVar.d).getClass();
                int i9 = s65.d;
                return new ora(new tsa(yqaVarG, new sr5(2, s65.g(v9j.h(7, y65.DAYS)), ttgVar4.i), 0), new f1g(augVar.c, 0), 7);
            case 7:
                ttg ttgVar5 = (ttg) obj;
                return ttgVar5.a() ? vqa.k(ttgVar5) : new sra(new vr8(new k2f(new m2f(new k2f(new m2f(new m2f(e2f.g(ttgVar5).m(augVar.f), new vtg(augVar, i7), 0), new vtg(augVar, i4), 0), new vtg(augVar, i6), 1), new vtg(augVar, i3), 0), new vtg(augVar, i6), 1), new vtg(augVar, i5), 3), new vtg(augVar, 6), r8jVar, jn6Var);
        }
    }
}

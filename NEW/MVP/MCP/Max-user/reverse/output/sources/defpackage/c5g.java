package defpackage;

import android.view.Surface;
import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import com.my.tracker.userlifecycle.o.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class c5g implements gu3, uu1, pa8, tm6, vvf, sk3, es8, w2f, yu, EngineCore.EventPacker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c5g(aug augVar, wvg wvgVar, ttg ttgVar) {
        this.a = 3;
        this.b = wvgVar;
        this.c = ttgVar;
    }

    @Override // defpackage.vvf
    public Object a() {
        switch (this.a) {
            case 7:
                awg awgVar = (awg) this.b;
                Iterable iterable = (Iterable) this.c;
                gwd gwdVar = (gwd) awgVar.c;
                gwdVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gwdVar.l().compileStatement("DELETE FROM events WHERE _id in " + gwd.h0(iterable)).execute();
                    break;
                }
                break;
            default:
                awg awgVar2 = (awg) this.b;
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    ((gwd) awgVar2.i).Q(((Integer) entry.getValue()).intValue(), jg8.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((e5g) obj3).a.put((CharSequence) obj2, (d5g) obj);
                break;
            case 4:
                aug augVar = (aug) obj3;
                ttg ttgVar = (ttg) obj2;
                if (((Throwable) obj) instanceof HttpUrlExpiredException) {
                    stg stgVarB = ttgVar.b();
                    stgVarB.d = null;
                    stgVarB.e = 0.0f;
                    augVar.b(new ttg(stgVarB));
                    break;
                }
                break;
            case 5:
                aug augVar2 = (aug) obj3;
                bug bugVar = (bug) obj2;
                wqi.e("aug", "onErrorUpload: data=" + bugVar, (Throwable) obj);
                augVar2.d(bugVar);
                augVar2.c(bugVar);
                break;
            case 6:
                gvg gvgVar = (gvg) obj3;
                um9 um9Var = (um9) obj2;
                Throwable th = (Throwable) obj;
                if ((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b)) {
                    bug bugVarB = gvg.b(um9Var);
                    aug augVar3 = gvgVar.a;
                    augVar3.d(bugVarB);
                    augVar3.c(bugVarB);
                    break;
                }
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                l2h l2hVar = (l2h) obj2;
                Locale locale = Locale.ENGLISH;
                wqi.e("u2h", "onError: conversionData=" + l2hVar, (Throwable) obj);
                ((u2h) obj3).a(l2hVar);
                break;
            default:
                hch hchVar = (hch) obj3;
                v10 v10Var = (v10) obj2;
                Throwable th2 = (Throwable) obj;
                int i2 = th2 instanceof FetcherException ? ((FetcherException) th2).a : 0;
                boolean zF = true;
                if (i2 != 1 && i2 != 7 && i2 != 6 && i2 != 9) {
                    zF = true ^ hchVar.d.f();
                }
                if (!zF) {
                    dd ddVar = (dd) hchVar.c.get();
                    if (ddVar != null) {
                        if (l8g.c(v10Var.j)) {
                            ddVar.e("ACTION_VIDEO_FETCH_FAILURE");
                        } else {
                            ddVar.f("ACTION_VIDEO_FETCH_FAILURE", v10Var.j);
                        }
                    }
                    wqi.e("VideoRipper", "ripVideo: failed to fetch " + v10Var.h, th2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tm6
    public ha8 apply(Object obj) {
        xod xodVar = (xod) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        u4e u4eVar = (u4e) xodVar.d;
        Object objF = 100;
        try {
            objF = ((h52) arrayList.get(0)).b.f(h52.j);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) objF;
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        Object objF2 = 0;
        try {
            objF2 = ((h52) arrayList.get(0)).b.f(h52.i);
        } catch (IllegalArgumentException unused2) {
        }
        Integer num2 = (Integer) objF2;
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        jdc jdcVar = ((wlf) u4eVar.b).u;
        return jdcVar != null ? ((gsf) jdcVar.b).h(iIntValue, iIntValue2) : new ag7(1, new Exception("Failed to take picture: pipeline is not ready."));
    }

    @Override // defpackage.es8
    public void b(rr8 rr8Var) {
        lwg lwgVar = (lwg) this.b;
        String str = (String) this.c;
        if (rr8Var.e()) {
            return;
        }
        Collection collectionValues = ((Map) lwgVar.b).values();
        Object obj = null;
        if (collectionValues != null) {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    if (((ttg) next).a.d.equals(str)) {
                        obj = next;
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        ttg ttgVar = (ttg) obj;
        if (rr8Var.e()) {
            return;
        }
        if (ttgVar != null) {
            rr8Var.a(ttgVar);
        }
        rr8Var.b();
    }

    @Override // defpackage.sk3
    public void c(jk3 jk3Var) {
        switch (this.a) {
            case 9:
                jwg jwgVar = (jwg) this.b;
                String str = (String) this.c;
                wqi.c("jwg", "removeUploadWithPhotoToken: token=" + str, new Object[0]);
                synchronized (jwgVar) {
                    jwgVar.a.e(str).c(((gwg) jwgVar.b.getValue()).e(str)).a();
                }
                if (jk3Var.e()) {
                    return;
                }
                jk3Var.b();
                return;
            case 10:
                jwg jwgVar2 = (jwg) this.b;
                ttg ttgVar = (ttg) this.c;
                wqi.c("jwg", "putUpload: upload=" + ttgVar, new Object[0]);
                synchronized (jwgVar2) {
                    jwgVar2.a.a(ttgVar).c(((gwg) jwgVar2.b.getValue()).a(ttgVar)).a();
                }
                if (jk3Var.e()) {
                    return;
                }
                jk3Var.b();
                return;
            case 11:
                lwg lwgVar = (lwg) this.b;
                ttg ttgVar2 = (ttg) this.c;
                ((Map) lwgVar.b).put(ttgVar2.a, ttgVar2);
                jk3Var.b();
                return;
            default:
                lwg lwgVar2 = (lwg) this.b;
                m7c m7cVar = (m7c) this.c;
                synchronized (((Map) lwgVar2.b)) {
                    try {
                        Iterator it = ((Map) lwgVar2.b).entrySet().iterator();
                        while (it.hasNext()) {
                            tvg tvgVar = ((ttg) ((Map.Entry) it.next()).getValue()).h;
                            if ((tvgVar != null) && m7cVar.test(tvgVar)) {
                                it.remove();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (jk3Var.e()) {
                    return;
                }
                jk3Var.b();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    @Override // defpackage.w2f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(defpackage.i2f r18) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5g.i(i2f):void");
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        switch (this.a) {
            case 19:
                return ((a) this.b).a((Map) this.c, insertEventTools);
            default:
                return ((d) this.b).a((String) this.c, insertEventTools);
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        r6g r6gVar = (r6g) this.b;
        Surface surface = (Surface) this.c;
        gri.a("TextureViewImpl", "Surface set on Preview.");
        r6gVar.h.b(surface, ayi.a(), new s32(6, tu1Var));
        return "provideSurface[request=" + r6gVar.h + " surface=" + surface + "]";
    }

    public /* synthetic */ c5g(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        hhg hhgVar = (hhg) this.b;
        nn5 nn5Var = (nn5) this.c;
        ra9 ra9Var = (ra9) obj;
        hhgVar.u.getClass();
        String str = ra9Var.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onCompleted", null);
            }
        }
        pa9 pa9Var = ra9Var.a;
        pa9Var.f.set(nn5Var);
        pa9Var.g.set(null);
        ra9Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // defpackage.tm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r12) throws org.json.JSONException {
        /*
            r11 = this;
            java.lang.Object r0 = r11.b
            wvg r0 = (defpackage.wvg) r0
            java.lang.Object r1 = r11.c
            ttg r1 = (defpackage.ttg) r1
            da7 r12 = (defpackage.da7) r12
            boolean r2 = r12.a
            long r3 = r12.d
            java.lang.String r5 = r12.b
            r6 = 0
            if (r2 == 0) goto L3c
            r0.getClass()
            wvg r7 = defpackage.wvg.d
            if (r0 != r7) goto L1b
            goto L25
        L1b:
            boolean r7 = r0.a()
            if (r7 != 0) goto L25
            wvg r7 = defpackage.wvg.Z
            if (r0 != r7) goto L3c
        L25:
            java.lang.String r0 = defpackage.eoi.f(r5)
            boolean r5 = defpackage.l8g.c(r0)
            if (r5 != 0) goto L6a
            svg r5 = new svg
            r5.<init>()
            r5.a = r0
            tvg r6 = new tvg
            r6.<init>(r5)
            goto L6a
        L3c:
            if (r2 == 0) goto L68
            boolean r0 = r0.c()
            if (r0 == 0) goto L68
            boolean r0 = defpackage.l8g.c(r5)
            if (r0 == 0) goto L4b
            goto L6a
        L4b:
            java.lang.String r0 = defpackage.eoi.h(r5)
            boolean r7 = defpackage.l8g.c(r0)
            if (r7 == 0) goto L5b
            java.lang.String r0 = "aug"
            defpackage.wqi.e(r0, r5, r6)
            goto L6a
        L5b:
            svg r5 = new svg
            r5.<init>()
            r5.a = r0
            tvg r6 = new tvg
            r6.<init>(r5)
            goto L6a
        L68:
            tvg r6 = r1.h
        L6a:
            if (r2 == 0) goto L77
            if (r6 == 0) goto L6f
            goto L77
        L6f:
            one.me.sdk.transfer.domain.UploadException r12 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r0 = "upload failed. no upload result on finished upload"
            r12.<init>(r0)
            throw r12
        L77:
            r7 = 0
            if (r2 == 0) goto L92
            java.lang.String r0 = r6.a
            boolean r0 = defpackage.l8g.c(r0)
            if (r0 == 0) goto L92
            long r9 = r6.b
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L8a
            goto L92
        L8a:
            one.me.sdk.transfer.domain.UploadException r12 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r0 = "upload failed. token and attachId are empty"
            r12.<init>(r0)
            throw r12
        L92:
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto Lb1
            stg r0 = r1.b()
            r0.h = r6
            if (r2 == 0) goto La1
            vvg r1 = defpackage.vvg.UPLOADED
            goto La3
        La1:
            vvg r1 = defpackage.vvg.UPLOADING
        La3:
            r0.g = r1
            float r12 = r12.c
            r0.e = r12
            r0.f = r3
            ttg r12 = new ttg
            r12.<init>(r0)
            return r12
        Lb1:
            one.me.sdk.transfer.domain.UploadException r12 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r0 = "upload failed. file has zero size"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5g.apply(java.lang.Object):java.lang.Object");
    }
}

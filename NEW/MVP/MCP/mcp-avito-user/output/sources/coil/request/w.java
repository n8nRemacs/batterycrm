package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RequestService.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/w;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final coil.n f58735a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final coil.util.y f58736b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final coil.util.s f58737c;

    public w(@Y61.k coil.n nVar, @Y61.k coil.util.y yVar, @Y61.l coil.util.o oVar) {
        this.f58735a = nVar;
        this.f58736b = yVar;
        this.f58737c = coil.util.f.a(oVar);
    }

    @Y61.k
    public static e a(@Y61.k p pVar, @Y61.k Throwable th2) {
        Drawable drawableB;
        if (th2 instanceof NullRequestDataException) {
            drawableB = coil.util.k.b(pVar, pVar.f58656K, pVar.f58655J, pVar.f58658M.f58633l);
            if (drawableB == null) {
                drawableB = coil.util.k.b(pVar, pVar.f58654I, pVar.f58653H, pVar.f58658M.f58632k);
            }
        } else {
            drawableB = coil.util.k.b(pVar, pVar.f58654I, pVar.f58653H, pVar.f58658M.f58632k);
        }
        return new e(drawableB, pVar, th2);
    }

    public static boolean b(@Y61.k p pVar, @Y61.k Bitmap.Config config) {
        if (!(config == Bitmap.Config.HARDWARE)) {
            return true;
        }
        if (!pVar.f58675q) {
            return false;
        }
        K2.c cVar = pVar.f58661c;
        if (cVar instanceof K2.d) {
            View view = ((K2.d) cVar).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final coil.request.t c(@Y61.k coil.request.p r20, @Y61.k coil.view.C27253g r21) {
        /*
            r19 = this;
            r0 = r20
            r4 = r21
            java.util.List<L2.c> r1 = r0.f58670l
            boolean r2 = r1.isEmpty()
            android.graphics.Bitmap$Config r3 = r0.f58665g
            if (r2 != 0) goto L1a
            android.graphics.Bitmap$Config[] r2 = coil.util.l.f58781a
            boolean r2 = kotlin.collections.C42756l.h(r3, r2)
            if (r2 == 0) goto L17
            goto L1a
        L17:
            r15 = r19
            goto L2f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.HARDWARE
            if (r3 != r2) goto L32
            boolean r2 = b(r0, r3)
            if (r2 == 0) goto L17
            r15 = r19
            coil.util.s r2 = r15.f58737c
            boolean r2 = r2.a(r4)
            if (r2 == 0) goto L2f
            goto L34
        L2f:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L35
        L32:
            r15 = r19
        L34:
            r2 = r3
        L35:
            coil.size.c r3 = r4.f58765a
            coil.size.c$b r5 = coil.view.AbstractC27249c.b.f58760a
            boolean r3 = kotlin.jvm.internal.L.f(r3, r5)
            if (r3 != 0) goto L4c
            coil.size.c r3 = r4.f58766b
            boolean r3 = kotlin.jvm.internal.L.f(r3, r5)
            if (r3 == 0) goto L48
            goto L4c
        L48:
            coil.size.Scale r3 = r0.f58648C
        L4a:
            r5 = r3
            goto L4f
        L4c:
            coil.size.Scale r3 = coil.view.Scale.f58756c
            goto L4a
        L4f:
            boolean r3 = r0.f58676r
            if (r3 == 0) goto L60
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L60
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r1) goto L60
            r1 = 1
        L5e:
            r7 = r1
            goto L62
        L60:
            r1 = 0
            goto L5e
        L62:
            coil.request.t r16 = new coil.request.t
            boolean r6 = coil.util.k.a(r20)
            coil.request.CachePolicy r14 = r0.f58679u
            coil.request.CachePolicy r13 = r0.f58680v
            android.content.Context r1 = r0.f58659a
            android.graphics.ColorSpace r3 = r0.f58666h
            boolean r8 = r0.f58677s
            java.lang.String r9 = r0.f58664f
            okhttp3.Headers r10 = r0.f58672n
            coil.request.y r11 = r0.f58673o
            coil.request.u r12 = r0.f58649D
            coil.request.CachePolicy r0 = r0.f58678t
            r17 = r0
            r0 = r16
            r4 = r21
            r18 = r13
            r13 = r17
            r15 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.request.w.c(coil.request.p, coil.size.g):coil.request.t");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final coil.request.t d(@Y61.k coil.request.t r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            android.graphics.Bitmap$Config r2 = r0.f58718b
            coil.request.CachePolicy r3 = r0.f58731o
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            r5 = 0
            r6 = 1
            if (r2 != r4) goto L10
            r4 = r6
            goto L11
        L10:
            r4 = r5
        L11:
            if (r4 == 0) goto L21
            coil.util.s r4 = r1.f58737c
            boolean r4 = r4.getF58799a()
            if (r4 == 0) goto L1c
            goto L21
        L1c:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r9 = r2
            r5 = r6
            goto L22
        L21:
            r9 = r2
        L22:
            coil.request.CachePolicy r2 = r0.f58731o
            boolean r2 = r2.f58618b
            if (r2 == 0) goto L3b
            coil.util.y r2 = r1.f58736b
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L38
            boolean r4 = r2.f58807f     // Catch: java.lang.Throwable -> L38
            monitor-exit(r2)
            if (r4 != 0) goto L3b
            coil.request.CachePolicy r3 = coil.request.CachePolicy.f58615e
            r22 = r3
            goto L3e
        L38:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L38
            throw r0
        L3b:
            r22 = r3
            r6 = r5
        L3e:
            if (r6 == 0) goto L6e
            android.content.Context r8 = r0.f58717a
            android.graphics.ColorSpace r10 = r0.f58719c
            coil.size.g r11 = r0.f58720d
            coil.size.Scale r12 = r0.f58721e
            boolean r13 = r0.f58722f
            boolean r14 = r0.f58723g
            boolean r15 = r0.f58724h
            java.lang.String r2 = r0.f58725i
            okhttp3.Headers r3 = r0.f58726j
            coil.request.y r4 = r0.f58727k
            coil.request.u r5 = r0.f58728l
            coil.request.CachePolicy r6 = r0.f58729m
            coil.request.CachePolicy r0 = r0.f58730n
            coil.request.t r23 = new coil.request.t
            r7 = r23
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r23
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.request.w.d(coil.request.t):coil.request.t");
    }
}

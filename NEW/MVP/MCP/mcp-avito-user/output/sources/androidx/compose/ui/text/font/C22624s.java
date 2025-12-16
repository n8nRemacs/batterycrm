package androidx.compose.ui.text.font;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.text.font.C0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/font/s;", "Landroidx/compose/runtime/I3;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22624s implements I3<Object> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<D> f42296b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final z0 f42297c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C22625t f42298d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C0.b, G0> f42299e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final m0 f42300f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f42301g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f42302h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C22624s(@Y61.k List<? extends D> list, @Y61.k Object obj, @Y61.k z0 z0Var, @Y61.k C22625t c22625t, @Y61.k Y41.l<? super C0.b, G0> lVar, @Y61.k m0 m0Var) {
        this.f42296b = list;
        this.f42297c = z0Var;
        this.f42298d = c22625t;
        this.f42299e = lVar;
        this.f42300f = m0Var;
        this.f42301g = C22126m3.g(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:28:0x0072, B:30:0x008a, B:35:0x00bf, B:37:0x00cd, B:42:0x00f3), top: B:55:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3 A[Catch: all -> 0x00f0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:28:0x0072, B:30:0x008a, B:35:0x00bf, B:37:0x00cd, B:42:0x00f3), top: B:55:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0109 -> B:46:0x010a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x010e -> B:48:0x0110). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.C22624s.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k androidx.compose.ui.text.font.D r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.C22623q
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.q r0 = (androidx.compose.ui.text.font.C22623q) r0
            int r1 = r0.f42292t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42292t = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.q r0 = new androidx.compose.ui.text.font.q
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f42290r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f42292t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            androidx.compose.ui.text.font.D r7 = r0.f42289q
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            goto L4d
        L2c:
            r8 = move-exception
            goto L4f
        L2e:
            r7 = move-exception
            goto L78
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.C42729a0.b(r8)
            androidx.compose.ui.text.font.r r8 = new androidx.compose.ui.text.font.r     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r0.f42289q = r7     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r0.f42292t = r3     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = kotlinx.coroutines.D1.c(r2, r8, r0)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> L2e
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r4 = r8
            goto L82
        L4f:
            kotlin.coroutines.CoroutineContext r1 = r0.getF411960f()
            kotlinx.coroutines.N$b r2 = kotlinx.coroutines.N.f410714t2
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.N r1 = (kotlinx.coroutines.N) r1
            if (r1 == 0) goto L82
            kotlin.coroutines.CoroutineContext r0 = r0.getF411960f()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to load font "
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L82
        L78:
            kotlin.coroutines.CoroutineContext r8 = r0.getF411960f()
            boolean r8 = kotlinx.coroutines.Q0.h(r8)
            if (r8 == 0) goto L83
        L82:
            return r4
        L83:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.C22624s.d(androidx.compose.ui.text.font.D, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.runtime.I3
    @Y61.k
    /* renamed from: getValue */
    public final Object getF42167b() {
        return ((C22082i3) this.f42301g).getF42167b();
    }
}

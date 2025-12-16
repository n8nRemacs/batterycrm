package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;

/* compiled from: AndroidSelectionHandles.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21006e {

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.e$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22544x2 f31950l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f31951m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f31952n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f31953o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21039u f31954p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22544x2 interfaceC22544x2, long j12, boolean z12, androidx.compose.ui.v vVar, InterfaceC21039u interfaceC21039u) {
            super(2);
            this.f31950l = interfaceC22544x2;
            this.f31951m = j12;
            this.f31952n = z12;
            this.f31953o = vVar;
            this.f31954p = interfaceC21039u;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
                androidx.compose.runtime.S.a(androidx.compose.ui.platform.Q0.f41210s.b(this.f31950l), androidx.compose.runtime.internal.r.c(1260045569, new C21003d(this.f31951m, this.f31952n, this.f31953o, this.f31954p), a13), a13, 56);
            } else {
                a13.f();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.e$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21039u f31955l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f31956m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ResolvedTextDirection f31957n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f31958o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f31959p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ float f31960q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f31961r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f31962s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f31963t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC21039u interfaceC21039u, boolean z12, ResolvedTextDirection resolvedTextDirection, boolean z13, long j12, float f12, androidx.compose.ui.v vVar, int i12, int i13) {
            super(2);
            this.f31955l = interfaceC21039u;
            this.f31956m = z12;
            this.f31957n = resolvedTextDirection;
            this.f31958o = z13;
            this.f31959p = j12;
            this.f31960q = f12;
            this.f31961r = vVar;
            this.f31962s = i12;
            this.f31963t = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f31962s | 1);
            long j12 = this.f31959p;
            C21006e.b(this.f31955l, this.f31956m, this.f31957n, this.f31958o, j12, this.f31960q, this.f31961r, a12, iA2, this.f31963t);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.e$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21039u f31964l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f31965m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f31966n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC21039u interfaceC21039u, boolean z12, boolean z13) {
            super(1);
            this.f31964l = interfaceC21039u;
            this.f31965m = z12;
            this.f31966n = z13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
            androidx.compose.ui.semantics.F f13 = f12;
            long jA2 = this.f31964l.a();
            f13.a(C21021k0.f32054c, new C21019j0(this.f31965m ? Handle.f30329c : Handle.f30330d, jA2, this.f31966n ? SelectionHandleAnchor.f31868b : SelectionHandleAnchor.f31870d, (9223372034707292159L & jA2) != 9205357640488583168L, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidSelectionHandles.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.e$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f31967l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Boolean> f31968m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f31969n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f31970o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12, Y41.a aVar, androidx.compose.ui.v vVar, boolean z12) {
            super(2);
            this.f31967l = vVar;
            this.f31968m = aVar;
            this.f31969n = z12;
            this.f31970o = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f31970o | 1);
            boolean z12 = this.f31969n;
            androidx.compose.ui.v vVar = this.f31967l;
            C21006e.c(iA2, this.f31968m, a12, vVar, z12);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.foundation.text.selection.InterfaceC21039u r21, @Y61.k androidx.compose.ui.InterfaceC22215f r22, @Y61.k androidx.compose.runtime.internal.C22096n r23, @Y61.l androidx.compose.runtime.A r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C21006e.a(androidx.compose.foundation.text.selection.u, androidx.compose.ui.f, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ff  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k androidx.compose.foundation.text.selection.InterfaceC21039u r16, boolean r17, @Y61.k androidx.compose.ui.text.style.ResolvedTextDirection r18, boolean r19, long r20, float r22, @Y61.k androidx.compose.ui.v r23, @Y61.l androidx.compose.runtime.A r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C21006e.b(androidx.compose.foundation.text.selection.u, boolean, androidx.compose.ui.text.style.ResolvedTextDirection, boolean, long, float, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(int i12, @Y61.k Y41.a aVar, @Y61.l androidx.compose.runtime.A a12, @Y61.k androidx.compose.ui.v vVar, boolean z12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(2111672474);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | (bE2.u(aVar) ? 32 : 16) | (bE2.j(z12) ? 256 : 128);
        if (bE2.p(i14 & 1, (i14 & 147) != 146)) {
            C20608p2.a(bE2, androidx.compose.ui.n.a(C20588k2.q(vVar, C21021k0.f32052a, C21021k0.f32053b), C22535v1.f41625a, new C21014h(aVar, z12)));
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(i12, aVar, vVar, z12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.InterfaceC22280q0 d(@Y61.k androidx.compose.ui.draw.i r29, float r30) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C21006e.d(androidx.compose.ui.draw.i, float):androidx.compose.ui.graphics.q0");
    }
}

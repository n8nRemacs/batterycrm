package com.akita.compose.foundation.ui;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.input.pointer.K;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ClickableText.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.foundation.ui.a$a, reason: collision with other inner class name */
    public static final class C2106a extends N implements Y41.l<o0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2106a f63659l = new C2106a();

        public C2106a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(o0 o0Var) {
            return G0.f406611a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f63660l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
            num.intValue();
            return G0.f406611a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/o0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<o0, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<o0> f63661l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<o0, G0> f63662m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.l lVar, InterfaceC22204y1 interfaceC22204y1) {
            super(1);
            this.f63661l = interfaceC22204y1;
            this.f63662m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(o0 o0Var) {
            o0 o0Var2 = o0Var;
            this.f63661l.setValue(o0Var2);
            this.f63662m.invoke(o0Var2);
            return G0.f406611a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22602e f63663l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f63664m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f63665n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ x0 f63666o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f63667p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f63668q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f63669r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<o0, G0> f63670s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f63671t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f63672u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f63673v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(C22602e c22602e, Y41.l<? super Integer, G0> lVar, v vVar, x0 x0Var, boolean z12, int i12, int i13, Y41.l<? super o0, G0> lVar2, Y41.l<? super Integer, G0> lVar3, int i14, int i15) {
            super(2);
            this.f63663l = c22602e;
            this.f63664m = lVar;
            this.f63665n = vVar;
            this.f63666o = x0Var;
            this.f63667p = z12;
            this.f63668q = i12;
            this.f63669r = i13;
            this.f63670s = lVar2;
            this.f63671t = lVar3;
            this.f63672u = i14;
            this.f63673v = i15;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f63672u | 1);
            int i12 = this.f63669r;
            a.a(this.f63663l, this.f63664m, this.f63665n, this.f63666o, this.f63667p, this.f63668q, i12, this.f63670s, this.f63671t, a12, iA2, this.f63673v);
            return G0.f406611a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<o0> f63674b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f63675c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f63676d;

        /* compiled from: ClickableText.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "pos", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.akita.compose.foundation.ui.a$e$a, reason: collision with other inner class name */
        public static final class C2107a extends N implements Y41.l<l0.g, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<o0> f63677l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Y41.l<Integer, G0> f63678m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2107a(Y41.l lVar, InterfaceC22204y1 interfaceC22204y1) {
                super(1);
                this.f63677l = interfaceC22204y1;
                this.f63678m = lVar;
            }

            @Override // Y41.l
            public final G0 invoke(l0.g gVar) {
                long j12 = gVar.f413387a;
                o0 f42167b = this.f63677l.getF42167b();
                if (f42167b != null) {
                    this.f63678m.invoke(Integer.valueOf(f42167b.f42527b.g(j12)));
                }
                return G0.f406611a;
            }
        }

        /* compiled from: ClickableText.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "pos", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.l<l0.g, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<o0> f63679l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Y41.l<Integer, G0> f63680m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Y41.l lVar, InterfaceC22204y1 interfaceC22204y1) {
                super(1);
                this.f63679l = interfaceC22204y1;
                this.f63680m = lVar;
            }

            @Override // Y41.l
            public final G0 invoke(l0.g gVar) {
                long j12 = gVar.f413387a;
                o0 f42167b = this.f63679l.getF42167b();
                if (f42167b != null) {
                    this.f63680m.invoke(Integer.valueOf(f42167b.f42527b.g(j12)));
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(InterfaceC22204y1<o0> interfaceC22204y1, Y41.l<? super Integer, G0> lVar, Y41.l<? super Integer, G0> lVar2) {
            this.f63674b = interfaceC22204y1;
            this.f63675c = lVar;
            this.f63676d = lVar2;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        @Y61.l
        public final Object invoke(@Y61.k K k12, @Y61.k Continuation<? super G0> continuation) {
            InterfaceC22204y1<o0> interfaceC22204y1 = this.f63674b;
            Object objG = C20445d2.g(k12, new C2107a(this.f63675c, interfaceC22204y1), null, new b(this.f63676d, interfaceC22204y1), continuation, 5);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.text.C22602e r25, @Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r26, @Y61.l androidx.compose.ui.v r27, @Y61.l androidx.compose.ui.text.x0 r28, boolean r29, int r30, int r31, @Y61.l Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> r32, @Y61.l Y41.l<? super java.lang.Integer, kotlin.G0> r33, @Y61.l androidx.compose.runtime.A r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.foundation.ui.a.a(androidx.compose.ui.text.e, Y41.l, androidx.compose.ui.v, androidx.compose.ui.text.x0, boolean, int, int, Y41.l, Y41.l, androidx.compose.runtime.A, int, int):void");
    }
}

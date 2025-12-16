package androidx.compose.material3;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22381q0;
import androidx.compose.ui.layout.K0;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: SegmentedButton.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/ee;", "Landroidx/compose/ui/layout/q0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21544ee implements InterfaceC22381q0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f36295a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public C20268c<Integer, C20318t> f36296b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Integer f36297c;

    /* compiled from: SegmentedButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$1", f = "SegmentedButton.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.ee$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f36298q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20268c<Integer, C20318t> f36299r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f36300s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20268c<Integer, C20318t> c20268c, int i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f36299r = c20268c;
            this.f36300s = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f36299r, this.f36300s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f36298q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Integer numBoxInt = Boxing.boxInt(this.f36300s);
                androidx.compose.animation.core.G1 g1E = C20310q.e(350, 0, null, 6);
                this.f36298q = 1;
                if (C20268c.c(this.f36299r, numBoxInt, g1E, null, null, this, 12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SegmentedButton.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ee$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36301l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f36302m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C21544ee f36303n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f36304o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36305p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f36306q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList, InterfaceC22369k0 interfaceC22369k0, C21544ee c21544ee, int i12, ArrayList arrayList2, int i13) {
            super(1);
            this.f36301l = arrayList;
            this.f36302m = interfaceC22369k0;
            this.f36303n = c21544ee;
            this.f36304o = i12;
            this.f36305p = arrayList2;
            this.f36306q = i13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            int i12;
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f36301l;
            int size = arrayList.size();
            int i13 = 0;
            while (true) {
                i12 = this.f36306q;
                if (i13 >= size) {
                    break;
                }
                androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) arrayList.get(i13);
                aVar2.e(k02, 0, (i12 - k02.f40346c) / 2, 0.0f);
                i13++;
            }
            C21567fe.f36343a.getClass();
            float f12 = C21567fe.f36344b;
            InterfaceC22369k0 interfaceC22369k0 = this.f36302m;
            int iY02 = interfaceC22369k0.y0(C21975xe.f37721a) + interfaceC22369k0.y0(f12);
            C20268c<Integer, C20318t> c20268c = this.f36303n.f36296b;
            int iIntValue = iY02 + (c20268c != null ? c20268c.f().intValue() : this.f36304o);
            ArrayList arrayList2 = this.f36305p;
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                androidx.compose.ui.layout.K0 k03 = (androidx.compose.ui.layout.K0) arrayList2.get(i14);
                aVar2.e(k03, iIntValue, (i12 - k03.f40346c) / 2, 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    public C21544ee(@Y61.k kotlinx.coroutines.T t12) {
        this.f36295a = t12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends List<? extends InterfaceC22363h0>> list, long j12) {
        Object obj;
        Object obj2;
        Object obj3;
        List<? extends InterfaceC22363h0> list2 = list.get(0);
        List<? extends InterfaceC22363h0> list3 = list.get(1);
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        int iF2 = 0;
        while (iF2 < size) {
            iF2 = androidx.compose.foundation.H.f(list2.get(iF2), j12, arrayList, iF2, 1);
        }
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i12 = ((androidx.compose.ui.layout.K0) obj).f40345b;
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i13 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i13);
                    int i14 = ((androidx.compose.ui.layout.K0) obj4).f40345b;
                    if (i12 < i14) {
                        obj = obj4;
                        i12 = i14;
                    }
                    if (i13 == size2) {
                        break;
                    }
                    i13++;
                }
            }
        }
        androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) obj;
        int i15 = k02 != null ? k02.f40345b : 0;
        ArrayList arrayList2 = new ArrayList(list3.size());
        int size3 = list3.size();
        int iF3 = 0;
        while (iF3 < size3) {
            iF3 = androidx.compose.foundation.H.f(list3.get(iF3), j12, arrayList2, iF3, 1);
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int i16 = ((androidx.compose.ui.layout.K0) obj2).f40345b;
            int size4 = arrayList2.size() - 1;
            if (1 <= size4) {
                int i17 = 1;
                while (true) {
                    Object obj5 = arrayList2.get(i17);
                    int i18 = ((androidx.compose.ui.layout.K0) obj5).f40345b;
                    if (i16 < i18) {
                        obj2 = obj5;
                        i16 = i18;
                    }
                    if (i17 == size4) {
                        break;
                    }
                    i17++;
                }
            }
        }
        androidx.compose.ui.layout.K0 k03 = (androidx.compose.ui.layout.K0) obj2;
        Integer numValueOf = k03 != null ? Integer.valueOf(k03.f40345b) : null;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int i19 = ((androidx.compose.ui.layout.K0) obj3).f40346c;
            int size5 = arrayList2.size() - 1;
            if (1 <= size5) {
                int i22 = 1;
                while (true) {
                    Object obj6 = arrayList2.get(i22);
                    int i23 = ((androidx.compose.ui.layout.K0) obj6).f40346c;
                    if (i19 < i23) {
                        obj3 = obj6;
                        i19 = i23;
                    }
                    if (i22 == size5) {
                        break;
                    }
                    i22++;
                }
            }
        }
        androidx.compose.ui.layout.K0 k04 = (androidx.compose.ui.layout.K0) obj3;
        int i24 = k04 != null ? k04.f40346c : 0;
        C21567fe.f36343a.getClass();
        float f12 = C21567fe.f36344b;
        int iMax = Math.max(interfaceC22369k0.y0(f12), i15);
        float f13 = C21975xe.f37721a;
        int iY02 = interfaceC22369k0.y0(f13) + iMax + (numValueOf != null ? numValueOf.intValue() : 0);
        int i25 = i15 == 0 ? (-(interfaceC22369k0.y0(f13) + interfaceC22369k0.y0(f12))) / 2 : 0;
        Integer num = this.f36297c;
        if (num == null) {
            this.f36297c = Integer.valueOf(i25);
        } else {
            C20268c<Integer, C20318t> c20268c = this.f36296b;
            if (c20268c == null) {
                int i26 = kotlin.jvm.internal.J.f406821a;
                c20268c = new C20268c<>(num, androidx.compose.animation.core.J1.f26076b, null, null, 12, null);
                this.f36296b = c20268c;
            }
            if (((Number) ((C22082i3) c20268c.f26227f).getF42167b()).intValue() != i25) {
                C43259k.d(this.f36295a, null, null, new a(c20268c, i25, null), 3);
            }
        }
        return interfaceC22369k0.L0(iY02, i24, kotlin.collections.P0.c(), new b(arrayList, interfaceC22369k0, this, i25, arrayList2, i24));
    }
}

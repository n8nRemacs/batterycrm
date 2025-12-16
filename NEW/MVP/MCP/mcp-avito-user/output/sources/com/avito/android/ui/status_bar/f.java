package com.avito.android.ui.status_bar;

import Y41.p;
import Y41.q;
import Y61.l;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.ui.status_bar.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.n;

/* compiled from: StatusBarUpdatesHandlerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/status_bar/f;", "Landroidx/lifecycle/q;", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f304657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseFragment f304658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0.h<N0> f304659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<k> f304660e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f304661f;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/E1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<d> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i[] f304662b;

        /* compiled from: Zip.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/I1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.ui.status_bar.f$a$a, reason: collision with other inner class name */
        public static final class C9358a extends N implements Y41.a<d[]> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i[] f304663l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9358a(InterfaceC43160i[] interfaceC43160iArr) {
                super(0);
                this.f304663l = interfaceC43160iArr;
            }

            @Override // Y41.a
            public final d[] invoke() {
                return new d[this.f304663l.length];
            }
        }

        /* compiled from: Zip.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/J1"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.ui.status_bar.StatusBarUpdatesHandlerImpl$handle$1$onResume$$inlined$combine$1$3", f = "StatusBarUpdatesHandlerImpl.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super d>, d[], Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f304664q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ InterfaceC43172j f304665r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object[] f304666s;

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super d> interfaceC43172j, d[] dVarArr, Continuation<? super G0> continuation) {
                b bVar = new b(3, continuation);
                bVar.f304665r = interfaceC43172j;
                bVar.f304666s = dVarArr;
                return bVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                d dVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f304664q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = this.f304665r;
                    d[] dVarArr = (d[]) this.f304666s;
                    int length = dVarArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            dVar = dVarArr[i13];
                            if (dVar != null) {
                                break;
                            }
                            i13++;
                        } else {
                            dVar = null;
                            break;
                        }
                    }
                    this.f304664q = 1;
                    if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return G0.f406611a;
            }
        }

        public a(InterfaceC43160i[] interfaceC43160iArr) {
            this.f304662b = interfaceC43160iArr;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@Y61.k InterfaceC43172j<? super d> interfaceC43172j, @Y61.k Continuation continuation) {
            InterfaceC43160i[] interfaceC43160iArr = this.f304662b;
            Object objA = n.a(new C9358a(interfaceC43160iArr), new b(3, null), continuation, interfaceC43172j, interfaceC43160iArr);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
        }
    }

    /* compiled from: StatusBarUpdatesHandlerImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/fragment/app/Fragment;", "Lcom/avito/android/ui/status_bar/a;", "T", "Lcom/avito/android/ui/status_bar/d;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/ui/status_bar/d;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.ui.status_bar.StatusBarUpdatesHandlerImpl$handle$1$onResume$3", f = "StatusBarUpdatesHandlerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<d, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f304667q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ h f304668r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ BaseFragment f304669s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ActivityC22955m f304670t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, BaseFragment baseFragment, ActivityC22955m activityC22955m, Continuation continuation) {
            super(2, continuation);
            this.f304668r = hVar;
            this.f304669s = baseFragment;
            this.f304670t = activityC22955m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f304668r, this.f304669s, this.f304670t, continuation);
            bVar.f304667q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(d dVar, Continuation<? super G0> continuation) {
            return ((b) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            d dVar = (d) this.f304667q;
            a.C9355a c9355a = com.avito.android.ui.status_bar.a.f304645Z1;
            View viewRequireView = this.f304669s.requireView();
            c9355a.getClass();
            View viewFindViewById = viewRequireView.findViewById(R.id.edge_to_edge_fake_status_bar);
            ActivityC22955m activityC22955m = this.f304670t;
            Window window = activityC22955m.getWindow();
            if (dVar == null) {
                dVar = this.f304668r.f304672a;
            }
            this.f304668r.d(viewFindViewById, activityC22955m, window, dVar, true);
            return G0.f406611a;
        }
    }

    public f(h hVar, BaseFragment baseFragment, l0.h hVar2, List list, ActivityC22955m activityC22955m) {
        this.f304657b = hVar;
        this.f304658c = baseFragment;
        this.f304659d = hVar2;
        this.f304660e = list;
        this.f304661f = activityC22955m;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onDestroy(@Y61.k InterfaceC22983P interfaceC22983P) {
        l0.h<N0> hVar = this.f304659d;
        N0 n02 = hVar.f406842b;
        if (n02 != null) {
            n02.c(null);
        }
        hVar.f406842b = null;
        int iIdentityHashCode = System.identityHashCode(this.f304658c);
        h hVar2 = this.f304657b;
        Integer num = hVar2.f304674c;
        if (num != null && iIdentityHashCode == num.intValue()) {
            hVar2.f304674c = null;
        }
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onPause(@Y61.k InterfaceC22983P interfaceC22983P) {
        l0.h<N0> hVar = this.f304659d;
        N0 n02 = hVar.f406842b;
        if (n02 != null) {
            n02.c(null);
        }
        hVar.f406842b = null;
        BaseFragment baseFragment = this.f304658c;
        int iIdentityHashCode = System.identityHashCode(baseFragment);
        h hVar2 = this.f304657b;
        Integer num = hVar2.f304674c;
        if (num != null && iIdentityHashCode == num.intValue() && this.f304661f.getLifecycle().getF46705d() == Lifecycle.State.f46683f) {
            hVar2.f304674c = null;
            hVar2.e(baseFragment);
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, kotlinx.coroutines.N0] */
    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@Y61.k InterfaceC22983P interfaceC22983P) {
        BaseFragment baseFragment = this.f304658c;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(baseFragment));
        h hVar = this.f304657b;
        hVar.f304674c = numValueOf;
        List<k> list = this.f304660e;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) it.next()).e2());
        }
        this.f304659d.f406842b = C43175k.K(new C43197r1(new b(hVar, baseFragment, this.f304661f, null), new a((InterfaceC43160i[]) C42745f0.M0(arrayList).toArray(new InterfaceC43160i[0]))), hVar.f304673b);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStop(@Y61.k InterfaceC22983P interfaceC22983P) {
        l0.h<N0> hVar = this.f304659d;
        N0 n02 = hVar.f406842b;
        if (n02 != null) {
            n02.c(null);
        }
        hVar.f406842b = null;
        BaseFragment baseFragment = this.f304658c;
        int iIdentityHashCode = System.identityHashCode(baseFragment);
        h hVar2 = this.f304657b;
        Integer num = hVar2.f304674c;
        if (num != null && iIdentityHashCode == num.intValue()) {
            hVar2.f304674c = null;
            hVar2.e(baseFragment);
        }
    }
}

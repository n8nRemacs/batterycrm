package androidx.work.impl.constraints;

import Y41.l;
import Y41.q;
import Y61.k;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.work.G;
import androidx.work.impl.constraints.b;
import androidx.work.impl.model.H;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.n;

/* compiled from: WorkConstraintsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/f;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f55696a;

    /* compiled from: WorkConstraintsTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/work/impl/constraints/controllers/d;", "it", "", "invoke", "(Landroidx/work/impl/constraints/controllers/d;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements l<androidx.work.impl.constraints.controllers.d, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f55697l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(androidx.work.impl.constraints.controllers.d dVar) {
            return dVar.getClass().getSimpleName();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/E1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<androidx.work.impl.constraints.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i[] f55698b;

        /* compiled from: Zip.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "R", "", "invoke", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/I1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a extends N implements Y41.a<androidx.work.impl.constraints.b[]> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i[] f55699l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC43160i[] interfaceC43160iArr) {
                super(0);
                this.f55699l = interfaceC43160iArr;
            }

            @Override // Y41.a
            public final androidx.work.impl.constraints.b[] invoke() {
                return new androidx.work.impl.constraints.b[this.f55699l.length];
            }
        }

        /* compiled from: Zip.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/J1"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", i = {}, l = {292}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.work.impl.constraints.f$b$b, reason: collision with other inner class name */
        public static final class C1958b extends SuspendLambda implements q<InterfaceC43172j<? super androidx.work.impl.constraints.b>, androidx.work.impl.constraints.b[], Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f55700q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ InterfaceC43172j f55701r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object[] f55702s;

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super androidx.work.impl.constraints.b> interfaceC43172j, androidx.work.impl.constraints.b[] bVarArr, Continuation<? super G0> continuation) {
                C1958b c1958b = new C1958b(3, continuation);
                c1958b.f55701r = interfaceC43172j;
                c1958b.f55702s = bVarArr;
                return c1958b.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                androidx.work.impl.constraints.b bVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f55700q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = this.f55701r;
                    androidx.work.impl.constraints.b[] bVarArr = (androidx.work.impl.constraints.b[]) this.f55702s;
                    int length = bVarArr.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i13];
                        if (!L.f(bVar, b.a.f55669a)) {
                            break;
                        }
                        i13++;
                    }
                    if (bVar == null) {
                        bVar = b.a.f55669a;
                    }
                    this.f55700q = 1;
                    if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
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

        public b(InterfaceC43160i[] interfaceC43160iArr) {
            this.f55698b = interfaceC43160iArr;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@k InterfaceC43172j<? super androidx.work.impl.constraints.b> interfaceC43172j, @k Continuation continuation) {
            InterfaceC43160i[] interfaceC43160iArr = this.f55698b;
            Object objA = n.a(new a(interfaceC43160iArr), new C1958b(3, null), continuation, interfaceC43172j, interfaceC43160iArr);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
        }
    }

    public f() {
        throw null;
    }

    public f(@k androidx.work.impl.constraints.trackers.n nVar) {
        c cVar;
        androidx.work.impl.constraints.controllers.b bVar = new androidx.work.impl.constraints.controllers.b(nVar.f55728b);
        androidx.work.impl.constraints.controllers.c cVar2 = new androidx.work.impl.constraints.controllers.c(nVar.f55729c);
        androidx.work.impl.constraints.controllers.i iVar = new androidx.work.impl.constraints.controllers.i(nVar.f55731e);
        androidx.work.impl.constraints.trackers.g<d> gVar = nVar.f55730d;
        androidx.work.impl.constraints.controllers.e eVar = new androidx.work.impl.constraints.controllers.e(gVar);
        androidx.work.impl.constraints.controllers.h hVar = new androidx.work.impl.constraints.controllers.h(gVar);
        androidx.work.impl.constraints.controllers.g gVar2 = new androidx.work.impl.constraints.controllers.g(gVar);
        androidx.work.impl.constraints.controllers.f fVar = new androidx.work.impl.constraints.controllers.f(gVar);
        if (Build.VERSION.SDK_INT >= 28) {
            int i12 = h.f55710b;
            cVar = new c((ConnectivityManager) nVar.f55727a.getSystemService("connectivity"), 0L, 2, null);
        } else {
            cVar = null;
        }
        this.f55696a = C42756l.B(new androidx.work.impl.constraints.controllers.d[]{bVar, cVar2, iVar, eVar, hVar, gVar2, fVar, cVar});
    }

    public final boolean a(@k H h12) {
        ArrayList arrayList = this.f55696a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((androidx.work.impl.constraints.controllers.d) obj).c(h12)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            G gA2 = G.a();
            int i12 = h.f55710b;
            C42745f0.O(arrayList2, null, null, null, a.f55697l, 31);
            gA2.getClass();
        }
        return arrayList2.isEmpty();
    }

    @k
    public final InterfaceC43160i<androidx.work.impl.constraints.b> b(@k H h12) {
        ArrayList arrayList = this.f55696a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((androidx.work.impl.constraints.controllers.d) obj).a(h12)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((androidx.work.impl.constraints.controllers.d) it.next()).b(h12.f55804j));
        }
        return C43175k.r(new b((InterfaceC43160i[]) C42745f0.M0(arrayList3).toArray(new InterfaceC43160i[0])));
    }
}

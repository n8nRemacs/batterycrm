package com.avito.android.user_adverts.root_screen.adverts_host.overlay.core;

import EI0.a;
import EI0.b;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.view.M0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.j;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: OverlayViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/overlay/core/c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/overlay/core/b;", "Landroidx/lifecycle/M0;", "<init>", "()V", "a", "b", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends M0 implements com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final Z1<b> f313130E = p2.a(new b((Comparator) new a(), (EI0.a) null, false, 6, (C42822w) null));

    /* compiled from: OverlayViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/overlay/core/c$a;", "Ljava/util/Comparator;", "LEI0/a;", "Lkotlin/Comparator;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Comparator<EI0.a> {
        @Override // java.util.Comparator
        public final int compare(EI0.a aVar, EI0.a aVar2) {
            return aVar.getPriority() - aVar2.getPriority();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c$c, reason: collision with other inner class name */
    public static final class C9597c implements InterfaceC43160i<EI0.a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f313134b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f313135b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.OverlayViewModelImpl$collect$$inlined$map$1$2", f = "OverlayViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c$c$a$a, reason: collision with other inner class name */
            public static final class C9598a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f313136q;

                /* renamed from: r, reason: collision with root package name */
                public int f313137r;

                public C9598a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f313136q = obj;
                    this.f313137r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f313135b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c.C9597c.a.C9598a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c$c$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c.C9597c.a.C9598a) r0
                    int r1 = r0.f313137r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f313137r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c$c$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f313136q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f313137r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c$b r5 = (com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c.b) r5
                    EI0.a r5 = r5.f313132b
                    r0.f313137r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f313135b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.c.C9597c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C9597c(InterfaceC43160i interfaceC43160i) {
            this.f313134b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super EI0.a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f313134b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [EI0.a] */
    public static b ke(b bVar) {
        if (!bVar.f313133c) {
            return bVar;
        }
        a.C0223a c0223a = a.C0223a.f3921a;
        if (!L.f(bVar.f313132b, c0223a)) {
            return bVar;
        }
        ?? r12 = (EI0.a) C42745f0.F(bVar.f313131a);
        if (r12 != 0) {
            c0223a = r12;
        }
        return b.a(bVar, null, c0223a, false, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractSet] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.TreeSet] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection, java.util.TreeSet] */
    @Override // com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b
    public final void V2(@k EI0.b bVar) {
        b value;
        b bVarA;
        ?? E12;
        LinkedHashSet linkedHashSetI;
        Z1<b> z12 = this.f313130E;
        do {
            value = z12.getValue();
            bVarA = value;
            if (bVar instanceof b.C0224b) {
                Set<EI0.a> set = bVarA.f313131a;
                j jVar = ((b.C0224b) bVar).f3924a;
                if (!set.contains(jVar)) {
                    Set<EI0.a> set2 = bVarA.f313131a;
                    if (set2 instanceof TreeSet) {
                        ?? treeSet = new TreeSet(((TreeSet) set2).comparator());
                        treeSet.addAll(treeSet);
                        treeSet.add(jVar);
                        linkedHashSetI = treeSet;
                    } else {
                        linkedHashSetI = b1.i(set2, jVar);
                    }
                    bVarA = ke(b.a(bVarA, linkedHashSetI, null, false, 6));
                }
            } else if (bVar instanceof b.c) {
                Set<EI0.a> set3 = bVarA.f313131a;
                j jVar2 = ((b.c) bVar).f3925a;
                if (set3.contains(jVar2)) {
                    Set<EI0.a> set4 = bVarA.f313131a;
                    if (set4 instanceof TreeSet) {
                        TreeSet treeSet2 = (TreeSet) set4;
                        E12 = new TreeSet(treeSet2.comparator());
                        Iterator it = treeSet2.iterator();
                        while (it.hasNext()) {
                            EI0.a aVar = (EI0.a) it.next();
                            if (!L.f(aVar, jVar2)) {
                                E12.add(aVar);
                            }
                        }
                    } else {
                        E12 = b1.e(set4, jVar2);
                    }
                    EI0.a aVar2 = bVarA.f313132b;
                    if (L.f(aVar2, jVar2)) {
                        aVar2 = a.C0223a.f3921a;
                    }
                    bVarA = b.a(bVarA, E12, aVar2, false, 4);
                }
            } else if (bVar instanceof b.d) {
                bVarA = ke(b.a(bVarA, null, null, true, 3));
            } else {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVarA = b.a(bVarA, null, a.C0223a.f3921a, false, 1);
            }
        } while (!z12.N3(value, bVarA));
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super EI0.a> interfaceC43172j, @k Continuation<? super G0> continuation) {
        Object objCollect = C43175k.r(new C9597c(this.f313130E)).collect(interfaceC43172j, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(EI0.b bVar, Continuation continuation) {
        V2(bVar);
        return G0.f406611a;
    }

    /* compiled from: OverlayViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/overlay/core/c$b;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Set<EI0.a> f313131a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final EI0.a f313132b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f313133c;

        public b() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k Set<? extends EI0.a> set, @k EI0.a aVar, boolean z12) {
            this.f313131a = set;
            this.f313132b = aVar;
            this.f313133c = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(b bVar, AbstractSet abstractSet, EI0.a aVar, boolean z12, int i12) {
            Set set = abstractSet;
            if ((i12 & 1) != 0) {
                set = bVar.f313131a;
            }
            if ((i12 & 2) != 0) {
                aVar = bVar.f313132b;
            }
            if ((i12 & 4) != 0) {
                z12 = bVar.f313133c;
            }
            bVar.getClass();
            return new b(set, aVar, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f313131a, bVar.f313131a) && L.f(this.f313132b, bVar.f313132b) && this.f313133c == bVar.f313133c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f313133c) + ((this.f313132b.hashCode() + (this.f313131a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(overlayQueue=");
            sb2.append(this.f313131a);
            sb2.append(", runningOverlay=");
            sb2.append(this.f313132b);
            sb2.append(", isStarted=");
            return r.x(sb2, this.f313133c, ')');
        }

        public /* synthetic */ b(Set set, EI0.a aVar, boolean z12, int i12, C42822w c42822w) {
            this(set, (i12 & 2) != 0 ? a.C0223a.f3921a : aVar, (i12 & 4) != 0 ? false : z12);
        }

        public b(Comparator comparator, EI0.a aVar, boolean z12, int i12, C42822w c42822w) {
            this(new TreeSet(comparator), (i12 & 2) != 0 ? a.C0223a.f3921a : aVar, (i12 & 4) != 0 ? false : z12);
        }
    }
}

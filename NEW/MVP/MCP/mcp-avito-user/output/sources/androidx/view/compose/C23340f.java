package androidx.view.compose;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.r;
import androidx.compose.runtime.saveable.l;
import androidx.compose.runtime.snapshots.D;
import androidx.compose.ui.platform.C22543x1;
import androidx.view.C23395u;
import androidx.view.compose.C23348n;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: DialogHost.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002¨\u0006\u0005²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\nX\u008a\u0084\u0002"}, d2 = {"", "Landroidx/navigation/u;", "dialogBackStack", "", "transitionInProgress", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23340f {

    /* compiled from: DialogHost.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.f$a */
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23348n f52945l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C23395u f52946m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C23348n c23348n, C23395u c23395u) {
            super(0);
            this.f52945l = c23348n;
            this.f52946m = c23395u;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f52945l.i(this.f52946m, false);
            return G0.f406611a;
        }
    }

    /* compiled from: DialogHost.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.f$b */
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23395u f52947l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f52948m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ D<C23395u> f52949n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C23348n f52950o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C23348n.b f52951p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C23395u c23395u, l lVar, D<C23395u> d12, C23348n c23348n, C23348n.b bVar) {
            super(2);
            this.f52947l = c23395u;
            this.f52948m = lVar;
            this.f52949n = d12;
            this.f52950o = c23348n;
            this.f52951p = bVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                C23395u c23395u = this.f52947l;
                C22187u0.a(c23395u, new C23342h(this.f52949n, c23395u, this.f52950o), a13);
                C23352r.a(c23395u, this.f52948m, r.b(a13, -497631156, new C23343i(this.f52951p, c23395u)), a13, 456);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DialogHost.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.navigation.compose.f$c */
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f52952q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C23348n f52953r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ D<C23395u> f52954s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC22204y1 interfaceC22204y1, C23348n c23348n, D d12, Continuation continuation) {
            super(2, continuation);
            this.f52952q = interfaceC22204y1;
            this.f52953r = c23348n;
            this.f52954s = d12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new c(this.f52952q, this.f52953r, this.f52954s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            for (C23395u c23395u : (Set) this.f52952q.getF42167b()) {
                C23348n c23348n = this.f52953r;
                if (!c23348n.b().f52865e.getValue().contains(c23395u) && !this.f52954s.contains(c23395u)) {
                    c23348n.b().b(c23395u);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DialogHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.f$d */
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23348n f52955l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C23348n c23348n, int i12) {
            super(2);
            this.f52955l = c23348n;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            C23340f.a(this.f52955l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.view.compose.C23348n r16, @Y61.l androidx.compose.runtime.A r17, int r18) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.compose.C23340f.a(androidx.navigation.compose.n, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    public static final void b(@k D d12, @k Collection collection, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1537894851);
        boolean zBooleanValue = ((Boolean) bE2.o(C22543x1.f41638a)).booleanValue();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C23395u c23395u = (C23395u) it.next();
            C22187u0.a(c23395u.f53188i, new C23346l(d12, c23395u, zBooleanValue), bE2);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C23347m(d12, collection, i12);
    }
}

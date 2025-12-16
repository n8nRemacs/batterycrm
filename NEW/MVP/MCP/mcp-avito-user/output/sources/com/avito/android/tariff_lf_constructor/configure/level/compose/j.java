package com.avito.android.tariff_lf_constructor.configure.level.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
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
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import mD0.C43952d;
import mD0.InterfaceC43949a;
import mD0.InterfaceC43951c;

/* compiled from: ConstructorConfigureLevelScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "backEvent", "Lkotlin/Function1;", "Lcom/avito/android/deep_linking/links/DeepLink;", "deepLinkEvent", "_avito_tariff-lf-constructor_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    /* compiled from: ConstructorConfigureLevelScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff_lf_constructor.configure.level.compose.ConstructorConfigureLevelScreenKt$ConstructorConfigureLevelScreen$1", f = "ConstructorConfigureLevelScreen.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f299767q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC43951c> f299768r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f299769s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f299770t;

        /* compiled from: ConstructorConfigureLevelScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LmD0/c;", "event", "Lkotlin/G0;", "emit", "(LmD0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.tariff_lf_constructor.configure.level.compose.j$a$a, reason: collision with other inner class name */
        public static final class C9173a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f299771b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f299772c;

            public C9173a(InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
                this.f299771b = interfaceC22204y1;
                this.f299772c = interfaceC22204y12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC43951c interfaceC43951c = (InterfaceC43951c) obj;
                if (interfaceC43951c instanceof InterfaceC43951c.a) {
                    ((Y41.a) this.f299771b.getF42167b()).invoke();
                } else if (interfaceC43951c instanceof InterfaceC43951c.b) {
                    ((Y41.l) this.f299772c.getF42167b()).invoke(((InterfaceC43951c.b) interfaceC43951c).f414424a);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
            super(2, continuation);
            this.f299768r = interfaceC43160i;
            this.f299769s = interfaceC22204y1;
            this.f299770t = interfaceC22204y12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f299768r, this.f299769s, this.f299770t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f299767q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C9173a c9173a = new C9173a(this.f299769s, this.f299770t);
                this.f299767q = 1;
                if (this.f299768r.collect(c9173a, this) == coroutine_suspended) {
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

    /* compiled from: ConstructorConfigureLevelScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C43952d f299773l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC43949a, G0> f299774m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(C43952d c43952d, Y41.l<? super InterfaceC43949a, G0> lVar) {
            super(2);
            this.f299773l = c43952d;
            this.f299774m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                FillElement fillElement = C20588k2.f28682c;
                aVar.getClass();
                C43952d c43952d = this.f299773l;
                Y41.l<InterfaceC43949a, G0> lVar = this.f299774m;
                C22096n c22096nC = androidx.compose.runtime.internal.r.c(-1556251499, new l(c43952d, lVar), a13);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.scaffold.g.a(fillElement, c22096nC, null, null, null, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, androidx.compose.runtime.internal.r.c(-1688213204, new o(c43952d, lVar), a13), a13, 12582966, 92);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ConstructorConfigureLevelScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C43952d f299775l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC43951c> f299776m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC43949a, G0> f299777n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f299778o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f299779p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(C43952d c43952d, InterfaceC43160i<? extends InterfaceC43951c> interfaceC43160i, Y41.l<? super InterfaceC43949a, G0> lVar, Y41.l<? super DeepLink, G0> lVar2, Y41.a<G0> aVar, int i12) {
            super(2);
            this.f299775l = c43952d;
            this.f299776m = interfaceC43160i;
            this.f299777n = lVar;
            this.f299778o = lVar2;
            this.f299779p = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(73);
            Y41.a<G0> aVar = this.f299779p;
            InterfaceC43160i<InterfaceC43951c> interfaceC43160i = this.f299776m;
            Y41.l<InterfaceC43949a, G0> lVar = this.f299777n;
            j.a(this.f299775l, interfaceC43160i, lVar, this.f299778o, aVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C43952d c43952d, @Y61.k InterfaceC43160i<? extends InterfaceC43951c> interfaceC43160i, @Y61.k Y41.l<? super InterfaceC43949a, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2, @Y61.k Y41.a<G0> aVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(968310548);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(aVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar2, bE2);
        C22187u0.d(new a(interfaceC43160i, interfaceC22204y1M, interfaceC22204y1M2, null), bE2, G0.f406611a);
        com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1406732327, new b(c43952d, lVar), bE2), bE2, 48, 1);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(c43952d, interfaceC43160i, lVar, lVar2, aVar, i12);
        }
    }

    public static final void b(C43952d c43952d, Y41.l lVar, A a12, int i12) {
        B bE2 = a12.E(-1822671834);
        C20650b.a(null, (w0) com.avito.android.analytics.screens.compose.s.b(v.f299798l, bE2), null, false, null, null, null, false, null, new t(c43952d, lVar), bE2, 0, 509);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new u(c43952d, lVar, i12);
        }
    }
}

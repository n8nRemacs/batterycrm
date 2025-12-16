package com.avito.android.cpt.pre_activation.ui;

import Xr.InterfaceC17041b;
import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.core.os.C22777e;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PreActivationScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cpt.pre_activation.ui.PreActivationScreenKt$PreActivationScreen$1", f = "PreActivationScreen.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f126754q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC17041b> f126755r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f126756s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f126757t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f126758u;

    /* compiled from: PreActivationScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXr/b;", "event", "Lkotlin/G0;", "emit", "(LXr/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cpt.pre_activation.ui.a$a, reason: collision with other inner class name */
    public static final class C3778a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f126759b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f126760c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f126761d;

        public C3778a(com.avito.android.lib.design.bottom_sheet.d dVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
            this.f126759b = dVar;
            this.f126760c = interfaceC22204y1;
            this.f126761d = interfaceC22204y12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC17041b interfaceC17041b = (InterfaceC17041b) obj;
            if (interfaceC17041b instanceof InterfaceC17041b.C1353b) {
                InterfaceC17041b.C1353b c1353b = (InterfaceC17041b.C1353b) interfaceC17041b;
                ((p) this.f126760c.getF42167b()).invoke(c1353b.f19087a, Boxing.boxBoolean(c1353b.f19088b));
            } else if (L.f(interfaceC17041b, InterfaceC17041b.a.f19086a)) {
                this.f126759b.dismiss();
            } else if (interfaceC17041b instanceof InterfaceC17041b.c) {
                ((l) this.f126761d.getF42167b()).invoke(C22777e.b(new Q("cpt_mass_activation_key_deeplink", ((InterfaceC17041b.c) interfaceC17041b).f19089a)));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC43160i interfaceC43160i, com.avito.android.lib.design.bottom_sheet.d dVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
        super(2, continuation);
        this.f126755r = interfaceC43160i;
        this.f126756s = dVar;
        this.f126757t = interfaceC22204y1;
        this.f126758u = interfaceC22204y12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f126757t;
        InterfaceC22204y1 interfaceC22204y12 = this.f126758u;
        return new a(this.f126755r, this.f126756s, interfaceC22204y1, interfaceC22204y12, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f126754q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C3778a c3778a = new C3778a(this.f126756s, this.f126757t, this.f126758u);
            this.f126754q = 1;
            if (this.f126755r.collect(c3778a, this) == coroutine_suspended) {
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

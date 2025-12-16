package com.avito.android.fees_methods.screen.fees_by_package.ui.compose;

import FE.b;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FeesByPackageScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.fees_methods.screen.fees_by_package.ui.compose.FeesByPackageScreenKt$FeesByPackageScreen$1", f = "FeesByPackageScreen.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f158084q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<FE.b> f158085r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f158086s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158087t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158088u;

    /* compiled from: FeesByPackageScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFE/b;", "event", "Lkotlin/G0;", "emit", "(LFE/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.fees_methods.screen.fees_by_package.ui.compose.a$a, reason: collision with other inner class name */
    public static final class C4622a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f158089b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f158090c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f158091d;

        public C4622a(androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
            this.f158089b = mVar;
            this.f158090c = interfaceC22204y1;
            this.f158091d = interfaceC22204y12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            FE.b bVar = (FE.b) obj;
            if (bVar instanceof b.a) {
                androidx.appcompat.app.m mVar = this.f158089b;
                if (mVar != null) {
                    mVar.onBackPressed();
                }
            } else if (bVar instanceof b.c) {
                ((Y41.l) this.f158090c.getF42167b()).invoke(((b.c) bVar).f4651a);
            } else if (bVar instanceof b.C0285b) {
                ((Y41.a) this.f158091d.getF42167b()).invoke();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC43160i interfaceC43160i, androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
        super(2, continuation);
        this.f158085r = interfaceC43160i;
        this.f158086s = mVar;
        this.f158087t = interfaceC22204y1;
        this.f158088u = interfaceC22204y12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f158085r, this.f158086s, this.f158087t, this.f158088u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f158084q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C4622a c4622a = new C4622a(this.f158086s, this.f158087t, this.f158088u);
            this.f158084q = 1;
            if (this.f158085r.collect(c4622a, this) == coroutine_suspended) {
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

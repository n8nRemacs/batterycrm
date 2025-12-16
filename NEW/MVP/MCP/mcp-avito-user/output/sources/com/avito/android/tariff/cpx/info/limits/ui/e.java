package com.avito.android.tariff.cpx.info.limits.ui;

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
import vB0.b;

/* compiled from: TariffCpxInfoLimitsScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpx.info.limits.ui.TariffCpxInfoLimitsScreenKt$TariffCpxInfoLimitsScreen$1", f = "TariffCpxInfoLimitsScreen.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f296637q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<vB0.b> f296638r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f296639s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f296640t;

    /* compiled from: TariffCpxInfoLimitsScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LvB0/b;", "event", "Lkotlin/G0;", "emit", "(LvB0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.m f296641b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f296642c;

        public a(androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1) {
            this.f296641b = mVar;
            this.f296642c = interfaceC22204y1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            vB0.b bVar = (vB0.b) obj;
            if (bVar instanceof b.a) {
                androidx.appcompat.app.m mVar = this.f296641b;
                if (mVar != null) {
                    mVar.onBackPressed();
                }
            } else if (bVar instanceof b.C12749b) {
                Y41.l lVar = (Y41.l) this.f296642c.getF42167b();
                ((b.C12749b) bVar).getClass();
                lVar.invoke(null);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC43160i interfaceC43160i, androidx.appcompat.app.m mVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f296638r = interfaceC43160i;
        this.f296639s = mVar;
        this.f296640t = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f296638r, this.f296639s, this.f296640t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f296637q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f296639s, this.f296640t);
            this.f296637q = 1;
            if (this.f296638r.collect(aVar, this) == coroutine_suspended) {
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

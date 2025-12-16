package com.avito.android.multigeo_flow.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.remote.model.TypedResult;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;

/* compiled from: JobMultiGeoEditDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multigeo_flow.deeplink.JobMultiGeoEditDeeplinkHandler$onDeleteClicked$1", f = "JobMultiGeoEditDeeplinkHandler.kt", i = {}, l = {UpdateStatusCode.DialogButton.CONFIRM}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.multigeo_flow.deeplink.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32888j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206831q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206832r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f206833s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AddressItem f206834t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f206835u;

    /* compiled from: JobMultiGeoEditDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LP20/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multigeo_flow.deeplink.JobMultiGeoEditDeeplinkHandler$onDeleteClicked$1$request$1", f = "JobMultiGeoEditDeeplinkHandler.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.multigeo_flow.deeplink.j$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<P20.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f206836q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ o f206837r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AddressItem f206838s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f206839t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, AddressItem addressItem, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f206837r = oVar;
            this.f206838s = addressItem;
            this.f206839t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f206837r, this.f206838s, this.f206839t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<P20.d>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f206836q;
            if (i12 == 0) {
                C42729a0.b(obj);
                o oVar = this.f206837r;
                AddressItem addressItem = this.f206838s;
                this.f206836q = 1;
                obj = oVar.f206852i.a(this.f206839t, addressItem.f206875c, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32888j(o oVar, AddressItem addressItem, String str, Continuation<? super C32888j> continuation) {
        super(2, continuation);
        this.f206833s = oVar;
        this.f206834t = addressItem;
        this.f206835u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32888j c32888j = new C32888j(this.f206833s, this.f206834t, this.f206835u, continuation);
        c32888j.f206832r = obj;
        return c32888j;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C32888j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206831q;
        AddressItem addressItem = this.f206834t;
        o oVar = this.f206833s;
        a.g gVar = oVar.f206850g;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f206832r;
            gVar.g(null, true);
            InterfaceC43076a0 interfaceC43076a0B = C43259k.b(t12, null, new a(oVar, addressItem, this.f206835u, null), 3);
            this.f206831q = 1;
            obj = interfaceC43076a0B.F(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        gVar.g(null, false);
        if (typedResult instanceof TypedResult.Success) {
            oVar.j(new JobMultiGeoLink.a.b(addressItem.f206875c, addressItem.f206876d, ((P20.d) ((TypedResult.Success) typedResult).getResult()).getJwt(), addressItem.f206874b));
        } else if (typedResult instanceof TypedResult.Error) {
            oVar.j(JobMultiGeoLink.a.d.f206983b);
        }
        return G0.f406611a;
    }
}

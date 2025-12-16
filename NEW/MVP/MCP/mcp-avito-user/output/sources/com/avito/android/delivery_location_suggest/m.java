package com.avito.android.delivery_location_suggest;

import Mn0.InterfaceC14512b;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import com.avito.android.geo_common.model.CoordsByAddressResult;
import com.avito.android.location_picker.providers.InterfaceC31564a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.Q;
import nF.C44245a;

/* compiled from: DeliveryLocationSuggestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/m;", "Lcom/avito/android/delivery_location_suggest/l;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31564a f135140a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f135141b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f135142c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14512b f135143d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C44245a f135144e;

    /* compiled from: DeliveryLocationSuggestInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/geo_common/model/CoordsByAddressResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_location_suggest.DeliveryLocationSuggestInteractorImpl$loadCoords$1", f = "DeliveryLocationSuggestInteractor.kt", i = {}, l = {89, 89}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CoordsByAddressResult>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f135145q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f135146r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f135148t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f135148t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = m.this.new a(this.f135148t, continuation);
            aVar.f135146r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CoordsByAddressResult> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f135145q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f135146r;
                InterfaceC31564a interfaceC31564a = m.this.f135140a;
                this.f135146r = interfaceC43172j;
                this.f135145q = 1;
                obj = interfaceC31564a.c(this.f135148t, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f135146r;
                C42729a0.b(obj);
            }
            this.f135146r = null;
            this.f135145q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public m(@Y61.k InterfaceC31564a interfaceC31564a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k R0 r02, @Y61.k InterfaceC14512b interfaceC14512b, @Y61.k C44245a c44245a) {
        this.f135140a = interfaceC31564a;
        this.f135141b = interfaceC35745a5;
        this.f135142c = r02;
        this.f135143d = interfaceC14512b;
        this.f135144e = c44245a;
    }

    @Override // com.avito.android.delivery_location_suggest.l
    @Y61.k
    public final W a(@Y61.k String str, @Y61.k DeliveryLocationSuggestParams deliveryLocationSuggestParams) {
        I iR2;
        boolean z12 = deliveryLocationSuggestParams instanceof DeliveryLocationSuggestParams.Bounds;
        InterfaceC35745a5 interfaceC35745a5 = this.f135141b;
        if (z12) {
            C44245a c44245a = this.f135144e;
            c44245a.getClass();
            kotlin.reflect.n<Object> nVar = C44245a.f414956i[5];
            if (((Boolean) c44245a.f414962g.a().invoke()).booleanValue()) {
                iR2 = Q.a(EmptyCoroutineContext.INSTANCE, new n(this, str, deliveryLocationSuggestParams, null)).r(o.f135210b).z(interfaceC35745a5.a());
            } else {
                MapBounds mapBounds = ((DeliveryLocationSuggestParams.Bounds) deliveryLocationSuggestParams).f135036b;
                Point point = mapBounds.f135040b;
                AvitoMapPoint avitoMapPoint = new AvitoMapPoint(point.f135042b, point.f135043c, null, 4, null);
                Point point2 = mapBounds.f135041c;
                iR2 = this.f135140a.d(str, new AvitoMapBounds(avitoMapPoint, new AvitoMapPoint(point2.f135042b, point2.f135043c, null, 4, null)));
            }
        } else {
            if (!(deliveryLocationSuggestParams instanceof DeliveryLocationSuggestParams.ItemLocationId)) {
                throw new NoWhenBranchMatchedException();
            }
            iR2 = this.f135143d.b(str, ((DeliveryLocationSuggestParams.ItemLocationId) deliveryLocationSuggestParams).f135038b).r(p.f135211b);
        }
        return iR2.z(interfaceC35745a5.a());
    }

    @Override // com.avito.android.delivery_location_suggest.l
    @Y61.k
    public final InterfaceC43160i<CoordsByAddressResult> b(@Y61.k String str) {
        return C43175k.I(this.f135142c.a(), C43175k.G(new a(str, null)));
    }
}

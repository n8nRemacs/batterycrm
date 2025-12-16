package com.avito.android.user_address.map.mvi;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.geo_common.model.location_picker.LocationPickerAddressType;
import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import com.avito.android.user_address.model.ValidateByCoordsResult;
import java.util.Locale;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nF.C44245a;

/* compiled from: UserAddressMapMviActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapMviActor$processEditAddress$1", f = "UserAddressMapMviActor.kt", i = {0, 1, 1, 1, 1}, l = {390, 413, 433}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "savedAddress", "savedAddressKind", "savedAddressId"}, s = {"L$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes4.dex */
final class F extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f307666q;

    /* renamed from: r, reason: collision with root package name */
    public String f307667r;

    /* renamed from: s, reason: collision with root package name */
    public int f307668s;

    /* renamed from: t, reason: collision with root package name */
    public int f307669t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f307670u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ UserAddressMapFullAddressMviState f307671v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ B f307672w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(UserAddressMapFullAddressMviState userAddressMapFullAddressMviState, B b12, Continuation<? super F> continuation) {
        super(2, continuation);
        this.f307671v = userAddressMapFullAddressMviState;
        this.f307672w = b12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        F f12 = new F(this.f307671v, this.f307672w, continuation);
        f12.f307670u = obj;
        return f12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((F) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        String str;
        int i12;
        String str2;
        Object objI;
        String str3;
        int i13;
        String str4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = this.f307669t;
        if (i14 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f307670u;
            UserAddressMapFullAddressMviState userAddressMapFullAddressMviState = this.f307671v;
            int i15 = userAddressMapFullAddressMviState.f307735l;
            ValidateByCoordsResult.Address address = userAddressMapFullAddressMviState.f307729f;
            String strE = address.e();
            LocationPickerAddressType locationPickerAddressType = userAddressMapFullAddressMviState.f307740q;
            String str5 = locationPickerAddressType.f159426c;
            B b12 = this.f307672w;
            C44245a c44245a = b12.f307649h;
            c44245a.getClass();
            kotlin.reflect.n<Object> nVar = C44245a.f414956i[1];
            boolean zBooleanValue = ((Boolean) c44245a.f414958c.a().invoke()).booleanValue();
            String str6 = userAddressMapFullAddressMviState.f307739p;
            String str7 = userAddressMapFullAddressMviState.f307737n;
            String str8 = userAddressMapFullAddressMviState.f307738o;
            String str9 = userAddressMapFullAddressMviState.f307736m;
            AvitoMapCameraPosition avitoMapCameraPosition = userAddressMapFullAddressMviState.f307726c;
            com.avito.android.user_address.map.domain.d dVar = b12.f307643b;
            if (zBooleanValue) {
                String lowerCase = locationPickerAddressType.toString().toLowerCase(Locale.ROOT);
                String strE2 = address.e();
                com.avito.android.user_address.map.domain.b bVar = new com.avito.android.user_address.map.domain.b(avitoMapCameraPosition.getMapPoint().getLatitude(), avitoMapCameraPosition.getMapPoint().getLongitude());
                com.avito.android.user_address.map.domain.c cVar = new com.avito.android.user_address.map.domain.c(userAddressMapFullAddressMviState.f307735l, strE2, lowerCase, new aH0.g(str9, str8, str7, str6), bVar);
                this.f307670u = interfaceC43172j;
                this.f307669t = 1;
                objI = dVar.i(cVar, this);
                if (objI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aH0.l lVar = (aH0.l) objI;
                int addressId = lVar.getAddressId();
                String address2 = lVar.getAddress();
                str3 = lVar.getAddressKind().f159426c;
                i13 = addressId;
                str4 = address2;
            } else {
                String lowerCase2 = locationPickerAddressType.toString().toLowerCase(Locale.ROOT);
                String strE3 = address.e();
                com.avito.android.user_address.map.domain.b bVar2 = new com.avito.android.user_address.map.domain.b(avitoMapCameraPosition.getMapPoint().getLatitude(), avitoMapCameraPosition.getMapPoint().getLongitude());
                com.avito.android.user_address.map.domain.c cVar2 = new com.avito.android.user_address.map.domain.c(userAddressMapFullAddressMviState.f307735l, strE3, lowerCase2, new aH0.g(str9, str8, str7, str6), bVar2);
                this.f307670u = interfaceC43172j;
                this.f307666q = strE;
                this.f307667r = str5;
                this.f307668s = i15;
                this.f307669t = 2;
                if (dVar.f(cVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str5;
                i12 = i15;
                str2 = strE;
                i13 = i12;
                str3 = str;
                str4 = str2;
            }
        } else if (i14 == 1) {
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f307670u;
            C42729a0.b(obj);
            interfaceC43172j = interfaceC43172j2;
            objI = obj;
            aH0.l lVar2 = (aH0.l) objI;
            int addressId2 = lVar2.getAddressId();
            String address22 = lVar2.getAddress();
            str3 = lVar2.getAddressKind().f159426c;
            i13 = addressId2;
            str4 = address22;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            i12 = this.f307668s;
            str = this.f307667r;
            str2 = this.f307666q;
            interfaceC43172j = (InterfaceC43172j) this.f307670u;
            C42729a0.b(obj);
            i13 = i12;
            str3 = str;
            str4 = str2;
        }
        UserAddressMapMviInternalAction.ProceedUpdateAddressSuccessMap proceedUpdateAddressSuccessMap = new UserAddressMapMviInternalAction.ProceedUpdateAddressSuccessMap(i13, null, str4, str3, null, null, null);
        this.f307670u = null;
        this.f307666q = null;
        this.f307667r = null;
        this.f307669t = 3;
        if (interfaceC43172j.emit(proceedUpdateAddressSuccessMap, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}

package com.avito.android.user_address.map.mvi;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.user_address.NavigationController;
import com.avito.android.user_address.UserAddressActivity;
import com.avito.android.user_address.map.domain.UserAddressMultiGeoData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressMapFlowUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.map.mvi.UserAddressMapFlowUtilsKt$moveMapToCameraPositionMultiGeoFlow$1", f = "UserAddressMapFlowUtils.kt", i = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8}, l = {237, 242, 244, 253, 262, 263, 264, 265, 266, 267}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "data", "$this$flow", "data", "$this$flow", "data", "$this$flow", "data", "$this$flow", "data"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.user_address.map.mvi.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35368v extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressMapMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public UserAddressMultiGeoData f307920q;

    /* renamed from: r, reason: collision with root package name */
    public int f307921r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f307922s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserAddressAddNewAddressMviState f307923t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AvitoMapCameraPosition f307924u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo f307925v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_address.map.domain.d f307926w;

    /* compiled from: UserAddressMapFlowUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_address.map.mvi.v$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[NavigationController.Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                NavigationController.Mode mode = NavigationController.Mode.f307098b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35368v(UserAddressAddNewAddressMviState userAddressAddNewAddressMviState, AvitoMapCameraPosition avitoMapCameraPosition, UserAddressActivity.UserAddressActivityOpenParams.FragmentsParams.Map.MultiGeo multiGeo, com.avito.android.user_address.map.domain.d dVar, Continuation<? super C35368v> continuation) {
        super(2, continuation);
        this.f307923t = userAddressAddNewAddressMviState;
        this.f307924u = avitoMapCameraPosition;
        this.f307925v = multiGeo;
        this.f307926w = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35368v c35368v = new C35368v(this.f307923t, this.f307924u, this.f307925v, this.f307926w, continuation);
        c35368v.f307922s = obj;
        return c35368v;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserAddressMapMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C35368v) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.map.mvi.C35368v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

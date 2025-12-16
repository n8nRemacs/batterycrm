package com.avito.android.bxcontent.mvi;

import com.avito.android.AnalyticParams;
import com.avito.android.bxcontent.model.AdvertListData;
import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.model.BxContentResult;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpDisplayTypeKt;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.serp.adapter.LayoutType;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/BxContentResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getItemListForPushContent$additionalTopicsFlows$1$1", f = "BxContentInteractor.kt", i = {}, l = {1337, 1336}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class S extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<BxContentResult>>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ LayoutType f111458A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ String f111459B;

    /* renamed from: q, reason: collision with root package name */
    public int f111460q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f111461r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f111462s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdvertListData f111463t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f111464u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AnalyticParams f111465v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SerpDisplayType f111466w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f111467x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f111468y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f111469z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(F f12, AdvertListData advertListData, String str, AnalyticParams analyticParams, SerpDisplayType serpDisplayType, String str2, String str3, String str4, LayoutType layoutType, String str5, Continuation<? super S> continuation) {
        super(2, continuation);
        this.f111462s = f12;
        this.f111463t = advertListData;
        this.f111464u = str;
        this.f111465v = analyticParams;
        this.f111466w = serpDisplayType;
        this.f111467x = str2;
        this.f111468y = str3;
        this.f111469z = str4;
        this.f111458A = layoutType;
        this.f111459B = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        S s5 = new S(this.f111462s, this.f111463t, this.f111464u, this.f111465v, this.f111466w, this.f111467x, this.f111468y, this.f111469z, this.f111458A, this.f111459B, continuation);
        s5.f111461r = obj;
        return s5;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<BxContentResult>> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((S) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object objD;
        Object obj2;
        Object obj3;
        S s5;
        InterfaceC43172j interfaceC43172j;
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, String> map3;
        Map<String, String> map4;
        Map<String, String> map5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f111460q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f111461r;
            InterfaceC34323k interfaceC34323k = this.f111462s.f111279a.get();
            String strO = C42745f0.O(this.f111463t.f111191c, ",", null, null, null, 62);
            String str = this.f111464u;
            if (str == null) {
                str = "landing";
            }
            AnalyticParams analyticParams = this.f111465v;
            String str2 = (analyticParams == null || (map5 = analyticParams.f67181b) == null) ? null : map5.get("notification_message_id");
            String str3 = (analyticParams == null || (map4 = analyticParams.f67181b) == null) ? null : map4.get("notification_id");
            String str4 = (analyticParams == null || (map3 = analyticParams.f67181b) == null) ? null : map3.get("launch_id");
            String str5 = (analyticParams == null || (map2 = analyticParams.f67181b) == null) ? null : map2.get("group_id");
            String str6 = (analyticParams == null || (map = analyticParams.f67181b) == null) ? null : map.get("campaign_id");
            SerpDisplayType serpDisplayType = this.f111466w;
            String parameterValue = serpDisplayType != null ? SerpDisplayTypeKt.toParameterValue(serpDisplayType) : null;
            LayoutType layoutType = this.f111458A;
            String str7 = layoutType != null ? layoutType.f268516b : null;
            this.f111461r = interfaceC43172j2;
            this.f111460q = 1;
            objD = interfaceC34323k.d(strO, str, str2, str3, str4, str5, str6, parameterValue, this.f111467x, this.f111468y, this.f111469z, str7, this.f111459B, null, this);
            obj2 = coroutine_suspended;
            if (objD == obj2) {
                return obj2;
            }
            obj3 = null;
            s5 = this;
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            InterfaceC43172j interfaceC43172j3 = (InterfaceC43172j) this.f111461r;
            C42729a0.b(obj);
            interfaceC43172j = interfaceC43172j3;
            obj2 = coroutine_suspended;
            s5 = this;
            obj3 = null;
            objD = obj;
        }
        s5.f111461r = obj3;
        s5.f111460q = 2;
        if (interfaceC43172j.emit(objD, s5) == obj2) {
            return obj2;
        }
        return kotlin.G0.f406611a;
    }
}

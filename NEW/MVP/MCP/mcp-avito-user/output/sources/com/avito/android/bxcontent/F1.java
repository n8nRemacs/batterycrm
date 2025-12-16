package com.avito.android.bxcontent;

import com.avito.android.remote.InterfaceC34323k;
import com.avito.android.remote.model.BxContentResult;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpDisplayTypeKt;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.serp.i;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxSingleItemLoader.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/serp/adapter/l1;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxSingleItemLoaderImpl$loadSingleItemInList$1", f = "BxSingleItemLoader.kt", i = {0}, l = {48, 62, 71}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class F1 extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.serp.adapter.l1>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f109324q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f109325r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G1 f109326s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PresentationType f109327t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Long f109328u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f109329v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SearchParams f109330w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f109331x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(G1 g12, PresentationType presentationType, Long l12, String str, SearchParams searchParams, String str2, Continuation continuation) {
        super(2, continuation);
        this.f109326s = g12;
        this.f109327t = presentationType;
        this.f109328u = l12;
        this.f109329v = str;
        this.f109330w = searchParams;
        this.f109331x = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        F1 f12 = new F1(this.f109326s, this.f109327t, this.f109328u, this.f109329v, this.f109330w, this.f109331x, continuation);
        f12.f109325r = obj;
        return f12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.serp.adapter.l1> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((F1) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Map mapSingletonMap;
        SearchParams searchParams;
        G1 g12;
        String str;
        String str2;
        Object objB;
        Object obj2;
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f109324q;
        String str3 = this.f109331x;
        SearchParams searchParams2 = this.f109330w;
        G1 g13 = this.f109326s;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f109325r;
            InterfaceC34323k interfaceC34323k = g13.f109335a.get();
            String parameterValue = PresentationTypeKt.toParameterValue(this.f109327t);
            Integer numBoxInt = Boxing.boxInt(1);
            if (searchParams2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(SearchParamsConverter.DefaultImpls.convertToMap$default(g13.f109337c, searchParams2, null, false, null, 14, null));
                linkedHashMap.put("itemIds", str3);
                mapSingletonMap = linkedHashMap;
            } else {
                mapSingletonMap = Collections.singletonMap("itemIds", str3);
            }
            SerpDisplayType displayType = (searchParams2 == null ? SearchParams.INSTANCE.getEMPTY() : searchParams2).getDisplayType();
            String parameterValue2 = displayType != null ? SerpDisplayTypeKt.toParameterValue(displayType) : null;
            this.f109325r = interfaceC43172j2;
            this.f109324q = 1;
            searchParams = searchParams2;
            g12 = g13;
            str = null;
            str2 = str3;
            objB = InterfaceC34323k.a.b(interfaceC34323k, null, parameterValue, numBoxInt, this.f109328u, this.f109329v, null, mapSingletonMap, null, null, null, parameterValue2, null, null, null, null, null, null, this, 516099);
            obj2 = coroutine_suspended;
            if (objB == obj2) {
                return obj2;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            InterfaceC43172j interfaceC43172j3 = (InterfaceC43172j) this.f109325r;
            C42729a0.b(obj);
            interfaceC43172j = interfaceC43172j3;
            str2 = str3;
            g12 = g13;
            searchParams = searchParams2;
            obj2 = coroutine_suspended;
            objB = obj;
            str = null;
        }
        TypedResult typedResult = (TypedResult) objB;
        if (typedResult instanceof TypedResult.Error) {
            String str4 = str;
            this.f109325r = str4;
            this.f109324q = 2;
            if (interfaceC43172j.emit(str4, this) == obj2) {
                return obj2;
            }
        } else {
            String str5 = str;
            if (typedResult instanceof TypedResult.Success) {
                BxContentResult bxContentResult = (BxContentResult) ((TypedResult.Success) typedResult).getResult();
                com.avito.android.serp.i iVar = g12.f109336b;
                List<SerpElement> items = bxContentResult.getItems();
                SerpDisplayType serpDisplayTypeOrDefault = SerpDisplayTypeKt.orDefault(bxContentResult.getDisplayType());
                String categoryId = searchParams != null ? searchParams.getCategoryId() : str5;
                Boolean boolIsVerticalMain = bxContentResult.isVerticalMain();
                for (Object obj3 : i.a.a(iVar, items, serpDisplayTypeOrDefault, categoryId, null, boolIsVerticalMain != null ? boolIsVerticalMain.booleanValue() : false, null, 104)) {
                    String str6 = str2;
                    if (kotlin.jvm.internal.L.f(((com.avito.android.serp.adapter.l1) obj3).getF262931b(), str6)) {
                        this.f109325r = str5;
                        this.f109324q = 3;
                        if (interfaceC43172j.emit(obj3, this) == obj2) {
                            return obj2;
                        }
                    } else {
                        str2 = str6;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return kotlin.G0.f406611a;
    }
}

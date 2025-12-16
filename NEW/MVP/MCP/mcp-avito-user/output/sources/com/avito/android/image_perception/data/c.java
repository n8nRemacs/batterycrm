package com.avito.android.image_perception.data;

import AM.e;
import AM.f;
import AM.h;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalColor;
import io.reactivex.rxjava3.core.K;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import zM.InterfaceC50484a;

/* compiled from: ImagePerceptionRepository.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.image_perception.data.ImagePerceptionRepositoryImpl$loadImageBadges$2$job$1", f = "ImagePerceptionRepository.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f169562q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f169563r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f169564s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f169565t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ K<Map<String, List<InterfaceC33208b.a>>> f169566u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ArrayList arrayList, LinkedHashMap linkedHashMap, K k12, Continuation continuation) {
        super(2, continuation);
        this.f169563r = dVar;
        this.f169564s = arrayList;
        this.f169565t = linkedHashMap;
        this.f169566u = k12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        LinkedHashMap linkedHashMap = this.f169565t;
        K<Map<String, List<InterfaceC33208b.a>>> k12 = this.f169566u;
        return new c(this.f169563r, this.f169564s, linkedHashMap, k12, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object objA;
        Map<String, AM.d> mapC;
        ?? arrayList;
        AM.a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f169562q;
        ArrayList arrayList2 = this.f169564s;
        K<Map<String, List<InterfaceC33208b.a>>> k12 = this.f169566u;
        d dVar = this.f169563r;
        InterfaceC33208b.a.C6539a c6539a = null;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC50484a interfaceC50484a = dVar.f169567a;
                LinkedHashMap linkedHashMap = this.f169565t;
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                h hVar = new h(null, arrayList2, null, linkedHashMap);
                this.f169562q = 1;
                objA = interfaceC50484a.a(hVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                objA = obj;
            }
            TypedResult typedResult = (TypedResult) objA;
            TypedResult.Success success = typedResult instanceof TypedResult.Success ? (TypedResult.Success) typedResult : null;
            if (success == null || (aVar = (AM.a) success.getResult()) == null || (mapC = aVar.a()) == null) {
                mapC = P0.c();
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(mapC.size()));
            for (Object obj2 : mapC.entrySet()) {
                Object key = ((Map.Entry) obj2).getKey();
                List<e> listA = ((AM.d) ((Map.Entry) obj2).getValue()).a();
                if (listA != null) {
                    List<e> list = listA;
                    arrayList = new ArrayList(C42745f0.q(list, 10));
                    for (e eVar : list) {
                        PrintableText printableTextF = com.avito.android.printable_text.b.f(eVar.getTitle());
                        UniversalColor universalColorE = d.e(dVar, eVar);
                        String badgeID = eVar.getBadgeID();
                        f tooltip = eVar.getTooltip();
                        arrayList.add(new InterfaceC33208b.a(printableTextF, null, universalColorE, badgeID, tooltip != null ? new InterfaceC33208b.a.C6539a(tooltip.getTitle(), tooltip.getDescription()) : c6539a));
                        c6539a = null;
                    }
                } else {
                    arrayList = C42784z0.f406748b;
                }
                linkedHashMap2.put(key, arrayList);
                c6539a = null;
            }
            if (!k12.i()) {
                dVar.f169569c = linkedHashMap2;
                dVar.f169570d.put(arrayList2, linkedHashMap2);
                k12.onSuccess(linkedHashMap2);
            }
        } catch (Exception e12) {
            if (!k12.i()) {
                k12.onError(e12);
            }
        }
        return G0.f406611a;
    }
}

package com.avito.android.similar_adverts.mvi;

import Lw0.InterfaceC14445b;
import Ow0.b;
import Y41.p;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.section.SectionTypeItem;
import com.avito.android.similar_adverts.mvi.entity.Engine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import l41.o;

/* compiled from: SimilarAdvertsBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LOw0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.similar_adverts.mvi.SimilarAdvertsBootstrapKt$downloadSimilarItems$1", f = "SimilarAdvertsBootstrap.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super Ow0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f283956q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f283957r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14445b f283958s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.similar_adverts.d f283959t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f283960u;

    /* compiled from: SimilarAdvertsBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "sections", "Lcom/avito/android/remote/model/section/SectionTypeItem;", "Lkotlin/internal/i;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14445b f283961b;

        public a(InterfaceC14445b interfaceC14445b) {
            this.f283961b = interfaceC14445b;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ScreenPerformanceTracker.a.d(this.f283961b, null, null, null, null, 15);
            ArrayList arrayList = new ArrayList();
            for (T t12 : (List) obj) {
                if (t12 instanceof SectionTypeItem) {
                    arrayList.add(t12);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String engine = ((SectionTypeItem) next).getEngine();
                Object objR = linkedHashMap.get(engine);
                if (objR == null) {
                    objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, engine);
                }
                ((List) objR).add(next);
            }
            Engine[] engineArr = Engine.f283963b;
            List list = (List) linkedHashMap.get("shop_similar");
            if (list != null) {
                return list;
            }
            List list2 = (List) linkedHashMap.get("vas_collab_similar");
            if (list2 != null) {
                return list2;
            }
            List list3 = (List) linkedHashMap.get("marketplace_not_mkp_item");
            if (list3 != null) {
                return list3;
            }
            List list4 = (List) linkedHashMap.get("marketplace");
            return list4 == null ? C42745f0.H(linkedHashMap.values()) : list4;
        }
    }

    /* compiled from: SimilarAdvertsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0011\u0010\u0003\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/remote/model/section/SectionTypeItem;", "Lkotlin/internal/i;", "it", "Lkotlin/G0;", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Ow0.b> f283962b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43172j<? super Ow0.b> interfaceC43172j) {
            this.f283962b = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Object objEmit = this.f283962b.emit(new b.a((SectionTypeItem) C42745f0.G((List) obj)), continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC14445b interfaceC14445b, com.avito.android.similar_adverts.d dVar, String str, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f283958s = interfaceC14445b;
        this.f283959t = dVar;
        this.f283960u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f283958s, this.f283959t, this.f283960u, continuation);
        eVar.f283957r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Ow0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f283956q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f283957r;
            InterfaceC14445b interfaceC14445b = this.f283958s;
            ScreenPerformanceTracker.a.b(interfaceC14445b, null, 3);
            InterfaceC43160i interfaceC43160iA = y.a(this.f283959t.a(this.f283960u).d0(new a(interfaceC14445b)));
            b bVar = new b(interfaceC43172j);
            this.f283956q = 1;
            if (((AbstractC43168f) interfaceC43160iA).collect(bVar, this) == coroutine_suspended) {
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

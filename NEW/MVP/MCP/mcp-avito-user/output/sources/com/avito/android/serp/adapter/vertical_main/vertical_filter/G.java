package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import EN.b;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.inline_filters.calendar.deeplink.FiltersCalendarPickerDeepLink;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.serp.adapter.vertical_main.VerticalFilterData;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kv.C43501a;

/* compiled from: VerticalFilterPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "deepLinkResultEvent", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.serp.adapter.vertical_main.vertical_filter.VerticalFilterPresenterImpl$subscribeToDeeplinkResults$2", f = "VerticalFilterPresenterImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class G extends SuspendLambda implements Y41.p<C43501a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f273378q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f273379r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(v vVar, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f273379r = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        G g12 = new G(this.f273379r, continuation);
        g12.f273378q = obj;
        return g12;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
        return ((G) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<Filter> list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43501a c43501a = (C43501a) this.f273378q;
        Bundle bundle = c43501a.f413260a.f134522c;
        Filter filter = null;
        String string = bundle != null ? bundle.getString("inline_filter_deep_link_filter_id") : null;
        v vVar = this.f273379r;
        VerticalFilterData verticalFilterData = vVar.f273582H;
        if (verticalFilterData != null && (list = verticalFilterData.f272512c) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.L.f(((Filter) next).getId(), string)) {
                    filter = next;
                    break;
                }
            }
            filter = filter;
        }
        if (string != null && filter != null) {
            InterfaceC14249c interfaceC14249c = c43501a.f413261b;
            if (interfaceC14249c instanceof FiltersCalendarPickerDeepLink.b) {
                T t12 = ((FiltersCalendarPickerDeepLink.b) interfaceC14249c).f171067b;
                if (t12 instanceof b.a ? true : t12 instanceof b.C0228b ? true : t12 instanceof b.d) {
                    vVar.f273617q.getClass();
                    InlineFilterValue.InlineFilterDateRangeValue inlineFilterDateRangeValueA = com.avito.android.inline_filters.dialog.calendar.date_range.a.a(t12);
                    if (inlineFilterDateRangeValueA != null) {
                        vVar.w(filter, inlineFilterDateRangeValueA);
                    }
                } else if (kotlin.jvm.internal.L.f(t12, b.c.f3941a)) {
                    vVar.t();
                }
            }
        }
        return G0.f406611a;
    }
}

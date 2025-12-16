package com.avito.android.serp.adapter.vertical_main.publish;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilterValueKt;
import com.avito.android.remote.model.search.NextActionType;
import com.avito.android.serp.adapter.vertical_main.VerticalPublishData;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalPublishPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InlineFilterValue f273134l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Filter f273135m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f273136n;

    /* compiled from: VerticalPublishPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f273137a;

        static {
            int[] iArr = new int[NextActionType.values().length];
            try {
                iArr[NextActionType.FocusField.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextActionType.Autocomplete.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f273137a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InlineFilterValue inlineFilterValue, Filter filter, f fVar) {
        super(0);
        this.f273134l = inlineFilterValue;
        this.f273135m = filter;
        this.f273136n = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Filter.Config config;
        Filter.NextAction nextAction;
        String focusField;
        VerticalPublishData verticalPublishData;
        List<Filter> list;
        Filter.Widget widget;
        Filter.Config config2;
        Filter.NextAction nextAction2;
        if (InlineFilterValueKt.isNotEmpty(this.f273134l)) {
            Object obj = null;
            Filter filter = this.f273135m;
            NextActionType type = (filter == null || (widget = filter.getWidget()) == null || (config2 = widget.getConfig()) == null || (nextAction2 = config2.getNextAction()) == null) ? null : nextAction2.getType();
            int i12 = type == null ? -1 : a.f273137a[type.ordinal()];
            f fVar = this.f273136n;
            if (i12 == 1) {
                Filter.Widget widget2 = filter.getWidget();
                if (widget2 != null && (config = widget2.getConfig()) != null && (nextAction = config.getNextAction()) != null && (focusField = nextAction.getFocusField()) != null && (verticalPublishData = fVar.f273109s) != null && (list = verticalPublishData.f272562c) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (L.f(((Filter) next).getId(), focusField)) {
                            obj = next;
                            break;
                        }
                    }
                    Filter filter2 = (Filter) obj;
                    if (filter2 != null) {
                        fVar.s(filter2);
                    }
                }
            } else if (i12 == 2) {
                fVar.t();
            }
        }
        return G0.f406611a;
    }
}

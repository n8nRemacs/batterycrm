package com.avito.android.serp.adapter.vertical_main.publish;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.Y0;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.s;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.serp.adapter.vertical_main.VerticalFormType;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.VerticalPublishData;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34876l;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import okhttp3.internal.http2.Http2;

/* compiled from: VerticalPublishPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/publish/f;", "Lcom/avito/android/serp/adapter/vertical_main/q;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.serp.adapter.vertical_main.q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34876l> f273091a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f273092b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.m f273093c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f273094d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final SearchParams f273095e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f273096f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f273097g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f273098h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.calendar.date_range.a f273099i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<PublishAction> f273100j = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Throwable> f273101k = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final e2 f273102l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final e2 f273103m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Y0 f273104n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f f273105o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public y f273106p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public y f273107q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final HashMap f273108r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public VerticalPublishData f273109s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Parcelable f273110t;

    /* compiled from: VerticalPublishPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f273111a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Checkbox.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f273111a = iArr;
        }
    }

    @Inject
    public f(@Y61.k h31.e<InterfaceC34876l> eVar, @Y61.k s sVar, @Y61.k com.avito.android.serp.adapter.vertical_main.m mVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l SearchParams searchParams, @Y61.l String str, @Y61.l @Zr0.n VerticalPublishState verticalPublishState, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.inline_filters.dialog.calendar.date_range.a aVar2) {
        this.f273091a = eVar;
        this.f273092b = sVar;
        this.f273093c = mVar;
        this.f273094d = interfaceC35745a5;
        this.f273095e = searchParams;
        this.f273096f = str;
        this.f273097g = gVar;
        this.f273098h = aVar;
        this.f273099i = aVar2;
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f273102l = f2.b(0, 1, bufferOverflow, 1);
        this.f273103m = f2.b(0, 1, bufferOverflow, 1);
        this.f273108r = new HashMap();
        this.f273109s = verticalPublishState != null ? verticalPublishState.f273084b : null;
        this.f273110t = verticalPublishState != null ? verticalPublishState.f273085c : null;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.q
    public final void a() {
        com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f fVar = this.f273105o;
        if (fVar != null) {
            fVar.Of(null, true);
        }
    }

    @Override // com.avito.android.serp.adapter.vertical_main.q
    public final void b(@Y61.k Y0 y02) {
        Filter filter;
        this.f273104n = y02;
        this.f273107q = (y) this.f273098h.d9().N(n.f273138b).t0(new o(this));
        VerticalPublishData verticalPublishData = this.f273109s;
        if (verticalPublishData == null || (filter = verticalPublishData.f272565f) == null) {
            return;
        }
        s(filter);
        this.f273110t = null;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.q
    @Y61.l
    public final VerticalPublishState d0() {
        VerticalPublishData verticalPublishData = this.f273109s;
        if (verticalPublishData == null) {
            return null;
        }
        Y0 y02 = this.f273104n;
        return new VerticalPublishState(verticalPublishData, y02 != null ? y02.d0() : null);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    public final void e0() {
        this.f273105o = null;
        Y0 y02 = this.f273104n;
        if (y02 != null) {
            y02.f2();
        }
        this.f273104n = null;
        y yVar = this.f273107q;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f273107q = null;
        y yVar2 = this.f273106p;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f273106p = null;
        y yVar3 = this.f273107q;
        if (yVar3 != null) {
            DisposableHelper.a(yVar3);
        }
        this.f273107q = null;
        this.f273109s = null;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    @Y61.k
    public final C41981q0 f() {
        com.jakewharton.rxrelay3.c<Throwable> cVar = this.f273101k;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    public final void invalidate() {
        this.f273109s = null;
        this.f273110t = null;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    public final void j(@Y61.k Filter filter) {
        Filter.Widget widget = filter.getWidget();
        WidgetType type = widget != null ? widget.getType() : null;
        if ((type == null ? -1 : a.f273111a[type.ordinal()]) != 1) {
            s(filter);
            return;
        }
        InlineFilterValue value = filter.getValue();
        InlineFilterValue.InlineFilterBooleanValue inlineFilterBooleanValue = value instanceof InlineFilterValue.InlineFilterBooleanValue ? (InlineFilterValue.InlineFilterBooleanValue) value : null;
        if (inlineFilterBooleanValue == null) {
            inlineFilterBooleanValue = new InlineFilterValue.InlineFilterBooleanValue(false);
        }
        u(filter, inlineFilterBooleanValue.copy(!inlineFilterBooleanValue.getValue()));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.q
    public final void l(@Y61.k com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f fVar, @Y61.k VerticalPromoBlockItem.VerticalPublishItem verticalPublishItem, int i12) {
        VerticalPublishData verticalPublishData;
        List<Filter> list;
        this.f273105o = fVar;
        fVar.bg(new C(this, i12, verticalPublishItem, 16));
        List<Filter> list2 = verticalPublishItem.f272551h;
        if (list2 != null && ((verticalPublishData = this.f273109s) == null || ((list = verticalPublishData.f272562c) != null && list.isEmpty()))) {
            this.f273109s = new VerticalPublishData(verticalPublishItem.f272553j, list2, verticalPublishItem.f272552i, null, null, Integer.valueOf(verticalPublishItem.f272554k), verticalPublishItem.f272555l, verticalPublishItem.f272556m, 24, null);
        }
        v();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    public final void n(@Y61.k Filter filter, boolean z12) {
        u(filter, new InlineFilterValue.InlineFilterBooleanValue(z12));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    public final void o(@Y61.k Filter filter, @Y61.l Filter.InnerOptions.Options options) {
        u(filter, new InlineFilterValue.InlineFilterSelectValue(options != null ? options.getOptionId() : null));
    }

    @Override // com.avito.android.serp.adapter.vertical_main.b
    @Y61.k
    public final C41981q0 p() {
        com.jakewharton.rxrelay3.c<PublishAction> cVar = this.f273100j;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.q
    public final void q1() {
        com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f fVar = this.f273105o;
        if (fVar != null) {
            VerticalPublishData verticalPublishData = this.f273109s;
            fVar.Of(verticalPublishData != null ? verticalPublishData.f272563d : null, false);
        }
    }

    public final void r() {
        VerticalPublishData verticalPublishData = this.f273109s;
        this.f273109s = verticalPublishData != null ? VerticalPublishData.b(verticalPublishData, null) : null;
        v();
    }

    public final void s(Filter filter) {
        VerticalPublishData verticalPublishData = this.f273109s;
        this.f273109s = verticalPublishData != null ? VerticalPublishData.b(verticalPublishData, filter) : null;
        Y0 y02 = this.f273104n;
        if (y02 != null) {
            List<com.avito.android.inline_filters.dialog.select.adapter.i> listA = (List) this.f273108r.get(filter.getId());
            if (listA == null) {
                listA = this.f273092b.a(filter);
            }
            Parcelable parcelable = this.f273110t;
            InlineFilterDialogOpener.Source source = InlineFilterDialogOpener.Source.f171141b;
            j jVar = new j(0, this, f.class, "onFilterClose", "onFilterClose()V", 0);
            y02.RA(filter, listA, parcelable, this.f273095e, ((-13570176) & 16) != 0 ? null : null, ((-13570176) & 32) != 0 ? null : null, ((-13570176) & 64) != 0 ? null : null, ((-13570176) & 128) != 0 ? null : null, ((-13570176) & 256) != 0 ? null : null, ((-13570176) & 512) != 0 ? null : null, ((-13570176) & 1024) != 0 ? null : null, ((-13570176) & 2048) != 0 ? null : null, new k(this, filter), ((-13570176) & 8192) != 0 ? null : null, ((-13570176) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? com.avito.android.inline_filters.dialog.g.f171554l : null, (32768 & (-13570176)) != 0 ? com.avito.android.inline_filters.dialog.h.f171644l : null, jVar, (131072 & (-13570176)) != 0 ? new com.avito.android.inline_filters.dialog.i(jVar) : new l(this), (262144 & (-13570176)) != 0 ? null : null, (524288 & (-13570176)) != 0 ? null : source, (1048576 & (-13570176)) != 0 ? null : null, (4194304 & (-13570176)) != 0 ? null : null, this.f273096f, (16777216 & (-13570176)) != 0 ? null : null, (33554432 & (-13570176)) != 0 ? null : null, (67108864 & (-13570176)) != 0 ? null : null, (134217728 & (-13570176)) != 0 ? null : null, (268435456 & (-13570176)) != 0 ? null : null, (536870912 & (-13570176)) != 0 ? null : null, (1073741824 & (-13570176)) != 0 ? null : null, ((-13570176) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : null);
        }
    }

    public final void t() {
        VerticalPublishData verticalPublishData = this.f273109s;
        if (verticalPublishData == null) {
            return;
        }
        e2 e2Var = this.f273102l;
        List<Filter> list = verticalPublishData.f272562c;
        String str = verticalPublishData.f272567h;
        String str2 = verticalPublishData.f272568i;
        e2Var.K5(new PublishAction(list, str, str2));
        this.f273100j.accept(new PublishAction(list, str, str2));
    }

    public final void u(Filter filter, InlineFilterValue inlineFilterValue) {
        m mVar = new m(inlineFilterValue, filter, this);
        VerticalPublishData verticalPublishData = this.f273109s;
        if (verticalPublishData == null) {
            return;
        }
        y yVar = this.f273106p;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f fVar = this.f273105o;
        if (fVar != null) {
            fVar.Of(null, true);
        }
        this.f273106p = (y) this.f273091a.get().a(verticalPublishData, filter, inlineFilterValue, VerticalFormType.f272520d).j0(this.f273094d.e()).v0(new h(this, mVar), new i(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    public final void v() {
        VerticalPublishData verticalPublishData;
        com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f fVar = this.f273105o;
        if (fVar == null || (verticalPublishData = this.f273109s) == null || verticalPublishData.f272562c.isEmpty()) {
            return;
        }
        fVar.Of(verticalPublishData.f272563d, false);
        fVar.s1(this.f273093c.a(verticalPublishData.f272562c, null, false, false, null));
    }
}

package com.avito.android.inline_filters.dialog.select;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;

/* compiled from: SelectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/inline_filters/dialog/select/adapter/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class I<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Filter, InlineFilterValue, G0> f172022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Filter f172023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f172024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f172025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E f172026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f172027g;

    /* JADX WARN: Multi-variable type inference failed */
    public I(Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, Filter filter, Y41.a<G0> aVar, View view, E e12, com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f172022b = pVar;
        this.f172023c = filter;
        this.f172024d = aVar;
        this.f172025e = view;
        this.f172026f = e12;
        this.f172027g = aVar2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InlineFilterValue inlineFilterSelectValue;
        com.avito.android.deeplink_handler.handler.composite.a aVar;
        com.avito.android.inline_filters.dialog.select.adapter.i iVar = (com.avito.android.inline_filters.dialog.select.adapter.i) obj;
        if (iVar.f172095f == InlineItemType.f172064k) {
            DeepLink deepLink = iVar.f172102m;
            if (deepLink != null && (aVar = this.f172027g) != null) {
                b.a.a(aVar, deepLink, null, null, 6);
            }
            ((J) this.f172024d).invoke();
        } else {
            boolean z12 = iVar.f172097h;
            String str = iVar.f172092c;
            if (z12) {
                String string = str.toString();
                C43044a.a(10);
                inlineFilterSelectValue = new InlineFilterValue.InlineFilterSelectIntValue(Integer.parseInt(string, 10));
            } else {
                inlineFilterSelectValue = new InlineFilterValue.InlineFilterSelectValue(str);
            }
            this.f172022b.invoke(this.f172023c, inlineFilterSelectValue);
        }
        K2.d(this.f172025e, true);
        this.f172026f.c();
    }
}

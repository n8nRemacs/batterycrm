package com.avito.android.widget_filters.ui.items.dates;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WidgetFiltersDatesWidgetBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/dates/c;", "LTV0/b;", "Lcom/avito/android/widget_filters/ui/items/dates/k;", "Lcom/avito/android/widget_filters/ui/items/dates/e;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements TV0.b<k, e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f330366a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f330367b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f330368c = new g.a<>(R.layout.widget_filters_dates_widget_item, new a());

    /* compiled from: WidgetFiltersDatesWidgetBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/widget_filters/ui/items/dates/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/widget_filters/ui/items/dates/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, l> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view, c.this.f330367b);
        }
    }

    @Inject
    public c(@Y61.k i iVar, @Y61.k FragmentManager fragmentManager) {
        this.f330366a = iVar;
        this.f330367b = fragmentManager;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f330366a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f330368c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof e;
    }
}

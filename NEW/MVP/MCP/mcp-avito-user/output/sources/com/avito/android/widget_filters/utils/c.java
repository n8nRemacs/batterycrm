package com.avito.android.widget_filters.utils;

import Y61.k;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.y6;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WidgetFiltersResourceProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/utils/c;", "Lcom/avito/android/widget_filters/utils/b;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f330559a = com.avito.android.printable_text.b.c(R.string.guests_widget_adults_title, new Serializable[0]);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f330560b = com.avito.android.printable_text.b.c(R.string.guests_widget_adults_description, new Serializable[0]);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f330561c = com.avito.android.printable_text.b.c(R.string.guests_widget_children_title, new Serializable[0]);

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f330562d = com.avito.android.printable_text.b.c(R.string.guests_widget_children_description, new Serializable[0]);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f330563e = com.avito.android.printable_text.b.c(R.string.guests_widget_children_picker_button_title, new Serializable[0]);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PrintableText f330564f = com.avito.android.printable_text.b.c(R.string.guests_widget_children_picker_toolbar_select_button_title, new Serializable[0]);

    /* renamed from: g, reason: collision with root package name */
    public final int f330565g = y6.b(8);

    /* renamed from: h, reason: collision with root package name */
    public final int f330566h = y6.b(96);

    /* renamed from: i, reason: collision with root package name */
    public final int f330567i = y6.b(4);

    /* renamed from: j, reason: collision with root package name */
    public final int f330568j = y6.b(10);

    /* renamed from: k, reason: collision with root package name */
    public final int f330569k = y6.b(6);

    @Inject
    public c() {
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    /* renamed from: a, reason: from getter */
    public final PrintableText getF330561c() {
        return this.f330561c;
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    public final PrintableText b() {
        return com.avito.android.printable_text.b.c(R.string.widget_badge_is_new_text, new Serializable[0]);
    }

    @Override // com.avito.android.widget_filters.utils.b
    /* renamed from: c, reason: from getter */
    public final int getF330565g() {
        return this.f330565g;
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    public final PrintableText d(int i12) {
        return i12 > 0 ? com.avito.android.printable_text.b.b(R.plurals.selected_number_of_adults, i12, Integer.valueOf(i12)) : com.avito.android.printable_text.b.a();
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    public final PrintableText e(boolean z12) {
        return z12 ? com.avito.android.printable_text.b.c(R.string.guests_widget_with_animal, new Serializable[0]) : com.avito.android.printable_text.b.a();
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    /* renamed from: f, reason: from getter */
    public final PrintableText getF330559a() {
        return this.f330559a;
    }

    @Override // com.avito.android.widget_filters.utils.b
    /* renamed from: g, reason: from getter */
    public final int getF330567i() {
        return this.f330567i;
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    /* renamed from: h, reason: from getter */
    public final PrintableText getF330560b() {
        return this.f330560b;
    }

    @Override // com.avito.android.widget_filters.utils.b
    /* renamed from: i, reason: from getter */
    public final int getF330566h() {
        return this.f330566h;
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    /* renamed from: j, reason: from getter */
    public final PrintableText getF330564f() {
        return this.f330564f;
    }

    @Override // com.avito.android.widget_filters.utils.b
    /* renamed from: k, reason: from getter */
    public final int getF330568j() {
        return this.f330568j;
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    public final PrintableText l(int i12) {
        return com.avito.android.printable_text.b.c(R.string.guests_widget_children_selected_title, Integer.valueOf(i12), Integer.valueOf(i12));
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    public final PrintableText m(int i12) {
        return com.avito.android.printable_text.b.c(R.string.guests_widget_children_picker_toolbar_title, Integer.valueOf(i12), Integer.valueOf(i12));
    }

    @Override // com.avito.android.widget_filters.utils.b
    /* renamed from: n, reason: from getter */
    public final int getF330569k() {
        return this.f330569k;
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    public final PrintableText o(int i12) {
        return com.avito.android.printable_text.b.b(R.plurals.selected_number_of_nights, i12, Integer.valueOf(i12));
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    public final PrintableText p(int i12) {
        return i12 > 0 ? com.avito.android.printable_text.b.b(R.plurals.selected_number_of_categories, i12, Integer.valueOf(i12)) : com.avito.android.printable_text.b.a();
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    /* renamed from: q, reason: from getter */
    public final PrintableText getF330562d() {
        return this.f330562d;
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    /* renamed from: r, reason: from getter */
    public final PrintableText getF330563e() {
        return this.f330563e;
    }

    @Override // com.avito.android.widget_filters.utils.b
    @k
    public final PrintableText s(int i12) {
        return i12 > 0 ? com.avito.android.printable_text.b.b(R.plurals.selected_number_of_children, i12, Integer.valueOf(i12)) : com.avito.android.printable_text.b.a();
    }
}

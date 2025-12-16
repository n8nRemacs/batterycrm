package com.avito.android.comparison;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComparisonResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/f;", "Lcom/avito/android/comparison/e;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f123903a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f123904b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f123905c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f123906d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f123907e;

    /* renamed from: f, reason: collision with root package name */
    public final float f123908f;

    /* renamed from: g, reason: collision with root package name */
    public final float f123909g;

    @Inject
    public f(@Y61.k Resources resources) {
        this.f123903a = resources.getString(R.string.comparison_default_text_option_value);
        this.f123904b = resources.getString(R.string.comparison_default_loading_error);
        this.f123905c = resources.getString(R.string.comparison_default_remove_error);
        this.f123906d = resources.getString(R.string.comparison_remove_button_text);
        this.f123907e = resources.getString(R.string.comparison_closed_item_title);
        this.f123908f = resources.getDimension(R.dimen.comparison_specification_header_padding_small);
        this.f123909g = resources.getDimension(R.dimen.comparison_specification_header_padding_large);
    }

    @Override // com.avito.android.comparison.e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF123907e() {
        return this.f123907e;
    }

    @Override // com.avito.android.comparison.e
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF123905c() {
        return this.f123905c;
    }

    @Override // com.avito.android.comparison.e
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF123903a() {
        return this.f123903a;
    }

    @Override // com.avito.android.comparison.e
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF123904b() {
        return this.f123904b;
    }

    @Override // com.avito.android.comparison.e
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getF123906d() {
        return this.f123906d;
    }

    @Override // com.avito.android.comparison.e
    /* renamed from: f, reason: from getter */
    public final float getF123909g() {
        return this.f123909g;
    }

    @Override // com.avito.android.comparison.e
    /* renamed from: g, reason: from getter */
    public final float getF123908f() {
        return this.f123908f;
    }
}

package com.avito.android.section;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SectionResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/x;", "Lcom/avito/android/section/w;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f264960a;

    @Inject
    public x(@Y61.k Resources resources) {
        this.f264960a = resources;
    }

    @Override // com.avito.android.home.InterfaceC30768c
    /* renamed from: a */
    public final int getF131068c() {
        return this.f264960a.getInteger(R.integer.serp_columns);
    }

    @Override // com.avito.android.section.w
    public final int b() {
        return this.f264960a.getConfiguration().orientation;
    }

    @Override // com.avito.android.section.w
    public final boolean c() {
        return this.f264960a.getBoolean(R.bool.is_tablet);
    }

    @Override // com.avito.android.section.w
    public final int d() {
        return 0;
    }

    @Override // com.avito.android.section.w
    public final int f() {
        return this.f264960a.getDimensionPixelSize(R.dimen.section_advert_width_default);
    }

    @Override // com.avito.android.section.w
    public final int k() {
        return this.f264960a.getDimensionPixelSize(R.dimen.content_horizontal_padding);
    }

    @Override // com.avito.android.section.w
    public final int l() {
        return this.f264960a.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
    }

    @Override // com.avito.android.section.w
    public final int n() {
        return this.f264960a.getDimensionPixelSize(R.dimen.section_advert_item_crop);
    }
}

package com.avito.android.spare_parts.bottom_sheet;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SparePartsBottomSheetAnalytics.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/g;", "Lcom/avito/android/spare_parts/bottom_sheet/f;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f284769a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f284770b;

    @Inject
    public g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k @InterfaceC30174s String str) {
        this.f284769a = interfaceC28373a;
        this.f284770b = str;
    }

    @Override // com.avito.android.spare_parts.bottom_sheet.f
    public final void a(@Y61.k String str) {
        this.f284769a.c(new z(this.f284770b, str));
    }
}

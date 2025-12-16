package com.avito.android.vas_performance.ui.items.banner;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;

/* compiled from: VasBundleBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/banner/c;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321596b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f321597c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalColor f321598d;

    public c(@k String str, @l UniversalImage universalImage, @k UniversalColor universalColor) {
        this.f321596b = str;
        this.f321597c = universalImage;
        this.f321598d = universalColor;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return -1874341269;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF314727c() {
        return "applied_services_banner";
    }
}

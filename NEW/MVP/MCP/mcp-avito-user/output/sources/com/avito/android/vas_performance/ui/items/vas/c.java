package com.avito.android.vas_performance.ui.items.vas;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: PerformanceVasItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/vas/c;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321794b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f321795c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f321796d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f321797e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f321798f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f321799g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Long f321800h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f321801i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DeepLink f321802j;

    public c(@k String str, @k String str2, @k String str3, @l AttributedText attributedText, @l AttributedText attributedText2, @l Image image, @l Image image2, @l Long l12, @l DeepLink deepLink) {
        this.f321794b = str;
        this.f321795c = str2;
        this.f321796d = attributedText;
        this.f321797e = attributedText2;
        this.f321798f = image;
        this.f321799g = image2;
        this.f321800h = l12;
        this.f321801i = str3;
        this.f321802j = deepLink;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return getF314727c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF314727c() {
        return this.f321794b;
    }
}

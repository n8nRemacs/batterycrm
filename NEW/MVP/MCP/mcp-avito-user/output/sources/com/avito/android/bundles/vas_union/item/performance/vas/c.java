package com.avito.android.bundles.vas_union.item.performance.vas;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: PerformanceVasItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/performance/vas/c;", "Lcom/avito/conveyor_item/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f108643b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f108644c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f108645d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f108646e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f108647f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f108648g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f108649h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeepLink f108650i;

    public c(@k String str, @k String str2, @l AttributedText attributedText, @l AttributedText attributedText2, @l Image image, @l Image image2, @k String str3, @l DeepLink deepLink) {
        this.f108643b = str;
        this.f108644c = str2;
        this.f108645d = attributedText;
        this.f108646e = attributedText2;
        this.f108647f = image;
        this.f108648g = image2;
        this.f108649h = str3;
        this.f108650i = deepLink;
    }

    @Override // TV0.a
    public final long getId() {
        return getF97029b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF97029b() {
        return this.f108643b;
    }
}

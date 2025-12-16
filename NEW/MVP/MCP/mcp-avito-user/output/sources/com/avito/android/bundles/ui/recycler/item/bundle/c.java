package com.avito.android.bundles.ui.recycler.item.bundle;

import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: VasBundleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/bundle/c;", "Lcom/avito/conveyor_item/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f108399b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f108400c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Dk.e f108401d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f108402e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ArrayList f108403f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AttributedText f108404g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f108405h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final AttributedText f108406i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f108407j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final DeepLink f108408k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f108409l;

    public c(@Y61.k String str, @l UniversalImage universalImage, @l Dk.e eVar, @Y61.k String str2, @Y61.k ArrayList arrayList, @Y61.k AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, @Y61.k String str3, @Y61.k DeepLink deepLink, boolean z12) {
        this.f108399b = str;
        this.f108400c = universalImage;
        this.f108401d = eVar;
        this.f108402e = str2;
        this.f108403f = arrayList;
        this.f108404g = attributedText;
        this.f108405h = attributedText2;
        this.f108406i = attributedText3;
        this.f108407j = str3;
        this.f108408k = deepLink;
        this.f108409l = z12;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79875h() {
        return getF106084b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106084b() {
        return this.f108399b;
    }
}

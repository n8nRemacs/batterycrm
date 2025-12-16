package com.avito.android.bundles.ui.recycler.item.benefit;

import Dk.C13408a;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: BundleBenefitItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/ui/recycler/item/benefit/h;", "Lcom/avito/conveyor_item/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f108380b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C13408a f108381c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f108382d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Dk.b f108383e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f108384f;

    public h(@k String str, @l C13408a c13408a, @k String str2, @l Dk.b bVar, @l DeepLink deepLink) {
        this.f108380b = str;
        this.f108381c = c13408a;
        this.f108382d = str2;
        this.f108383e = bVar;
        this.f108384f = deepLink;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF95530b() {
        return getF106500f().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106500f() {
        return this.f108380b;
    }
}

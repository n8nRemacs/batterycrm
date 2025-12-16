package com.avito.android.tariff_lf_constructor.configure.vertical.items.content;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureVerticalContentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/items/content/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300607b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f300608c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f300609d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Image f300610e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f300611f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f300612g;

    public a(@k DeepLink deepLink, @k Image image, @k String str, @k String str2, @k String str3, boolean z12) {
        this.f300607b = str;
        this.f300608c = str2;
        this.f300609d = str3;
        this.f300610e = image;
        this.f300611f = deepLink;
        this.f300612g = z12;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF298936b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298936b() {
        return this.f300607b;
    }
}

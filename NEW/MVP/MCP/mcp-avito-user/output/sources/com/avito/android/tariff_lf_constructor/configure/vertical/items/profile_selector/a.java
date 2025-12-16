package com.avito.android.tariff_lf_constructor.configure.vertical.items.profile_selector;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: ConstructorConfigureVerticalProfileSelectorItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/vertical/items/profile_selector/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300638b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f300639c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f300640d;

    public a(@k String str, @l Image image, @k DeepLink deepLink) {
        this.f300638b = str;
        this.f300639c = image;
        this.f300640d = deepLink;
    }

    @Override // TV0.a
    public final long getId() {
        return 734040925;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF295013b() {
        return "profile_selector_item";
    }
}

package com.avito.android.tariff.cpa.configure_info.items.feature;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ConfigureFeatureItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/items/feature/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalImage f294495b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f294496c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f294497d;

    public a(@k String str, @k AttributedText attributedText, @k UniversalImage universalImage) {
        this.f294495b = universalImage;
        this.f294496c = str;
        this.f294497d = attributedText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return 1208885948;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF289436b() {
        return "feature_item";
    }
}

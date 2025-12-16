package com.avito.android.vas_performance.ui.items.lightning_block;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: LightningBlockItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/lightning_block/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f321710b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Image f321711c;

    public a(@k AttributedText attributedText, @k Image image) {
        this.f321710b = attributedText;
        this.f321711c = image;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return 1975761624;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF281670b() {
        return "lightning_block";
    }
}

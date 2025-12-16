package com.avito.android.vas_performance.ui.items.stickers_changes;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: StickersChangesItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/stickers_changes/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f321742b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f321743c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f321744d;

    public a(@l Image image, @k String str, @l AttributedText attributedText) {
        this.f321742b = str;
        this.f321743c = attributedText;
        this.f321744d = image;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return -1229290737;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF294787b() {
        return "stickers_vas_count";
    }
}

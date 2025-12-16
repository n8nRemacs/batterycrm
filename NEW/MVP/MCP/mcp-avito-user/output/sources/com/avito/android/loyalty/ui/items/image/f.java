package com.avito.android.loyalty.ui.items.image;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: ImageItemView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/items/image/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f183689b;

    public f(@k View view) {
        super(view);
        this.f183689b = (SimpleDraweeView) view.findViewById(R.id.item_image_drawee_view);
    }
}

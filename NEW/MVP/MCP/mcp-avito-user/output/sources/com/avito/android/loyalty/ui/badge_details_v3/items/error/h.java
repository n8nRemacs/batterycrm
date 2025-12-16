package com.avito.android.loyalty.ui.badge_details_v3.items.error;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BadgeDetailsErrorItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/items/error/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/loyalty/ui/badge_details_v3/items/error/g;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f183304c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Button f183305b;

    public h(@k View view) {
        super(view);
        this.f183305b = (Button) view.findViewById(R.id.badge_details_retry_button);
    }

    @Override // com.avito.android.loyalty.ui.badge_details_v3.items.error.g
    public final void Xx(@k Y41.a<G0> aVar) {
        this.f183305b.setOnClickListener(new com.avito.android.lib.design.list_item.a(15, aVar));
    }
}

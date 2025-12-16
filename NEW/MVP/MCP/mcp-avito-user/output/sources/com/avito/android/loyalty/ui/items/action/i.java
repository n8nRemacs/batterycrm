package com.avito.android.loyalty.ui.items.action;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ActionItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/items/action/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/loyalty/ui/items/action/h;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f183652c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f183653b;

    public i(@k View view) {
        super(view);
        this.f183653b = (Button) view;
    }

    @Override // com.avito.android.loyalty.ui.items.action.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f183653b.setOnClickListener(new com.avito.android.lib.design.list_item.a(16, aVar));
    }

    @Override // com.avito.android.loyalty.ui.items.action.h
    public final void b(@k String str) {
        com.avito.android.lib.design.button.b.a(this.f183653b, str, false);
    }
}

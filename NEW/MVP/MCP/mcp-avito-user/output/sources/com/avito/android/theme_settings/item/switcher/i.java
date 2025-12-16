package com.avito.android.theme_settings.item.switcher;

import Y61.k;
import android.view.View;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SwitcherItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/theme_settings/item/switcher/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/theme_settings/item/switcher/h;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f301348c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemSwitcher f301349b;

    public i(@k View view) {
        super(view);
        this.f301349b = (ListItemSwitcher) view;
    }

    @Override // com.avito.android.theme_settings.item.switcher.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f301349b.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(27, aVar));
    }

    @Override // com.avito.android.theme_settings.item.switcher.h
    public final void f(@k String str) {
        this.f301349b.setMessage(str);
    }

    @Override // com.avito.android.theme_settings.item.switcher.h
    public final void setChecked(boolean z12) {
        this.f301349b.setChecked(z12);
    }

    @Override // com.avito.android.theme_settings.item.switcher.h
    public final void setTitle(@k String str) {
        this.f301349b.setTitle(str);
    }
}

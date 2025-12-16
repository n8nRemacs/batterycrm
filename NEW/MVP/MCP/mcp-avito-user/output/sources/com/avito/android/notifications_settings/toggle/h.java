package com.avito.android.notifications_settings.toggle;

import Au.C13079a;
import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationsSettingsToggleView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/toggle/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/notifications_settings/toggle/g;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f208195c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemSwitcher f208196b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.nc_settings_switch_list_element);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f208196b = (ListItemSwitcher) viewFindViewById;
    }

    @Override // com.avito.android.notifications_settings.toggle.g
    public final void fd(@k Y41.a<G0> aVar) {
        ListItemSwitcher listItemSwitcher = this.f208196b;
        listItemSwitcher.i();
        listItemSwitcher.e(new C13079a(aVar, 4));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f208196b.i();
    }

    @Override // com.avito.android.notifications_settings.toggle.g
    public final void setChecked(boolean z12) {
        this.f208196b.setChecked(z12);
    }

    @Override // com.avito.android.notifications_settings.toggle.g
    public final void setTitle(@k String str) {
        this.f208196b.setTitle(str);
    }
}

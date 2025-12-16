package com.avito.android.notifications_settings.info;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationsSettingsInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/info/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/notifications_settings/info/f;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f208008b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.notifications_settings_info);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f208008b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.notifications_settings.info.f
    public final void setText(@k String str) {
        this.f208008b.setText(str);
    }
}

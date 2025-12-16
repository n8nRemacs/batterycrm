package com.avito.android.notifications_settings.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationsSettingsTitleView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/notifications_settings/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/notifications_settings/title/f;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f208178b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f208179c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f208178b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f208179c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.notifications_settings.title.f
    public final void f(@k String str) {
        this.f208179c.setText(str);
    }

    @Override // com.avito.android.notifications_settings.title.f
    public final void setTitle(@k String str) {
        this.f208178b.setText(str);
    }
}

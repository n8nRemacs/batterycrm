package com.avito.android.remote.notification;

import android.content.Context;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: NotificationResourceProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/B;", "Lcom/avito/android/remote/notification/A;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class B implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f253954a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f253955b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f253956c;

    /* renamed from: d, reason: collision with root package name */
    public final int f253957d;

    @Inject
    public B(@Y61.k Context context) {
        this.f253954a = context;
        this.f253955b = context.getResources().getString(R.string.notification_direct_reply);
        this.f253956c = context.getResources().getString(R.string.notification_direct_reply_missed_in_app_call);
        this.f253957d = context.getResources().getColor(R.color.common_blue);
    }

    @Override // com.avito.android.remote.notification.A
    @Y61.k
    public final String a() {
        return this.f253954a.getString(R.string.notification_channel_messenger_id_2);
    }

    @Override // com.avito.android.remote.notification.A
    @Y61.k
    public final String b() {
        return this.f253954a.getString(R.string.notification_channel_id_default);
    }

    @Override // com.avito.android.remote.notification.A
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF253955b() {
        return this.f253955b;
    }

    @Override // com.avito.android.remote.notification.A
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF253956c() {
        return this.f253956c;
    }

    @Override // com.avito.android.remote.notification.A
    /* renamed from: getColor, reason: from getter */
    public final int getF253957d() {
        return this.f253957d;
    }
}

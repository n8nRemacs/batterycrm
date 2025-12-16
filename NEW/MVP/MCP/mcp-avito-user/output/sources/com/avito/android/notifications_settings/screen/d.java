package com.avito.android.notifications_settings.screen;

import com.avito.android.util.InterfaceC35845m2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationsSettingsActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ NotificationsSettingsActivity f208057l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NotificationsSettingsActivity notificationsSettingsActivity) {
        super(0);
        this.f208057l = notificationsSettingsActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        NotificationsSettingsActivity notificationsSettingsActivity = this.f208057l;
        notificationsSettingsActivity.f208032t = true;
        InterfaceC35845m2 interfaceC35845m2 = notificationsSettingsActivity.f208028p;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        notificationsSettingsActivity.startActivity(interfaceC35845m2.a());
        return G0.f406611a;
    }
}

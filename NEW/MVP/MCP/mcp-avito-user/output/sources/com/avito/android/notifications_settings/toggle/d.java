package com.avito.android.notifications_settings.toggle;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationsSettingsTogglePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f208189l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NotificationsSettingsToggleItem f208190m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, NotificationsSettingsToggleItem notificationsSettingsToggleItem) {
        super(0);
        this.f208189l = eVar;
        this.f208190m = notificationsSettingsToggleItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f208189l;
        com.jakewharton.rxrelay3.d<NotificationsSettingsToggleItem> dVar = eVar.f208191b;
        NotificationsSettingsToggleItem notificationsSettingsToggleItem = this.f208190m;
        dVar.accept(notificationsSettingsToggleItem);
        eVar.f208192c.invoke(notificationsSettingsToggleItem);
        return G0.f406611a;
    }
}

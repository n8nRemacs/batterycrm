package com.avito.android.notifications_settings.screen.mvi;

import Pz.C14860a;
import c40.InterfaceC26936a;
import com.avito.android.arch.mvi.a;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsInternalAction;
import com.avito.android.notifications_settings.screen.mvi.entity.NotificationsSettingsState;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: NotificationsSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/notifications_settings/screen/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Lc40/a;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsInternalAction;", "Lcom/avito/android/notifications_settings/screen/mvi/entity/NotificationsSettingsState;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC26936a, NotificationsSettingsInternalAction, NotificationsSettingsState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f208116a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<C14860a> f208117b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f208118c;

    @Inject
    public e(@Y61.k l lVar, @Y61.k l41.g<C14860a> gVar, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f208116a = lVar;
        this.f208117b = gVar;
        this.f208118c = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<NotificationsSettingsInternalAction> b(InterfaceC26936a interfaceC26936a, NotificationsSettingsState notificationsSettingsState) {
        C43152f0 c43152f0;
        InterfaceC26936a interfaceC26936a2 = interfaceC26936a;
        NotificationsSettingsState notificationsSettingsState2 = notificationsSettingsState;
        if (interfaceC26936a2.equals(InterfaceC26936a.C2028a.f57631a)) {
            return new C43210w(NotificationsSettingsInternalAction.UpdateNotificationsEnabled.f208125b);
        }
        if (interfaceC26936a2.equals(InterfaceC26936a.b.f57632a)) {
            c43152f0 = new C43152f0(C43175k.G(new a(this, null)), new b(3, null));
        } else {
            if (!(interfaceC26936a2 instanceof InterfaceC26936a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c43152f0 = new C43152f0(C43175k.G(new c(notificationsSettingsState2, ((InterfaceC26936a.c) interfaceC26936a2).f57633a, this, null)), new d(this, null));
        }
        return c43152f0;
    }
}

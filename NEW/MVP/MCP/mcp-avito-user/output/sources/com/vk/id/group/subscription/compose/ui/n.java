package com.vk.id.group.subscription.compose.ui;

import androidx.compose.material3.C21729mg;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import kotlinx.coroutines.T;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class n implements Y41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f366948c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f366949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T f366950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f366951f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f366952g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f366953h;

    public /* synthetic */ n(InterfaceC22204y1 interfaceC22204y1, GroupSubscriptionSheetStatus groupSubscriptionSheetStatus, GroupSubscriptionSheetState groupSubscriptionSheetState, T t12, GroupSubscriptionInteractor groupSubscriptionInteractor, I3 i32, int i12) {
        this.f366947b = i12;
        this.f366948c = interfaceC22204y1;
        this.f366953h = groupSubscriptionSheetStatus;
        this.f366949d = groupSubscriptionSheetState;
        this.f366950e = t12;
        this.f366951f = groupSubscriptionInteractor;
        this.f366952g = i32;
    }

    @Override // Y41.a
    public final Object invoke() {
        switch (this.f366947b) {
            case 0:
                return GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2.invoke$lambda$7$lambda$2$lambda$1(this.f366948c, (GroupSubscriptionSheetStatus.Loaded) this.f366953h, (GroupSubscriptionSheetState) this.f366949d, this.f366950e, (GroupSubscriptionInteractor) this.f366951f, (I3) this.f366952g);
            case 1:
                return GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2.invoke$lambda$7$lambda$4$lambda$3(this.f366948c, (GroupSubscriptionSheetStatus.Failure) this.f366953h, (GroupSubscriptionSheetState) this.f366949d, this.f366950e, (GroupSubscriptionInteractor) this.f366951f, (I3) this.f366952g);
            case 2:
                return GroupSubscriptionSheetKt$GroupSubscriptionSheet$6$2.invoke$lambda$7$lambda$6$lambda$5(this.f366948c, (GroupSubscriptionSheetStatus.Resubscribing) this.f366953h, (GroupSubscriptionSheetState) this.f366949d, this.f366950e, (GroupSubscriptionInteractor) this.f366951f, (I3) this.f366952g);
            default:
                return GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$17$lambda$16(this.f366950e, (Y41.a) this.f366953h, this.f366948c, (Y41.a) this.f366949d, (C21729mg) this.f366951f, (String) this.f366952g);
        }
    }

    public /* synthetic */ n(T t12, Y41.a aVar, InterfaceC22204y1 interfaceC22204y1, Y41.a aVar2, C21729mg c21729mg, String str) {
        this.f366947b = 3;
        this.f366950e = t12;
        this.f366953h = aVar;
        this.f366948c = interfaceC22204y1;
        this.f366949d = aVar2;
        this.f366951f = c21729mg;
        this.f366952g = str;
    }
}

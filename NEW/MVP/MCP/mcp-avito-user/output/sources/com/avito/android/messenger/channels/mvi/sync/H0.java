package com.avito.android.messenger.channels.mvi.sync;

import androidx.compose.runtime.C22026a;
import com.avito.android.util.X2;
import l41.InterfaceC43543a;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class H0 implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f188335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188336c;

    public /* synthetic */ H0(MessengerUserHashInfo messengerUserHashInfo, int i12) {
        this.f188335b = i12;
        this.f188336c = messengerUserHashInfo;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f188335b) {
            case 0:
                X2.f318778a.i("MessengerReadStatusSyncAgent", C22026a.c(new StringBuilder("Subscription to ChatEvent stream disposed ("), com.avito.android.messenger.util.i.b(this.f188336c, new kotlin.Q[0]), ')'), null);
                break;
            case 1:
                X2.f318778a.i("MessengerReadStatusSyncAgent", C22026a.c(new StringBuilder("Subscription to ChatEvent stream completed ("), com.avito.android.messenger.util.i.b(this.f188336c, new kotlin.Q[0]), ')'), null);
                break;
            case 2:
                X2.f318778a.i("MessageSyncAgent", C22026a.c(new StringBuilder("Subscription to ChatEvent stream disposed ("), com.avito.android.messenger.util.i.b(this.f188336c, new kotlin.Q[0]), ')'), null);
                break;
            default:
                X2.f318778a.i("MessageSyncAgent", C22026a.c(new StringBuilder("Subscription to ChatEvent stream completed ("), com.avito.android.messenger.util.i.b(this.f188336c, new kotlin.Q[0]), ')'), null);
                break;
        }
    }
}

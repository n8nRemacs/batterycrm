package defpackage;

import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* loaded from: classes2.dex */
public final /* synthetic */ class tjh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l2f b;

    public /* synthetic */ tjh(l2f l2fVar, int i) {
        this.a = i;
        this.b = l2fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$5(this.b);
                break;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$1$lambda$0(this.b);
                break;
        }
    }
}

package defpackage;

import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class gje implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ em6 b;

    public /* synthetic */ gje(int i, em6 em6Var) {
        this.a = i;
        this.b = em6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SessionRoomParticipantsDataProviderImpl.resolveParticipantIds$lambda$9(this.b);
                break;
            case 1:
                StereoRoomManagerImpl.revokeRoles$lambda$7(this.b);
                break;
            case 2:
                StereoRoomManagerImpl.grantAdmin$lambda$2$lambda$1(this.b);
                break;
            default:
                StereoRoomManagerImpl.revokeAdmin$lambda$5$lambda$4(this.b);
                break;
        }
    }
}

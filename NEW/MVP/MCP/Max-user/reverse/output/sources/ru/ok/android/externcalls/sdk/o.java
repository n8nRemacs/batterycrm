package ru.ok.android.externcalls.sdk;

import defpackage.gu3;
import defpackage.ti1;
import defpackage.wi1;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements gu3, StereoRoomManagerImpl.GrantRolesRequest {
    public final /* synthetic */ ConversationImpl a;

    public /* synthetic */ o(ConversationImpl conversationImpl) {
        this.a = conversationImpl;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) throws Throwable {
        this.a.lambda$addParticipant$26((Throwable) obj);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.GrantRolesRequest
    public void grantRoles(ti1 ti1Var, boolean z, wi1[] wi1VarArr, Runnable runnable, Runnable runnable2) {
        this.a.grantRoles(ti1Var, z, wi1VarArr, runnable, runnable2);
    }
}

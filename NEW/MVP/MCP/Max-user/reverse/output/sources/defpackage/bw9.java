package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class bw9 extends bt7 implements u6g {
    public final /* synthetic */ MessagesListWidget M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw9(MessagesListWidget messagesListWidget, hvf hvfVar) {
        super(hvfVar);
        this.M0 = messagesListWidget;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        hvf hvfVar = this.M0.z0;
        if (hvfVar == null) {
            hvfVar = null;
        }
        hvfVar.onThemeChanged(yebVar);
    }
}

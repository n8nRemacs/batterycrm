package defpackage;

import java.util.List;
import one.me.members.list.MembersListWidget;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class h9 extends yb4 {
    public final long v0;
    public final String w0;
    public final List x0;

    public h9(long j, String str, List list, AddChatAdminsScreen addChatAdminsScreen) {
        super((Widget) addChatAdminsScreen);
        this.v0 = j;
        this.w0 = str;
        this.x0 = list;
    }

    @Override // defpackage.yb4
    public final void E(ytd ytdVar, int i) {
        if (ytdVar.n()) {
            return;
        }
        ((i9) this.x0.get(i)).getClass();
        MembersListWidget membersListWidget = new MembersListWidget(this.w0, new hd9(this.v0, br2.MEMBER, 12), null);
        membersListWidget.setRetainViewMode(b54.b);
        ytdVar.S(new bud(membersListWidget, null, null, null, false, -1));
    }

    @Override // defpackage.phd
    public final int j() {
        return this.x0.size();
    }
}

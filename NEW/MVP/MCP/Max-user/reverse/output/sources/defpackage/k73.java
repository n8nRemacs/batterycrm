package defpackage;

/* loaded from: classes2.dex */
public final class k73 implements cbb {
    public final /* synthetic */ yfb a;

    public k73(yfb yfbVar) {
        this.a = yfbVar;
    }

    @Override // defpackage.cbb
    public final void a0() {
        fbb searchView = this.a.getSearchView();
        if (searchView != null) {
            searchView.setExpandable(false);
        }
    }

    @Override // defpackage.cbb
    public final void e() {
        a63.c.p0().b(":chats-search", null);
    }
}

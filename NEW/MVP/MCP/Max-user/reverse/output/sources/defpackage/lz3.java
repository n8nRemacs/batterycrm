package defpackage;

import one.me.contactlist.ContactListWidget;

/* loaded from: classes2.dex */
public final class lz3 extends bva {
    public final /* synthetic */ ContactListWidget d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz3(ContactListWidget contactListWidget) {
        super(false);
        this.d = contactListWidget;
    }

    @Override // defpackage.bva
    public final void b() {
        yy7[] yy7VarArr = ContactListWidget.O0;
        fbb searchView = this.d.B0().getSearchView();
        if (searchView != null) {
            searchView.b();
        }
    }
}

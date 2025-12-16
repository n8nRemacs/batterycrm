package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final /* synthetic */ class az3 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ az3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        sfb sfbVar;
        int i = this.a;
        hz3 hz3Var = hz3.a;
        int i2 = 1;
        int i3 = 2;
        ContactListWidget contactListWidget = this.b;
        switch (i) {
            case 0:
                hs hsVar = contactListWidget.L0;
                yy7[] yy7VarArr = ContactListWidget.O0;
                yy7 yy7Var = yy7VarArr[7];
                if (((Boolean) hsVar.a(contactListWidget)).booleanValue()) {
                    ((EndlessRecyclerView2) contactListWidget.B0.D(contactListWidget, yy7VarArr[2])).x0(0);
                    yy7 yy7Var2 = yy7VarArr[7];
                    hsVar.b(contactListWidget, Boolean.FALSE);
                }
                return qqg.a;
            case 1:
                yy7[] yy7VarArr2 = ContactListWidget.O0;
                return Boolean.valueOf(((nx3) contactListWidget.C0().C0.a.getValue()).b());
            case 2:
                yy7[] yy7VarArr3 = ContactListWidget.O0;
                return contactListWidget.getRouter();
            case 3:
                yy7[] yy7VarArr4 = ContactListWidget.O0;
                yfb yfbVar = new yfb(contactListWidget.getContext(), 6);
                yfbVar.setId(u1b.v);
                int iOrdinal = contactListWidget.C0().b.ordinal();
                if (iOrdinal == 0) {
                    yfbVar.setForm(qfb.a);
                    yfbVar.setTitle(i3d.contact_list_call_contact_title);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yfbVar.setForm(qfb.b);
                    yfbVar.setTitle(mvd.O);
                }
                if (iz3.$EnumSwitchMapping$1[contactListWidget.C0().b.ordinal()] == 1) {
                    yfbVar.setLeftActions(new gfb(new bz3(contactListWidget, i3)));
                }
                tfb tfbVar = new tfb(new co2(3, contactListWidget));
                int iOrdinal2 = contactListWidget.C0().b.ordinal();
                if (iOrdinal2 == 0) {
                    sfbVar = null;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sfbVar = new sfb(yud.I0, new bz3(contactListWidget, i2), 14);
                }
                yfbVar.setRightActions(new lfb(tfbVar, sfbVar, null));
                fbb searchView = yfbVar.getSearchView();
                if (searchView != null) {
                    searchView.setSearchHint(z7.e(yfbVar.getContext(), v1b.m));
                    if (contactListWidget.D0()) {
                        searchView.setExpandWithAnimation(false);
                        searchView.d();
                        searchView.setExpandWithAnimation(true);
                        searchView.setSearchText(contactListWidget.A0());
                    }
                }
                return yfbVar;
            case 4:
                yy7[] yy7VarArr5 = ContactListWidget.O0;
                return new lz3(contactListWidget);
            case 5:
                yy7[] yy7VarArr6 = ContactListWidget.O0;
                hz3 hz3Var2 = contactListWidget.C0().b;
                hz3Var2.getClass();
                return new zh0(hz3Var2 == hz3Var ? bi0.a.getAccessor().d(550) : bi0.a.getAccessor().d(549), ((Boolean) contactListWidget.y0.getValue()).booleanValue(), new az3(contactListWidget, i2), 14);
            case 6:
                yy7[] yy7VarArr7 = ContactListWidget.O0;
                return new ccb(contactListWidget);
            case 7:
                yy7[] yy7VarArr8 = ContactListWidget.O0;
                return new kj1(new bwf(new az3(contactListWidget, i3)), new s2i(contactListWidget, 0));
            default:
                yy7[] yy7VarArr9 = ContactListWidget.O0;
                hz3 hz3Var3 = contactListWidget.C0().b;
                hz3Var3.getClass();
                if (hz3Var3 == hz3Var) {
                    return f1e.CALL_NEW_CALL;
                }
                return null;
        }
    }
}

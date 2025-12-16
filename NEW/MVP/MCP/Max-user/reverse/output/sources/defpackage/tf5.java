package defpackage;

import android.content.res.Resources;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final /* synthetic */ class tf5 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EndlessRecyclerView2 b;

    public /* synthetic */ tf5(EndlessRecyclerView2 endlessRecyclerView2, int i) {
        this.a = i;
        this.b = endlessRecyclerView2;
    }

    @Override // defpackage.cm6
    public final Object invoke() throws Resources.NotFoundException {
        int i = this.a;
        EndlessRecyclerView2 endlessRecyclerView2 = this.b;
        switch (i) {
            case 0:
                int i2 = EndlessRecyclerView2.h2;
                return dnf.q(EndlessRecyclerView2.class.getName() + "-" + endlessRecyclerView2.getResources().getResourceName(endlessRecyclerView2.getId()), ".", "_");
            default:
                yy7[] yy7VarArr = PickerMembersListWidget.y0;
                return kk4.j(endlessRecyclerView2.getContext());
        }
    }
}

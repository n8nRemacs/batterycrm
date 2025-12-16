package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class oyb implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ oyb(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        PickerContactsListWidget pickerContactsListWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = PickerContactsListWidget.y0;
                e03 e03Var = e03.a;
                ay3 ay3Var = (ay3) e03Var.getAccessor().c(556);
                bwf bwfVarD = e03Var.getAccessor().d(8);
                bwf bwfVarD2 = e03Var.getAccessor().d(99);
                hs hsVar = pickerContactsListWidget.a;
                yy7 yy7Var = PickerContactsListWidget.y0[0];
                return new wyb(ay3Var, bwfVarD, bwfVarD2, (yg2) hsVar.a(pickerContactsListWidget));
            case 1:
                yy7[] yy7VarArr2 = PickerContactsListWidget.y0;
                x3b x3bVar = new x3b(pickerContactsListWidget.getContext());
                x3bVar.setIcon(yud.K0);
                x3bVar.setTitle(new n5g(avd.d));
                x3bVar.setSubtitle(new n5g(avd.c));
                return x3bVar;
            default:
                yy7[] yy7VarArr3 = PickerContactsListWidget.y0;
                RecyclerView recyclerView = new RecyclerView(pickerContactsListWidget.getContext(), null);
                recyclerView.setId(i1b.d0);
                recyclerView.setClipChildren(false);
                recyclerView.setClipToPadding(false);
                recyclerView.setClipToOutline(false);
                recyclerView.setItemAnimator(null);
                recyclerView.setHasFixedSize(true);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                recyclerView.setAdapter(pickerContactsListWidget.s0);
                recyclerView.j(new w73(new vc6(recyclerView, 1), new nyb(pickerContactsListWidget, 2), new dga(23), new nyb(pickerContactsListWidget, 1)));
                pickerContactsListWidget.y0(recyclerView);
                pickerContactsListWidget.v0 = x7j.c(recyclerView);
                return recyclerView;
        }
    }
}

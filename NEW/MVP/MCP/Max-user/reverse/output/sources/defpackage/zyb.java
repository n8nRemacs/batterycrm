package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class zyb implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerMembersListWidget b;

    public /* synthetic */ zyb(PickerMembersListWidget pickerMembersListWidget, int i) {
        this.a = i;
        this.b = pickerMembersListWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        PickerMembersListWidget pickerMembersListWidget = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = PickerMembersListWidget.y0;
                bwf bwfVar = new bwf(new zyb(pickerMembersListWidget, 3));
                e03 e03Var = e03.a;
                l24 l24Var = (l24) e03Var.getAccessor().c(123);
                w63 w63Var = (w63) e03Var.getAccessor().c(109);
                fd9 fd9Var = (fd9) e03Var.getAccessor().c(565);
                lzf lzfVar = (lzf) e03Var.getAccessor().c(8);
                bwf bwfVarD = e03Var.getAccessor().d(100);
                bwf bwfVarD2 = e03Var.getAccessor().d(99);
                s5i s5iVar = new s5i();
                s5iVar.a = l24Var;
                s5iVar.b = w63Var;
                s5iVar.c = bwfVarD;
                s5iVar.d = bwfVarD2;
                s5iVar.e = bwfVar;
                ContextScope contextScopeA = d7j.a(((q2b) lzfVar).b());
                s5iVar.f = contextScopeA;
                s5iVar.g = new AtomicBoolean(false);
                hd5 hd5Var = hd5.a;
                s5iVar.h = ucf.a(hd5Var);
                s5iVar.i = ucf.a(hd5Var);
                tcf tcfVarA = ucf.a(hd5Var);
                s5iVar.j = tcfVarA;
                s5iVar.k = new hbd(tcfVarA);
                s5iVar.l = kve.b(0, 0, 7);
                gw0.w(new g56(fd9Var.c, new ne9(s5iVar, null), 1), contextScopeA);
                hs hsVar = pickerMembersListWidget.a;
                yy7 yy7Var = PickerMembersListWidget.y0[0];
                return new izb(((Number) hsVar.a(pickerMembersListWidget)).longValue(), s5iVar, s5iVar, e03Var.getAccessor().d(109));
            case 1:
                yy7[] yy7VarArr2 = PickerMembersListWidget.y0;
                x3b x3bVar = new x3b(pickerMembersListWidget.getContext());
                x3bVar.setIcon(yud.K0);
                x3bVar.setTitle(new n5g(avd.d));
                x3bVar.setSubtitle(new n5g(avd.c));
                return x3bVar;
            case 2:
                yy7[] yy7VarArr3 = PickerMembersListWidget.y0;
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(pickerMembersListWidget.getContext(), null, 6);
                endlessRecyclerView2.setId(i1b.d0);
                endlessRecyclerView2.setClipChildren(false);
                endlessRecyclerView2.setClipToPadding(false);
                endlessRecyclerView2.setClipToOutline(false);
                endlessRecyclerView2.setHasFixedSize(true);
                endlessRecyclerView2.getContext();
                endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
                endlessRecyclerView2.setAdapter(pickerMembersListWidget.Z);
                endlessRecyclerView2.setItemAnimator(null);
                endlessRecyclerView2.j(new w73(new tf5(endlessRecyclerView2, i2), new ia(endlessRecyclerView2, 29, pickerMembersListWidget), new d73(1), new d73(1)));
                endlessRecyclerView2.l(new yh4(endlessRecyclerView2));
                if (pickerMembersListWidget.z0()) {
                    pickerMembersListWidget.y0(endlessRecyclerView2);
                }
                pickerMembersListWidget.v0 = x7j.c(endlessRecyclerView2);
                return endlessRecyclerView2;
            default:
                yy7[] yy7VarArr4 = PickerMembersListWidget.y0;
                e03 e03Var2 = e03.a;
                bwf bwfVarD3 = e03Var2.getAccessor().d(48);
                bwf bwfVarD4 = e03Var2.getAccessor().d(HttpStatus.SC_MULTI_STATUS);
                bwf bwfVarD5 = e03Var2.getAccessor().d(HttpStatus.SC_PARTIAL_CONTENT);
                hs hsVar2 = pickerMembersListWidget.c;
                yy7 yy7Var2 = PickerMembersListWidget.y0[2];
                return new myb(bwfVarD3, bwfVarD4, bwfVarD5, (yg2) hsVar2.a(pickerMembersListWidget));
        }
    }
}

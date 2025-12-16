package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class vc6 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ vc6(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        RecyclerView recyclerView = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = FoldersPickerScreen.Z;
                return kk4.j(recyclerView.getContext());
            case 1:
                yy7[] yy7VarArr2 = PickerContactsListWidget.y0;
                return kk4.j(recyclerView.getContext());
            default:
                a layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                int iX0 = linearLayoutManager != null ? linearLayoutManager.X0() : -1;
                int iZ0 = linearLayoutManager != null ? linearLayoutManager.Z0() : -1;
                if (iX0 != -1 && iZ0 != -1) {
                    int iAbs = Math.abs(iZ0 - iX0) + 1;
                    phd adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.o(iX0, iAbs, new Object());
                    }
                }
                return qqg.a;
        }
    }
}

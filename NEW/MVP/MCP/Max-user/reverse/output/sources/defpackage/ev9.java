package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class ev9 extends bid {
    public final int a = kti.d(80 * vw4.d().getDisplayMetrics().density);
    public Boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ MessagesListWidget e;

    public ev9(MessagesListWidget messagesListWidget) {
        this.e = messagesListWidget;
    }

    public static boolean c(RecyclerView recyclerView) {
        phd adapter;
        LinearLayoutManager linearLayoutManagerE = x7j.e(recyclerView);
        if (linearLayoutManagerE == null || (adapter = recyclerView.getAdapter()) == null) {
            return false;
        }
        int iJ = adapter.j();
        Integer numValueOf = Integer.valueOf(iJ);
        if (iJ <= 0) {
            numValueOf = null;
        }
        return (numValueOf == null || linearLayoutManagerE.s(numValueOf.intValue() - 1) == null) ? false : true;
    }

    @Override // defpackage.bid
    public final void a(RecyclerView recyclerView, int i) {
        this.c = i != 0;
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        int iComputeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
        boolean z = this.d;
        int i3 = this.a;
        if (z || iComputeVerticalScrollRange >= recyclerView.getHeight() + i3) {
            this.d = false;
            boolean zC = c(recyclerView);
            MessagesListWidget messagesListWidget = this.e;
            if (!zC || (iComputeVerticalScrollOffset >= 0 && iComputeVerticalScrollRange - (iComputeVerticalScrollOffset + iComputeVerticalScrollExtent) >= i3)) {
                Boolean bool = this.b;
                if (bool == null || bool.equals(Boolean.FALSE)) {
                    yy7[] yy7VarArr = MessagesListWidget.b1;
                    messagesListWidget.K0().Q(true);
                    this.b = Boolean.TRUE;
                    return;
                }
                return;
            }
            Boolean bool2 = this.b;
            if (bool2 == null || bool2.equals(Boolean.TRUE)) {
                yy7[] yy7VarArr2 = MessagesListWidget.b1;
                messagesListWidget.K0().Q(false);
                this.b = Boolean.FALSE;
            }
        }
    }
}

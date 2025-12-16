package defpackage;

import android.view.View;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

/* loaded from: classes2.dex */
public final class ld5 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ EmptyRecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld5(EmptyRecyclerView emptyRecyclerView, int i) {
        super(12, (Object) null);
        this.c = i;
        this.d = emptyRecyclerView;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        int i = this.c;
        EmptyRecyclerView emptyRecyclerView = this.d;
        switch (i) {
            case 0:
                if (((View) obj2) == null) {
                    if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.V1 != null) {
                        phd adapter = emptyRecyclerView.getAdapter();
                        if (adapter != null) {
                            EmptyRecyclerView.J0(adapter, emptyRecyclerView.V1);
                        }
                        emptyRecyclerView.V1 = null;
                        break;
                    }
                } else {
                    yy7[] yy7VarArr = EmptyRecyclerView.X1;
                    emptyRecyclerView.V1 = new kd5(0, emptyRecyclerView);
                    phd adapter2 = emptyRecyclerView.getAdapter();
                    if (adapter2 != null) {
                        EmptyRecyclerView.I0(adapter2, emptyRecyclerView.V1);
                        break;
                    }
                }
                break;
            default:
                if (((View) obj2) == null) {
                    if (emptyRecyclerView.getAdapter() != null && emptyRecyclerView.V1 != null) {
                        phd adapter3 = emptyRecyclerView.getAdapter();
                        if (adapter3 != null) {
                            EmptyRecyclerView.J0(adapter3, emptyRecyclerView.V1);
                        }
                        emptyRecyclerView.V1 = null;
                        break;
                    }
                } else {
                    yy7[] yy7VarArr2 = EmptyRecyclerView.X1;
                    emptyRecyclerView.V1 = new kd5(0, emptyRecyclerView);
                    phd adapter4 = emptyRecyclerView.getAdapter();
                    if (adapter4 != null) {
                        EmptyRecyclerView.I0(adapter4, emptyRecyclerView.V1);
                        break;
                    }
                }
                break;
        }
    }
}

package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class dv9 extends bid {
    public final Rect a = new Rect();
    public int b = -1;
    public int c = -1;
    public boolean d = true;
    public LinkedHashSet e = new LinkedHashSet();
    public LinkedHashSet f = new LinkedHashSet();
    public final /* synthetic */ MessagesListWidget g;

    public dv9(MessagesListWidget messagesListWidget) {
        this.g = messagesListWidget;
    }

    @Override // defpackage.bid
    public final void a(RecyclerView recyclerView, int i) {
        this.d = i != 2;
        if (i == 0) {
            b(recyclerView, -1, -1);
            c();
        }
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (this.d) {
            LinearLayoutManager linearLayoutManagerE = x7j.e(recyclerView);
            if (linearLayoutManagerE == null) {
                throw new IllegalStateException("Only linear layout manger supported");
            }
            int iX0 = linearLayoutManagerE.X0();
            int iZ0 = linearLayoutManagerE.Z0();
            View viewS = linearLayoutManagerE.s(iX0);
            Rect rect = this.a;
            if (viewS != null && ((!viewS.getLocalVisibleRect(rect) || rect.height() < viewS.getMeasuredHeight() * 0.3f) && (iX0 = linearLayoutManagerE.U0()) == -1)) {
                iX0 = this.b;
            }
            View viewS2 = linearLayoutManagerE.s(iZ0);
            if (viewS2 != null && ((!viewS2.getLocalVisibleRect(rect) || rect.height() < viewS2.getMeasuredHeight() * 0.3f) && (iZ0 = linearLayoutManagerE.Y0()) == -1)) {
                iZ0 = this.c;
            }
            Integer numValueOf = Integer.valueOf(iX0);
            Integer numValueOf2 = Integer.valueOf(iZ0);
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            int i3 = this.b;
            if (i3 == -1 && this.c == -1) {
                this.b = iIntValue;
                this.c = iIntValue2;
                d(iIntValue, iIntValue2);
                c();
                return;
            }
            if (iIntValue == i3 && iIntValue2 == this.c) {
                return;
            }
            this.b = iIntValue;
            this.c = iIntValue2;
            d(iIntValue, iIntValue2);
        }
    }

    public final void c() {
        Set setE = gke.e(this.e, this.f);
        if (setE.isEmpty()) {
            return;
        }
        this.f = this.e;
        this.e = new LinkedHashSet();
        yy7[] yy7VarArr = MessagesListWidget.b1;
        vu9 vu9VarK0 = this.g.K0();
        gu5 gu5Var = (gu5) vu9VarK0.z0;
        gu5Var.getClass();
        if (gu5Var.j(PmsKey.f155viewscountenabled, false)) {
            svi.e(vu9VarK0.a, ((q2b) vu9VarK0.X).a(), null, new du9(setE, vu9VarK0, null), 2);
        }
    }

    public final void d(int i, int i2) {
        LinkedHashSet linkedHashSet = this.e;
        to7 to7Var = new to7(i, i2, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = to7Var.iterator();
        while (((so7) it).c) {
            MessageModel messageModelM = this.g.C0.M(((so7) it).nextInt());
            if (messageModelM != null) {
                arrayList.add(messageModelM);
            }
        }
        linkedHashSet.addAll(arrayList);
    }
}

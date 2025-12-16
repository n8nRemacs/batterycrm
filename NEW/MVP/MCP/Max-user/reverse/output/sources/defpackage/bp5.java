package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class bp5 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bp5(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        phd adapter;
        switch (this.a) {
            case 0:
                return ((dp5) this.c).a.findViewById(this.b);
            case 1:
                mc8 mc8Var = (mc8) this.c;
                Drawable drawable = mc8Var.a.getDrawable(this.b);
                drawable.setColorFilter(new PorterDuffColorFilter(mc8Var.b, PorterDuff.Mode.SRC_IN));
                return drawable;
            default:
                MessagesLayoutManager messagesLayoutManager = (MessagesLayoutManager) this.c;
                int i = this.b;
                View viewS = messagesLayoutManager.s(i);
                if (viewS != null) {
                    String str = messagesLayoutManager.F;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            RecyclerView recyclerView = messagesLayoutManager.H;
                            l6bVar.c(lg8Var, str, "LM scroll to inflated view after redraw by pos:" + i + ", curSize:" + ((recyclerView == null || (adapter = recyclerView.getAdapter()) == null) ? null : Integer.valueOf(adapter.j())), null);
                        }
                    }
                    messagesLayoutManager.x1(viewS, i);
                }
                return Boolean.FALSE;
        }
    }
}

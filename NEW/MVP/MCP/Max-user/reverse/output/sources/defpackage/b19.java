package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class b19 extends bid {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public b19(Context context, o91 o91Var, o91 o91Var2) {
        this.a = 0;
        this.f = o91Var;
        this.g = o91Var2;
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = 50;
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) throws IOException {
        View viewS;
        MessageModel messageModelM;
        View viewS2;
        switch (this.a) {
            case 0:
                int i3 = this.b;
                int i4 = this.c;
                if (i2 > 0) {
                    int i5 = this.e + i2;
                    this.e = i5;
                    if (i5 >= i4 || i2 >= i3) {
                        ((o91) this.g).invoke();
                        this.e = 0;
                        this.d = 0;
                        return;
                    }
                    return;
                }
                if (i2 < 0) {
                    int i6 = this.d + i2;
                    this.d = i6;
                    if (Math.abs(i6) >= i4 || Math.abs(i2) >= i3) {
                        ((o91) this.f).invoke();
                        this.d = 0;
                        this.e = 0;
                        return;
                    }
                    return;
                }
                return;
            default:
                LinearLayoutManager linearLayoutManagerE = x7j.e(recyclerView);
                if (linearLayoutManagerE == null) {
                    throw new IllegalStateException("Only linear layout manger supported");
                }
                this.b = linearLayoutManagerE.X0();
                int iZ0 = linearLayoutManagerE.Z0();
                this.d = iZ0;
                int i7 = this.b;
                if (i7 == -1 || iZ0 == -1) {
                    return;
                }
                if (i7 < this.c && (viewS2 = linearLayoutManagerE.s(i7)) != null) {
                    viewS2.getLocalVisibleRect((Rect) this.f);
                    if (((Rect) this.f).height() >= viewS2.getMeasuredHeight() * 0.3f) {
                        this.c = this.b;
                    }
                }
                int i8 = this.d;
                if (i8 <= this.e || (viewS = linearLayoutManagerE.s(i8)) == null) {
                    return;
                }
                if (!viewS.getLocalVisibleRect((Rect) this.f) || ((Rect) this.f).height() < viewS.getMeasuredHeight() * 0.3f) {
                    this.d = linearLayoutManagerE.Y0();
                }
                int i9 = this.d;
                boolean zK = false;
                if (i9 >= 0 && i9 < ((MessagesListWidget) this.g).C0.j() && (messageModelM = ((MessagesListWidget) this.g).C0.M(i9)) != null) {
                    String str = ((MessagesListWidget) this.g).a;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, "Try change last read message from listener, pos:" + i9 + ", msg:" + messageModelM.n(), null);
                        }
                    }
                    zK = ((MessagesListWidget) this.g).K0().K(messageModelM);
                }
                if (zK) {
                    this.e = this.d;
                    return;
                }
                return;
        }
    }

    public b19(MessagesListWidget messagesListWidget) {
        this.a = 1;
        this.g = messagesListWidget;
        this.f = new Rect();
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }
}

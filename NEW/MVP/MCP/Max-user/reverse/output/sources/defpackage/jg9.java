package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class jg9 extends q55 {
    public final int A0;
    public yf9 B0;
    public zf9 C0;
    public final int z0;

    public jg9(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.z0 = 21;
            this.A0 = 22;
        } else {
            this.z0 = 22;
            this.A0 = 21;
        }
    }

    @Override // defpackage.q55, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        sf9 sf9Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.B0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                sf9Var = (sf9) headerViewListAdapter.getWrappedAdapter();
            } else {
                sf9Var = (sf9) adapter;
                headersCount = 0;
            }
            zf9 zf9VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= sf9Var.getCount()) ? null : sf9Var.getItem(i);
            zf9 zf9Var = this.C0;
            if (zf9Var != zf9VarB) {
                vf9 vf9Var = sf9Var.a;
                if (zf9Var != null) {
                    this.B0.d(vf9Var, zf9Var);
                }
                this.C0 = zf9VarB;
                if (zf9VarB != null) {
                    this.B0.k(vf9Var, zf9VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.z0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.A0) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (sf9) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (sf9) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(yf9 yf9Var) {
        this.B0 = yf9Var;
    }

    @Override // defpackage.q55, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}

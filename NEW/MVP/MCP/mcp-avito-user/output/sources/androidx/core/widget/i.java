package androidx.core.widget;

import android.widget.ListView;
import j.N;

/* compiled from: ListViewAutoScrollHelper.java */
/* loaded from: classes.dex */
public class i extends AbstractViewOnTouchListenerC22847a {

    /* renamed from: s, reason: collision with root package name */
    public final ListView f45160s;

    public i(@N ListView listView) {
        super(listView);
        this.f45160s = listView;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC22847a
    public final boolean a(int i12) {
        ListView listView = this.f45160s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i13 = firstVisiblePosition + childCount;
        if (i12 > 0) {
            if (i13 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i12 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.AbstractViewOnTouchListenerC22847a
    public final void f(int i12) {
        this.f45160s.scrollListBy(i12);
    }
}

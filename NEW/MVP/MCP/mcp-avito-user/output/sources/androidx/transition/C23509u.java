package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import java.util.ArrayList;

/* compiled from: GhostViewHolder.java */
@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23509u extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f54845d = 0;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public ViewGroup f54846b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f54847c;

    public static void a(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.f54847c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            ViewGroup viewGroup = this.f54846b;
            viewGroup.setTag(R.id.ghost_view_holder, null);
            new Z(viewGroup).f54732a.remove(this);
            this.f54847c = false;
        }
    }
}

package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import com.avito.android.R;
import e1.C39842a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FragmentContainerView.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lkotlin/G0;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f46343b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f46344c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public View.OnApplyWindowInsetsListener f46345d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46346e;

    /* compiled from: FragmentContainerView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$a;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @j.X
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f46347a = new a();
    }

    @X41.j
    public FragmentContainerView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a(View view) {
        if (this.f46344c.contains(view)) {
            this.f46343b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.k View view, int i12, @Y61.l ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i12, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @Y61.k
    @j.X
    public final WindowInsets dispatchApplyWindowInsets(@Y61.k WindowInsets windowInsets) {
        J0 j0V;
        J0 j0S = J0.s(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f46345d;
        if (onApplyWindowInsetsListener != null) {
            a.f46347a.getClass();
            j0V = J0.s(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            j0V = C22823h0.v(this, j0S);
        }
        if (!j0V.o()) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                C22823h0.c(getChildAt(i12), j0V);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        if (this.f46346e) {
            Iterator it = this.f46343b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(@Y61.k Canvas canvas, @Y61.k View view, long j12) {
        if (this.f46346e) {
            ArrayList arrayList = this.f46343b;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j12);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(@Y61.k View view) {
        this.f46344c.remove(view);
        if (this.f46343b.remove(view)) {
            this.f46346e = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        ActivityC22955m activityC22955m;
        FragmentManager supportFragmentManager;
        Fragment fragmentI = FragmentManager.I(this);
        if (fragmentI == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activityC22955m = null;
                    break;
                }
                if (context instanceof ActivityC22955m) {
                    activityC22955m = (ActivityC22955m) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activityC22955m == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = activityC22955m.getSupportFragmentManager();
        } else {
            if (!fragmentI.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragmentI + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = fragmentI.getChildFragmentManager();
        }
        return (F) supportFragmentManager.G(getId());
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            a(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@Y61.k View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i12) {
        a(getChildAt(i12));
        super.removeViewAt(i12);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(@Y61.k View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i12, int i13) {
        int i14 = i12 + i13;
        for (int i15 = i12; i15 < i14; i15++) {
            a(getChildAt(i15));
        }
        super.removeViews(i12, i13);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i12, int i13) {
        int i14 = i12 + i13;
        for (int i15 = i12; i15 < i14; i15++) {
            a(getChildAt(i15));
        }
        super.removeViewsInLayout(i12, i13);
    }

    @X41.i
    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f46346e = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Y61.l LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@Y61.k View.OnApplyWindowInsetsListener listener) {
        this.f46345d = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(@Y61.k View view) {
        if (view.getParent() == this) {
            this.f46344c.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(@Y61.k Context context) {
        super(context);
        this.f46343b = new ArrayList();
        this.f46344c = new ArrayList();
        this.f46346e = true;
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        String str;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f46343b = new ArrayList();
        this.f46344c = new ArrayList();
        this.f46346e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39842a.d.f394260b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public FragmentContainerView(@Y61.k Context context, @Y61.k AttributeSet attributeSet, @Y61.k FragmentManager fragmentManager) {
        View view;
        super(context, attributeSet);
        this.f46343b = new ArrayList();
        this.f46344c = new ArrayList();
        this.f46346e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39842a.d.f394260b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentG = fragmentManager.G(id2);
        if (classAttribute != null && fragmentG == null) {
            if (id2 == -1) {
                throw new IllegalStateException(AK.c.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Fragment fragmentB = fragmentManager.O().b(context.getClassLoader(), classAttribute);
            fragmentB.mFragmentId = id2;
            fragmentB.mContainerId = id2;
            fragmentB.mTag = string;
            fragmentB.mFragmentManager = fragmentManager;
            fragmentB.mHost = fragmentManager.f46384v;
            fragmentB.onInflate(context, attributeSet, (Bundle) null);
            C22943a c22943a = new C22943a(fragmentManager);
            c22943a.f46457p = true;
            fragmentB.mContainer = this;
            c22943a.j(getId(), fragmentB, string, 1);
            c22943a.h();
        }
        Iterator it = fragmentManager.f46365c.d().iterator();
        while (it.hasNext()) {
            E e12 = (E) it.next();
            Fragment fragment = e12.f46294c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                e12.a();
            }
        }
    }

    @Override // android.view.View
    @Y61.k
    @j.X
    public final WindowInsets onApplyWindowInsets(@Y61.k WindowInsets windowInsets) {
        return windowInsets;
    }
}

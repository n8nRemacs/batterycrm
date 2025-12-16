package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import e1.C39842a;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class LayoutInflaterFactory2C22961t implements LayoutInflater.Factory2 {

    /* renamed from: b, reason: collision with root package name */
    public final FragmentManager f46600b;

    public LayoutInflaterFactory2C22961t(FragmentManager fragmentManager) {
        this.f46600b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @j.P
    public final View onCreateView(@j.N String str, @j.N Context context, @j.N AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @j.P
    public final View onCreateView(@j.P View view, @j.N String str, @j.N Context context, @j.N AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        E eI2;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f46600b;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39842a.d.f394259a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(C22959q.c(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id2 = view != null ? view.getId() : 0;
                if (id2 == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentG = resourceId != -1 ? fragmentManager.G(resourceId) : null;
                if (fragmentG == null && string != null) {
                    fragmentG = fragmentManager.H(string);
                }
                if (fragmentG == null && id2 != -1) {
                    fragmentG = fragmentManager.G(id2);
                }
                if (fragmentG == null) {
                    fragmentG = fragmentManager.O().b(context.getClassLoader(), attributeValue);
                    fragmentG.mFromLayout = true;
                    fragmentG.mFragmentId = resourceId != 0 ? resourceId : id2;
                    fragmentG.mContainerId = id2;
                    fragmentG.mTag = string;
                    fragmentG.mInLayout = true;
                    fragmentG.mFragmentManager = fragmentManager;
                    r<?> rVar = fragmentManager.f46384v;
                    fragmentG.mHost = rVar;
                    fragmentG.onInflate((Context) rVar.f46584c, attributeSet, fragmentG.mSavedFragmentState);
                    eI2 = fragmentManager.a(fragmentG);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragmentG.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (fragmentG.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    fragmentG.mInLayout = true;
                    fragmentG.mFragmentManager = fragmentManager;
                    r<?> rVar2 = fragmentManager.f46384v;
                    fragmentG.mHost = rVar2;
                    fragmentG.onInflate((Context) rVar2.f46584c, attributeSet, fragmentG.mSavedFragmentState);
                    eI2 = fragmentManager.i(fragmentG);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragmentG.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f46587a;
                FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragmentG, "Attempting to use <fragment> tag to add fragment " + fragmentG + " to container " + viewGroup);
                FragmentStrictMode.f46587a.getClass();
                FragmentStrictMode.b(fragmentTagUsageViolation);
                FragmentStrictMode.a(fragmentG).f46598a.getClass();
                fragmentG.mContainer = viewGroup;
                eI2.i();
                eI2.h();
                View view2 = fragmentG.mView;
                if (view2 == null) {
                    throw new IllegalStateException(AK.c.k("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentG.mView.getTag() == null) {
                    fragmentG.mView.setTag(string);
                }
                fragmentG.mView.addOnAttachStateChangeListener(new a(eI2));
                return fragmentG.mView;
            }
        }
        return null;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* renamed from: androidx.fragment.app.t$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ E f46601b;

        public a(E e12) {
            this.f46601b = e12;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            E e12 = this.f46601b;
            Fragment fragment = e12.f46294c;
            e12.i();
            SpecialEffectsController.f((ViewGroup) fragment.mView.getParent(), LayoutInflaterFactory2C22961t.this.f46600b).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}

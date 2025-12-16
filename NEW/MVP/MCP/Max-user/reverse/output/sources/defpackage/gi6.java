package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* loaded from: classes.dex */
public final class gi6 implements LayoutInflater.Factory2 {
    public final c a;

    public gi6(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        e eVarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        c cVar = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, cVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l6d.Fragment);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(l6d.Fragment_android_name);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(l6d.Fragment_android_id, -1);
            String string = typedArrayObtainStyledAttributes.getString(l6d.Fragment_android_tag);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = a.class.isAssignableFrom(li6.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    a aVarC = resourceId != -1 ? cVar.C(resourceId) : null;
                    if (aVarC == null && string != null) {
                        aVarC = cVar.D(string);
                    }
                    if (aVarC == null && id != -1) {
                        aVarC = cVar.C(id);
                    }
                    if (aVarC == null) {
                        li6 li6VarH = cVar.H();
                        context.getClassLoader();
                        aVarC = li6VarH.a(attributeValue);
                        aVarC.x0 = true;
                        aVarC.H0 = resourceId != 0 ? resourceId : id;
                        aVarC.I0 = id;
                        aVarC.J0 = string;
                        aVarC.y0 = true;
                        aVarC.D0 = cVar;
                        ei6 ei6Var = cVar.w;
                        aVarC.E0 = ei6Var;
                        b bVar = ei6Var.d;
                        aVarC.V(attributeSet, aVarC.b);
                        eVarG = cVar.a(aVarC);
                        if (c.K(2)) {
                            Log.v("FragmentManager", "Fragment " + aVarC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (aVarC.y0) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        aVarC.y0 = true;
                        aVarC.D0 = cVar;
                        ei6 ei6Var2 = cVar.w;
                        aVarC.E0 = ei6Var2;
                        b bVar2 = ei6Var2.d;
                        aVarC.V(attributeSet, aVarC.b);
                        eVarG = cVar.g(aVarC);
                        if (c.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + aVarC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    yi6 yi6Var = zi6.a;
                    zi6.b(new FragmentTagUsageViolation(aVarC, "Attempting to use <fragment> tag to add fragment " + aVarC + " to container " + viewGroup));
                    zi6.a(aVarC).getClass();
                    aVarC.R0 = viewGroup;
                    eVarG.k();
                    eVarG.j();
                    View view2 = aVarC.S0;
                    if (view2 == null) {
                        throw new IllegalStateException(ho7.i("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (aVarC.S0.getTag() == null) {
                        aVarC.S0.setTag(string);
                    }
                    aVarC.S0.addOnAttachStateChangeListener(new r40(this, eVarG));
                    return aVarC.S0;
                }
            }
        }
        return null;
    }
}

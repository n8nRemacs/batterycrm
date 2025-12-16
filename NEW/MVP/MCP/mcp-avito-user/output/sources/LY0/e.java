package lY0;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.R;
import j.N;

/* compiled from: ChildrenAlphaProperty.java */
/* loaded from: classes6.dex */
public class e extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final e f413885a = new e(Float.class, "childrenAlpha");

    @Override // android.util.Property
    @N
    public final Float get(@N ViewGroup viewGroup) {
        Float f12 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f12 != null ? f12 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(@N ViewGroup viewGroup, @N Float f12) {
        ViewGroup viewGroup2 = viewGroup;
        Float f13 = f12;
        float fFloatValue = f13.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, f13);
        int childCount = viewGroup2.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            viewGroup2.getChildAt(i12).setAlpha(fFloatValue);
        }
    }
}

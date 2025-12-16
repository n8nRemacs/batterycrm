package defpackage;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class lqi {
    public static final void a(Animator animator) {
        animator.removeAllListeners();
        animator.cancel();
    }

    public static final void b(ViewPager2 viewPager2) {
        RecyclerView recyclerView = (RecyclerView) lee.i(lee.g(new at(8, viewPager2), zx0.H0));
        if (recyclerView != null) {
            recyclerView.setId(zud.a1);
        }
    }

    public static ArrayList c(Object... objArr) {
        int length = objArr.length;
        u4j.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(jni.h(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList d(om6 om6Var, List list) {
        return list != null ? new xa8(om6Var, list) : new ya8(om6Var, list);
    }
}

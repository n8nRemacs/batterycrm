package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* loaded from: classes.dex */
public final class li0 extends d2f {
    public final ii0 E0;
    public final c14 F0;

    public li0(Context context, b14 b14Var) {
        ii0 ii0Var = (ii0) bi0.a.getAccessor().c(155);
        ViewPager2 viewPager2 = new ViewPager2(context);
        lqi.b(viewPager2);
        super(viewPager2);
        this.E0 = ii0Var;
        c14 c14Var = new c14(b14Var);
        this.F0 = c14Var;
        viewPager2.setId(vxa.a);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        viewPager2.setAdapter(c14Var);
        viewPager2.setOrientation(0);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setPageTransformer(new i00(viewPager2, 1, this));
        viewPager2.b(new ki0(0, this));
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(ai0 ai0Var) {
        List list = ai0Var.b;
        this.F0.F(list, new o3(17, this));
        ViewPager2 viewPager2 = (ViewPager2) this.a;
        viewPager2.setUserInputEnabled(list.size() > 1);
        if (list.size() == 1 && ((d14) list.get(0)).a == 1) {
            viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class f8b extends FrameLayout implements u6g {
    public static final /* synthetic */ yy7[] s0 = {new z8a(f8b.class, "size", "getSize()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Size;"), u45.h(vid.a, f8b.class, "mode", "getMode()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton$Mode;")};
    public final e8b a;
    public final e8b b;
    public final vbb c;
    public final ShapeDrawable d;
    public final RippleDrawable o;

    public f8b(Context context) {
        super(context, null);
        this.a = new e8b(this, 0);
        this.b = new e8b(this, 1);
        vbb vbbVar = new vbb(context);
        vbbVar.setId(zud.i);
        this.c = vbbVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.d = shapeDrawable;
        int i = a93.s0.y(this).c().a.a.e;
        this.o = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        addView(vbbVar);
        c();
        d();
    }

    public final void a(float f, int i, String str) {
        Drawable drawableA = eri.a(getContext(), i);
        if (drawableA == null) {
            return;
        }
        b(drawableA, str, f);
    }

    public final void b(Drawable drawable, String str, float f) {
        vbb vbbVar = this.c;
        vbbVar.setImageDrawable(drawable);
        vbbVar.o = ve3.f(str);
        vbbVar.d = f;
        vbbVar.invalidate();
    }

    public final void c() {
        int i;
        v1a v1aVar = a93.s0;
        v1aVar.y(this).getIcon();
        this.c.setImageTintList(ColorStateList.valueOf(-1));
        int iOrdinal = getMode().ordinal();
        if (iOrdinal == 0) {
            i = v1aVar.y(this).b().g;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        this.d.getPaint().setColor(i);
        v1aVar.y(this).b();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-1728053248);
        RippleDrawable rippleDrawable = this.o;
        rippleDrawable.setColor(colorStateListValueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    public final void d() {
        int i;
        int i2;
        int iOrdinal = getSize().ordinal();
        if (iOrdinal == 0) {
            i = 24;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 32;
        }
        int iD = kti.d(i * vw4.d().getDisplayMetrics().density);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(iD, iD));
        int iOrdinal2 = getSize().ordinal();
        if (iOrdinal2 == 0) {
            i2 = 8;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 10;
        }
        int iD2 = kti.d(i2 * vw4.d().getDisplayMetrics().density);
        setPadding(iD2, iD2, iD2, iD2);
        setOutlineProvider(new u74(iD));
        requestLayout();
        invalidate();
    }

    public final c8b getMode() {
        yy7 yy7Var = s0[1];
        return (c8b) this.b.b;
    }

    public final d8b getSize() {
        yy7 yy7Var = s0[0];
        return (d8b) this.a.b;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        c();
    }

    public final void setMode(c8b c8bVar) {
        this.b.O(this, s0[1], c8bVar);
    }

    public final void setSize(d8b d8bVar) {
        this.a.O(this, s0[0], d8bVar);
    }
}

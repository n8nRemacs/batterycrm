package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.a93;
import defpackage.a9b;
import defpackage.at;
import defpackage.ax0;
import defpackage.b9b;
import defpackage.bx0;
import defpackage.c9b;
import defpackage.cm6;
import defpackage.cx0;
import defpackage.dga;
import defpackage.dpg;
import defpackage.dqi;
import defpackage.e9b;
import defpackage.f9b;
import defpackage.gza;
import defpackage.h9b;
import defpackage.hza;
import defpackage.i9b;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jqi;
import defpackage.jza;
import defpackage.k9b;
import defpackage.kti;
import defpackage.kwi;
import defpackage.kza;
import defpackage.lee;
import defpackage.m9b;
import defpackage.ns2;
import defpackage.nz5;
import defpackage.r2b;
import defpackage.t5g;
import defpackage.t75;
import defpackage.u45;
import defpackage.u6g;
import defpackage.u74;
import defpackage.vid;
import defpackage.vmf;
import defpackage.vw4;
import defpackage.w2b;
import defpackage.y8b;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.z8b;
import defpackage.zud;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004!*1\u001eB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0010\u001a\u00020\u000b2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0013\u0010\u001c\u001a\u00020\u000b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R+\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u00100\u001a\u00020*2\u0006\u0010\"\u001a\u00020*8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010$\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00107\u001a\u0002012\u0006\u0010\"\u001a\u0002018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u00104\"\u0004\b5\u00106R/\u0010>\u001a\u0004\u0018\u0001082\b\u0010\"\u001a\u0004\u0018\u0001088F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010$\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010@\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010$\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\rR\u0011\u0010\u0016\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010;R\u0014\u0010J\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeButton;", "Landroid/view/ViewGroup;", "Lu6g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lqqg;", "setEnabled", "(Z)V", "Landroid/graphics/drawable/Drawable;", "icon", "setEndIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "resId", "(Ljava/lang/Integer;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "(I)V", "setTextBadge", "Landroid/widget/TextView;", "setupTextViewParams", "(Landroid/widget/TextView;)V", "Lhza;", "getInternalType", "()Lhza;", "Ljza;", "<set-?>", "a", "Ldbd;", "getSize", "()Ljza;", "setSize", "(Ljza;)V", "size", "Liza;", "b", "getMode", "()Liza;", "setMode", "(Liza;)V", "mode", "Lgza;", "c", "getAppearance", "()Lgza;", "setAppearance", "(Lgza;)V", "appearance", "Lyeb;", "d", "getCustomTheme", "()Lyeb;", "setCustomTheme", "(Lyeb;)V", "customTheme", "o", "isProgressEnabled", "()Z", "setProgressEnabled", "", "getText", "()Ljava/lang/String;", "getCurrentTheme", "currentTheme", "getVerticalPaddingOffset", "()I", "verticalPaddingOffset", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneMeButton extends ViewGroup implements u6g {
    public static final /* synthetic */ yy7[] A0 = {new z8a(OneMeButton.class, "size", "getSize()Lone/me/sdk/uikit/common/button/OneMeButton$Size;"), u45.h(vid.a, OneMeButton.class, "mode", "getMode()Lone/me/sdk/uikit/common/button/OneMeButton$Mode;"), new z8a(OneMeButton.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/button/OneMeButton$Appearance;"), new z8a(OneMeButton.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), new z8a(OneMeButton.class, "isProgressEnabled", "isProgressEnabled()Z")};
    public final kza a;
    public final kza b;
    public final kza c;
    public final kza d;
    public final kza o;
    public final Object s0;
    public final Object t0;
    public final Object u0;
    public final Object v0;
    public final Object w0;
    public final ShapeDrawable x0;
    public final RippleDrawable y0;
    public boolean z0;

    public OneMeButton(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new kza(this, 0);
        this.b = new kza(this, 1);
        this.c = new kza(this, 2);
        this.d = new kza(this, 3);
        this.o = new kza(this, 4);
        final int i = 0;
        this.s0 = ipi.b(3, new cm6() { // from class: fza
            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                OneMeButton oneMeButton = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = OneMeButton.A0;
                        m9b m9bVar = new m9b(context2);
                        m9bVar.setId(zud.h);
                        m9bVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        mgb.a(m9bVar, new r98(10, m9bVar, oneMeButton));
                        dqi.a(oneMeButton, m9bVar, Integer.valueOf(oneMeButton.getChildCount()));
                        return m9bVar;
                    default:
                        yy7[] yy7VarArr2 = OneMeButton.A0;
                        w2b w2bVar = new w2b(context2);
                        int i3 = zud.f;
                        w2bVar.setId(i3);
                        oneMeButton.addView(w2bVar, oneMeButton.b(i3));
                        return w2bVar;
                }
            }
        });
        this.t0 = ipi.b(3, new ns2(context, 20));
        this.u0 = ipi.b(3, new ns2(context, 21));
        this.v0 = ipi.b(3, new ns2(context, 22));
        final int i2 = 1;
        this.w0 = ipi.b(3, new cm6() { // from class: fza
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                OneMeButton oneMeButton = this;
                Context context2 = context;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = OneMeButton.A0;
                        m9b m9bVar = new m9b(context2);
                        m9bVar.setId(zud.h);
                        m9bVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        mgb.a(m9bVar, new r98(10, m9bVar, oneMeButton));
                        dqi.a(oneMeButton, m9bVar, Integer.valueOf(oneMeButton.getChildCount()));
                        return m9bVar;
                    default:
                        yy7[] yy7VarArr2 = OneMeButton.A0;
                        w2b w2bVar = new w2b(context2);
                        int i3 = zud.f;
                        w2bVar.setId(i3);
                        oneMeButton.addView(w2bVar, oneMeButton.b(i3));
                        return w2bVar;
                }
            }
        });
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.x0 = shapeDrawable;
        int i3 = a93.s0.y(this).c().a.a.e;
        this.y0 = new RippleDrawable(ColorStateList.valueOf(i3), shapeDrawable, new ColorDrawable(-65536));
        this.z0 = true;
        setClipToOutline(true);
        e();
        j();
    }

    public static final void a(OneMeButton oneMeButton, boolean z) {
        int i = zud.a;
        nz5 nz5Var = new nz5(lee.g(new at(8, oneMeButton), new dga(7)));
        while (nz5Var.hasNext()) {
            ((View) nz5Var.next()).setVisibility(z ? 0 : 8);
        }
    }

    private final yeb getCurrentTheme() {
        yeb customTheme = getCustomTheme();
        return customTheme == null ? a93.s0.y(this) : customTheme;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    private final hza getInternalType() {
        yy7 yy7Var = A0[4];
        return ((Boolean) this.o.b).booleanValue() ? hza.c : (dqi.r(this.t0) == dqi.r(this.u0) || dqi.r(this.v0)) ? hza.a : hza.b;
    }

    private final int getVerticalPaddingOffset() {
        return (getPaddingTop() / 2) - (getPaddingBottom() / 2);
    }

    private final void setupTextViewParams(TextView textView) {
        CharSequence text = textView.getText();
        textView.setVisibility(text == null || text.length() == 0 ? 8 : 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(17);
        textView.setTextAlignment(4);
    }

    public final int b(int i) {
        if (i == zud.i) {
            return 0;
        }
        if (i == zud.k) {
            return (lee.e(jqi.e(this)) / 2) - 1;
        }
        if (i == zud.f) {
            return lee.e(jqi.e(this)) / 2;
        }
        if (i == zud.g) {
            return lee.e(jqi.e(this)) - 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void c(Integer num, boolean z) {
        ?? r0 = this.w0;
        if (r0.e() || num != null) {
            w2b w2bVar = (w2b) r0.getValue();
            w2bVar.setVisibility(num != null ? 0 : 8);
            w2bVar.g(num != null ? num.intValue() : 0, z);
            g();
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void d(Integer num) {
        ImageView imageView = (ImageView) this.t0.getValue();
        imageView.setId(zud.i);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        imageView.setVisibility(num == null ? 8 : 0);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.z0 = true;
        dqi.a(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        j();
    }

    public final void e() {
        h();
        k();
        g();
        i();
        f();
        invalidate();
    }

    public final void f() {
        ax0 ax0Var;
        yeb currentTheme = getCurrentTheme();
        iza mode = getMode();
        gza appearance = getAppearance();
        if (isEnabled()) {
            int iOrdinal = mode.ordinal();
            if (iOrdinal == 0) {
                int iOrdinal2 = appearance.ordinal();
                if (iOrdinal2 == 0) {
                    ax0Var = new ax0(currentTheme.c().a.a.h, Integer.valueOf(currentTheme.b().a.n));
                } else if (iOrdinal2 == 1) {
                    ax0Var = new ax0(currentTheme.c().a.a.c, Integer.valueOf(currentTheme.b().a.f));
                } else if (iOrdinal2 == 2) {
                    ax0Var = new ax0(currentTheme.c().a.a.d, Integer.valueOf(currentTheme.b().a.g));
                } else if (iOrdinal2 == 3) {
                    ax0Var = new ax0(currentTheme.c().a.a.f, Integer.valueOf(currentTheme.b().a.l));
                } else {
                    if (iOrdinal2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    currentTheme.b();
                    ax0Var = new ax0(currentTheme.c().a.a.b, -1);
                }
            } else if (iOrdinal == 1) {
                ax0Var = new ax0(currentTheme.c().a.a.e, Integer.valueOf(currentTheme.b().a.h));
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ax0Var = new ax0(currentTheme.c().a.a.i, null);
            }
        } else {
            int iOrdinal3 = mode.ordinal();
            if (iOrdinal3 == 0) {
                int iOrdinal4 = appearance.ordinal();
                if (iOrdinal4 == 0) {
                    ax0Var = new ax0(currentTheme.c().a.b.l, Integer.valueOf(currentTheme.c().a.b.l));
                } else if (iOrdinal4 == 1) {
                    ax0Var = new ax0(currentTheme.c().a.b.d, Integer.valueOf(currentTheme.c().a.b.d));
                } else if (iOrdinal4 == 2) {
                    ax0Var = new ax0(currentTheme.c().a.b.e, Integer.valueOf(currentTheme.c().a.b.e));
                } else if (iOrdinal4 == 3) {
                    ax0Var = new ax0(currentTheme.c().a.b.h, Integer.valueOf(currentTheme.c().a.b.h));
                } else {
                    if (iOrdinal4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ax0Var = new ax0(currentTheme.c().a.b.c, Integer.valueOf(currentTheme.c().a.b.c));
                }
            } else if (iOrdinal3 == 1) {
                ax0Var = new ax0(currentTheme.c().a.b.f, Integer.valueOf(currentTheme.c().a.b.f));
            } else {
                if (iOrdinal3 != 2 && iOrdinal3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ax0Var = new ax0(currentTheme.c().a.a.i, null);
            }
        }
        Paint paint = this.x0.getPaint();
        Integer num = ax0Var.a;
        paint.setColor(num != null ? num.intValue() : 0);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(ax0Var.b);
        RippleDrawable rippleDrawable = this.y0;
        rippleDrawable.setColor(colorStateListValueOf);
        setBackground(rippleDrawable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void g() {
        ?? r0 = this.w0;
        if (r0.e()) {
            w2b w2bVar = (w2b) r0.getValue();
            iza mode = getMode();
            gza appearance = getAppearance();
            int i = cx0.$EnumSwitchMapping$3[mode.ordinal()];
            r2b r2bVar = r2b.b;
            r2b r2bVar2 = r2b.o;
            if (i != 1) {
                int iOrdinal = appearance.ordinal();
                if (iOrdinal == 0) {
                    r2bVar = r2b.a;
                } else if (iOrdinal == 1) {
                    r2bVar = r2b.d;
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3 && iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r2bVar = r2bVar2;
                }
            } else if (appearance == gza.c) {
                r2bVar = r2bVar2;
            }
            w2bVar.setAppearance(r2bVar);
        }
    }

    public final gza getAppearance() {
        yy7 yy7Var = A0[2];
        return (gza) this.c.b;
    }

    public final yeb getCustomTheme() {
        yy7 yy7Var = A0[3];
        return (yeb) this.d.b;
    }

    public final iza getMode() {
        yy7 yy7Var = A0[1];
        return (iza) this.b.b;
    }

    public final jza getSize() {
        yy7 yy7Var = A0[0];
        return (jza) this.a.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final String getText() {
        ?? r0 = this.v0;
        return r0.e() ? ((TextView) r0.getValue()).getText().toString() : "";
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, k18] */
    public final void h() {
        yeb currentTheme = getCurrentTheme();
        iza mode = getMode();
        gza appearance = getAppearance();
        int iOrdinal = mode.ordinal();
        int i = -1;
        if (iOrdinal == 0) {
            int iOrdinal2 = appearance.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                currentTheme.getIcon();
            } else if (iOrdinal2 == 2) {
                i = currentTheme.getIcon().b;
            } else if (iOrdinal2 == 3) {
                currentTheme.getIcon();
            } else {
                if (iOrdinal2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = currentTheme.getIcon().g;
            }
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal3 = appearance.ordinal();
            if (iOrdinal3 == 0) {
                i = currentTheme.getIcon().k;
            } else if (iOrdinal3 == 1) {
                i = currentTheme.getIcon().c;
            } else if (iOrdinal3 == 2) {
                i = currentTheme.getIcon().f;
            } else if (iOrdinal3 == 3) {
                i = currentTheme.getIcon().d;
            } else {
                if (iOrdinal3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                currentTheme.getIcon();
            }
        }
        if (this.z0) {
            ?? r0 = this.t0;
            if (r0.e()) {
                ((ImageView) r0.getValue()).setImageTintList(ColorStateList.valueOf(i));
            }
        }
        ?? r02 = this.u0;
        if (r02.e()) {
            ((ImageView) r02.getValue()).setImageTintList(ColorStateList.valueOf(i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void i() {
        k9b k9bVar;
        ?? r0 = this.s0;
        if (r0.e()) {
            m9b m9bVar = (m9b) r0.getValue();
            iza mode = getMode();
            gza appearance = getAppearance();
            int i = cx0.$EnumSwitchMapping$3[mode.ordinal()];
            f9b f9bVar = z8b.a;
            if (i == 1) {
                int i2 = cx0.$EnumSwitchMapping$2[appearance.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        f9bVar = y8b.a;
                    } else if (i2 != 4) {
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f9bVar = c9b.a;
                    }
                }
            } else {
                if (i != 2 && i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = cx0.$EnumSwitchMapping$2[appearance.ordinal()];
                if (i3 == 1) {
                    f9bVar = e9b.a;
                } else if (i3 != 2) {
                    b9b b9bVar = b9b.a;
                    if (i3 == 3 || i3 == 4) {
                        f9bVar = b9bVar;
                    } else if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    f9bVar = a9b.a;
                }
            }
            m9bVar.setAppearance(f9bVar);
            int i4 = cx0.$EnumSwitchMapping$0[getSize().ordinal()];
            if (i4 == 1) {
                k9bVar = i9b.a;
            } else {
                if (i4 != 2 && i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                k9bVar = h9b.a;
            }
            m9bVar.setSize(k9bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, k18] */
    public final void j() {
        bx0 bx0Var;
        t5g t5gVar;
        int iD;
        k9b k9bVar;
        setMinimumHeight(kwi.b(getSize()));
        setOutlineProvider(new u74(kwi.a(getSize())));
        jza size = getSize();
        int iOrdinal = getInternalType().ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = size.ordinal();
            if (iOrdinal2 == 0) {
                bx0Var = new bx0(kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(5 * vw4.d().getDisplayMetrics().density));
            } else if (iOrdinal2 == 1) {
                bx0Var = new bx0(kti.d(16 * vw4.d().getDisplayMetrics().density), kti.d(10 * vw4.d().getDisplayMetrics().density));
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bx0Var = new bx0(kti.d(20 * vw4.d().getDisplayMetrics().density), kti.d(15 * vw4.d().getDisplayMetrics().density));
            }
        } else if (iOrdinal == 1) {
            int iOrdinal3 = size.ordinal();
            if (iOrdinal3 == 0) {
                float f = 6;
                bx0Var = new bx0(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
            } else if (iOrdinal3 == 1) {
                float f2 = 8;
                bx0Var = new bx0(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
            } else {
                if (iOrdinal3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f3 = 14;
                bx0Var = new bx0(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
            }
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int iOrdinal4 = size.ordinal();
            if (iOrdinal4 == 0) {
                bx0Var = new bx0(kti.d(12 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
            } else if (iOrdinal4 == 1) {
                bx0Var = new bx0(kti.d(16 * vw4.d().getDisplayMetrics().density), kti.d(8 * vw4.d().getDisplayMetrics().density));
            } else {
                if (iOrdinal4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bx0Var = new bx0(kti.d(20 * vw4.d().getDisplayMetrics().density), kti.d(14 * vw4.d().getDisplayMetrics().density));
            }
        }
        int i = bx0Var.a;
        setPadding(i, 0, i, 0);
        int iOrdinal5 = getSize().ordinal();
        if (iOrdinal5 == 0) {
            t5gVar = dpg.A;
        } else if (iOrdinal5 == 1) {
            t5gVar = dpg.z;
        } else {
            if (iOrdinal5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            t5gVar = dpg.y;
        }
        ?? r1 = this.v0;
        if (r1.e()) {
            t5gVar.b((TextView) r1.getValue(), t75.b);
        }
        int iOrdinal6 = getSize().ordinal();
        if (iOrdinal6 == 0) {
            iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
        } else {
            if (iOrdinal6 != 1 && iOrdinal6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iD = kti.d(24 * vw4.d().getDisplayMetrics().density);
        }
        ?? r12 = this.t0;
        if (r12.e()) {
            ImageView imageView = (ImageView) r12.getValue();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iD;
            layoutParams.height = iD;
            imageView.setLayoutParams(layoutParams);
        }
        ?? r13 = this.u0;
        if (r13.e()) {
            ImageView imageView2 = (ImageView) r13.getValue();
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = iD;
            layoutParams2.height = iD;
            imageView2.setLayoutParams(layoutParams2);
        }
        ?? r0 = this.s0;
        if (r0.e()) {
            m9b m9bVar = (m9b) r0.getValue();
            int i2 = cx0.$EnumSwitchMapping$0[getSize().ordinal()];
            if (i2 == 1) {
                k9bVar = i9b.a;
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                k9bVar = h9b.a;
            }
            m9bVar.setSize(k9bVar);
        }
        requestLayout();
        requestLayout();
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void k() {
        ?? r0 = this.v0;
        if (r0.e()) {
            TextView textView = (TextView) r0.getValue();
            yeb currentTheme = getCurrentTheme();
            iza mode = getMode();
            gza appearance = getAppearance();
            int i = -1;
            if (isEnabled()) {
                int iOrdinal = mode.ordinal();
                if (iOrdinal == 0) {
                    int iOrdinal2 = appearance.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                        currentTheme.getText();
                    } else if (iOrdinal2 == 2) {
                        i = currentTheme.getText().a;
                    } else if (iOrdinal2 == 3) {
                        currentTheme.getText();
                    } else {
                        if (iOrdinal2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = currentTheme.getText().f;
                    }
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iOrdinal3 = appearance.ordinal();
                    if (iOrdinal3 == 0) {
                        i = currentTheme.getText().j;
                    } else if (iOrdinal3 == 1) {
                        i = currentTheme.getText().b;
                    } else if (iOrdinal3 == 2) {
                        i = currentTheme.getText().e;
                    } else if (iOrdinal3 == 3) {
                        i = currentTheme.getText().c;
                    } else {
                        if (iOrdinal3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        currentTheme.getText();
                    }
                }
            } else {
                int iOrdinal4 = mode.ordinal();
                if (iOrdinal4 == 0) {
                    int iOrdinal5 = appearance.ordinal();
                    if (iOrdinal5 == 0 || iOrdinal5 == 1) {
                        i = currentTheme.c().c.b.b;
                    } else if (iOrdinal5 == 2) {
                        i = currentTheme.c().c.b.a;
                    } else if (iOrdinal5 == 3) {
                        i = currentTheme.c().c.b.b;
                    } else {
                        if (iOrdinal5 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = currentTheme.c().c.b.f;
                    }
                } else {
                    if (iOrdinal4 != 1 && iOrdinal4 != 2 && iOrdinal4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int iOrdinal6 = appearance.ordinal();
                    if (iOrdinal6 == 0) {
                        i = currentTheme.getText().j;
                    } else if (iOrdinal6 == 1) {
                        i = currentTheme.getText().b;
                    } else if (iOrdinal6 == 2) {
                        i = currentTheme.getText().e;
                    } else if (iOrdinal6 == 3) {
                        i = currentTheme.getText().c;
                    } else {
                        if (iOrdinal6 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        currentTheme.getText();
                    }
                }
            }
            textView.setTextColor(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = (getMeasuredHeight() / 2) + getVerticalPaddingOffset();
        int measuredWidth = getMeasuredWidth();
        int paddingRight = measuredWidth - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        ?? r12 = this.s0;
        if (dqi.r(r12)) {
            m9b m9bVar = (m9b) r12.getValue();
            int measuredHeight2 = m9bVar.getMeasuredHeight() / 2;
            int i5 = measuredWidth / 2;
            m9bVar.layout(i5 - (m9bVar.getMeasuredWidth() / 2), measuredHeight - measuredHeight2, (m9bVar.getMeasuredWidth() / 2) + i5, measuredHeight + measuredHeight2);
            return;
        }
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        ?? r122 = this.t0;
        if (dqi.r(r122)) {
            ImageView imageView = (ImageView) r122.getValue();
            int measuredHeight3 = imageView.getMeasuredHeight() / 2;
            imageView.layout(paddingLeft, measuredHeight - measuredHeight3, imageView.getMeasuredWidth() + paddingLeft, measuredHeight3 + measuredHeight);
            paddingLeft += imageView.getMeasuredWidth() + iD;
        }
        ?? r123 = this.u0;
        int measuredWidth2 = (paddingRight - paddingLeft) - (dqi.r(r123) ? ((ImageView) r123.getValue()).getMeasuredWidth() + iD : 0);
        ?? r0 = this.v0;
        if (dqi.r(r0)) {
            TextView textView = (TextView) r0.getValue();
            int measuredWidth3 = textView.getMeasuredWidth();
            int measuredHeight4 = textView.getMeasuredHeight() / 2;
            ?? r5 = this.w0;
            int measuredWidth4 = dqi.r(r5) ? ((w2b) r5.getValue()).getMeasuredWidth() + iD : 0;
            int i6 = ((measuredWidth2 - (measuredWidth3 + measuredWidth4)) / 2) + paddingLeft;
            int i7 = measuredWidth3 + i6;
            textView.layout(i6, measuredHeight - measuredHeight4, i7, measuredHeight4 + measuredHeight);
            if (dqi.r(r5)) {
                w2b w2bVar = (w2b) r5.getValue();
                int measuredHeight5 = w2bVar.getMeasuredHeight() / 2;
                w2bVar.layout(iD + i7, measuredHeight - measuredHeight5, i7 + measuredWidth4, measuredHeight5 + measuredHeight);
            }
        }
        if (dqi.r(r123)) {
            ImageView imageView2 = (ImageView) r123.getValue();
            int measuredHeight6 = imageView2.getMeasuredHeight() / 2;
            imageView2.layout(paddingRight - imageView2.getMeasuredWidth(), measuredHeight - measuredHeight6, paddingRight, measuredHeight + measuredHeight6);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        ?? r0 = this.s0;
        if (dqi.r(r0)) {
            m9b m9bVar = (m9b) r0.getValue();
            measureChild(m9bVar, i, i2);
            setMeasuredDimension(View.resolveSizeAndState(m9bVar.getMeasuredWidth() + paddingLeft, i, 0), Math.max(View.resolveSizeAndState(Math.max(paddingBottom, m9bVar.getMeasuredHeight()), i2, 0), getMinimumHeight()));
            return;
        }
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        ?? r3 = this.t0;
        boolean zR = dqi.r(r3);
        ?? r6 = this.v0;
        ?? r7 = this.w0;
        ?? r8 = this.u0;
        if (zR) {
            ImageView imageView = (ImageView) r3.getValue();
            measureChild(imageView, i, i2);
            paddingLeft += (dqi.r(r8) || dqi.r(r7) || dqi.r(r6)) ? imageView.getMeasuredWidth() + iD : imageView.getMeasuredWidth();
            paddingBottom = Math.max(paddingBottom, imageView.getMeasuredHeight());
        }
        if (dqi.r(r8)) {
            ImageView imageView2 = (ImageView) r8.getValue();
            measureChild(imageView2, i, i2);
            paddingLeft += imageView2.getMeasuredWidth();
            paddingBottom = Math.max(paddingBottom, imageView2.getMeasuredHeight());
        }
        if (dqi.r(r7)) {
            w2b w2bVar = (w2b) r7.getValue();
            measureChild(w2bVar, i, i2);
            paddingLeft += dqi.r(r8) ? w2bVar.getMeasuredWidth() + iD : w2bVar.getMeasuredWidth();
            paddingBottom = Math.max(paddingBottom, w2bVar.getMeasuredHeight());
        }
        if (!dqi.r(r6)) {
            setMeasuredDimension(View.resolveSizeAndState(paddingLeft, i, 0), Math.max(View.resolveSizeAndState(paddingBottom, i2, 0), getMinimumHeight()));
            return;
        }
        TextView textView = (TextView) r6.getValue();
        measureChild(textView, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE ? paddingLeft : 0), Integer.MIN_VALUE), i2);
        setMeasuredDimension(View.resolveSizeAndState(paddingLeft + ((dqi.r(r7) || dqi.r(r8)) ? iD + textView.getMeasuredWidth() : textView.getMeasuredWidth()), i, 0), Math.max(View.resolveSizeAndState(Math.max(paddingBottom, textView.getMeasuredHeight()), i2, 0), getMinimumHeight()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        e();
        ?? r0 = this.w0;
        if (r0.e()) {
            ((w2b) r0.getValue()).f(yebVar);
        }
    }

    public final void setAppearance(gza gzaVar) {
        this.c.O(this, A0[2], gzaVar);
    }

    public final void setCustomTheme(yeb yebVar) {
        this.d.O(this, A0[3], yebVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        f();
        k();
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setEndIcon(Drawable icon) {
        ImageView imageView = (ImageView) this.u0.getValue();
        imageView.setId(zud.g);
        if (icon != null) {
            imageView.setImageDrawable(icon);
        }
        imageView.setVisibility(icon == null ? 8 : 0);
        dqi.a(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        j();
    }

    public final void setMode(iza izaVar) {
        this.b.O(this, A0[1], izaVar);
    }

    public final void setProgressEnabled(boolean z) {
        this.o.O(this, A0[4], Boolean.valueOf(z));
    }

    public final void setSize(jza jzaVar) {
        this.a.O(this, A0[0], jzaVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setText(CharSequence text) {
        TextView textView = (TextView) this.v0.getValue();
        textView.setId(zud.k);
        textView.setText(text);
        setupTextViewParams(textView);
        dqi.a(this, textView, Integer.valueOf(b(textView.getId())));
        k();
        j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setTextBadge(CharSequence text) {
        ?? r0 = this.w0;
        if (r0.e() || !(text == null || vmf.F(text))) {
            w2b w2bVar = (w2b) r0.getValue();
            w2bVar.setVisibility((text == null || text.length() == 0) ? 8 : 0);
            if (text != null) {
                w2bVar.setTypography(dpg.H);
                w2bVar.setText(text.toString());
            }
            g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setEndIcon(Integer resId) {
        ImageView imageView = (ImageView) this.u0.getValue();
        imageView.setId(zud.g);
        if (resId != null) {
            imageView.setImageResource(resId.intValue());
        }
        imageView.setVisibility(resId == null ? 8 : 0);
        dqi.a(this, imageView, Integer.valueOf(b(imageView.getId())));
        h();
        j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setText(int resId) {
        TextView textView = (TextView) this.v0.getValue();
        textView.setId(zud.k);
        textView.setText(resId);
        setupTextViewParams(textView);
        dqi.a(this, textView, Integer.valueOf(b(textView.getId())));
        k();
        j();
    }
}

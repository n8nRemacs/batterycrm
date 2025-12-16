package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import java.util.EnumMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class d3e extends LinearLayout implements u6g {
    public static final AccelerateDecelerateInterpolator w0 = new AccelerateDecelerateInterpolator();
    public cm6 a;
    public final Object b;
    public cm6 c;
    public final Object d;
    public cm6 o;
    public final Object s0;
    public final EnumMap t0;
    public final EnumMap u0;
    public final EnumMap v0;

    public d3e(final Context context) {
        super(context);
        this.a = new efd(10);
        final int i = 0;
        this.b = ipi.b(3, new cm6() { // from class: v2e
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        t2e t2eVar = new t2e(context);
                        t2eVar.setImageDrawable(r34.b(t2eVar.getContext(), y9b.u).mutate());
                        final int i2 = 0;
                        final d3e d3eVar = this;
                        f8j.d(t2eVar, 300L, new View.OnClickListener() { // from class: u2e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i2) {
                                    case 0:
                                        d3eVar.a.invoke();
                                        break;
                                    case 1:
                                        d3eVar.c.invoke();
                                        break;
                                    default:
                                        d3eVar.o.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams = t2eVar.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, kti.d(4 * vw4.d().getDisplayMetrics().density));
                        t2eVar.setLayoutParams(marginLayoutParams);
                        return t2eVar;
                    case 1:
                        t2e t2eVar2 = new t2e(context);
                        t2eVar2.setImageDrawable(r34.b(t2eVar2.getContext(), y9b.q).mutate());
                        final int i3 = 1;
                        final d3e d3eVar2 = this;
                        f8j.d(t2eVar2, 300L, new View.OnClickListener() { // from class: u2e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i3) {
                                    case 0:
                                        d3eVar2.a.invoke();
                                        break;
                                    case 1:
                                        d3eVar2.c.invoke();
                                        break;
                                    default:
                                        d3eVar2.o.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams2 = t2eVar2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, kti.d(8 * vw4.d().getDisplayMetrics().density));
                        t2eVar2.setLayoutParams(marginLayoutParams2);
                        return t2eVar2;
                    default:
                        t2e t2eVar3 = new t2e(context);
                        t2eVar3.setImageDrawable(r34.b(t2eVar3.getContext(), y9b.p).mutate());
                        final int i4 = 2;
                        final d3e d3eVar3 = this;
                        f8j.d(t2eVar3, 300L, new View.OnClickListener() { // from class: u2e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        d3eVar3.a.invoke();
                                        break;
                                    case 1:
                                        d3eVar3.c.invoke();
                                        break;
                                    default:
                                        d3eVar3.o.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams3 = t2eVar3.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, kti.d(8 * vw4.d().getDisplayMetrics().density));
                        t2eVar3.setLayoutParams(marginLayoutParams3);
                        return t2eVar3;
                }
            }
        });
        this.c = new efd(10);
        final int i2 = 1;
        this.d = ipi.b(3, new cm6() { // from class: v2e
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        t2e t2eVar = new t2e(context);
                        t2eVar.setImageDrawable(r34.b(t2eVar.getContext(), y9b.u).mutate());
                        final int i22 = 0;
                        final d3e d3eVar = this;
                        f8j.d(t2eVar, 300L, new View.OnClickListener() { // from class: u2e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        d3eVar.a.invoke();
                                        break;
                                    case 1:
                                        d3eVar.c.invoke();
                                        break;
                                    default:
                                        d3eVar.o.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams = t2eVar.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, kti.d(4 * vw4.d().getDisplayMetrics().density));
                        t2eVar.setLayoutParams(marginLayoutParams);
                        return t2eVar;
                    case 1:
                        t2e t2eVar2 = new t2e(context);
                        t2eVar2.setImageDrawable(r34.b(t2eVar2.getContext(), y9b.q).mutate());
                        final int i3 = 1;
                        final d3e d3eVar2 = this;
                        f8j.d(t2eVar2, 300L, new View.OnClickListener() { // from class: u2e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i3) {
                                    case 0:
                                        d3eVar2.a.invoke();
                                        break;
                                    case 1:
                                        d3eVar2.c.invoke();
                                        break;
                                    default:
                                        d3eVar2.o.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams2 = t2eVar2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, kti.d(8 * vw4.d().getDisplayMetrics().density));
                        t2eVar2.setLayoutParams(marginLayoutParams2);
                        return t2eVar2;
                    default:
                        t2e t2eVar3 = new t2e(context);
                        t2eVar3.setImageDrawable(r34.b(t2eVar3.getContext(), y9b.p).mutate());
                        final int i4 = 2;
                        final d3e d3eVar3 = this;
                        f8j.d(t2eVar3, 300L, new View.OnClickListener() { // from class: u2e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        d3eVar3.a.invoke();
                                        break;
                                    case 1:
                                        d3eVar3.c.invoke();
                                        break;
                                    default:
                                        d3eVar3.o.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams3 = t2eVar3.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, kti.d(8 * vw4.d().getDisplayMetrics().density));
                        t2eVar3.setLayoutParams(marginLayoutParams3);
                        return t2eVar3;
                }
            }
        });
        this.o = new efd(10);
        final int i3 = 2;
        this.s0 = ipi.b(3, new cm6() { // from class: v2e
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        t2e t2eVar = new t2e(context);
                        t2eVar.setImageDrawable(r34.b(t2eVar.getContext(), y9b.u).mutate());
                        final int i22 = 0;
                        final d3e d3eVar = this;
                        f8j.d(t2eVar, 300L, new View.OnClickListener() { // from class: u2e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        d3eVar.a.invoke();
                                        break;
                                    case 1:
                                        d3eVar.c.invoke();
                                        break;
                                    default:
                                        d3eVar.o.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams = t2eVar.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, kti.d(4 * vw4.d().getDisplayMetrics().density));
                        t2eVar.setLayoutParams(marginLayoutParams);
                        return t2eVar;
                    case 1:
                        t2e t2eVar2 = new t2e(context);
                        t2eVar2.setImageDrawable(r34.b(t2eVar2.getContext(), y9b.q).mutate());
                        final int i32 = 1;
                        final d3e d3eVar2 = this;
                        f8j.d(t2eVar2, 300L, new View.OnClickListener() { // from class: u2e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i32) {
                                    case 0:
                                        d3eVar2.a.invoke();
                                        break;
                                    case 1:
                                        d3eVar2.c.invoke();
                                        break;
                                    default:
                                        d3eVar2.o.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams2 = t2eVar2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, kti.d(8 * vw4.d().getDisplayMetrics().density));
                        t2eVar2.setLayoutParams(marginLayoutParams2);
                        return t2eVar2;
                    default:
                        t2e t2eVar3 = new t2e(context);
                        t2eVar3.setImageDrawable(r34.b(t2eVar3.getContext(), y9b.p).mutate());
                        final int i4 = 2;
                        final d3e d3eVar3 = this;
                        f8j.d(t2eVar3, 300L, new View.OnClickListener() { // from class: u2e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i4) {
                                    case 0:
                                        d3eVar3.a.invoke();
                                        break;
                                    case 1:
                                        d3eVar3.c.invoke();
                                        break;
                                    default:
                                        d3eVar3.o.invoke();
                                        break;
                                }
                            }
                        });
                        ViewGroup.LayoutParams layoutParams3 = t2eVar3.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, kti.d(8 * vw4.d().getDisplayMetrics().density));
                        t2eVar3.setLayoutParams(marginLayoutParams3);
                        return t2eVar3;
                }
            }
        });
        this.t0 = new EnumMap(x2e.class);
        this.u0 = new EnumMap(x2e.class);
        this.v0 = new EnumMap(x2e.class);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
    }

    public static void a(x2e x2eVar, EnumMap enumMap, EnumMap enumMap2, em6 em6Var) {
        ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(x2eVar);
        if (valueAnimator != null) {
            lqi.a(valueAnimator);
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(x2eVar);
        if (valueAnimator2 != null) {
            lqi.a(valueAnimator2);
        }
        enumMap2.put((EnumMap) x2eVar, (x2e) null);
        enumMap.put((EnumMap) x2eVar, (x2e) em6Var.invoke(valueAnimator));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final t2e getMentionButton() {
        return (t2e) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final t2e getReactionButton() {
        return (t2e) this.s0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final t2e getScrollToBottomButton() {
        return (t2e) this.b.getValue();
    }

    public final void b(x2e x2eVar) {
        t2e t2eVarD = d(x2eVar);
        EnumMap enumMap = this.u0;
        if (enumMap.get(x2eVar) != null) {
            return;
        }
        ViewParent parent = t2eVarD.getParent();
        EnumMap enumMap2 = this.t0;
        if (parent == null && enumMap2.get(x2eVar) == null) {
            return;
        }
        EnumMap enumMap3 = this.v0;
        cm6 cm6Var = (cm6) enumMap3.remove(x2eVar);
        if (cm6Var != null) {
            cm6Var.invoke();
        }
        ValueAnimator valueAnimator = (ValueAnimator) enumMap.get(x2eVar);
        if (valueAnimator != null) {
            lqi.a(valueAnimator);
        }
        enumMap.put((EnumMap) x2eVar, (x2e) null);
        ValueAnimator valueAnimator2 = (ValueAnimator) enumMap2.get(x2eVar);
        if (valueAnimator2 != null) {
            lqi.a(valueAnimator2);
        }
        enumMap2.put((EnumMap) x2eVar, (x2e) null);
        if (isInLayout()) {
            enumMap.put((EnumMap) x2eVar, (x2e) new ValueAnimator());
            enumMap3.put((EnumMap) x2eVar, (x2e) shh.b(this, new vu2(this, 6, x2eVar)));
        } else {
            t2e t2eVarD2 = d(x2eVar);
            a(x2eVar, enumMap, enumMap2, new b3e(t2eVarD2, this, x2eVar, this, t2eVarD2));
        }
    }

    public final void c(x2e x2eVar) {
        t2e t2eVarD = d(x2eVar);
        EnumMap enumMap = this.t0;
        if (enumMap.get(x2eVar) != null) {
            return;
        }
        ViewParent parent = t2eVarD.getParent();
        EnumMap enumMap2 = this.u0;
        if (parent == null || enumMap2.get(x2eVar) != null) {
            EnumMap enumMap3 = this.v0;
            cm6 cm6Var = (cm6) enumMap3.remove(x2eVar);
            if (cm6Var != null) {
                cm6Var.invoke();
            }
            ValueAnimator valueAnimator = (ValueAnimator) enumMap2.get(x2eVar);
            if (valueAnimator != null) {
                lqi.a(valueAnimator);
            }
            enumMap2.put((EnumMap) x2eVar, (x2e) null);
            ValueAnimator valueAnimator2 = (ValueAnimator) enumMap.get(x2eVar);
            if (valueAnimator2 != null) {
                lqi.a(valueAnimator2);
            }
            enumMap.put((EnumMap) x2eVar, (x2e) null);
            if (isInLayout()) {
                enumMap.put((EnumMap) x2eVar, (x2e) new ValueAnimator());
                enumMap3.put((EnumMap) x2eVar, (x2e) shh.b(this, new wv4(t2eVarD, this, x2eVar, 1)));
                return;
            }
            if (t2eVarD.getParent() != null) {
                removeView(t2eVarD);
            }
            if (x2eVar == x2e.a) {
                addView(t2eVarD, getChildCount());
            } else {
                addView(t2eVarD, 0);
            }
            a(x2eVar, enumMap, enumMap2, new uv1(t2eVarD, this, x2eVar, 10));
        }
    }

    public final t2e d(x2e x2eVar) {
        int i = y2e.$EnumSwitchMapping$0[x2eVar.ordinal()];
        if (i == 1) {
            return getScrollToBottomButton();
        }
        if (i == 2) {
            return getMentionButton();
        }
        if (i == 3) {
            return getReactionButton();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        ?? r0 = this.b;
        if (r0.e()) {
            ((t2e) r0.getValue()).onThemeChanged(yebVar);
        }
        ?? r02 = this.d;
        if (r02.e()) {
            ((t2e) r02.getValue()).onThemeChanged(yebVar);
        }
        ?? r03 = this.s0;
        if (r03.e()) {
            ((t2e) r03.getValue()).onThemeChanged(yebVar);
        }
    }

    public final void setOnClickListener(em6 em6Var) {
        this.a = new w2e(0, em6Var);
        this.c = new w2e(1, em6Var);
        this.o = new w2e(2, em6Var);
    }
}

package one.me.chatscreen.search;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b1e;
import defpackage.c6e;
import defpackage.cm6;
import defpackage.d53;
import defpackage.fua;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.jva;
import defpackage.k18;
import defpackage.kga;
import defpackage.kti;
import defpackage.l38;
import defpackage.l5j;
import defpackage.r6i;
import defpackage.s5e;
import defpackage.sn0;
import defpackage.t5e;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ut3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yy7;
import defpackage.z8a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chatscreen/search/SearchMessageBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SearchMessageBottomWidget extends Widget {
    public static final /* synthetic */ yy7[] Z = {new z8a(SearchMessageBottomWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), ho7.d(vid.a, SearchMessageBottomWidget.class, "searchResultTextView", "getSearchResultTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0), new toc(SearchMessageBottomWidget.class, "upButton", "getUpButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new toc(SearchMessageBottomWidget.class, "downButton", "getDownButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), new toc(SearchMessageBottomWidget.class, "separatorView", "getSeparatorView()Landroid/view/View;", 0)};
    public boolean X;
    public boolean Y;
    public final k18 a;
    public final sn0 b;
    public final sn0 c;
    public final sn0 d;
    public final sn0 o;

    public SearchMessageBottomWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    public final View A0() {
        yy7 yy7Var = Z[4];
        return (View) this.o.getValue();
    }

    public final AppCompatImageView B0() {
        yy7 yy7Var = Z[2];
        return (AppCompatImageView) this.c.getValue();
    }

    public final c6e C0() {
        return (c6e) this.a.getValue();
    }

    public final void D0(AppCompatImageView appCompatImageView, boolean z) {
        appCompatImageView.setImageTintList(ColorStateList.valueOf(z ? E0().d.d : E0().d.g));
    }

    public final r6i E0() {
        return a93.s0.x(getContext()).k().a().k();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        float f = 12;
        float f2 = 4;
        constraintLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        constraintLayout.setMinHeight(kti.d(44 * vw4.d().getDisplayMetrics().density));
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        constraintLayout.addView(z0());
        constraintLayout.addView(B0());
        constraintLayout.addView(A0());
        constraintLayout.addView(y0());
        tqi.c(new kga(this, (Continuation) null, 20), constraintLayout);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = z0().getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 7, B0().getId(), 6);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id, 5));
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.g(id).d.l0 = true;
        ut3VarG.g(id).d.w = 0.0f;
        int id2 = B0().getId();
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 7, A0().getId(), 6);
        float f3 = 10;
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id2, 5));
        ut3VarG.d(id2, 4, 0, 4);
        int id3 = A0().getId();
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 7, y0().getId(), 6);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id3, 5));
        ut3VarG.d(id3, 4, 0, 4);
        int id4 = y0().getId();
        ut3VarG.d(id4, 3, 0, 3);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.d(id4, 4, 0, 4);
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        C0().t();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        jva jvaVarH = getRouter().h();
        if (jvaVarH != null) {
            jvaVarH.a(getViewLifecycleOwner(), C0().o);
        }
        gw0.w(new g56(C0().X, new s5e(view, this, null), 1), getViewLifecycleScope());
        gw0.w(new g56(new d53(aw0.a(C0().Z, this.lifecycleOwner.p(), l38.d), 12), new t5e(this, null), 1), getViewLifecycleScope());
    }

    public final AppCompatImageView y0() {
        yy7 yy7Var = Z[3];
        return (AppCompatImageView) this.d.getValue();
    }

    public final AppCompatTextView z0() {
        yy7 yy7Var = Z[1];
        return (AppCompatTextView) this.b.getValue();
    }

    public SearchMessageBottomWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        hs hsVar = new hs(b1e.class, Widget.ARG_SCOPE_ID);
        yy7 yy7Var = Z[0];
        this.a = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, c6e.class, null);
        final int i = 0;
        this.b = binding(new cm6(this) { // from class: q5e
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                final int i3 = 1;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = SearchMessageBottomWidget.Z;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), null);
                        appCompatTextView.setId(m1b.d);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        dpg.j.b(appCompatTextView, t75.b);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(a93.s0.y(appCompatTextView).a().k().d.g));
                        appCompatTextView.setText(n1b.f);
                        appCompatTextView.setLayoutParams(new kt3(-2, -2));
                        return appCompatTextView;
                    case 1:
                        yy7[] yy7VarArr2 = SearchMessageBottomWidget.Z;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView.setId(m1b.g);
                        float f = 32;
                        appCompatImageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        appCompatImageView.setImageResource(l1b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).a().k().d.g));
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(n1b.h));
                        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        f8j.d(appCompatImageView, 300L, new View.OnClickListener() { // from class: r5e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i4 = i3;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i4) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Y) {
                                            cs2 cs2Var = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList = cs2Var.f;
                                            int i5 = cs2Var.d;
                                            if (i5 - 1 >= 0) {
                                                int i6 = i5 - 1;
                                                cs2Var.d = i6;
                                                zr2 zr2Var = cs2Var.g;
                                                if (zr2Var != null) {
                                                    zr2Var.b(i6, cs2Var.k);
                                                }
                                                zr2 zr2Var2 = cs2Var.g;
                                                if (zr2Var2 != null) {
                                                    zr2Var2.c((gm9) arrayList.get(cs2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.X) {
                                            cs2 cs2Var2 = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList2 = cs2Var2.f;
                                            if (cs2Var2.d + 1 <= arrayList2.size()) {
                                                int i7 = cs2Var2.d + 1;
                                                cs2Var2.d = i7;
                                                zr2 zr2Var3 = cs2Var2.g;
                                                if (zr2Var3 != null) {
                                                    zr2Var3.b(i7, cs2Var2.k);
                                                }
                                                zr2 zr2Var4 = cs2Var2.g;
                                                if (zr2Var4 != null) {
                                                    zr2Var4.c((gm9) arrayList2.get(cs2Var2.d - 1));
                                                }
                                                if (cs2Var2.d + 1 <= arrayList2.size() && cs2Var2.g != null) {
                                                }
                                            }
                                            String str = cs2Var2.c;
                                            if (cs2Var2.h && arrayList2.size() - cs2Var2.d < 5 && cs2Var2.j != 0 && str != null && str.length() != 0) {
                                                wqi.c("cs2", "Search for next messages", new Object[0]);
                                                cs2Var2.h = false;
                                                svi.e(cs2Var2.e, null, null, new as2(cs2Var2, str, cs2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i4 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i4), null, shapeDrawable));
                        return appCompatImageView;
                    case 2:
                        yy7[] yy7VarArr3 = SearchMessageBottomWidget.Z;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView2.setId(m1b.e);
                        float f2 = 32;
                        appCompatImageView2.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        appCompatImageView2.setImageResource(l1b.c);
                        v1a v1aVar2 = a93.s0;
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(v1aVar2.y(appCompatImageView2).a().k().d.g));
                        appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(n1b.e));
                        int iD2 = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iD2, iD2, iD2, iD2);
                        final int i5 = 0;
                        f8j.d(appCompatImageView2, 300L, new View.OnClickListener() { // from class: r5e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i42 = i5;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i42) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Y) {
                                            cs2 cs2Var = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList = cs2Var.f;
                                            int i52 = cs2Var.d;
                                            if (i52 - 1 >= 0) {
                                                int i6 = i52 - 1;
                                                cs2Var.d = i6;
                                                zr2 zr2Var = cs2Var.g;
                                                if (zr2Var != null) {
                                                    zr2Var.b(i6, cs2Var.k);
                                                }
                                                zr2 zr2Var2 = cs2Var.g;
                                                if (zr2Var2 != null) {
                                                    zr2Var2.c((gm9) arrayList.get(cs2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.X) {
                                            cs2 cs2Var2 = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList2 = cs2Var2.f;
                                            if (cs2Var2.d + 1 <= arrayList2.size()) {
                                                int i7 = cs2Var2.d + 1;
                                                cs2Var2.d = i7;
                                                zr2 zr2Var3 = cs2Var2.g;
                                                if (zr2Var3 != null) {
                                                    zr2Var3.b(i7, cs2Var2.k);
                                                }
                                                zr2 zr2Var4 = cs2Var2.g;
                                                if (zr2Var4 != null) {
                                                    zr2Var4.c((gm9) arrayList2.get(cs2Var2.d - 1));
                                                }
                                                if (cs2Var2.d + 1 <= arrayList2.size() && cs2Var2.g != null) {
                                                }
                                            }
                                            String str = cs2Var2.c;
                                            if (cs2Var2.h && arrayList2.size() - cs2Var2.d < 5 && cs2Var2.j != 0 && str != null && str.length() != 0) {
                                                wqi.c("cs2", "Search for next messages", new Object[0]);
                                                cs2Var2.h = false;
                                                svi.e(cs2Var2.e, null, null, new as2(cs2Var2, str, cs2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i6 = v1aVar2.y(appCompatImageView2).c().a.a.i;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i6), null, shapeDrawable2));
                        return appCompatImageView2;
                    default:
                        yy7[] yy7VarArr4 = SearchMessageBottomWidget.Z;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(m1b.f);
                        view.setLayoutParams(new kt3(kti.d(1 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(a93.s0.y(view).a().k().d.g);
                        return view;
                }
            }
        });
        final int i2 = 1;
        this.c = binding(new cm6(this) { // from class: q5e
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                final int i3 = 1;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SearchMessageBottomWidget.Z;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), null);
                        appCompatTextView.setId(m1b.d);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        dpg.j.b(appCompatTextView, t75.b);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(a93.s0.y(appCompatTextView).a().k().d.g));
                        appCompatTextView.setText(n1b.f);
                        appCompatTextView.setLayoutParams(new kt3(-2, -2));
                        return appCompatTextView;
                    case 1:
                        yy7[] yy7VarArr2 = SearchMessageBottomWidget.Z;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView.setId(m1b.g);
                        float f = 32;
                        appCompatImageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        appCompatImageView.setImageResource(l1b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).a().k().d.g));
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(n1b.h));
                        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        f8j.d(appCompatImageView, 300L, new View.OnClickListener() { // from class: r5e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i42 = i3;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i42) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Y) {
                                            cs2 cs2Var = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList = cs2Var.f;
                                            int i52 = cs2Var.d;
                                            if (i52 - 1 >= 0) {
                                                int i6 = i52 - 1;
                                                cs2Var.d = i6;
                                                zr2 zr2Var = cs2Var.g;
                                                if (zr2Var != null) {
                                                    zr2Var.b(i6, cs2Var.k);
                                                }
                                                zr2 zr2Var2 = cs2Var.g;
                                                if (zr2Var2 != null) {
                                                    zr2Var2.c((gm9) arrayList.get(cs2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.X) {
                                            cs2 cs2Var2 = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList2 = cs2Var2.f;
                                            if (cs2Var2.d + 1 <= arrayList2.size()) {
                                                int i7 = cs2Var2.d + 1;
                                                cs2Var2.d = i7;
                                                zr2 zr2Var3 = cs2Var2.g;
                                                if (zr2Var3 != null) {
                                                    zr2Var3.b(i7, cs2Var2.k);
                                                }
                                                zr2 zr2Var4 = cs2Var2.g;
                                                if (zr2Var4 != null) {
                                                    zr2Var4.c((gm9) arrayList2.get(cs2Var2.d - 1));
                                                }
                                                if (cs2Var2.d + 1 <= arrayList2.size() && cs2Var2.g != null) {
                                                }
                                            }
                                            String str = cs2Var2.c;
                                            if (cs2Var2.h && arrayList2.size() - cs2Var2.d < 5 && cs2Var2.j != 0 && str != null && str.length() != 0) {
                                                wqi.c("cs2", "Search for next messages", new Object[0]);
                                                cs2Var2.h = false;
                                                svi.e(cs2Var2.e, null, null, new as2(cs2Var2, str, cs2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i4 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i4), null, shapeDrawable));
                        return appCompatImageView;
                    case 2:
                        yy7[] yy7VarArr3 = SearchMessageBottomWidget.Z;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView2.setId(m1b.e);
                        float f2 = 32;
                        appCompatImageView2.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        appCompatImageView2.setImageResource(l1b.c);
                        v1a v1aVar2 = a93.s0;
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(v1aVar2.y(appCompatImageView2).a().k().d.g));
                        appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(n1b.e));
                        int iD2 = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iD2, iD2, iD2, iD2);
                        final int i5 = 0;
                        f8j.d(appCompatImageView2, 300L, new View.OnClickListener() { // from class: r5e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i42 = i5;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i42) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Y) {
                                            cs2 cs2Var = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList = cs2Var.f;
                                            int i52 = cs2Var.d;
                                            if (i52 - 1 >= 0) {
                                                int i6 = i52 - 1;
                                                cs2Var.d = i6;
                                                zr2 zr2Var = cs2Var.g;
                                                if (zr2Var != null) {
                                                    zr2Var.b(i6, cs2Var.k);
                                                }
                                                zr2 zr2Var2 = cs2Var.g;
                                                if (zr2Var2 != null) {
                                                    zr2Var2.c((gm9) arrayList.get(cs2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.X) {
                                            cs2 cs2Var2 = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList2 = cs2Var2.f;
                                            if (cs2Var2.d + 1 <= arrayList2.size()) {
                                                int i7 = cs2Var2.d + 1;
                                                cs2Var2.d = i7;
                                                zr2 zr2Var3 = cs2Var2.g;
                                                if (zr2Var3 != null) {
                                                    zr2Var3.b(i7, cs2Var2.k);
                                                }
                                                zr2 zr2Var4 = cs2Var2.g;
                                                if (zr2Var4 != null) {
                                                    zr2Var4.c((gm9) arrayList2.get(cs2Var2.d - 1));
                                                }
                                                if (cs2Var2.d + 1 <= arrayList2.size() && cs2Var2.g != null) {
                                                }
                                            }
                                            String str = cs2Var2.c;
                                            if (cs2Var2.h && arrayList2.size() - cs2Var2.d < 5 && cs2Var2.j != 0 && str != null && str.length() != 0) {
                                                wqi.c("cs2", "Search for next messages", new Object[0]);
                                                cs2Var2.h = false;
                                                svi.e(cs2Var2.e, null, null, new as2(cs2Var2, str, cs2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i6 = v1aVar2.y(appCompatImageView2).c().a.a.i;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i6), null, shapeDrawable2));
                        return appCompatImageView2;
                    default:
                        yy7[] yy7VarArr4 = SearchMessageBottomWidget.Z;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(m1b.f);
                        view.setLayoutParams(new kt3(kti.d(1 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(a93.s0.y(view).a().k().d.g);
                        return view;
                }
            }
        });
        final int i3 = 2;
        this.d = binding(new cm6(this) { // from class: q5e
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                final int i32 = 1;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SearchMessageBottomWidget.Z;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), null);
                        appCompatTextView.setId(m1b.d);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        dpg.j.b(appCompatTextView, t75.b);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(a93.s0.y(appCompatTextView).a().k().d.g));
                        appCompatTextView.setText(n1b.f);
                        appCompatTextView.setLayoutParams(new kt3(-2, -2));
                        return appCompatTextView;
                    case 1:
                        yy7[] yy7VarArr2 = SearchMessageBottomWidget.Z;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView.setId(m1b.g);
                        float f = 32;
                        appCompatImageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        appCompatImageView.setImageResource(l1b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).a().k().d.g));
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(n1b.h));
                        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        f8j.d(appCompatImageView, 300L, new View.OnClickListener() { // from class: r5e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i42 = i32;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i42) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Y) {
                                            cs2 cs2Var = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList = cs2Var.f;
                                            int i52 = cs2Var.d;
                                            if (i52 - 1 >= 0) {
                                                int i6 = i52 - 1;
                                                cs2Var.d = i6;
                                                zr2 zr2Var = cs2Var.g;
                                                if (zr2Var != null) {
                                                    zr2Var.b(i6, cs2Var.k);
                                                }
                                                zr2 zr2Var2 = cs2Var.g;
                                                if (zr2Var2 != null) {
                                                    zr2Var2.c((gm9) arrayList.get(cs2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.X) {
                                            cs2 cs2Var2 = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList2 = cs2Var2.f;
                                            if (cs2Var2.d + 1 <= arrayList2.size()) {
                                                int i7 = cs2Var2.d + 1;
                                                cs2Var2.d = i7;
                                                zr2 zr2Var3 = cs2Var2.g;
                                                if (zr2Var3 != null) {
                                                    zr2Var3.b(i7, cs2Var2.k);
                                                }
                                                zr2 zr2Var4 = cs2Var2.g;
                                                if (zr2Var4 != null) {
                                                    zr2Var4.c((gm9) arrayList2.get(cs2Var2.d - 1));
                                                }
                                                if (cs2Var2.d + 1 <= arrayList2.size() && cs2Var2.g != null) {
                                                }
                                            }
                                            String str = cs2Var2.c;
                                            if (cs2Var2.h && arrayList2.size() - cs2Var2.d < 5 && cs2Var2.j != 0 && str != null && str.length() != 0) {
                                                wqi.c("cs2", "Search for next messages", new Object[0]);
                                                cs2Var2.h = false;
                                                svi.e(cs2Var2.e, null, null, new as2(cs2Var2, str, cs2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i4 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i4), null, shapeDrawable));
                        return appCompatImageView;
                    case 2:
                        yy7[] yy7VarArr3 = SearchMessageBottomWidget.Z;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView2.setId(m1b.e);
                        float f2 = 32;
                        appCompatImageView2.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        appCompatImageView2.setImageResource(l1b.c);
                        v1a v1aVar2 = a93.s0;
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(v1aVar2.y(appCompatImageView2).a().k().d.g));
                        appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(n1b.e));
                        int iD2 = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iD2, iD2, iD2, iD2);
                        final int i5 = 0;
                        f8j.d(appCompatImageView2, 300L, new View.OnClickListener() { // from class: r5e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i42 = i5;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i42) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Y) {
                                            cs2 cs2Var = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList = cs2Var.f;
                                            int i52 = cs2Var.d;
                                            if (i52 - 1 >= 0) {
                                                int i6 = i52 - 1;
                                                cs2Var.d = i6;
                                                zr2 zr2Var = cs2Var.g;
                                                if (zr2Var != null) {
                                                    zr2Var.b(i6, cs2Var.k);
                                                }
                                                zr2 zr2Var2 = cs2Var.g;
                                                if (zr2Var2 != null) {
                                                    zr2Var2.c((gm9) arrayList.get(cs2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.X) {
                                            cs2 cs2Var2 = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList2 = cs2Var2.f;
                                            if (cs2Var2.d + 1 <= arrayList2.size()) {
                                                int i7 = cs2Var2.d + 1;
                                                cs2Var2.d = i7;
                                                zr2 zr2Var3 = cs2Var2.g;
                                                if (zr2Var3 != null) {
                                                    zr2Var3.b(i7, cs2Var2.k);
                                                }
                                                zr2 zr2Var4 = cs2Var2.g;
                                                if (zr2Var4 != null) {
                                                    zr2Var4.c((gm9) arrayList2.get(cs2Var2.d - 1));
                                                }
                                                if (cs2Var2.d + 1 <= arrayList2.size() && cs2Var2.g != null) {
                                                }
                                            }
                                            String str = cs2Var2.c;
                                            if (cs2Var2.h && arrayList2.size() - cs2Var2.d < 5 && cs2Var2.j != 0 && str != null && str.length() != 0) {
                                                wqi.c("cs2", "Search for next messages", new Object[0]);
                                                cs2Var2.h = false;
                                                svi.e(cs2Var2.e, null, null, new as2(cs2Var2, str, cs2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i6 = v1aVar2.y(appCompatImageView2).c().a.a.i;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i6), null, shapeDrawable2));
                        return appCompatImageView2;
                    default:
                        yy7[] yy7VarArr4 = SearchMessageBottomWidget.Z;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(m1b.f);
                        view.setLayoutParams(new kt3(kti.d(1 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(a93.s0.y(view).a().k().d.g);
                        return view;
                }
            }
        });
        final int i4 = 3;
        this.o = binding(new cm6(this) { // from class: q5e
            public final /* synthetic */ SearchMessageBottomWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i4;
                final int i32 = 1;
                final SearchMessageBottomWidget searchMessageBottomWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = SearchMessageBottomWidget.Z;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(searchMessageBottomWidget.getContext(), null);
                        appCompatTextView.setId(m1b.d);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        dpg.j.b(appCompatTextView, t75.b);
                        appCompatTextView.setTextColor(ColorStateList.valueOf(a93.s0.y(appCompatTextView).a().k().d.g));
                        appCompatTextView.setText(n1b.f);
                        appCompatTextView.setLayoutParams(new kt3(-2, -2));
                        return appCompatTextView;
                    case 1:
                        yy7[] yy7VarArr2 = SearchMessageBottomWidget.Z;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView.setId(m1b.g);
                        float f = 32;
                        appCompatImageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        appCompatImageView.setImageResource(l1b.d);
                        v1a v1aVar = a93.s0;
                        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(appCompatImageView).a().k().d.g));
                        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(n1b.h));
                        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView.setPadding(iD, iD, iD, iD);
                        f8j.d(appCompatImageView, 300L, new View.OnClickListener() { // from class: r5e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i42 = i32;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i42) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Y) {
                                            cs2 cs2Var = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList = cs2Var.f;
                                            int i52 = cs2Var.d;
                                            if (i52 - 1 >= 0) {
                                                int i6 = i52 - 1;
                                                cs2Var.d = i6;
                                                zr2 zr2Var = cs2Var.g;
                                                if (zr2Var != null) {
                                                    zr2Var.b(i6, cs2Var.k);
                                                }
                                                zr2 zr2Var2 = cs2Var.g;
                                                if (zr2Var2 != null) {
                                                    zr2Var2.c((gm9) arrayList.get(cs2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.X) {
                                            cs2 cs2Var2 = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList2 = cs2Var2.f;
                                            if (cs2Var2.d + 1 <= arrayList2.size()) {
                                                int i7 = cs2Var2.d + 1;
                                                cs2Var2.d = i7;
                                                zr2 zr2Var3 = cs2Var2.g;
                                                if (zr2Var3 != null) {
                                                    zr2Var3.b(i7, cs2Var2.k);
                                                }
                                                zr2 zr2Var4 = cs2Var2.g;
                                                if (zr2Var4 != null) {
                                                    zr2Var4.c((gm9) arrayList2.get(cs2Var2.d - 1));
                                                }
                                                if (cs2Var2.d + 1 <= arrayList2.size() && cs2Var2.g != null) {
                                                }
                                            }
                                            String str = cs2Var2.c;
                                            if (cs2Var2.h && arrayList2.size() - cs2Var2.d < 5 && cs2Var2.j != 0 && str != null && str.length() != 0) {
                                                wqi.c("cs2", "Search for next messages", new Object[0]);
                                                cs2Var2.h = false;
                                                svi.e(cs2Var2.e, null, null, new as2(cs2Var2, str, cs2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i42 = v1aVar.y(appCompatImageView).c().a.a.i;
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        shapeDrawable.getPaint().setColor(-1);
                        appCompatImageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i42), null, shapeDrawable));
                        return appCompatImageView;
                    case 2:
                        yy7[] yy7VarArr3 = SearchMessageBottomWidget.Z;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(searchMessageBottomWidget.getContext(), null);
                        appCompatImageView2.setId(m1b.e);
                        float f2 = 32;
                        appCompatImageView2.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                        appCompatImageView2.setImageResource(l1b.c);
                        v1a v1aVar2 = a93.s0;
                        appCompatImageView2.setImageTintList(ColorStateList.valueOf(v1aVar2.y(appCompatImageView2).a().k().d.g));
                        appCompatImageView2.setContentDescription(appCompatImageView2.getContext().getString(n1b.e));
                        int iD2 = kti.d(4 * vw4.d().getDisplayMetrics().density);
                        appCompatImageView2.setPadding(iD2, iD2, iD2, iD2);
                        final int i5 = 0;
                        f8j.d(appCompatImageView2, 300L, new View.OnClickListener() { // from class: r5e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i422 = i5;
                                SearchMessageBottomWidget searchMessageBottomWidget2 = searchMessageBottomWidget;
                                switch (i422) {
                                    case 0:
                                        if (searchMessageBottomWidget2.Y) {
                                            cs2 cs2Var = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList = cs2Var.f;
                                            int i52 = cs2Var.d;
                                            if (i52 - 1 >= 0) {
                                                int i6 = i52 - 1;
                                                cs2Var.d = i6;
                                                zr2 zr2Var = cs2Var.g;
                                                if (zr2Var != null) {
                                                    zr2Var.b(i6, cs2Var.k);
                                                }
                                                zr2 zr2Var2 = cs2Var.g;
                                                if (zr2Var2 != null) {
                                                    zr2Var2.c((gm9) arrayList.get(cs2Var.d - 1));
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        if (searchMessageBottomWidget2.X) {
                                            cs2 cs2Var2 = (cs2) searchMessageBottomWidget2.C0().d.a;
                                            ArrayList arrayList2 = cs2Var2.f;
                                            if (cs2Var2.d + 1 <= arrayList2.size()) {
                                                int i7 = cs2Var2.d + 1;
                                                cs2Var2.d = i7;
                                                zr2 zr2Var3 = cs2Var2.g;
                                                if (zr2Var3 != null) {
                                                    zr2Var3.b(i7, cs2Var2.k);
                                                }
                                                zr2 zr2Var4 = cs2Var2.g;
                                                if (zr2Var4 != null) {
                                                    zr2Var4.c((gm9) arrayList2.get(cs2Var2.d - 1));
                                                }
                                                if (cs2Var2.d + 1 <= arrayList2.size() && cs2Var2.g != null) {
                                                }
                                            }
                                            String str = cs2Var2.c;
                                            if (cs2Var2.h && arrayList2.size() - cs2Var2.d < 5 && cs2Var2.j != 0 && str != null && str.length() != 0) {
                                                wqi.c("cs2", "Search for next messages", new Object[0]);
                                                cs2Var2.h = false;
                                                svi.e(cs2Var2.e, null, null, new as2(cs2Var2, str, cs2Var2.j, null), 3);
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        int i6 = v1aVar2.y(appCompatImageView2).c().a.a.i;
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                        shapeDrawable2.getPaint().setColor(-1);
                        appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i6), null, shapeDrawable2));
                        return appCompatImageView2;
                    default:
                        yy7[] yy7VarArr4 = SearchMessageBottomWidget.Z;
                        View view = new View(searchMessageBottomWidget.getContext());
                        view.setId(m1b.f);
                        view.setLayoutParams(new kt3(kti.d(1 * vw4.d().getDisplayMetrics().density), kti.d(18 * vw4.d().getDisplayMetrics().density)));
                        view.setBackgroundColor(a93.s0.y(view).a().k().d.g);
                        return view;
                }
            }
        });
    }
}

package one.me.keyboardmedia;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a62;
import defpackage.b19;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.c19;
import defpackage.c24;
import defpackage.d08;
import defpackage.ea1;
import defpackage.f54;
import defpackage.f8j;
import defpackage.g08;
import defpackage.gwi;
import defpackage.h08;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.iv6;
import defpackage.j48;
import defpackage.jva;
import defpackage.k18;
import defpackage.ki0;
import defpackage.kti;
import defpackage.lqi;
import defpackage.mw4;
import defpackage.nl;
import defpackage.o91;
import defpackage.om2;
import defpackage.q08;
import defpackage.qk8;
import defpackage.sa1;
import defpackage.sxg;
import defpackage.t09;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u6g;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w5b;
import defpackage.wu7;
import defpackage.xz7;
import defpackage.yeb;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.z44;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lone/me/keyboardmedia/MediaKeyboardWidget;", "Lone/me/sdk/arch/Widget;", "Lu6g;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "", ApiProtocol.PARAM_CHAT_ID, "", "onlyEmoji", "(Ljava/lang/String;JZLtk4;)V", "b19", "keyboard-media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaKeyboardWidget extends Widget implements u6g {
    public static final /* synthetic */ yy7[] B0 = {new toc(MediaKeyboardWidget.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, MediaKeyboardWidget.class, "onlyEmoji", "getOnlyEmoji()Z", 0), new toc(MediaKeyboardWidget.class, "bottomPanelView", "getBottomPanelView()Landroid/view/View;", 0), new toc(MediaKeyboardWidget.class, "keyboardBottomTabs", "getKeyboardBottomTabs()Lone/me/keyboardmedia/tablayout/KeyboardTabLayout;", 0), new toc(MediaKeyboardWidget.class, "keyboardViewPager", "getKeyboardViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new toc(MediaKeyboardWidget.class, "settingsButton", "getSettingsButton()Landroid/view/View;", 0), new toc(MediaKeyboardWidget.class, "removeButton", "getRemoveButton()Landroid/view/View;", 0), new toc(MediaKeyboardWidget.class, "showcaseButton", "getShowcaseButton()Landroid/view/View;", 0)};
    public AnimatorSet A0;
    public final bbd X;
    public final bbd Y;
    public final bbd Z;
    public final hs a;
    public final hs b;
    public final k18 c;
    public qk8 d;
    public final bbd o;
    public final bbd s0;
    public final bbd t0;
    public f54 u0;
    public final h08 v0;
    public om2 w0;
    public ki0 x0;
    public final EnumMap y0;
    public ObjectAnimator z0;

    public MediaKeyboardWidget(String str, long j, boolean z, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("arg_key_chat_id", Long.valueOf(j)), new imb("arg_key_only_emoji", Boolean.valueOf(z))));
    }

    public final ViewPager2 A0() {
        return (ViewPager2) this.Y.D(this, B0[4]);
    }

    public final boolean B0() {
        yy7 yy7Var = B0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final void C0(d08 d08Var, RecyclerView recyclerView) {
        EnumMap enumMap = this.y0;
        if (enumMap.containsKey(d08Var) || recyclerView == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        b19 b19Var = new b19(getContext(), new o91(i2, this, MediaKeyboardWidget.class, "showBottomPanel", "showBottomPanel()V", i, 20), new o91(i2, this, MediaKeyboardWidget.class, "hideBottomPanel", "hideBottomPanel()V", i, 21));
        recyclerView.m(b19Var);
        enumMap.put((EnumMap) d08Var, (d08) b19Var);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        int i = 3;
        Continuation continuation = null;
        final int i2 = 1;
        tqi.c(new c19(i, continuation, i2), frameLayout);
        int i3 = xz7.a;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, xz7.a(frameLayout.getContext())));
        ViewPager2 viewPager2 = new ViewPager2(frameLayout.getContext());
        viewPager2.setId(w5b.f);
        final int i4 = 0;
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOverScrollMode(2);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        lqi.b(viewPager2);
        frameLayout.addView(viewPager2);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(w5b.a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, kti.d(48 * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        tqi.c(new c19(i, continuation, i4), frameLayout2);
        frameLayout2.setClickable(true);
        View view = new View(frameLayout2.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, kti.c(vw4.d().getDisplayMetrics().density * 0.5d));
        layoutParams2.gravity = 48;
        view.setLayoutParams(layoutParams2);
        tqi.c(new c24(i, continuation, i2), view);
        frameLayout2.addView(view);
        int iD = kti.d(28 * vw4.d().getDisplayMetrics().density);
        View appCompatImageView = new AppCompatImageView(frameLayout2.getContext(), null);
        appCompatImageView.setId(w5b.j);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iD, iD);
        layoutParams3.gravity = 8388627;
        float f = 12;
        layoutParams3.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        appCompatImageView.setLayoutParams(layoutParams3);
        appCompatImageView.setPadding(4, 4, 4, 4);
        tqi.c(new a62(i, continuation, i2), appCompatImageView);
        f8j.d(appCompatImageView, 300L, new sa1(i2));
        frameLayout2.addView(appCompatImageView);
        View appCompatImageView2 = new AppCompatImageView(frameLayout2.getContext(), null);
        appCompatImageView2.setId(w5b.k);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iD, iD);
        layoutParams4.gravity = 8388629;
        layoutParams4.rightMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        appCompatImageView2.setLayoutParams(layoutParams4);
        appCompatImageView2.setPadding(4, 4, 4, 4);
        tqi.c(new a62(i, continuation, 2), appCompatImageView2);
        f8j.d(appCompatImageView2, 300L, new View.OnClickListener(this) { // from class: z09
            public final /* synthetic */ MediaKeyboardWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = i4;
                MediaKeyboardWidget mediaKeyboardWidget = this.b;
                switch (i5) {
                    case 0:
                        yy7[] yy7VarArr = MediaKeyboardWidget.B0;
                        uz7 uz7Var = uz7.c;
                        hs hsVar = mediaKeyboardWidget.a;
                        yy7 yy7Var = MediaKeyboardWidget.B0[0];
                        long jLongValue = ((Number) hsVar.a(mediaKeyboardWidget)).longValue();
                        uz7Var.p0().b(":stickers/showcase?chat_id=" + jLongValue, null);
                        break;
                    default:
                        yy7[] yy7VarArr2 = MediaKeyboardWidget.B0;
                        View view3 = mediaKeyboardWidget.getView();
                        if (view3 != null) {
                            uog.i(view3, p07.KEYBOARD_TAP);
                        }
                        xfh.r(((t09) mediaKeyboardWidget.c.getValue()).o, m09.a);
                        break;
                }
            }
        });
        frameLayout2.addView(appCompatImageView2);
        View appCompatImageView3 = new AppCompatImageView(frameLayout2.getContext(), null);
        appCompatImageView3.setId(w5b.i);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iD, iD);
        layoutParams5.gravity = 8388629;
        layoutParams5.rightMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        appCompatImageView3.setLayoutParams(layoutParams5);
        appCompatImageView3.setPadding(4, 4, 4, 4);
        tqi.c(new a62(i, continuation, i), appCompatImageView3);
        appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: z09
            public final /* synthetic */ MediaKeyboardWidget b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i5 = i2;
                MediaKeyboardWidget mediaKeyboardWidget = this.b;
                switch (i5) {
                    case 0:
                        yy7[] yy7VarArr = MediaKeyboardWidget.B0;
                        uz7 uz7Var = uz7.c;
                        hs hsVar = mediaKeyboardWidget.a;
                        yy7 yy7Var = MediaKeyboardWidget.B0[0];
                        long jLongValue = ((Number) hsVar.a(mediaKeyboardWidget)).longValue();
                        uz7Var.p0().b(":stickers/showcase?chat_id=" + jLongValue, null);
                        break;
                    default:
                        yy7[] yy7VarArr2 = MediaKeyboardWidget.B0;
                        View view3 = mediaKeyboardWidget.getView();
                        if (view3 != null) {
                            uog.i(view3, p07.KEYBOARD_TAP);
                        }
                        xfh.r(((t09) mediaKeyboardWidget.c.getValue()).o, m09.a);
                        break;
                }
            }
        });
        frameLayout2.addView(appCompatImageView3);
        g08 g08Var = new g08(frameLayout2.getContext());
        g08Var.setId(w5b.p);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        g08Var.setPadding(g08Var.getPaddingLeft(), iD2, g08Var.getPaddingRight(), iD2);
        g08Var.setLayoutParams(layoutParams6);
        g08Var.setTabMode(0);
        frameLayout2.addView(g08Var);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        t09 t09Var = (t09) this.c.getValue();
        int currentItem = A0().getCurrentItem();
        List list = (List) this.v0.b;
        t09Var.getClass();
        if (currentItem >= 0 && currentItem < list.size()) {
            ((sxg) t09Var.c.getValue()).h(ho7.c(((d08) list.get(currentItem)).b), "app.last.media_keyboard.page.id");
        }
        ObjectAnimator objectAnimator = this.z0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.z0 = null;
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.A0 = null;
        f54 f54Var = this.u0;
        if (f54Var != null) {
            f54Var.c();
        }
        this.u0 = null;
        ki0 ki0Var = this.x0;
        if (ki0Var != null) {
            A0().g(ki0Var);
        }
        this.x0 = null;
        this.y0.clear();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        ((g08) this.X.D(this, B0[3])).onThemeChanged(yebVar);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        List listSingletonList;
        qk8 qk8Var = this.d;
        yy7[] yy7VarArr = B0;
        yy7 yy7Var = yy7VarArr[0];
        long jLongValue = ((Number) this.a.a(this)).longValue();
        Object objA = yvi.a(getArgs(), Widget.ARG_SCOPE_ID, b1e.class);
        if (objA == null) {
            throw new IllegalArgumentException(ho7.i("No value passed for key arg_key_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
        }
        this.w0 = new om2(this, qk8Var, jLongValue, ((b1e) ((Parcelable) objA)).a);
        A0().setAdapter(this.w0);
        ViewPager2 viewPager2A0 = A0();
        ki0 ki0Var = new ki0(i, this);
        this.x0 = ki0Var;
        viewPager2A0.b(ki0Var);
        g08 g08Var = (g08) this.X.D(this, yy7VarArr[3]);
        ViewPager2 viewPager2A02 = A0();
        h08 h08Var = this.v0;
        h08Var.getClass();
        f54 f54Var = new f54(g08Var, viewPager2A02, new nl(g08Var, h08Var, viewPager2A02, i));
        f54Var.b();
        this.u0 = f54Var;
        jva onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            j48 viewLifecycleOwner = getViewLifecycleOwner();
            z44 z44Var = new z44(!B0(), new wu7(12, this));
            if (viewLifecycleOwner != null) {
                onBackPressedDispatcher.a(viewLifecycleOwner, z44Var);
            } else {
                onBackPressedDispatcher.b(z44Var);
            }
        }
        if (B0()) {
            listSingletonList = Collections.singletonList(d08.Y);
        } else {
            d08.d.getClass();
            listSingletonList = d08.o;
        }
        h08Var.b = listSingletonList;
        om2 om2Var = this.w0;
        if (om2Var != null) {
            if (!om2Var.x0.isEmpty() || listSingletonList.isEmpty()) {
                int i = 2;
                mw4 mw4VarB = q08.b(new ea1(i, om2Var.x0, listSingletonList));
                om2Var.x0 = listSingletonList;
                mw4VarB.a(new iv6(i, om2Var));
            } else {
                om2Var.x0 = listSingletonList;
                om2Var.p(0, listSingletonList.size());
            }
        }
        ViewPager2 viewPager2A03 = A0();
        View childAt = viewPager2A03.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
        om2 om2Var2 = this.w0;
        if ((om2Var2 != null ? om2Var2.x0.size() : 0) > 0) {
            ((View) this.s0.D(this, yy7VarArr[6])).setVisibility(B0() ? 0 : 8);
            ((View) this.Z.D(this, yy7VarArr[5])).setVisibility(!B0() ? 0 : 8);
            ((View) this.t0.D(this, yy7VarArr[7])).setVisibility(B0() ? 8 : 0);
            t09 t09Var = (t09) this.c.getValue();
            t09Var.getClass();
            Iterator it = listSingletonList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (ho7.c(((d08) it.next()).b) == ((sxg) t09Var.c.getValue()).g.getLong("app.last.media_keyboard.page.id", 0L)) {
                    break;
                } else {
                    i2++;
                }
            }
            viewPager2A03.e(i2 >= 0 ? i2 : 0, true);
            int i3 = xz7.a;
            viewPager2A03.measure(View.MeasureSpec.makeMeasureSpec(viewPager2A03.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(xz7.a(viewPager2A03.getContext()), 1073741824));
            y0();
        }
    }

    public final void y0() {
        if (getView() == null) {
            return;
        }
        List list = (List) this.v0.b;
        int currentItem = A0().getCurrentItem();
        if (currentItem < 0 || currentItem > ve3.i(list)) {
            return;
        }
        d08 d08Var = (d08) list.get(currentItem);
        int iOrdinal = d08Var.ordinal();
        if (iOrdinal == 0) {
            C0(d08Var, (RecyclerView) A0().findViewById(w5b.n));
        } else {
            if (iOrdinal != 1) {
                return;
            }
            C0(d08Var, (RecyclerView) A0().findViewById(w5b.c));
        }
    }

    public final View z0() {
        return (View) this.o.D(this, B0[2]);
    }

    public MediaKeyboardWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(Long.class, 0L, "arg_key_chat_id");
        this.b = new hs(Boolean.class, Boolean.FALSE, "arg_key_only_emoji");
        Object objA = yvi.a(bundle, Widget.ARG_SCOPE_ID, b1e.class);
        if (objA != null) {
            this.c = m39getSharedViewModelcp94BC8(((b1e) ((Parcelable) objA)).a, t09.class, null);
            this.o = viewBinding(w5b.a);
            this.X = viewBinding(w5b.p);
            this.Y = viewBinding(w5b.f);
            this.Z = viewBinding(w5b.j);
            this.s0 = viewBinding(w5b.i);
            this.t0 = viewBinding(w5b.k);
            h08 h08Var = new h08(0, false);
            h08Var.b = hd5.a;
            this.v0 = h08Var;
            this.y0 = new EnumMap(d08.class);
            return;
        }
        throw new IllegalArgumentException(ho7.i("No value passed for key arg_key_scope_id of type ", b1e.class.getSimpleName(), " in bundle").toString());
    }

    public /* synthetic */ MediaKeyboardWidget(String str, long j, boolean z, int i, tk4 tk4Var) {
        this(str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? false : z, null);
    }
}

package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.an2;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.cm6;
import defpackage.cn2;
import defpackage.czi;
import defpackage.d53;
import defpackage.dn2;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.f54;
import defpackage.f82;
import defpackage.fdc;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.i00;
import defpackage.imb;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l8j;
import defpackage.m;
import defpackage.neb;
import defpackage.o91;
import defpackage.om2;
import defpackage.sn0;
import defpackage.tl2;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ukd;
import defpackage.v8b;
import defpackage.vid;
import defpackage.wj1;
import defpackage.yfb;
import defpackage.ytd;
import defpackage.yy7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/profile/screens/media/ChatMediaTabWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatMediaTabWidget extends Widget {
    public static final /* synthetic */ yy7[] v0 = {new toc(ChatMediaTabWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, ChatMediaTabWidget.class, "mediaTabs", "getMediaTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), new toc(ChatMediaTabWidget.class, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0), new toc(ChatMediaTabWidget.class, "mediaViewPager", "getMediaViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final sn0 X;
    public final bbd Y;
    public final sn0 Z;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final k18 d;
    public final sn0 o;
    public f54 s0;
    public final ukd t0;
    public final om2 u0;

    public ChatMediaTabWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(new o91(0, this, ChatMediaTabWidget.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 9), (cm6) null, 6);
        this.b = eo7.f;
        this.c = fdc.a.getAccessor().d(151);
        this.d = createViewModelLazy(an2.class, new tl2(1, new wj1(bundle, 1)));
        final int i = 0;
        this.o = binding(new cm6(this) { // from class: bn2
            public final /* synthetic */ ChatMediaTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                int i3 = 2;
                ChatMediaTabWidget chatMediaTabWidget = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = ChatMediaTabWidget.v0;
                        yfb yfbVar = new yfb(chatMediaTabWidget.getContext(), 6);
                        yfbVar.setId(v8b.s0);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setLeftActions(new gfb(new gf1(18)));
                        return yfbVar;
                    case 1:
                        yy7[] yy7VarArr2 = ChatMediaTabWidget.v0;
                        neb nebVar = new neb(chatMediaTabWidget.getContext(), 0);
                        nebVar.setId(v8b.o0);
                        nebVar.setTabMode(0);
                        nebVar.setTabGravity(2);
                        return nebVar;
                    default:
                        yy7[] yy7VarArr3 = ChatMediaTabWidget.v0;
                        ViewPager2 viewPager2 = new ViewPager2(chatMediaTabWidget.getContext());
                        viewPager2.setId(v8b.q0);
                        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        viewPager2.setOffscreenPageLimit(3);
                        viewPager2.b(new ki0(i3, chatMediaTabWidget));
                        lqi.b(viewPager2);
                        return viewPager2;
                }
            }
        });
        final int i2 = 1;
        this.X = binding(new cm6(this) { // from class: bn2
            public final /* synthetic */ ChatMediaTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                int i3 = 2;
                ChatMediaTabWidget chatMediaTabWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = ChatMediaTabWidget.v0;
                        yfb yfbVar = new yfb(chatMediaTabWidget.getContext(), 6);
                        yfbVar.setId(v8b.s0);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setLeftActions(new gfb(new gf1(18)));
                        return yfbVar;
                    case 1:
                        yy7[] yy7VarArr2 = ChatMediaTabWidget.v0;
                        neb nebVar = new neb(chatMediaTabWidget.getContext(), 0);
                        nebVar.setId(v8b.o0);
                        nebVar.setTabMode(0);
                        nebVar.setTabGravity(2);
                        return nebVar;
                    default:
                        yy7[] yy7VarArr3 = ChatMediaTabWidget.v0;
                        ViewPager2 viewPager2 = new ViewPager2(chatMediaTabWidget.getContext());
                        viewPager2.setId(v8b.q0);
                        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        viewPager2.setOffscreenPageLimit(3);
                        viewPager2.b(new ki0(i3, chatMediaTabWidget));
                        lqi.b(viewPager2);
                        return viewPager2;
                }
            }
        });
        this.Y = viewBinding(v8b.r0);
        final int i3 = 2;
        this.Z = binding(new cm6(this) { // from class: bn2
            public final /* synthetic */ ChatMediaTabWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                int i32 = 2;
                ChatMediaTabWidget chatMediaTabWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = ChatMediaTabWidget.v0;
                        yfb yfbVar = new yfb(chatMediaTabWidget.getContext(), 6);
                        yfbVar.setId(v8b.s0);
                        yfbVar.setForm(qfb.a);
                        yfbVar.setLeftActions(new gfb(new gf1(18)));
                        return yfbVar;
                    case 1:
                        yy7[] yy7VarArr2 = ChatMediaTabWidget.v0;
                        neb nebVar = new neb(chatMediaTabWidget.getContext(), 0);
                        nebVar.setId(v8b.o0);
                        nebVar.setTabMode(0);
                        nebVar.setTabGravity(2);
                        return nebVar;
                    default:
                        yy7[] yy7VarArr3 = ChatMediaTabWidget.v0;
                        ViewPager2 viewPager2 = new ViewPager2(chatMediaTabWidget.getContext());
                        viewPager2.setId(v8b.q0);
                        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        viewPager2.setOffscreenPageLimit(3);
                        viewPager2.b(new ki0(i32, chatMediaTabWidget));
                        lqi.b(viewPager2);
                        return viewPager2;
                }
            }
        });
        this.t0 = new ukd(10);
        this.u0 = new om2(this, bundle.getLong("chat_id"));
    }

    public static final f1e y0(ChatMediaTabWidget chatMediaTabWidget) {
        int iOrdinal = ((dn2) dn2.d.get(chatMediaTabWidget.z0().getCurrentItem())).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return f1e.CHAT_ATTACHMENTS_FILES;
            }
            if (iOrdinal == 2) {
                return f1e.CHAT_ATTACHMENTS_LINKS;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return f1e.CHAT_ATTACHMENTS_MEDIA;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setId(v8b.p0);
        linearLayout.setOrientation(1);
        tqi.c(new m(3, null, 2), linearLayout);
        yy7[] yy7VarArr = v0;
        yy7 yy7Var = yy7VarArr[0];
        linearLayout.addView((yfb) this.o.getValue());
        yy7 yy7Var2 = yy7VarArr[1];
        linearLayout.addView((neb) this.X.getValue());
        f82 f82VarA = czi.a(linearLayout.getContext());
        f82VarA.setId(v8b.r0);
        linearLayout.addView(f82VarA);
        linearLayout.addView(z0());
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        f54 f54Var = this.s0;
        if (f54Var != null) {
            f54Var.c();
        }
        this.s0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ViewPager2 viewPager2Z0 = z0();
        om2 om2Var = this.u0;
        viewPager2Z0.setAdapter(om2Var);
        yy7[] yy7VarArr = v0;
        int i = 1;
        yy7 yy7Var = yy7VarArr[1];
        neb nebVar = (neb) this.X.getValue();
        ViewPager2 viewPager2Z02 = z0();
        ukd ukdVar = this.t0;
        ukdVar.getClass();
        f54 f54Var = new f54(nebVar, viewPager2Z02, new i00(nebVar, 13, ukdVar));
        f54Var.b();
        this.s0 = f54Var;
        Bundle bundle = null;
        Object[] objArr = 0;
        gw0.w(new g56(aw0.a(new d53(((an2) this.d.getValue()).c, 12), getViewLifecycleOwner().p(), l38.d), new cn2(null, this), 1), getViewLifecycleScope());
        ViewPager2 viewPager2Z03 = z0();
        View childAt = viewPager2Z03.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
        viewPager2Z03.e(0, false);
        if (om2Var.x0.size() > 0) {
            viewPager2Z03.measure(View.MeasureSpec.makeMeasureSpec(viewPager2Z03.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(viewPager2Z03.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        ytd childRouter = getChildRouter((ViewGroup) this.Y.D(this, yy7VarArr[2]));
        childRouter.e = 1;
        childRouter.R(false);
        if (childRouter.n()) {
            return;
        }
        PinBarsWidget pinBarsWidget = new PinBarsWidget(bundle, i, objArr == true ? 1 : 0);
        pinBarsWidget.setRetainViewMode(getRetainViewMode());
        childRouter.S(l8j.a(pinBarsWidget, null, null));
    }

    public final ViewPager2 z0() {
        yy7 yy7Var = v0[3];
        return (ViewPager2) this.Z.getValue();
    }

    public ChatMediaTabWidget(long j) {
        this(gwi.b(new imb("chat_id", Long.valueOf(j))));
    }
}

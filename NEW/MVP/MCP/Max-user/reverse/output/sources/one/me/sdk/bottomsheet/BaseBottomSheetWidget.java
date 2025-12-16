package one.me.sdk.bottomsheet;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bbd;
import defpackage.eo7;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i6c;
import defpackage.ld0;
import defpackage.lqi;
import defpackage.ls0;
import defpackage.m6c;
import defpackage.mgb;
import defpackage.ms0;
import defpackage.o6c;
import defpackage.q85;
import defpackage.s3;
import defpackage.tk4;
import defpackage.tqi;
import defpackage.u9b;
import defpackage.v9;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wqi;
import defpackage.yeb;
import defpackage.yn6;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zfi;
import defpackage.zi0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.webapp.rootscreen.WebAppRootScreen;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "q85", "v9", "zi0", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseBottomSheetWidget extends Widget {
    public final eo7 X;
    public boolean Y;
    public boolean Z;
    public final String a;
    public o6c b;
    public final hs c;
    public final bbd d;
    public final hs o;
    public static final /* synthetic */ yy7[] t0 = {new z8a(BaseBottomSheetWidget.class, "needDim", "getNeedDim()Z"), ho7.d(vid.a, BaseBottomSheetWidget.class, "cardView", "getCardView()Landroid/view/View;", 0), new z8a(BaseBottomSheetWidget.class, "isDialogClosable", "isDialogClosable()Z")};
    public static final q85 s0 = new q85(14);
    public static final String u0 = "need_dim";
    public static final String v0 = "is_closable";

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBottomSheetWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: A0, reason: from getter */
    public eo7 getX() {
        return this.X;
    }

    public final View B0() {
        return (View) this.d.D(this, t0[1]);
    }

    public yeb C0() {
        return null;
    }

    public boolean D0() {
        return true;
    }

    public final void E0(boolean z) {
        wqi.m(this.a, "hide(animated = " + z + ")", new Object[0]);
        o6c o6cVar = this.b;
        if (o6cVar == null) {
            F0();
        } else {
            if (o6cVar.getScrollState() == m6c.a) {
                return;
            }
            if (!this.Y) {
                this.Y = true;
                H0();
            }
            o6cVar.j(z);
        }
    }

    public void F0() {
        wqi.m(this.a, "hideInstant()", new Object[0]);
        if (!this.Y) {
            this.Y = true;
            H0();
        }
        I0();
    }

    public final boolean G0() {
        yy7 yy7Var = t0[2];
        return ((Boolean) this.o.a(this)).booleanValue();
    }

    public void H0() {
    }

    public final void I0() {
        if (this.Z) {
            return;
        }
        try {
            this.Z = true;
            getRouter().B(this);
        } catch (IllegalStateException e) {
            this.Z = false;
            wqi.e(getClass().getName(), "popController failure", new zi0(e));
        }
    }

    public final void J0(boolean z) {
        yy7 yy7Var = t0[0];
        this.c.b(this, Boolean.valueOf(z));
    }

    public abstract void K0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle);

    @Override // defpackage.c54
    public boolean handleBack() {
        E0(true);
        return true;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: isDialog */
    public boolean getA0() {
        return !(this instanceof WebAppRootScreen);
    }

    @Override // defpackage.c54
    public void onAttach(View view) {
        super.onAttach(view);
        o6c o6cVar = this.b;
        if (o6cVar == null || o6cVar.getScrollState() != m6c.a) {
            return;
        }
        mgb.a(o6cVar, new yn6(o6cVar, 4, o6cVar));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wqi.m(this.a, "onCreateView()", new Object[0]);
        o6c o6cVar = new o6c(layoutInflater.getContext());
        o6cVar.setId(u9b.a);
        FrameLayout frameLayoutY0 = y0(layoutInflater, bundle);
        ViewGroup.LayoutParams layoutParams = frameLayoutY0.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        o6cVar.addView(frameLayoutY0, layoutParams);
        o6cVar.setCallback(z0());
        zfi.b(frameLayoutY0, getX(), null);
        tqi.c(new s3(this, null, 3), o6cVar);
        this.b = o6cVar;
        return o6cVar;
    }

    @Override // defpackage.c54
    public void onDestroyView(View view) {
        wqi.m(this.a, "onDestroyView()", new Object[0]);
        o6c o6cVar = this.b;
        i6c callback = o6cVar != null ? o6cVar.getCallback() : null;
        o6c o6cVar2 = this.b;
        if (o6cVar2 != null) {
            o6cVar2.setCallback(null);
        }
        o6c o6cVar3 = this.b;
        if (o6cVar3 != null) {
            ValueAnimator valueAnimator = o6cVar3.o;
            if (valueAnimator != null) {
                lqi.a(valueAnimator);
            }
            o6cVar3.o = null;
        }
        this.b = null;
        this.Z = false;
        if (this.Y && callback != null) {
            callback.h();
        }
        this.Y = false;
        super.onDestroyView(view);
    }

    public FrameLayout y0(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(u9b.b);
        frameLayout.setClipToPadding(false);
        frameLayout.setClickable(true);
        frameLayout.setOutlineProvider(new ls0(1, vw4.d().getDisplayMetrics().density * 20.0f));
        K0(frameLayout, layoutInflater, bundle);
        tqi.c(new ld0(this, (Continuation) null, 1), frameLayout);
        return frameLayout;
    }

    public i6c z0() {
        return new v9(this, 1);
    }

    public BaseBottomSheetWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = "BaseBottomSheetWidget#".concat(getClass().getName());
        Boolean bool = Boolean.TRUE;
        this.c = new hs(Boolean.class, bool, u0);
        this.d = viewBinding(u9b.b);
        this.o = new hs(Boolean.class, bool, v0);
        this.X = new eo7(5, new ms0(3, 3, false), 5);
    }

    public /* synthetic */ BaseBottomSheetWidget(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}

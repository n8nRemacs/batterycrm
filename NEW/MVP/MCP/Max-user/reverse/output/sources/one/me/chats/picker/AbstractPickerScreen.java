package one.me.chats.picker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.a2b;
import defpackage.aw0;
import defpackage.b54;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.bud;
import defpackage.c54;
import defpackage.cm6;
import defpackage.eo7;
import defpackage.f82;
import defpackage.g56;
import defpackage.gw0;
import defpackage.ho7;
import defpackage.i1b;
import defpackage.id5;
import defpackage.jxb;
import defpackage.jzb;
import defpackage.k18;
import defpackage.kti;
import defpackage.l38;
import defpackage.lr8;
import defpackage.lyb;
import defpackage.m;
import defpackage.m3;
import defpackage.mcf;
import defpackage.q;
import defpackage.q3;
import defpackage.r3;
import defpackage.s3;
import defpackage.sn0;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ue3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yfb;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z41;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/chats/picker/AbstractPickerScreen;", "Ljzb;", "T", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AbstractPickerScreen<T extends jzb> extends Widget {
    public static final /* synthetic */ yy7[] s0 = {new toc(AbstractPickerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, AbstractPickerScreen.class, "chips", "getChips()Lone/me/sdk/uikit/common/views/OneMeContactsChipGroup;", 0), new toc(AbstractPickerScreen.class, "mainContainer", "getMainContainer()Landroid/view/ViewGroup;", 0), new toc(AbstractPickerScreen.class, "pickerWidgetContainer", "getPickerWidgetContainer()Landroid/view/ViewGroup;", 0)};
    public final bbd X;
    public final bbd Y;
    public bcb Z;
    public final eo7 a;
    public final String b;
    public final k18 c;
    public final sn0 d;
    public final sn0 o;

    public AbstractPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = "PickerScreen";
        this.c = createViewModelLazy(jxb.class, new q(1, new m3(this, 0, bundle)));
        final int i = 0;
        this.d = binding(new cm6(this) { // from class: n3
            public final /* synthetic */ AbstractPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                s5g s5gVar;
                int i2 = i;
                AbstractPickerScreen abstractPickerScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = AbstractPickerScreen.s0;
                        return abstractPickerScreen.B0(abstractPickerScreen.getContext());
                    default:
                        yy7[] yy7VarArr2 = AbstractPickerScreen.s0;
                        a2b a2bVar = new a2b(abstractPickerScreen.getContext());
                        EditText editText = a2bVar.getEditText();
                        mcf mcfVarE0 = abstractPickerScreen.E0();
                        editText.setHint((mcfVarE0 == null || (s5gVar = (s5g) ((tcf) mcfVarE0).getValue()) == null) ? null : s5gVar.b(a2bVar.getContext()));
                        a2bVar.setCallback(new i5i(abstractPickerScreen, a2bVar));
                        a2bVar.getEditText().addTextChangedListener(new p3(0, abstractPickerScreen));
                        return a2bVar;
                }
            }
        });
        final int i2 = 1;
        this.o = binding(new cm6(this) { // from class: n3
            public final /* synthetic */ AbstractPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                s5g s5gVar;
                int i22 = i2;
                AbstractPickerScreen abstractPickerScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = AbstractPickerScreen.s0;
                        return abstractPickerScreen.B0(abstractPickerScreen.getContext());
                    default:
                        yy7[] yy7VarArr2 = AbstractPickerScreen.s0;
                        a2b a2bVar = new a2b(abstractPickerScreen.getContext());
                        EditText editText = a2bVar.getEditText();
                        mcf mcfVarE0 = abstractPickerScreen.E0();
                        editText.setHint((mcfVarE0 == null || (s5gVar = (s5g) ((tcf) mcfVarE0).getValue()) == null) ? null : s5gVar.b(a2bVar.getContext()));
                        a2bVar.setCallback(new i5i(abstractPickerScreen, a2bVar));
                        a2bVar.getEditText().addTextChangedListener(new p3(0, abstractPickerScreen));
                        return a2bVar;
                }
            }
        });
        this.X = viewBinding(i1b.c0);
        this.Y = viewBinding(i1b.b0);
    }

    public abstract Widget A0(String str);

    public abstract yfb B0(Context context);

    public abstract jzb C0();

    public a2b D0() {
        yy7 yy7Var = s0[1];
        return (a2b) this.o.getValue();
    }

    public abstract mcf E0();

    public final ViewGroup F0() {
        return (ViewGroup) this.X.D(this, s0[2]);
    }

    public final Widget G0() {
        bud budVar = (bud) ue3.I(getChildRouter((ViewGroup) this.Y.D(this, s0[3])).e());
        c54 c54Var = budVar != null ? budVar.a : null;
        if (c54Var instanceof Widget) {
            return (Widget) c54Var;
        }
        return null;
    }

    public final yfb H0() {
        yy7 yy7Var = s0[0];
        return (yfb) this.d.getValue();
    }

    public final jxb I0() {
        return (jxb) this.c.getValue();
    }

    public abstract Set J0(Bundle bundle);

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public eo7 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getO() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(i1b.c0);
        tqi.c(new m(3, null, 1), linearLayout);
        linearLayout.addView(H0(), new FrameLayout.LayoutParams(-1, -2));
        if (D0() != null) {
            lr8 lr8Var = new lr8(linearLayout.getContext(), null);
            lr8Var.a = -1;
            lr8Var.setMaxHeight(kti.d(100 * vw4.d().getDisplayMetrics().density));
            lr8Var.addView(D0(), new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(lr8Var, new LinearLayout.LayoutParams(-1, -2));
            View view = new View(linearLayout.getContext());
            tqi.c(new q3(3, null, 0), view);
            linearLayout.addView(view, new LinearLayout.LayoutParams(-1, kti.c(vw4.d().getDisplayMetrics().density * 0.5d)));
        }
        f82 f82Var = new f82(linearLayout.getContext());
        f82Var.setId(i1b.b0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        linearLayout.addView(f82Var, layoutParams);
        ytd childRouter = getChildRouter(f82Var);
        Widget widgetA0 = A0(this.b);
        widgetA0.setRetainViewMode(b54.b);
        if (!childRouter.n()) {
            childRouter.S(new bud(widgetA0, null, null, null, false, -1));
        }
        Iterator it = y0().iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new z41(id5.a, I0().o, new s3(this, null, 0)), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(I0().Z, getViewLifecycleOwner().p(), l38.d), new r3(null, this), 1), getViewLifecycleScope());
    }

    public abstract Iterable y0();

    public abstract lyb z0();
}

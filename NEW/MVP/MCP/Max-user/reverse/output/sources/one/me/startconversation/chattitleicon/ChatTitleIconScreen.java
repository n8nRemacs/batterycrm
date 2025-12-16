package one.me.startconversation.chattitleicon;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import defpackage.api;
import defpackage.aw0;
import defpackage.az2;
import defpackage.bwf;
import defpackage.cm6;
import defpackage.cz2;
import defpackage.dz2;
import defpackage.eo7;
import defpackage.eu4;
import defpackage.ez2;
import defpackage.fu2;
import defpackage.g39;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gz2;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.jd0;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l48;
import defpackage.mz2;
import defpackage.ndb;
import defpackage.oz2;
import defpackage.paf;
import defpackage.pz2;
import defpackage.q2b;
import defpackage.qn2;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.raf;
import defpackage.sn0;
import defpackage.svi;
import defpackage.sz2;
import defpackage.tl2;
import defpackage.toc;
import defpackage.uaf;
import defpackage.uxa;
import defpackage.veb;
import defpackage.vid;
import defpackage.xfh;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0010\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/startconversation/chattitleicon/ChatTitleIconScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Lg39;", "Ljd0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "ids", "Lraf;", "createType", "([JLraf;)V", "start-conversation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatTitleIconScreen extends Widget implements qq3, g39, jd0 {
    public static final /* synthetic */ yy7[] z0 = {new toc(ChatTitleIconScreen.class, "ids", "getIds()[J", 0), ho7.d(vid.a, ChatTitleIconScreen.class, "createType", "getCreateType()Lone/me/startconversation/deeplink/StartConversationDeepLinkRoutes$CreateType;", 0), new toc(ChatTitleIconScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ChatTitleIconScreen.class, "hint", "getHint()Landroid/widget/TextView;", 0), new toc(ChatTitleIconScreen.class, "chatIcon", "getChatIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new toc(ChatTitleIconScreen.class, "chatTitle", "getChatTitle()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new toc(ChatTitleIconScreen.class, "chatDescription", "getChatDescription()Lone/me/sdk/uikit/common/views/DescriptionTextViewWithLimit;", 0), new toc(ChatTitleIconScreen.class, "confirmButton", "getConfirmButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final eo7 a;
    public final bwf b;
    public final hs c;
    public final hs d;
    public final ka5 o;
    public final sn0 s0;
    public final sn0 t0;
    public final sn0 u0;
    public final sn0 v0;
    public final sn0 w0;
    public eu4 x0;
    public final sn0 y0;

    public ChatTitleIconScreen(long[] jArr, raf rafVar) {
        this(gwi.b(new imb("ids", jArr), new imb("create_type", rafVar)));
    }

    public static final uxa y0(ChatTitleIconScreen chatTitleIconScreen) {
        sn0 sn0Var = chatTitleIconScreen.u0;
        yy7 yy7Var = z0[4];
        return (uxa) sn0Var.getValue();
    }

    public final OneMeButton A0() {
        yy7 yy7Var = z0[7];
        return (OneMeButton) this.y0.getValue();
    }

    public final raf B0() {
        yy7 yy7Var = z0[1];
        return (raf) this.d.a(this);
    }

    public final sz2 C0() {
        return (sz2) this.X.getValue();
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == ndb.b) {
            uaf uafVar = uaf.c;
            uafVar.getClass();
            uafVar.p0().b(":media-picker/select/photo", null);
        } else if (i == ndb.c) {
            C0().w();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.o;
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 777 && i2 == -1) {
            sz2 sz2VarC0 = C0();
            xfh.o(sz2VarC0, ((q2b) sz2VarC0.u()).b(), new mz2(sz2VarC0, intent != null ? intent.getData() : null, null), 2);
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        api.f(z0().a);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        yy7 yy7Var = z0[2];
        linearLayout.addView((yfb) this.s0.getValue());
        NestedScrollView nestedScrollView = new NestedScrollView(linearLayout.getContext(), null);
        nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        nestedScrollView.setFillViewport(true);
        cz2 cz2Var = new cz2(this, 1);
        ConstraintLayout constraintLayout = new ConstraintLayout(nestedScrollView.getContext());
        constraintLayout.setId(ndb.d);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        cz2Var.invoke(constraintLayout);
        nestedScrollView.addView(constraintLayout);
        linearLayout.addView(nestedScrollView);
        linearLayout.addView(A0());
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        eu4 eu4Var = this.x0;
        if (eu4Var != null) {
            eu4Var.a();
        }
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((qsb) this.Y.getValue()).c(strArr)) {
            C0().w();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        hbd hbdVar = C0().x0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new dz2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().y0, getViewLifecycleOwner().p(), l38Var), new ez2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(C0().z0, new gz2(null, this), 1), getLifecycleScope());
    }

    @Override // defpackage.g39
    public final void q(String str, RectF rectF, Rect rect) {
        sz2 sz2VarC0 = C0();
        sz2VarC0.getClass();
        xfh.o(sz2VarC0, null, new oz2(sz2VarC0, str, rect, rectF, null), 3);
    }

    @Override // defpackage.jd0
    public final void r(String str, RectF rectF, Rect rect) {
        sz2 sz2VarC0 = C0();
        svi.e(sz2VarC0.a, ((q2b) sz2VarC0.u()).b(), null, new pz2(sz2VarC0, rectF, rect, null), 2);
    }

    public final veb z0() {
        yy7 yy7Var = z0[5];
        return (veb) this.v0.getValue();
    }

    public ChatTitleIconScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = new bwf(new fu2(7));
        this.c = new hs(long[].class, new long[0], "ids");
        this.d = new hs(raf.class, "create_type");
        this.o = new ka5(new az2(this, 1), (cm6) null, 6);
        this.X = createViewModelLazy(sz2.class, new tl2(20, new qn2(this, 2, bundle)));
        paf pafVar = paf.a;
        this.Y = pafVar.getAccessor().d(10);
        this.Z = pafVar.getAccessor().d(151);
        this.s0 = binding(new az2(this, 2));
        this.t0 = binding(new az2(this, 3));
        this.u0 = binding(new az2(this, 4));
        this.v0 = binding(new az2(this, 5));
        this.w0 = binding(new az2(this, 6));
        this.y0 = binding(new az2(this, 7));
    }
}

package one.me.folders.edit;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.api;
import defpackage.bbd;
import defpackage.ca6;
import defpackage.d5b;
import defpackage.d9e;
import defpackage.e44;
import defpackage.eo7;
import defpackage.f5b;
import defpackage.f8j;
import defpackage.f96;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i96;
import defpackage.imb;
import defpackage.iza;
import defpackage.j6;
import defpackage.j96;
import defpackage.jza;
import defpackage.k18;
import defpackage.k96;
import defpackage.kt3;
import defpackage.kti;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.sa6;
import defpackage.toc;
import defpackage.tqi;
import defpackage.v96;
import defpackage.vb6;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wo4;
import defpackage.x86;
import defpackage.xfh;
import defpackage.xj1;
import defpackage.xz7;
import defpackage.y86;
import defpackage.yfb;
import defpackage.yo3;
import defpackage.yy7;
import defpackage.zr0;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lone/me/folders/edit/FolderEditScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Lx86;", "Lsa6;", "", "folderId", "<init>", "(Ljava/lang/String;)V", "", "serverChatId", "(J)V", "()V", "folders_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class FolderEditScreen extends Widget implements qq3, x86, sa6 {
    public static final /* synthetic */ yy7[] Z = {new toc(FolderEditScreen.class, "folderId", "getFolderId()Ljava/lang/String;", 0), ho7.d(vid.a, FolderEditScreen.class, "serverChatId", "getServerChatId()J", 0), new toc(FolderEditScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(FolderEditScreen.class, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final bbd X;
    public final bbd Y;
    public final eo7 a;
    public final hs b;
    public final hs c;
    public final k18 d;
    public final y86 o;

    public FolderEditScreen(String str) {
        this(gwi.b(new imb("key_folder_id", str)));
    }

    public static final yfb y0(FolderEditScreen folderEditScreen) {
        return (yfb) folderEditScreen.X.D(folderEditScreen, Z[2]);
    }

    public final void A0() {
        int i = xz7.a;
        if (xz7.b(xz7.c)) {
            api.c(this);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ca6 ca6VarZ0 = z0();
        ca6VarZ0.getClass();
        if (i == d5b.d) {
            ca6VarZ0.x();
        } else {
            if (i != d5b.c || ca6VarZ0.b == null) {
                return;
            }
            xfh.o(ca6VarZ0, ((q2b) ca6VarZ0.d).b(), new v96(ca6VarZ0, null), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yfb yfbVar = new yfb(getContext(), 6);
        yfbVar.setId(d5b.g);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new i96(this, 0)));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(d5b.e);
        recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setAdapter(this.o);
        recyclerView.setItemAnimator(null);
        wo4 wo4Var = new wo4(27, this);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), wo4Var, null, null, 28));
        recyclerView.j(new f96(wo4Var));
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(d5b.d);
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText(f5b.g);
        f8j.d(oneMeButton, 300L, new j6(27, this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(d5b.f);
        kt3 kt3Var = new kt3(0, -2);
        kt3Var.i = 0;
        kt3Var.e = 0;
        kt3Var.h = 0;
        constraintLayout.addView(yfbVar, kt3Var);
        kt3 kt3Var2 = new kt3(0, 0);
        kt3Var2.j = yfbVar.getId();
        kt3Var2.e = 0;
        kt3Var2.h = 0;
        kt3Var2.l = 0;
        constraintLayout.addView(recyclerView, kt3Var2);
        kt3 kt3Var3 = new kt3(0, -2);
        kt3Var3.e = 0;
        kt3Var3.h = 0;
        kt3Var3.l = 0;
        float f = 12;
        kt3Var3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, kt3Var3);
        tqi.c(new xj1(3, null, 1), constraintLayout);
        return constraintLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(z0().B0, new j96(this, null), 1), getViewLifecycleScope());
        gw0.w(new g56(z0().y0, new k96(this, null), 1), getViewLifecycleScope());
    }

    public final ca6 z0() {
        return (ca6) this.d.getValue();
    }

    public FolderEditScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = new hs(String.class, "key_folder_id");
        this.c = new hs(Long.class, 0L, "key_server_chat_id");
        this.d = createViewModelLazy(ca6.class, new yo3(12, new e44(18, this)));
        y86 y86Var = new y86(((g4b) vb6.a.getAccessor().c(56)).a(), this);
        this.o = y86Var;
        this.X = viewBinding(d5b.g);
        this.Y = viewBinding(d5b.d);
        gw0.w(new g56(z0().A0, new zr0(2, y86Var, y86.class, "submitList", "submitList(Ljava/util/List;)V", 4, 19), 1), getLifecycleScope());
    }

    public FolderEditScreen(long j) {
        this(gwi.b(new imb("key_server_chat_id", Long.valueOf(j))));
    }

    public FolderEditScreen() {
        this((Bundle) null);
    }
}

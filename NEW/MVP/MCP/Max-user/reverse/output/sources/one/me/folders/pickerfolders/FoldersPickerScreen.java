package one.me.folders.pickerfolders;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ad6;
import defpackage.aw0;
import defpackage.b0i;
import defpackage.bbd;
import defpackage.d5b;
import defpackage.em6;
import defpackage.eo7;
import defpackage.f5b;
import defpackage.f8j;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gd6;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.iza;
import defpackage.jx0;
import defpackage.jza;
import defpackage.k18;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.qfb;
import defpackage.sc6;
import defpackage.sn0;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uc6;
import defpackage.vb6;
import defpackage.vc6;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w73;
import defpackage.xc6;
import defpackage.y71;
import defpackage.yc6;
import defpackage.yfb;
import defpackage.yh4;
import defpackage.yo3;
import defpackage.yy7;
import defpackage.zc6;
import java.util.Set;
import kotlin.Metadata;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/folders/pickerfolders/FoldersPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "serverChatId", "(J)V", "folders_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class FoldersPickerScreen extends Widget {
    public static final /* synthetic */ yy7[] Z = {new toc(FoldersPickerScreen.class, "serverChatId", "getServerChatId()J", 0), ho7.d(vid.a, FoldersPickerScreen.class, "foldersRecycler", "getFoldersRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(FoldersPickerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(FoldersPickerScreen.class, "createButton", "getCreateButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final bbd X;
    public final sn0 Y;
    public final eo7 a;
    public final hs b;
    public final k18 c;
    public final b0i d;
    public final bbd o;

    public FoldersPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = new hs(Long.class, 0L, "arg_chat_id");
        this.c = createViewModelLazy(gd6.class, new yo3(14, new sc6(this, 0)));
        this.d = new b0i(((g4b) vb6.a.getAccessor().c(56)).a(), new jx0(1, this, FoldersPickerScreen.class, "onFolderClick", "onFolderClick(Lone/me/folders/list/adapter/UserFolderListItem;)V", 0, 18), 5);
        this.o = viewBinding(d5b.m);
        viewBinding(d5b.o);
        this.X = viewBinding(d5b.d);
        this.Y = binding(new sc6(this, 1));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yfb yfbVar = new yfb(getContext(), 6);
        yfbVar.setId(d5b.o);
        yfbVar.setForm(qfb.a);
        yfbVar.setTitle(f5b.p);
        final int i = 0;
        yfbVar.setLeftActions(new gfb(new em6(this) { // from class: tc6
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                fxg fxgVar;
                f86 f86Var;
                String str;
                int i2 = i;
                exg exgVar = exg.a;
                FoldersPickerScreen foldersPickerScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = FoldersPickerScreen.Z;
                        jva onBackPressedDispatcher = foldersPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return qqg.a;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        b0i b0iVar = foldersPickerScreen.d;
                        return Boolean.valueOf(b0iVar.j() >= iIntValue && iIntValue >= 0 && ((fxg) ((t98) b0iVar.C(iIntValue))).b != exgVar);
                    default:
                        int iIntValue2 = ((Integer) obj).intValue();
                        b0i b0iVar2 = foldersPickerScreen.d;
                        if (b0iVar2.j() <= iIntValue2 || iIntValue2 < 0 || (f86Var = (fxgVar = (fxg) ((t98) b0iVar2.C(iIntValue2))).a) == null || (str = f86Var.a) == null || (fxgVar.b != exgVar && !((Set) foldersPickerScreen.y0().w0.getValue()).contains(str))) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(d5b.d);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        oneMeButton.setEnabled(false);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText(f5b.g);
        f8j.d(oneMeButton, 300L, new uc6(this, 0));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        recyclerView.setId(d5b.m);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator(null);
        recyclerView.setClipChildren(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.d);
        float f = 6;
        recyclerView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        final int i2 = 1;
        em6 em6Var = new em6(this) { // from class: tc6
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                fxg fxgVar;
                f86 f86Var;
                String str;
                int i22 = i2;
                exg exgVar = exg.a;
                FoldersPickerScreen foldersPickerScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = FoldersPickerScreen.Z;
                        jva onBackPressedDispatcher = foldersPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return qqg.a;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        b0i b0iVar = foldersPickerScreen.d;
                        return Boolean.valueOf(b0iVar.j() >= iIntValue && iIntValue >= 0 && ((fxg) ((t98) b0iVar.C(iIntValue))).b != exgVar);
                    default:
                        int iIntValue2 = ((Integer) obj).intValue();
                        b0i b0iVar2 = foldersPickerScreen.d;
                        if (b0iVar2.j() <= iIntValue2 || iIntValue2 < 0 || (f86Var = (fxgVar = (fxg) ((t98) b0iVar2.C(iIntValue2))).a) == null || (str = f86Var.a) == null || (fxgVar.b != exgVar && !((Set) foldersPickerScreen.y0().w0.getValue()).contains(str))) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        };
        final int i3 = 2;
        recyclerView.j(new w73(new vc6(recyclerView, 0), new em6(this) { // from class: tc6
            public final /* synthetic */ FoldersPickerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                fxg fxgVar;
                f86 f86Var;
                String str;
                int i22 = i3;
                exg exgVar = exg.a;
                FoldersPickerScreen foldersPickerScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = FoldersPickerScreen.Z;
                        jva onBackPressedDispatcher = foldersPickerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                        }
                        return qqg.a;
                    case 1:
                        int iIntValue = ((Integer) obj).intValue();
                        b0i b0iVar = foldersPickerScreen.d;
                        return Boolean.valueOf(b0iVar.j() >= iIntValue && iIntValue >= 0 && ((fxg) ((t98) b0iVar.C(iIntValue))).b != exgVar);
                    default:
                        int iIntValue2 = ((Integer) obj).intValue();
                        b0i b0iVar2 = foldersPickerScreen.d;
                        if (b0iVar2.j() <= iIntValue2 || iIntValue2 < 0 || (f86Var = (fxgVar = (fxg) ((t98) b0iVar2.C(iIntValue2))).a) == null || (str = f86Var.a) == null || (fxgVar.b != exgVar && !((Set) foldersPickerScreen.y0().w0.getValue()).contains(str))) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }, em6Var, em6Var));
        recyclerView.l(new yh4(recyclerView));
        recyclerView.j(new y71(6));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(d5b.n);
        constraintLayout.setClipChildren(false);
        kt3 kt3Var = new kt3(0, -2);
        kt3Var.i = 0;
        kt3Var.e = 0;
        kt3Var.h = 0;
        constraintLayout.addView(yfbVar, kt3Var);
        kt3 kt3Var2 = new kt3(0, 0);
        kt3Var2.j = yfbVar.getId();
        kt3Var2.e = 0;
        kt3Var2.h = 0;
        kt3Var2.k = oneMeButton.getId();
        constraintLayout.addView(recyclerView, kt3Var2);
        kt3 kt3Var3 = new kt3(0, -2);
        kt3Var3.e = 0;
        kt3Var3.h = 0;
        kt3Var3.l = 0;
        float f2 = 12;
        kt3Var3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        constraintLayout.addView(oneMeButton, kt3Var3);
        tqi.c(new xc6(3, null, 0), constraintLayout);
        return constraintLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        hbd hbdVar = y0().s0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new yc6(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().x0, getViewLifecycleOwner().p(), l38Var), new zc6(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().u0, getViewLifecycleOwner().p(), l38Var), new ad6(null, this), 1), getViewLifecycleScope());
    }

    public final gd6 y0() {
        return (gd6) this.c.getValue();
    }

    public FoldersPickerScreen(long j) {
        this(gwi.b(new imb("arg_chat_id", Long.valueOf(j))));
    }
}

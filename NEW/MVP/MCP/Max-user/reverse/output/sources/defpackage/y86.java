package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.concurrent.ExecutorService;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class y86 extends y0f {
    public final FolderEditScreen o;

    public y86(ExecutorService executorService, FolderEditScreen folderEditScreen) {
        super(executorService);
        this.o = folderEditScreen;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        int iL = l(i) & 536870911;
        FolderEditScreen folderEditScreen = this.o;
        if (iL == 1) {
            h96 h96Var = (h96) d2fVar;
            h96Var.z((g96) ((t98) C(i)));
            h96Var.F0 = folderEditScreen;
        } else if (iL == 8) {
            f8j.d(((a96) d2fVar).a, 300L, new j6(26, folderEditScreen));
        } else {
            if (iL != 4) {
                super.r(d2fVar, i);
                return;
            }
            oa6 oa6Var = (oa6) d2fVar;
            ha6 ha6Var = (ha6) ((t98) C(i));
            oa6Var.z(ha6Var);
            ((v0b) oa6Var.a).setFirstTrailingIconClickListener(new qn2(folderEditScreen, 16, ha6Var));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (i2 == 1) {
            return new h96(viewGroup);
        }
        if (i2 == 4) {
            return new oa6(new v0b(viewGroup.getContext(), false));
        }
        if (i2 != 2) {
            if (i2 != 8) {
                throw new IllegalArgumentException(wy1.e(i, "Unknown view type ", "!"));
            }
            OneMeButton oneMeButton = new OneMeButton(viewGroup.getContext(), null);
            a96 a96Var = new a96(oneMeButton);
            oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            oneMeButton.setSize(jza.c);
            oneMeButton.setMode(iza.c);
            oneMeButton.setAppearance(gza.b);
            oneMeButton.setText(f5b.h);
            return a96Var;
        }
        o91 o91Var = new o91(0, this.o, x86.class, "onAddChatsClick", "onAddChatsClick()V", 0, 16);
        Context context = viewGroup.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setImageResource(ivd.w);
        TextView textView = new TextView(context);
        dpg.f.b(textView, t75.b);
        textView.setText(f5b.f);
        tqi.c(new uh1(appCompatImageView, textView, null, 2), frameLayout);
        float f = 24;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), 8388627);
        float f2 = 18;
        layoutParams2.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        layoutParams2.rightMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        float f3 = 12;
        layoutParams2.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f3);
        layoutParams2.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f3);
        frameLayout.addView(appCompatImageView, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 8388627);
        layoutParams3.leftMargin = u45.c(f, vw4.d().getDisplayMetrics().density, kti.d(f2 * vw4.d().getDisplayMetrics().density) * 2);
        layoutParams3.rightMargin = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        frameLayout.addView(textView, layoutParams3);
        g86 g86Var = new g86(frameLayout);
        f8j.d(frameLayout, 300L, new j6(25, o91Var));
        return g86Var;
    }
}

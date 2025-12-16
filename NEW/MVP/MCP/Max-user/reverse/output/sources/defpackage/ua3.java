package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class ua3 extends LinearLayout implements u6g {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final OneMeButton c;

    public ua3(FrameLayout frameLayout, final ClearRecentSearchBottomSheet clearRecentSearchBottomSheet, Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(appCompatTextView.getContext().getString(k1b.t));
        dpg.c.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setId(View.generateViewId());
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jza jzaVar = jza.c;
        oneMeButton.setSize(jzaVar);
        iza izaVar = iza.d;
        oneMeButton.setMode(izaVar);
        oneMeButton.setAppearance(gza.b);
        oneMeButton.setText(k1b.s);
        final int i = 0;
        f8j.d(oneMeButton, 300L, new View.OnClickListener() { // from class: ta3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        ClearRecentSearchBottomSheet clearRecentSearchBottomSheet2 = clearRecentSearchBottomSheet;
                        clearRecentSearchBottomSheet2.E0(true);
                        Object targetController = clearRecentSearchBottomSheet2.getTargetController();
                        sa3 sa3Var = targetController instanceof sa3 ? (sa3) targetController : null;
                        if (sa3Var != null) {
                            b43 b43VarZ0 = ((ChatsListSearchScreen) sa3Var).z0();
                            x9f x9fVar = b43VarZ0.T0;
                            if (x9fVar == null || !x9fVar.isActive()) {
                                b43VarZ0.T0 = svi.e(b43VarZ0.a, b43VarZ0.P0, null, new a33(b43VarZ0, null), 2);
                                break;
                            }
                        }
                        break;
                    default:
                        clearRecentSearchBottomSheet.E0(true);
                        break;
                }
            }
        });
        this.b = oneMeButton;
        OneMeButton oneMeButton2 = new OneMeButton(getContext(), null);
        oneMeButton2.setId(View.generateViewId());
        oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton2.setSize(jzaVar);
        oneMeButton2.setMode(izaVar);
        oneMeButton2.setAppearance(gza.d);
        oneMeButton2.setText(mvd.p);
        final int i2 = 1;
        f8j.d(oneMeButton2, 300L, new View.OnClickListener() { // from class: ta3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ClearRecentSearchBottomSheet clearRecentSearchBottomSheet2 = clearRecentSearchBottomSheet;
                        clearRecentSearchBottomSheet2.E0(true);
                        Object targetController = clearRecentSearchBottomSheet2.getTargetController();
                        sa3 sa3Var = targetController instanceof sa3 ? (sa3) targetController : null;
                        if (sa3Var != null) {
                            b43 b43VarZ0 = ((ChatsListSearchScreen) sa3Var).z0();
                            x9f x9fVar = b43VarZ0.T0;
                            if (x9fVar == null || !x9fVar.isActive()) {
                                b43VarZ0.T0 = svi.e(b43VarZ0.a, b43VarZ0.P0, null, new a33(b43VarZ0, null), 2);
                                break;
                            }
                        }
                        break;
                    default:
                        clearRecentSearchBottomSheet.E0(true);
                        break;
                }
            }
        });
        this.c = oneMeButton2;
        setOrientation(1);
        addView(appCompatTextView);
        addView(oneMeButton);
        addView(oneMeButton2);
        float f = 12;
        frameLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(26 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), 0);
    }

    public final OneMeButton getCancel() {
        return this.c;
    }

    public final OneMeButton getConfirm() {
        return this.b;
    }

    public final AppCompatTextView getTitle() {
        return this.a;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setTextColor(yebVar.getText().e);
        this.b.onThemeChanged(yebVar);
        this.c.onThemeChanged(yebVar);
    }
}

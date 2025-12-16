package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.settings.SettingsAvatarBottomSheet;

/* loaded from: classes2.dex */
public final class ane extends LinearLayout implements u6g {
    public final AppCompatTextView a;
    public final AppCompatTextView b;
    public final LinkedHashMap c;

    public ane(SettingsAvatarBottomSheet settingsAvatarBottomSheet, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, Context context) {
        AppCompatTextView appCompatTextView;
        super(context);
        yy7[] yy7VarArr = SettingsAvatarBottomSheet.G0;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null);
        dpg.c.b(appCompatTextView2, t75.b);
        appCompatTextView2.setText(charSequence);
        appCompatTextView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        hs hsVar = settingsAvatarBottomSheet.D0;
        yy7 yy7Var = SettingsAvatarBottomSheet.G0[1];
        layoutParams.bottomMargin = kti.d((((s5g) hsVar.a(settingsAvatarBottomSheet)) == null ? 16 : 12) * vw4.d().getDisplayMetrics().density);
        addView(appCompatTextView2, layoutParams);
        this.a = appCompatTextView2;
        if (charSequence2 != null) {
            appCompatTextView = new AppCompatTextView(getContext(), null);
            dpg.j.b(appCompatTextView, t75.b);
            appCompatTextView.setText(charSequence2);
            appCompatTextView.setGravity(17);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
            addView(appCompatTextView, layoutParams2);
        } else {
            appCompatTextView = null;
        }
        this.b = appCompatTextView;
        int i = to8.i(we3.q(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(i >= 16 ? i : 16);
        for (Object obj : arrayList) {
            zme zmeVar = (zme) obj;
            int i2 = zmeVar.a;
            CharSequence charSequenceB = zmeVar.b.b(getContext());
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), null);
            dpg.y.b(appCompatTextView3, t75.b);
            appCompatTextView3.setText(charSequenceB);
            appCompatTextView3.setGravity(17);
            f8j.d(appCompatTextView3, 300L, new pcc(settingsAvatarBottomSheet, i2));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            float f = 15;
            layoutParams3.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
            layoutParams3.bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
            addView(appCompatTextView3, layoutParams3);
            linkedHashMap.put(appCompatTextView3, obj);
        }
        this.c = linkedHashMap;
        setOrientation(1);
        setGravity(17);
        onThemeChanged(a93.s0.y(this));
    }

    public final Map<TextView, zme> getButtonViews() {
        return this.c;
    }

    public final TextView getDescriptionView() {
        return this.b;
    }

    public final TextView getTitleView() {
        return this.a;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int i;
        this.a.setTextColor(yebVar.getText().e);
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(yebVar.getText().g);
        }
        for (Map.Entry entry : this.c.entrySet()) {
            TextView textView = (TextView) entry.getKey();
            int iV = az1.v(((zme) entry.getValue()).c);
            if (iV == 0) {
                i = yebVar.getText().j;
            } else {
                if (iV != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = yebVar.getText().h;
            }
            textView.setTextColor(i);
        }
    }
}

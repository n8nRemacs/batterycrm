package defpackage;

import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class yqg extends LinearLayout {
    public wqg a;

    private final void setBlockReasonButtons(List<vqg> list) {
        removeAllViews();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            jza jzaVar = jza.c;
            gza gzaVar = gza.c;
            iza izaVar = iza.c;
            int i = 2;
            if (!zHasNext) {
                int i2 = j0b.g2;
                n5g n5gVar = new n5g(m0b.F2);
                vqg vqgVar = new vqg(i2, n5gVar);
                OneMeButton oneMeButton = new OneMeButton(getContext(), null);
                oneMeButton.setId(i2);
                oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                oneMeButton.setAppearance(gzaVar);
                oneMeButton.setSize(jzaVar);
                oneMeButton.setMode(izaVar);
                oneMeButton.setText(n5gVar.d(oneMeButton));
                f8j.d(oneMeButton, 300L, new iq5(this, vqgVar, i, 3));
                addView(oneMeButton);
                return;
            }
            vqg vqgVar2 = (vqg) it.next();
            OneMeButton oneMeButton2 = new OneMeButton(getContext(), null);
            oneMeButton2.setId(vqgVar2.a);
            oneMeButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            oneMeButton2.setAppearance(gzaVar);
            oneMeButton2.setSize(jzaVar);
            oneMeButton2.setMode(izaVar);
            oneMeButton2.setText(vqgVar2.b.d(oneMeButton2));
            f8j.d(oneMeButton2, 300L, new iq5(this, vqgVar2, i, 3));
            addView(oneMeButton2);
        }
    }

    private final void setCallStatusButtons(List<vqg> list) {
        removeAllViews();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            vqg vqgVar = (vqg) obj;
            os1 os1Var = new os1(i, 4);
            OneMeButton oneMeButton = new OneMeButton(getContext(), null);
            oneMeButton.setId(vqgVar.a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            os1Var.invoke(layoutParams);
            oneMeButton.setLayoutParams(layoutParams);
            oneMeButton.setAppearance(gza.c);
            oneMeButton.setSize(jza.c);
            oneMeButton.setMode(iza.b);
            oneMeButton.setText(vqgVar.b.d(oneMeButton));
            f8j.d(oneMeButton, 300L, new iq5(this, vqgVar, 1, 3));
            addView(oneMeButton);
            i = i2;
        }
    }

    public final void a(int i, List list) {
        int i2 = xqg.$EnumSwitchMapping$0[az1.v(i)];
        if (i2 == 1) {
            setCallStatusButtons(list);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            setBlockReasonButtons(list);
        }
    }

    public final void setListener(wqg wqgVar) {
        this.a = wqgVar;
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class d44 extends d2f {
    public final /* synthetic */ int E0 = 3;
    public final Object F0;
    public final Object G0;
    public Object H0;

    public d44(Context context, qk8 qk8Var, ExecutorService executorService, zhf zhfVar) {
        yhf yhfVar = new yhf(context);
        yhfVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        super(yhfVar);
        this.F0 = yhfVar;
        fb6 fb6Var = new fb6(executorService, new znd(zhfVar));
        this.G0 = fb6Var;
        yhfVar.setHeaderClickAction(new sue(this, 3, zhfVar));
        RecyclerView recyclerView = yhfVar.b;
        if (qk8Var != null) {
            recyclerView.k(new a08(5, qk8Var));
        }
        recyclerView.setAdapter(fb6Var);
    }

    @Override // defpackage.d2f
    public void A(t98 t98Var, Object obj) {
        switch (this.E0) {
            case 1:
                if (!(obj instanceof jc9)) {
                    z(t98Var);
                    break;
                } else {
                    x8d x8dVar = ((jc9) obj).a;
                    ((TextView) this.G0).setText(x8dVar != null ? x8dVar.a : null);
                    break;
                }
            default:
                super.A(t98Var, obj);
                break;
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        switch (this.E0) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.H0;
                if ((t98Var instanceof c44) && viewGroup.getChildCount() <= 0) {
                    r8j r8jVar = (r8j) this.F0;
                    Context context = this.a.getContext();
                    List list = ((c44) t98Var).a;
                    em6 em6Var = (em6) this.G0;
                    r8jVar.getClass();
                    viewGroup.addView(r8j.d(context, list, em6Var));
                    break;
                }
                break;
            case 1:
                v0b v0bVar = (v0b) this.F0;
                if (t98Var instanceof kc9) {
                    kc9 kc9Var = (kc9) t98Var;
                    CharSequence charSequence = kc9Var.b;
                    this.H0 = kc9Var;
                    v0bVar.g(kc9Var.a, charSequence, kc9Var.d);
                    v0bVar.setTitle(charSequence);
                    TextView textView = (TextView) this.G0;
                    x8d x8dVar = kc9Var.Z;
                    textView.setText(x8dVar != null ? x8dVar.a : null);
                    break;
                }
                break;
            case 2:
                yhf yhfVar = (yhf) this.F0;
                if (t98Var instanceof dgf) {
                    dgf dgfVar = (dgf) t98Var;
                    List list2 = dgfVar.o;
                    this.H0 = dgfVar;
                    int size = list2.size();
                    String str = String.format(yhfVar.getContext().getResources().getQuantityString(vab.a, size), Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    CharSequence charSequenceB = dgfVar.b.b(yhfVar.getContext());
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    boolean z = dgfVar.Z;
                    int i = z ? wab.b : wab.a;
                    iza izaVar = z ? iza.b : iza.a;
                    aif aifVar = yhfVar.a;
                    aifVar.a.setText(charSequenceB);
                    aifVar.b.setText(str);
                    OneMeButton oneMeButton = aifVar.c;
                    oneMeButton.setText(i);
                    oneMeButton.setMode(izaVar);
                    oneMeButton.setVisibility(0);
                    ((fb6) this.G0).E(list2);
                    break;
                }
                break;
            default:
                ak5 ak5Var = (ak5) t98Var;
                ((TextView) this.F0).setText(ak5Var.a);
                TextView textView2 = (TextView) this.G0;
                StringBuilder sbM = az1.m("completedTasks: ");
                sbM.append(ak5Var.c);
                sbM.append(", activeTasks: ");
                int i2 = ak5Var.d;
                sbM.append(i2);
                sbM.append(", idleThreads: ");
                sbM.append(ak5Var.b);
                sbM.append(", tasksInQueue: ");
                sbM.append(i2);
                textView2.setText(sbM);
                ((TextView) this.H0).setText("isShutdown: " + ak5Var.X + ", isTerminated: " + ak5Var.Y);
                break;
        }
    }

    public d44(Context context, r8j r8jVar, ji9 ji9Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        super(frameLayout);
        this.F0 = r8jVar;
        this.G0 = ji9Var;
        this.H0 = frameLayout;
    }

    public d44(Context context, jx0 jx0Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new xhd(-1, -2));
        v0b v0bVar = new v0b(context, false);
        int i = j7b.G;
        v0bVar.setId(i);
        v0bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 16));
        float f = 24;
        v0bVar.setPadding(0, v0bVar.getPaddingTop(), u45.c(12, vw4.d().getDisplayMetrics().density, kti.d(vw4.d().getDisplayMetrics().density * f)), v0bVar.getPaddingBottom());
        frameLayout.addView(v0bVar);
        TextView textView = new TextView(context);
        int i2 = j7b.H;
        textView.setId(i2);
        int iD = kti.d(f * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(new FrameLayout.LayoutParams(iD, iD, 8388629));
        textView.setGravity(17);
        textView.setTextSize(1, 16.0f);
        frameLayout.addView(textView);
        super(frameLayout);
        this.F0 = (v0b) frameLayout.findViewById(i);
        this.G0 = (TextView) frameLayout.findViewById(i2);
        f8j.d(frameLayout, 300L, new kg6(this, 16, jx0Var));
    }

    public d44(Context context) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(lyc.threads_state_state_view);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(18.0f);
        textView.setTextColor(-16777216);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        float f = 5;
        layoutParams2.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        textView2.setLayoutParams(layoutParams2);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(-16776961);
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        textView3.setLayoutParams(layoutParams3);
        textView3.setTextSize(14.0f);
        textView3.setTextColor(-16776961);
        linearLayout.addView(textView3);
        super(linearLayout);
        this.F0 = (TextView) linearLayout.getChildAt(0);
        this.G0 = (TextView) linearLayout.getChildAt(1);
        this.H0 = (TextView) linearLayout.getChildAt(2);
    }
}

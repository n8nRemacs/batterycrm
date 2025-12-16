package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import java.util.BitSet;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.uikit.common.views.EmptySearchView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class v01 extends d2f {
    public final /* synthetic */ int E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v01(View view, int i) {
        super(view);
        this.E0 = i;
    }

    private final void G(t98 t98Var) {
    }

    private final void H(t98 t98Var) {
    }

    private final void I(t98 t98Var) {
    }

    private final void J(t98 t98Var) {
    }

    private final void K(t98 t98Var) {
    }

    private final void L(t98 t98Var) {
    }

    private final void M(t98 t98Var) {
    }

    private final void N(t98 t98Var) {
    }

    @Override // defpackage.d2f
    public void A(t98 t98Var, Object obj) throws Resources.NotFoundException {
        switch (this.E0) {
            case 3:
                xf1 xf1Var = (xf1) t98Var;
                wf1 wf1Var = obj instanceof wf1 ? (wf1) obj : null;
                View view = this.a;
                if (wf1Var == null) {
                    ((i91) view).setOpponents(xf1Var.b);
                    break;
                } else if (((BitSet) wf1Var.b).get(0)) {
                    ((i91) view).setOpponents(xf1Var.b);
                    break;
                }
                break;
            case 7:
                zf1 zf1Var = (zf1) t98Var;
                in1 in1Var = zf1Var.c;
                yf1 yf1Var = obj instanceof yf1 ? (yf1) obj : null;
                if (yf1Var == null) {
                    F(zf1Var);
                    break;
                } else {
                    BitSet bitSet = (BitSet) yf1Var.b;
                    boolean z = bitSet.get(0);
                    View view2 = this.a;
                    if (z) {
                        view2.setVisibility(in1Var.a() ? 0 : 8);
                        tp1 tp1Var = (tp1) view2;
                        boolean z2 = in1Var.e;
                        if (tp1Var.G0 != z2) {
                            tp1Var.G0 = z2;
                            tp1Var.H0.setEndView(new doe(z2, true));
                        }
                    }
                    if (bitSet.get(1)) {
                        ((tp1) view2).setTitle(zf1Var.b);
                        break;
                    }
                }
                break;
            default:
                super.A(t98Var, obj);
                break;
        }
    }

    public void F(zf1 zf1Var) throws Resources.NotFoundException {
        in1 in1Var = zf1Var.c;
        int i = in1Var.a() ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        tp1 tp1Var = (tp1) view;
        boolean z = in1Var.e;
        if (tp1Var.G0 != z) {
            tp1Var.G0 = z;
            tp1Var.H0.setEndView(new doe(z, true));
        }
        tp1Var.setTitle(zf1Var.b);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) throws Resources.NotFoundException {
        switch (this.E0) {
            case 0:
                if (t98Var instanceof d21) {
                    TextView textView = (TextView) this.a;
                    textView.setText(((d21) t98Var).a.b(textView.getContext()));
                    break;
                }
                break;
            case 1:
                if (t98Var instanceof c21) {
                    TextView textView2 = (TextView) this.a;
                    textView2.setText(((c21) t98Var).a.b(textView2.getContext()));
                    break;
                }
                break;
            case 2:
                if (t98Var instanceof h61) {
                    TextView textView3 = (TextView) this.a;
                    textView3.setText(((h61) t98Var).a.b(textView3.getContext()));
                    break;
                }
                break;
            case 3:
                ((i91) this.a).setOpponents(((xf1) t98Var).b);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                if (t98Var instanceof uj1) {
                    veb vebVar = (veb) this.a;
                    uj1 uj1Var = (uj1) t98Var;
                    s5g s5gVar = uj1Var.a;
                    CharSequence charSequenceB = s5gVar != null ? s5gVar.b(vebVar.getContext()) : null;
                    if (charSequenceB == null || charSequenceB.length() == 0) {
                        vebVar.e();
                    } else {
                        vebVar.h(String.valueOf(charSequenceB), seb.a);
                    }
                    s5g s5gVar2 = uj1Var.b;
                    CharSequence charSequenceB2 = s5gVar2 != null ? s5gVar2.b(vebVar.getContext()) : null;
                    if (charSequenceB2 == null) {
                        charSequenceB2 = "";
                    }
                    if (!dnf.k(vebVar.getText(), charSequenceB2)) {
                        vebVar.setText(charSequenceB2);
                        break;
                    }
                }
                break;
            case 7:
                F((zf1) t98Var);
                break;
            case 8:
                break;
            case 9:
                EmptySearchView emptySearchView = (EmptySearchView) this.a;
                emptySearchView.setTitle(avd.h0);
                emptySearchView.setDescription(avd.g0);
                emptySearchView.setIsButtonVisible(false);
                break;
            case 10:
                break;
            case 11:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                if (t98Var instanceof doa) {
                    TextView textView4 = (TextView) this.a;
                    textView4.setText(((doa) t98Var).a.b(textView4.getContext()));
                    break;
                }
                break;
            case 13:
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                break;
            case 16:
                if (t98Var instanceof k8e) {
                    TextView textView5 = (TextView) this.a;
                    textView5.setText(((k8e) t98Var).a.b(textView5.getContext()));
                    break;
                }
                break;
            case LangUtils.HASH_SEED /* 17 */:
                break;
            case 18:
                if (t98Var instanceof c8e) {
                    TextView textView6 = (TextView) this.a;
                    textView6.setText(((c8e) t98Var).a.b(textView6.getContext()));
                    break;
                }
                break;
            case 19:
                if (t98Var instanceof e8e) {
                    View view = this.a;
                    ((TextView) view).setText(((e8e) t98Var).a.b(((TextView) view).getContext()));
                    break;
                }
                break;
            case 20:
                break;
            case 21:
                if (t98Var instanceof r8e) {
                    TextView textView7 = (TextView) this.a;
                    textView7.setText(((r8e) t98Var).a.b(textView7.getContext()));
                    break;
                }
                break;
            case 22:
                if (t98Var instanceof s8e) {
                    TextView textView8 = (TextView) this.a;
                    textView8.setText(((s8e) t98Var).a.b(textView8.getContext()));
                    break;
                }
                break;
            case 23:
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                if (t98Var instanceof w8e) {
                    TextView textView9 = (TextView) this.a;
                    textView9.setText(((w8e) t98Var).a.b(textView9.getContext()));
                    break;
                }
                break;
            case 25:
            case 26:
                break;
            case 27:
                if (t98Var instanceof b8e) {
                    TextView textView10 = (TextView) this.a;
                    textView10.setText(((b8e) t98Var).a.b(textView10.getContext()));
                    break;
                }
                break;
            case 28:
                break;
            default:
                if (t98Var instanceof cng) {
                    TextView textView11 = (TextView) this.a;
                    textView11.setText(((cng) t98Var).a.b(textView11.getContext()));
                    break;
                }
                break;
        }
    }
}

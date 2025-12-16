package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.e;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.devmenu.tools.server.ServerPortBottomSheet;
import one.me.devmenu.utils.ValueBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* loaded from: classes2.dex */
public final class p3 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(Editable editable) {
    }

    private final void g(Editable editable) {
    }

    private final void h(Editable editable) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, k18] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 2:
                MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) this.b;
                pt8 pt8Var = mediaBarPreviewLayout.S0;
                if (pt8Var != null && editable != null) {
                    ((ActLocalMedias) pt8Var).Q().f.j = editable;
                }
                if (mediaBarPreviewLayout.W0) {
                    mediaBarPreviewLayout.A(mediaBarPreviewLayout.Q0.f.b() > 0);
                    break;
                }
                break;
            case 4:
                fbb fbbVar = (fbb) this.b;
                fbbVar.d = editable;
                ?? r1 = fbbVar.E0;
                if (r1.e()) {
                    ((View) r1.getValue()).setVisibility((editable == null || editable.length() == 0) ? 8 : 0);
                }
                cbb cbbVar = fbbVar.t0;
                if (cbbVar != null) {
                    cbbVar.J(editable);
                    break;
                }
                break;
            case 5:
                em6 em6Var = (em6) this.b;
                CharSequence charSequenceA = editable != null ? kzi.a(editable) : null;
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                em6Var.invoke(charSequenceA);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        x2b x2bVar;
        String str;
        String strA;
        int i4 = this.a;
        Object obj = this.b;
        switch (i4) {
            case 0:
                jxb jxbVarI0 = ((AbstractPickerScreen) obj).I0();
                String string = charSequence != null ? charSequence.toString() : null;
                tcf tcfVar = jxbVarI0.s0;
                if (string == null) {
                    string = "";
                }
                tcfVar.m(null, string);
                break;
            case 1:
                yy7[] yy7VarArr = LogsViewerScreen.X;
                sj8 sj8VarY0 = ((LogsViewerScreen) obj).y0();
                if (charSequence != null) {
                    sj8VarY0.getClass();
                    if (!vmf.F(charSequence)) {
                        sj8VarY0.s0.O(sj8VarY0, sj8.u0[0], svi.d(sj8VarY0.a, ((q2b) sj8VarY0.c).b(), i84.b, new rj8(sj8VarY0, charSequence, null)));
                        sj8VarY0.u();
                        break;
                    }
                }
                sj8VarY0.s0.O(sj8VarY0, sj8.u0[0], null);
                sj8VarY0.Z.m(null, hd5.a);
                break;
            case 2:
                break;
            case 3:
                j8b j8bVar = (j8b) obj;
                EditText editText = j8bVar.v0;
                if (i3 > 1 && !j8bVar.o && (x2bVar = j8bVar.c) != null && (str = x2bVar.a) != null) {
                    String strValueOf = String.valueOf(charSequence);
                    i8b phoneFormatterProvider = j8bVar.getPhoneFormatterProvider();
                    if (phoneFormatterProvider != null && (strA = phoneFormatterProvider.a(str, strValueOf)) != null) {
                        strValueOf = strA;
                    }
                    editText.removeTextChangedListener(j8bVar.w0);
                    j8bVar.setText(strValueOf);
                    editText.addTextChangedListener(j8bVar.w0);
                    break;
                }
                break;
            case 4:
            case 5:
                break;
            case 6:
                veb vebVar = (veb) obj;
                veb.b(vebVar, vebVar.getEndIconDrawable());
                veb.c(vebVar, vebVar.getMaxLengthForLabel(), charSequence != null ? charSequence.length() : 0);
                veb.a(vebVar);
                w3b w3bVar = vebVar.a;
                if (vebVar.getTypingMode() == teb.b && !(w3bVar.getTransformationMethod() instanceof PasswordTransformationMethod) && fni.a(vebVar.getEndIconDrawable(), vebVar.d)) {
                    w3bVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    break;
                }
                break;
            case 7:
                ((e) obj).onTextChanged(charSequence);
                break;
            case 8:
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                ((OneMeButton) serverHostBottomSheet.J0.D(serverHostBottomSheet, ServerHostBottomSheet.K0[4])).setEnabled(((charSequence == null || charSequence.length() == 0) ? 1 : 0) ^ 1);
                break;
            case 9:
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) obj;
                ((OneMeButton) serverPortBottomSheet.E0.D(serverPortBottomSheet, ServerPortBottomSheet.F0[1])).setEnabled(((charSequence == null || charSequence.length() == 0) ? 1 : 0) ^ 1);
                break;
            default:
                ValueBottomSheet valueBottomSheet = (ValueBottomSheet) obj;
                ((OneMeButton) valueBottomSheet.G0.D(valueBottomSheet, ValueBottomSheet.H0[3])).setEnabled(((charSequence == null || charSequence.length() == 0) ? 1 : 0) ^ 1);
                break;
        }
    }
}

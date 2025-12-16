package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public final class jc5 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ jc5(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        apg[] apgVarArr;
        switch (this.a) {
            case 0:
                if (!TextUtils.isEmpty(editable) && !this.b) {
                    this.b = true;
                    String string = editable.toString();
                    if (!TextUtils.isEmpty(string)) {
                        for (CharSequence charSequence : ((vb5) this.c).c(string)) {
                            int iIndexOf = string.indexOf(charSequence.toString());
                            if (iIndexOf >= 0 && ((apgVarArr = (apg[]) editable.getSpans(iIndexOf, charSequence.length() + iIndexOf, apg.class)) == null || apgVarArr.length <= 0)) {
                                editable.replace(iIndexOf, charSequence.length() + iIndexOf, charSequence);
                            }
                        }
                    }
                    this.b = false;
                    break;
                }
                break;
            default:
                v1a v1aVar = a93.s0;
                ik9 ik9Var = (ik9) this.c;
                if (editable != null) {
                    wvi.d(editable);
                }
                Object[] spans = null;
                ik9Var.L0.m(null, Integer.valueOf(ik9Var.d.getSelectionEnd()));
                ik9Var.J0.setValue(editable != null ? kzi.a(editable) : null);
                if (editable == null || vmf.F(editable) || !this.b) {
                    ik9Var.k(v1aVar.y(ik9Var));
                }
                if (editable != null) {
                    try {
                        spans = editable.getSpans(0, editable.length(), me.class);
                    } catch (Throwable unused) {
                    }
                    if (spans == null) {
                        spans = new me[0];
                    }
                    for (me meVar : (me[]) spans) {
                        ((pk) meVar).b.start();
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b = !(charSequence == null || vmf.F(charSequence));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }
}

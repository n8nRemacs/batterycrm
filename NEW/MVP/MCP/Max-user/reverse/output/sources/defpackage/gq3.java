package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes2.dex */
public final /* synthetic */ class gq3 implements InputFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ gq3(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (!hq3.b.a(charSequence)) {
                    break;
                }
                break;
            default:
                yy7[] yy7VarArr = ik9.Q0;
                break;
        }
        return "";
    }
}

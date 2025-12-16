package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ri extends AppCompatEditText {
    public boolean t0;
    public hk[] u0;

    public ri(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new qi(0, this);
        super.setLayerType(1, null);
    }

    public final boolean getAnimojiEnabled() {
        return this.t0;
    }

    public final hk[] getCachedSpans$animoji_release() {
        return this.u0;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hk[] hkVarArr = this.u0;
        if (hkVarArr == null || hkVarArr.length <= 0) {
            return;
        }
        hkVarArr[0].getClass();
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z = wh.b;
        if (z) {
            wh.a("AnimojiEditText", "---> onDraw start");
        }
        super.onDraw(canvas);
        if (z) {
            wh.a("AnimojiEditText", "<--- onDraw finish");
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        hk[] hkVarArr;
        Spanned spanned;
        if (wh.c == null || !this.t0) {
            return;
        }
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            hk[] hkVarArr2 = this.u0;
            if (hkVarArr2 != null && hkVarArr2.length > 0) {
                hkVarArr2[0].getClass();
                throw null;
            }
            ssi.o(spannable, hk.class, 0, spannable.length());
        }
        try {
            ta5.a().g(charSequence);
        } catch (Throwable th) {
            Log.e("AnimojiEditText", "fail to process emojis", th);
        }
        vj vjVar = wh.c;
        if (charSequence != null && charSequence.length() != 0 && (charSequence instanceof Spannable)) {
            List listA = vjVar.a(charSequence);
            boolean zIsEmpty = listA.isEmpty();
            if (a() != zIsEmpty) {
                setEmojiCompatEnabled(zIsEmpty);
            }
            Spannable spannable2 = (Spannable) charSequence;
            ArrayList arrayList = new ArrayList();
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                throw ctd.h(it);
            }
            rqi.a(spannable2, arrayList, vjVar);
            rqi.d(charSequence);
        }
        if (charSequence != null) {
            int length = charSequence.length();
            try {
                spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
            } catch (Throwable unused) {
            }
            Object[] spans = spanned != null ? spanned.getSpans(0, length, hk.class) : null;
            hkVarArr = (hk[]) spans;
        } else {
            hkVarArr = null;
        }
        this.u0 = hkVarArr;
        if (hkVarArr == null || hkVarArr.length <= 0) {
            return;
        }
        hkVarArr[0].getClass();
        throw null;
    }

    public final void setAnimojiEnabled(boolean z) {
        if (this.t0 != z) {
            Editable text = getText();
            if (text != null) {
                onTextChanged(text, 0, text.length(), text.length());
            }
            this.t0 = z;
        }
    }

    public final void setCachedSpans$animoji_release(hk[] hkVarArr) {
        this.u0 = hkVarArr;
    }

    @Override // android.view.View
    public final void setLayerType(int i, Paint paint) {
        super.setLayerType(1, paint);
    }
}

package ru.ok.tamtam.animoji.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.imb;
import defpackage.k;
import defpackage.qk;
import defpackage.sk;
import defpackage.wh;
import java.io.IOException;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tamtam/animoji/views/AnimojiTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", SdkMetricStatEvent.VALUE_KEY, "getAnimojiEnabled", "()Z", "setAnimojiEnabled", "(Z)V", "animojiEnabled", "animoji_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"WrongCall"})
/* loaded from: classes2.dex */
public class AnimojiTextView extends AppCompatTextView {
    public final sk u0;
    public imb v0;

    public AnimojiTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void i(AnimojiTextView animojiTextView, CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public static void j(AnimojiTextView animojiTextView, Canvas canvas) {
        super.onDraw(canvas);
    }

    public final boolean getAnimojiEnabled() {
        sk skVar = this.u0;
        if (skVar != null) {
            return skVar.b;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) throws IOException {
        sk skVar = this.u0;
        if (skVar != null) {
            boolean z = wh.b;
            if (z) {
                wh.a("AnimojiTextView", "---> onDraw start");
            }
            ((k) skVar.X).invoke(canvas);
            if (z) {
                wh.a("AnimojiTextView", "<--- onDraw finish");
            }
        }
    }

    public final void setAnimojiEnabled(boolean z) {
        sk skVar = this.u0;
        if (skVar != null) {
            skVar.b = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setText(java.lang.CharSequence r10, android.widget.TextView.BufferType r11) {
        /*
            r9 = this;
            sk r0 = r9.u0
            if (r0 != 0) goto Lf
            super.setText(r10, r11)
            imb r0 = new imb
            r0.<init>(r10, r11)
            r9.v0 = r0
            return
        Lf:
            java.lang.Object r1 = r0.d
            ru.ok.tamtam.animoji.views.AnimojiTextView r1 = (ru.ok.tamtam.animoji.views.AnimojiTextView) r1
            java.lang.Object r2 = r0.o
            qk r2 = (defpackage.qk) r2
            if (r10 == 0) goto Lb9
            boolean r3 = defpackage.vmf.F(r10)
            if (r3 == 0) goto L21
            goto Lb9
        L21:
            boolean r3 = r0.b
            if (r3 != 0) goto L27
            goto Lb9
        L27:
            vj r3 = defpackage.wh.c
            int r4 = r10.length()
            r5 = 0
            r6 = 0
            boolean r7 = r10 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L40
            if (r7 == 0) goto L37
            r7 = r10
            android.text.Spanned r7 = (android.text.Spanned) r7     // Catch: java.lang.Throwable -> L40
            goto L38
        L37:
            r7 = r6
        L38:
            if (r7 == 0) goto L40
            java.lang.Class<apg> r8 = defpackage.apg.class
            java.lang.Object[] r6 = r7.getSpans(r5, r4, r8)     // Catch: java.lang.Throwable -> L40
        L40:
            if (r6 == 0) goto L48
            int r4 = r6.length
            if (r4 != 0) goto L46
            goto L48
        L46:
            r4 = r10
            goto L5e
        L48:
            ta5 r4 = defpackage.ta5.a()     // Catch: java.lang.Throwable -> L51
            java.lang.CharSequence r4 = r4.g(r10)     // Catch: java.lang.Throwable -> L51
            goto L58
        L51:
            r4 = move-exception
            ipd r6 = new ipd
            r6.<init>(r4)
            r4 = r6
        L58:
            boolean r6 = r4 instanceof defpackage.ipd
            if (r6 == 0) goto L5e
            goto L46
        L5e:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 != 0) goto L66
            r2.invoke(r10, r11)
            goto Lb3
        L66:
            java.util.List r10 = r3.a(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r10 = r10.iterator()
            boolean r6 = r10.hasNext()
            if (r6 != 0) goto Lb4
            boolean r10 = r4 instanceof android.text.Spannable
            if (r10 != 0) goto L7e
            goto Lb0
        L7e:
            boolean r10 = r1.a()
            if (r10 == 0) goto L87
            r1.setEmojiCompatEnabled(r5)
        L87:
            boolean r10 = r3.isEmpty()
            r10 = r10 ^ 1
            r0.c = r10
            boolean r10 = r3.isEmpty()
            if (r10 != 0) goto La5
            java.lang.Object r10 = r0.Y
            xj r10 = (defpackage.xj) r10
            if (r10 != 0) goto La5
            xj r10 = new xj
            r10.<init>(r1)
            r0.Y = r10
            r10.a()
        La5:
            r10 = r4
            android.text.Spannable r10 = (android.text.Spannable) r10
            vj r0 = defpackage.wh.c
            defpackage.rqi.a(r10, r3, r0)
            defpackage.rqi.d(r4)
        Lb0:
            r2.invoke(r4, r11)
        Lb3:
            return
        Lb4:
            java.lang.ClassCastException r10 = defpackage.ctd.h(r10)
            throw r10
        Lb9:
            r2.invoke(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.animoji.views.AnimojiTextView.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }

    public AnimojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.u0 = new sk(this, new qk(0, this), new k(9, this));
        imb imbVar = this.v0;
        if (imbVar != null) {
            setText((CharSequence) imbVar.a, (TextView.BufferType) imbVar.b);
        }
        this.v0 = null;
    }
}

package com.avito.android.util;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import kotlin.Metadata;

/* compiled from: TextViews.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class I5 {
    @X41.j
    public static final void a(@Y61.k TextView textView, @Y61.l CharSequence charSequence, boolean z12) {
        if (charSequence != null && charSequence.length() != 0) {
            D6.H(textView);
            textView.setText(charSequence);
        } else if (z12) {
            D6.g(textView);
        } else {
            D6.w(textView);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void b(@Y61.k TextView textView, @Y61.l Y41.a<kotlin.G0> aVar) {
        textView.setOnTouchListener(new L91.p(textView, aVar));
    }

    public static final void c(@Y61.k TextView textView, @Y61.l Y41.a<kotlin.G0> aVar) {
        if (aVar != null) {
            textView.setOnClickListener(new H5(0, aVar));
        } else {
            textView.setOnClickListener(null);
            textView.setClickable(false);
        }
    }

    public static void d(TextView textView, Drawable drawable, Drawable drawable2, int i12) {
        if ((i12 & 1) != 0) {
            drawable = null;
        }
        if ((i12 & 4) != 0) {
            drawable2 = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.widget.TextView r3, java.lang.Integer r4, java.lang.Integer r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            r6 = 0
            if (r4 == 0) goto L21
            int r4 = r4.intValue()
            android.graphics.drawable.Drawable[] r0 = r3.getCompoundDrawables()
            r0 = r0[r6]
            if (r0 == 0) goto L1e
            com.avito.android.util.V0.d(r0, r4)
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 != 0) goto L27
        L21:
            android.graphics.drawable.Drawable[] r4 = r3.getCompoundDrawables()
            r0 = r4[r6]
        L27:
            android.graphics.drawable.Drawable[] r4 = r3.getCompoundDrawables()
            r6 = 1
            r4 = r4[r6]
            r6 = 2
            if (r5 == 0) goto L43
            int r5 = r5.intValue()
            android.graphics.drawable.Drawable[] r2 = r3.getCompoundDrawables()
            r2 = r2[r6]
            if (r2 == 0) goto L41
            com.avito.android.util.V0.d(r2, r5)
            r1 = r2
        L41:
            if (r1 != 0) goto L49
        L43:
            android.graphics.drawable.Drawable[] r5 = r3.getCompoundDrawables()
            r1 = r5[r6]
        L49:
            android.graphics.drawable.Drawable[] r5 = r3.getCompoundDrawables()
            r6 = 3
            r5 = r5[r6]
            r3.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.I5.e(android.widget.TextView, java.lang.Integer, java.lang.Integer, int):void");
    }
}

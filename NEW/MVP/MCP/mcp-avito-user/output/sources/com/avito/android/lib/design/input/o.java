package com.avito.android.lib.design.input;

import android.text.InputFilter;
import android.text.Spanned;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InputFilterUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/input/o;", "", "<init>", "()V", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o {

    /* compiled from: InputFilterUtils.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/input/o$a;", "Landroid/text/InputFilter;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InputFilter {
        @Override // android.text.InputFilter
        @Y61.l
        public final CharSequence filter(@Y61.l CharSequence charSequence, int i12, int i13, @Y61.k Spanned spanned, int i14, int i15) throws IOException {
            Boolean boolValueOf;
            boolean z12;
            if (charSequence != null) {
                int i16 = 0;
                while (true) {
                    if (i16 >= charSequence.length()) {
                        z12 = true;
                        break;
                    }
                    if (Character.isWhitespace(charSequence.charAt(i16))) {
                        z12 = false;
                        break;
                    }
                    i16++;
                }
                boolValueOf = Boolean.valueOf(z12);
            } else {
                boolValueOf = null;
            }
            if (L.f(boolValueOf, Boolean.TRUE)) {
                return null;
            }
            if ((charSequence == null || charSequence.length() == 0) && spanned.length() != 1) {
                return spanned.subSequence(i14, i15);
            }
            if (charSequence == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            int length = charSequence.length();
            for (int i17 = 0; i17 < length; i17++) {
                char cCharAt = charSequence.charAt(i17);
                if (!Character.isWhitespace(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            return sb2;
        }
    }

    /* compiled from: InputFilterUtils.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/input/o$b;", "Landroid/text/InputFilter;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InputFilter {
        /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
        @Override // android.text.InputFilter
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.CharSequence filter(@Y61.l java.lang.CharSequence r1, int r2, int r3, @Y61.k android.text.Spanned r4, int r5, int r6) throws java.io.IOException {
            /*
                r0 = this;
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L19
                r4 = r3
            L5:
                int r5 = r1.length()
                if (r4 >= r5) goto L36
                char r5 = r1.charAt(r4)
                boolean r5 = java.lang.Character.isLetterOrDigit(r5)
                if (r5 != 0) goto L16
                goto L19
            L16:
                int r4 = r4 + 1
                goto L5
            L19:
                if (r1 == 0) goto L36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int r4 = r1.length()
            L24:
                if (r3 >= r4) goto L36
                char r5 = r1.charAt(r3)
                boolean r6 = java.lang.Character.isLetterOrDigit(r5)
                if (r6 == 0) goto L33
                r2.append(r5)
            L33:
                int r3 = r3 + 1
                goto L24
            L36:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.input.o.b.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
        }
    }

    static {
        new o();
    }
}

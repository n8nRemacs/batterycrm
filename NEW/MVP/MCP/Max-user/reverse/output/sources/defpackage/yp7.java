package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

/* loaded from: classes2.dex */
public final class yp7 implements TextWatcher {
    public int X;
    public final boolean Y;
    public final aub a;
    public boolean c;
    public dt d;
    public int o;
    public boolean b = false;
    public int Z = 0;
    public int s0 = 0;

    public yp7(aub aubVar, String str, int i, int i2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        this.a = aubVar;
        b(i, str);
        this.Y = true;
        this.X = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(android.text.Editable r12) {
        /*
            r11 = this;
            dt r0 = r11.d
            r0.f()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "+"
            r0.<init>(r1)
            int r1 = r11.o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 48
            r2 = 0
            boolean r3 = r11.Y
            if (r3 != 0) goto L28
            int r4 = r12.length()
            if (r4 <= 0) goto L37
            char r4 = r12.charAt(r2)
            if (r4 == r1) goto L37
        L28:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
        L37:
            int r4 = r12.length()
            java.lang.String r5 = ""
            r6 = r2
            r7 = r6
            r8 = r5
        L40:
            if (r6 >= r4) goto L58
            char r9 = r12.charAt(r6)
            boolean r10 = android.telephony.PhoneNumberUtils.isNonSeparator(r9)
            if (r10 == 0) goto L55
            if (r7 == 0) goto L54
            dt r8 = r11.d
            java.lang.String r8 = r8.h(r7)
        L54:
            r7 = r9
        L55:
            int r6 = r6 + 1
            goto L40
        L58:
            if (r7 == 0) goto L60
            dt r4 = r11.d
            java.lang.String r8 = r4.h(r7)
        L60:
            java.lang.String r4 = r8.trim()
            r6 = 32
            if (r3 != 0) goto L74
            int r3 = r12.length()
            if (r3 == 0) goto L74
            char r12 = r12.charAt(r2)
            if (r12 == r1) goto L9d
        L74:
            int r12 = r4.length()
            int r1 = r0.length()
            if (r12 <= r1) goto L9c
            int r12 = r0.length()
            char r12 = r4.charAt(r12)
            if (r12 != r6) goto L93
            int r12 = r0.length()
            int r12 = r12 + 1
            java.lang.String r4 = r4.substring(r12)
            goto L9d
        L93:
            int r12 = r0.length()
            java.lang.String r4 = r4.substring(r12)
            goto L9d
        L9c:
            r4 = r5
        L9d:
            r12 = 45
            java.lang.String r12 = r4.replace(r12, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto Laa
            return r5
        Laa:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp7.a(android.text.Editable):java.lang.String");
    }

    @Override // android.text.TextWatcher
    public final synchronized void afterTextChanged(Editable editable) {
        try {
            if (this.b) {
                return;
            }
            int selectionEnd = Selection.getSelectionEnd(editable);
            int i = 0;
            for (int i2 = 0; i2 < editable.length(); i2++) {
                if (PhoneNumberUtils.isNonSeparator(editable.charAt(i2))) {
                    i++;
                }
            }
            int i3 = this.X;
            if (i > i3) {
                int i4 = i - i3;
                int iMax = Math.max(this.Z + this.s0, 1) - 1;
                this.b = true;
                while (iMax < editable.length() && i4 > 0) {
                    if (PhoneNumberUtils.isNonSeparator(editable.charAt(iMax))) {
                        editable.delete(iMax, iMax + 1);
                        i4--;
                    } else {
                        iMax++;
                    }
                }
                this.b = false;
                return;
            }
            if (this.c) {
                this.c = editable.length() != 0;
                return;
            }
            boolean z = selectionEnd == editable.length();
            String strA = a(editable);
            if (!strA.equals(editable.toString())) {
                if (!z) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < editable.length() && i6 < selectionEnd; i6++) {
                        if (PhoneNumberUtils.isNonSeparator(editable.charAt(i6))) {
                            i5++;
                        }
                    }
                    selectionEnd = 0;
                    int i7 = 0;
                    while (true) {
                        if (selectionEnd >= strA.length()) {
                            selectionEnd = 0;
                            break;
                        } else {
                            if (i7 == i5) {
                                break;
                            }
                            if (PhoneNumberUtils.isNonSeparator(strA.charAt(selectionEnd))) {
                                i7++;
                            }
                            selectionEnd++;
                        }
                    }
                } else {
                    selectionEnd = strA.length();
                }
            }
            if (!z) {
                while (true) {
                    int i8 = selectionEnd - 1;
                    if (i8 > 0 && !PhoneNumberUtils.isNonSeparator(strA.charAt(i8))) {
                        selectionEnd--;
                    }
                }
            }
            try {
                this.b = true;
                editable.replace(0, editable.length(), strA, 0, strA.length());
                this.b = false;
                Selection.setSelection(editable, selectionEnd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(int i, String str) {
        this.o = i;
        aub aubVar = this.a;
        aubVar.getClass();
        dt dtVar = new dt(aubVar, str);
        this.d = dtVar;
        dtVar.f();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b || this.c || i2 <= 0) {
            return;
        }
        for (int i4 = i; i4 < i + i2; i4++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                this.c = true;
                this.d.f();
                return;
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.Z = i;
        this.s0 = i3;
        if (this.b || this.c || i3 <= 0) {
            return;
        }
        for (int i4 = i; i4 < i + i3; i4++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                this.c = true;
                this.d.f();
                return;
            }
        }
    }
}

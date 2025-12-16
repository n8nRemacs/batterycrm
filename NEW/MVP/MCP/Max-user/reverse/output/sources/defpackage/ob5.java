package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class ob5 implements t98 {
    public final long X;
    public final int Y;
    public final long Z;
    public final int a;
    public final int b;
    public final CharSequence c;
    public final List d;
    public final Drawable o;

    public ob5(int i, int i2, CharSequence charSequence, List list, Drawable drawable, long j) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.d = list;
        this.o = drawable;
        this.X = j;
        this.Y = dab.a;
        this.Z = j != 0 ? (BuildConfig.MAX_TIME_TO_UPLOAD - Math.abs(j)) - i : i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob5)) {
            return false;
        }
        ob5 ob5Var = (ob5) obj;
        return this.a == ob5Var.a && this.b == ob5Var.b && fni.a(this.c, ob5Var.c) && fni.a(this.d, ob5Var.d) && fni.a(this.o, ob5Var.o) && this.X == ob5Var.X;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.Z;
    }

    public final int hashCode() {
        int iL = xrf.l(this.d, u45.g(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        Drawable drawable = this.o;
        return Long.hashCode(this.X) + ((iL + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.Y;
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("EmojiModel(groupIndex=", this.a, ", itemIndex=", this.b, ", defaultValue=");
        sbK.append((Object) this.c);
        sbK.append(", values=");
        sbK.append(this.d);
        sbK.append(", drawable=");
        sbK.append(this.o);
        sbK.append(", animojiId=");
        sbK.append(this.X);
        sbK.append(")");
        return sbK.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ob5(int r9, int r10, java.lang.CharSequence r11, java.util.ArrayList r12, android.graphics.drawable.Drawable r13, long r14, int r16) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L6
            hd5 r12 = defpackage.hd5.a
        L6:
            r4 = r12
            r12 = r16 & 32
            if (r12 == 0) goto L14
            r0 = 0
            r6 = r0
            r2 = r10
            r3 = r11
            r5 = r13
            r0 = r8
            r1 = r9
            goto L1a
        L14:
            r6 = r14
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
        L1a:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob5.<init>(int, int, java.lang.CharSequence, java.util.ArrayList, android.graphics.drawable.Drawable, long, int):void");
    }
}

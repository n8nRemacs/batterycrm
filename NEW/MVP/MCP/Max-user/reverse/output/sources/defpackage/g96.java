package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class g96 implements t98 {
    public final s5g a;
    public final boolean b;
    public final int c;
    public final int d;

    public g96(int i, s5g s5gVar, boolean z) {
        this.a = s5gVar;
        this.b = z;
        this.c = i;
        this.d = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g96)) {
            return false;
        }
        g96 g96Var = (g96) obj;
        return fni.a(this.a, g96Var.a) && this.b == g96Var.b && this.c == g96Var.c;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public final int hashCode() {
        s5g s5gVar = this.a;
        return Integer.hashCode(this.c) + a9h.b((s5gVar == null ? 0 : s5gVar.hashCode()) * 31, 31, this.b);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderEditNameInputItem(defaultValue=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", nameLengthLimit=");
        return ho7.j(sb, this.c, ")");
    }

    public /* synthetic */ g96(r5g r5gVar, boolean z) {
        this(20, r5gVar, z);
    }
}

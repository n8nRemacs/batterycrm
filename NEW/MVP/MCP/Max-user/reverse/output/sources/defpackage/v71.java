package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class v71 implements t98 {
    public final long a;
    public final SpannableStringBuilder b;
    public final long c;
    public final int d = eyc.call_event_view_item;

    public v71(long j, SpannableStringBuilder spannableStringBuilder) {
        this.a = j;
        this.b = spannableStringBuilder;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v71)) {
            return false;
        }
        v71 v71Var = (v71) obj;
        return this.a == v71Var.a && this.b.equals(v71Var.b);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return this.d;
    }

    public final String toString() {
        return "CallEventItemView(id=" + this.a + ", text=" + ((Object) this.b) + ")";
    }
}

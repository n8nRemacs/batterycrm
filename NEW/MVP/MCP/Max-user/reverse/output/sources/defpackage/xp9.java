package defpackage;

/* loaded from: classes2.dex */
public final class xp9 implements eq9 {
    public final long a;

    public xp9(long j) {
        this.a = j;
    }

    @Override // defpackage.eq9
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp9) && this.a == ((xp9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.eq9
    public final long j() {
        return this.a;
    }

    public final String toString() {
        return a9h.d(this.a, "OnUnsupportedAttachButtonClick(messageId=", ", isSkippableForMultiSelect=true)");
    }
}

package defpackage;

/* loaded from: classes2.dex */
public final class p64 implements o64 {
    public String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p64) && fni.a(this.a, ((p64) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho7.i("ConversationIdProviderImpl(conversationId=", this.a, ")");
    }
}

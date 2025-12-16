package defpackage;

/* loaded from: classes2.dex */
public final class qid implements w74 {
    public final j9a a;

    public qid(j9a j9aVar) {
        this.a = j9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qid) && fni.a(this.a, ((qid) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReentrantMutexContextKey(mutex=" + this.a + ")";
    }
}

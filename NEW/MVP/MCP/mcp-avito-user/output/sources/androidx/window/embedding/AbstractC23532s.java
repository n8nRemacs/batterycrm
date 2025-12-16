package androidx.window.embedding;

import kotlin.Metadata;

/* compiled from: EmbeddingRule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/s;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.window.embedding.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC23532s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f55251a;

    public AbstractC23532s(@Y61.l String str) {
        this.f55251a = str;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC23532s)) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f55251a, ((AbstractC23532s) obj).f55251a);
    }

    public int hashCode() {
        String str = this.f55251a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}

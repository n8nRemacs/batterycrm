package z90;

import kotlin.Metadata;

/* compiled from: ProfileTabV1Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lz90/D;", "", "Lz90/E;", "action", "", "title", "<init>", "(Lz90/E;Ljava/lang/String;)V", "Lz90/E;", "a", "()Lz90/E;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class D {

    @com.google.gson.annotations.c("action")
    @Y61.k
    private final E action;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public D(@Y61.k E e12, @Y61.k String str) {
        this.action = e12;
        this.title = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final E getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

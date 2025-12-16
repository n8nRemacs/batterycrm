package KZ;

import kotlin.Metadata;

/* compiled from: ApplicationMortgageProgressItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKZ/w;", "", "", "title", "description", "LKZ/x;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;LKZ/x;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "LKZ/x;", "a", "()LKZ/x;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class w {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final x action;

    @com.google.gson.annotations.c("description")
    @Y61.k
    private final String description;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public w(@Y61.k String str, @Y61.k String str2, @Y61.l x xVar) {
        this.title = str;
        this.description = str2;
        this.action = xVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final x getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.L.f(this.title, wVar.title) && kotlin.jvm.internal.L.f(this.description, wVar.description) && kotlin.jvm.internal.L.f(this.action, wVar.action);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.title.hashCode() * 31, 31, this.description);
        x xVar = this.action;
        return iD2 + (xVar == null ? 0 : xVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ApplicationMortgageProgressStep(title=" + this.title + ", description=" + this.description + ", action=" + this.action + ')';
    }
}

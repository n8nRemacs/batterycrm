package tM0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2Result.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LtM0/h;", "", "", "type", "title", "", "selected", "LtM0/i;", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLtM0/i;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Z", "b", "()Z", "LtM0/i;", "a", "()LtM0/i;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    @com.google.gson.annotations.c("content")
    @k
    private final i content;

    @com.google.gson.annotations.c("selected")
    private final boolean selected;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("type")
    @k
    private final String type;

    public h(@k String str, @k String str2, boolean z12, @k i iVar) {
        this.type = str;
        this.title = str2;
        this.selected = z12;
        this.content = iVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final i getContent() {
        return this.content;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.type, hVar.type) && L.f(this.title, hVar.title) && this.selected == hVar.selected && L.f(this.content, hVar.content);
    }

    public final int hashCode() {
        return this.content.hashCode() + r.i(H.d(this.type.hashCode() * 31, 31, this.title), 31, this.selected);
    }

    @k
    public final String toString() {
        return "VasUnionV2Tab(type=" + this.type + ", title=" + this.title + ", selected=" + this.selected + ", content=" + this.content + ')';
    }
}

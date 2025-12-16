package cX;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsField.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LcX/c;", "LcX/a;", "", "title", "", "content", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cX.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C27117c implements InterfaceC27115a {

    @com.google.gson.annotations.c("content")
    @l
    private final List<InterfaceC27115a> content;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public C27117c(@l String str, @l List<? extends InterfaceC27115a> list) {
        this.title = str;
        this.content = list;
    }

    @l
    public final List<InterfaceC27115a> a() {
        return this.content;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27117c)) {
            return false;
        }
        C27117c c27117c = (C27117c) obj;
        return L.f(this.title, c27117c.title) && L.f(this.content, c27117c.content);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<InterfaceC27115a> list = this.content;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollapseField(title=");
        sb2.append(this.title);
        sb2.append(", content=");
        return H.p(sb2, this.content, ')');
    }
}

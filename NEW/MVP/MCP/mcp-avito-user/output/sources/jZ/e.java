package JZ;

import KZ.C14285o;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationResponse.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJZ/e;", "", "LJZ/c;", "header", "", "LKZ/o;", "content", "LJZ/d;", "metaInfo", "<init>", "(LJZ/c;Ljava/util/List;LJZ/d;)V", "LJZ/c;", "b", "()LJZ/c;", "Ljava/util/List;", "a", "()Ljava/util/List;", "LJZ/d;", "c", "()LJZ/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    @com.google.gson.annotations.c("content")
    @Y61.k
    private final List<C14285o> content;

    @com.google.gson.annotations.c("header")
    @Y61.k
    private final c header;

    @com.google.gson.annotations.c("metaInfo")
    @Y61.k
    private final d metaInfo;

    public e(@Y61.k c cVar, @Y61.k List<C14285o> list, @Y61.k d dVar) {
        this.header = cVar;
        this.content = list;
        this.metaInfo = dVar;
    }

    @Y61.k
    public final List<C14285o> a() {
        return this.content;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final c getHeader() {
        return this.header;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final d getMetaInfo() {
        return this.metaInfo;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.header, eVar.header) && L.f(this.content, eVar.content) && L.f(this.metaInfo, eVar.metaInfo);
    }

    public final int hashCode() {
        return this.metaInfo.hashCode() + H.e(this.header.hashCode() * 31, 31, this.content);
    }

    @Y61.k
    public final String toString() {
        return "ApplicationResponse(header=" + this.header + ", content=" + this.content + ", metaInfo=" + this.metaInfo + ')';
    }
}

package tM0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.vas_union.remote.model.VasPerformanceItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2Result.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LtM0/e;", "", "", "id", "", "title", "", "selected", "", "Lcom/avito/android/vas_union/remote/model/VasPerformanceItem;", "list", "<init>", "(ILjava/lang/String;ZLjava/util/List;)V", "I", "a", "()I", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Z", "c", "()Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e {

    @com.google.gson.annotations.c("id")
    private final int id;

    @com.google.gson.annotations.c("list")
    @k
    private final List<VasPerformanceItem> list;

    @com.google.gson.annotations.c("selected")
    private final boolean selected;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public e(int i12, @k String str, boolean z12, @k List<VasPerformanceItem> list) {
        this.id = i12;
        this.title = str;
        this.selected = z12;
        this.list = list;
    }

    /* renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @k
    public final List<VasPerformanceItem> b() {
        return this.list;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.id == eVar.id && L.f(this.title, eVar.title) && this.selected == eVar.selected && L.f(this.list, eVar.list);
    }

    public final int hashCode() {
        return this.list.hashCode() + r.i(H.d(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.selected);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasPerformanceTabForDuration(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", selected=");
        sb2.append(this.selected);
        sb2.append(", list=");
        return H.p(sb2, this.list, ')');
    }
}

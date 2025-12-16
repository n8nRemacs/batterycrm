package CL0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CompetitiveVasTab.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LCL0/d;", "", "", "title", "", "selected", "", "LCL0/a;", "list", "LCL0/b;", "icons", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Z", "c", "()Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    @com.google.gson.annotations.c("icons")
    @l
    private final List<b> icons;

    @com.google.gson.annotations.c("list")
    @k
    private final List<a> list;

    @com.google.gson.annotations.c("selected")
    private final boolean selected;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public d(@k String str, boolean z12, @k List<a> list, @l List<b> list2) {
        this.title = str;
        this.selected = z12;
        this.list = list;
        this.icons = list2;
    }

    @l
    public final List<b> a() {
        return this.icons;
    }

    @k
    public final List<a> b() {
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
}

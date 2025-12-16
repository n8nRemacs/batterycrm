package Dk;

import Y61.l;
import kotlin.Metadata;

/* compiled from: VasUnionTab.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LDk/k;", "", "", "title", "tabDescription", "", "selected", "LDk/i;", "item", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLDk/i;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Z", "b", "()Z", "LDk/i;", "a", "()LDk/i;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k {

    @com.google.gson.annotations.c("item")
    @Y61.k
    private final i item;

    @com.google.gson.annotations.c("selected")
    private final boolean selected;

    @com.google.gson.annotations.c("description")
    @l
    private final String tabDescription;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public k(@Y61.k String str, @l String str2, boolean z12, @Y61.k i iVar) {
        this.title = str;
        this.tabDescription = str2;
        this.selected = z12;
        this.item = iVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final i getItem() {
        return this.item;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getTabDescription() {
        return this.tabDescription;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

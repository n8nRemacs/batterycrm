package YB0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: TariffBar.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LYB0/c;", "", "", "title", "subtitle", "LYB0/b;", "currentProgress", "startProgress", "LYB0/a;", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;LYB0/b;LYB0/b;LYB0/a;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "LYB0/b;", "a", "()LYB0/b;", "getStartProgress", "LYB0/a;", "b", "()LYB0/a;", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    @com.google.gson.annotations.c("currentProgress")
    @k
    private final b currentProgress;

    @com.google.gson.annotations.c("description")
    @l
    private final a description;

    @com.google.gson.annotations.c("startProgress")
    @l
    private final b startProgress;

    @com.google.gson.annotations.c("subtitle")
    @l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public c(@k String str, @l String str2, @k b bVar, @l b bVar2, @l a aVar) {
        this.title = str;
        this.subtitle = str2;
        this.currentProgress = bVar;
        this.startProgress = bVar2;
        this.description = aVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getCurrentProgress() {
        return this.currentProgress;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final a getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}

package zD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ConfigureVerticalsResult.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LzD0/b;", "", "", "title", "description", "", "LzD0/a;", "verticals", "LzD0/c;", "selector", "LzD0/d;", "unavailableVerticals", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LzD0/c;LzD0/d;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "LzD0/c;", "b", "()LzD0/c;", "LzD0/d;", "d", "()LzD0/d;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zD0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50442b {

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("profileSelector")
    @l
    private final C50443c selector;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("unavailableVerticals")
    @l
    private final C50444d unavailableVerticals;

    @com.google.gson.annotations.c("verticals")
    @k
    private final List<C50441a> verticals;

    public C50442b(@k String str, @l String str2, @k List<C50441a> list, @l C50443c c50443c, @l C50444d c50444d) {
        this.title = str;
        this.description = str2;
        this.verticals = list;
        this.selector = c50443c;
        this.unavailableVerticals = c50444d;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C50443c getSelector() {
        return this.selector;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C50444d getUnavailableVerticals() {
        return this.unavailableVerticals;
    }

    @k
    public final List<C50441a> e() {
        return this.verticals;
    }
}

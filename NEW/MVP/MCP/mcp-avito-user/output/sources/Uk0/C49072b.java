package uk0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SerpElement;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvSimilarAdvertsResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luk0/b;", "", "", "Lcom/avito/android/remote/model/SerpElement;", "items", "Luk0/a;", "header", "<init>", "(Ljava/util/List;Luk0/a;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "Luk0/a;", "a", "()Luk0/a;", "_avito-discouraged_avito-api_imv-similar-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uk0.b, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final /* data */ class C49072b {

    @c("header")
    @k
    private final C49071a header;

    @c("items")
    @k
    private final List<SerpElement> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C49072b(@k List<? extends SerpElement> list, @k C49071a c49071a) {
        this.items = list;
        this.header = c49071a;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C49071a getHeader() {
        return this.header;
    }

    @k
    public final List<SerpElement> b() {
        return this.items;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49072b)) {
            return false;
        }
        C49072b c49072b = (C49072b) obj;
        return L.f(this.items, c49072b.items) && L.f(this.header, c49072b.header);
    }

    public final int hashCode() {
        return this.header.hashCode() + (this.items.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ImvSimilarAdvertsResult(items=" + this.items + ", header=" + this.header + ')';
    }
}

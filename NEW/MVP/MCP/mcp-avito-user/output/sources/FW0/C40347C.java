package fW0;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsBasicIndicators.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LfW0/C;", "", "LfW0/y;", "relative", "", "title", "titleHint", "subtitle", "", "value", "<init>", "(LfW0/y;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "LfW0/y;", "a", "()LfW0/y;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "b", "D", "e", "()D", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fW0.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40347C {

    @com.google.gson.annotations.c("relative")
    @Y61.l
    private final y relative;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("titleHint")
    @Y61.l
    private final String titleHint;

    @com.google.gson.annotations.c("value")
    private final double value;

    public C40347C(@Y61.l y yVar, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, double d12) {
        this.relative = yVar;
        this.title = str;
        this.titleHint = str2;
        this.subtitle = str3;
        this.value = d12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final y getRelative() {
        return this.relative;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getTitleHint() {
        return this.titleHint;
    }

    /* renamed from: e, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40347C)) {
            return false;
        }
        C40347C c40347c = (C40347C) obj;
        return L.f(this.relative, c40347c.relative) && L.f(this.title, c40347c.title) && L.f(this.titleHint, c40347c.titleHint) && L.f(this.subtitle, c40347c.subtitle) && Double.compare(this.value, c40347c.value) == 0;
    }

    public final int hashCode() {
        y yVar = this.relative;
        int iD2 = H.d((yVar == null ? 0 : yVar.hashCode()) * 31, 31, this.title);
        String str = this.titleHint;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return Double.hashCode(this.value) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Summary(relative=");
        sb2.append(this.relative);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", titleHint=");
        sb2.append(this.titleHint);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", value=");
        return androidx.compose.ui.graphics.colorspace.e.o(sb2, this.value, ')');
    }
}

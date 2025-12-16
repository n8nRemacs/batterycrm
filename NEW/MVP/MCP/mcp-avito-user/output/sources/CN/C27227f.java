package cn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingContent.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R0\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcn/f;", "", "", "feedTitle", "", "Lcn/c;", "items", "", "Lcom/avito/android/cart_snippet_actions/models/api/AnalyticsData;", "analyticsData", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cn.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C27227f {

    @com.google.gson.annotations.c("analyticsData")
    @l
    private final Map<String, Object> analyticsData;

    @com.google.gson.annotations.c("feedTitle")
    @k
    private final String feedTitle;

    @com.google.gson.annotations.c("items")
    @k
    private final List<C27224c> items;

    public C27227f(@k String str, @k List<C27224c> list, @l Map<String, ? extends Object> map) {
        this.feedTitle = str;
        this.items = list;
        this.analyticsData = map;
    }

    @l
    public final Map<String, Object> a() {
        return this.analyticsData;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getFeedTitle() {
        return this.feedTitle;
    }

    @k
    public final List<C27224c> c() {
        return this.items;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27227f)) {
            return false;
        }
        C27227f c27227f = (C27227f) obj;
        return L.f(this.feedTitle, c27227f.feedTitle) && L.f(this.items, c27227f.items) && L.f(this.analyticsData, c27227f.analyticsData);
    }

    public final int hashCode() {
        int iE2 = H.e(this.feedTitle.hashCode() * 31, 31, this.items);
        Map<String, Object> map = this.analyticsData;
        return iE2 + (map == null ? 0 : map.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Recommendations(feedTitle=");
        sb2.append(this.feedTitle);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", analyticsData=");
        return r.w(sb2, this.analyticsData, ')');
    }
}

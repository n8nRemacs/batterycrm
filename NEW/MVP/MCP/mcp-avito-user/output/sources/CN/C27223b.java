package cn;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingContent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcn/b;", "", "", "screenTitle", "Lcn/d;", "mainItem", "Lcn/f;", "recommendations", "Lcn/a;", "bottomForm", "<init>", "(Ljava/lang/String;Lcn/d;Lcn/f;Lcn/a;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcn/d;", "b", "()Lcn/d;", "Lcn/f;", "c", "()Lcn/f;", "Lcn/a;", "a", "()Lcn/a;", "_avito_cart-sheet-after-adding_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C27223b {

    @com.google.gson.annotations.c("bottomForm")
    @k
    private final C27222a bottomForm;

    @com.google.gson.annotations.c("mainItem")
    @k
    private final C27225d mainItem;

    @com.google.gson.annotations.c("recommendations")
    @l
    private final C27227f recommendations;

    @com.google.gson.annotations.c("screenTitle")
    @k
    private final String screenTitle;

    public C27223b(@k String str, @k C27225d c27225d, @l C27227f c27227f, @k C27222a c27222a) {
        this.screenTitle = str;
        this.mainItem = c27225d;
        this.recommendations = c27227f;
        this.bottomForm = c27222a;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C27222a getBottomForm() {
        return this.bottomForm;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C27225d getMainItem() {
        return this.mainItem;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C27227f getRecommendations() {
        return this.recommendations;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27223b)) {
            return false;
        }
        C27223b c27223b = (C27223b) obj;
        return L.f(this.screenTitle, c27223b.screenTitle) && L.f(this.mainItem, c27223b.mainItem) && L.f(this.recommendations, c27223b.recommendations) && L.f(this.bottomForm, c27223b.bottomForm);
    }

    public final int hashCode() {
        int iHashCode = (this.mainItem.hashCode() + (this.screenTitle.hashCode() * 31)) * 31;
        C27227f c27227f = this.recommendations;
        return this.bottomForm.hashCode() + ((iHashCode + (c27227f == null ? 0 : c27227f.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "CartSheetAfterAddingContent(screenTitle=" + this.screenTitle + ", mainItem=" + this.mainItem + ", recommendations=" + this.recommendations + ", bottomForm=" + this.bottomForm + ')';
    }
}

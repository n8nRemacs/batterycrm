package wD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ConfigurePackage.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"LwD0/c;", "", "", "id", "category", "subcategories", "locations", "size", "LwD0/a;", "discount", "price", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LwD0/a;LwD0/a;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "g", "d", "f", "LwD0/a;", "b", "()LwD0/a;", "e", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wD0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49489c {

    @com.google.gson.annotations.c("category")
    @k
    private final String category;

    @com.google.gson.annotations.c("discount")
    @l
    private final C49487a discount;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("locations")
    @k
    private final String locations;

    @com.google.gson.annotations.c("price")
    @l
    private final C49487a price;

    @com.google.gson.annotations.c("size")
    @k
    private final String size;

    @com.google.gson.annotations.c("subcategories")
    @l
    private final String subcategories;

    public C49489c(@k String str, @k String str2, @l String str3, @k String str4, @k String str5, @l C49487a c49487a, @l C49487a c49487a2) {
        this.id = str;
        this.category = str2;
        this.subcategories = str3;
        this.locations = str4;
        this.size = str5;
        this.discount = c49487a;
        this.price = c49487a2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C49487a getDiscount() {
        return this.discount;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getLocations() {
        return this.locations;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final C49487a getPrice() {
        return this.price;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getSubcategories() {
        return this.subcategories;
    }
}

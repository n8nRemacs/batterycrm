package com.avito.android.sbc.generated.api.api_create_dispatch_v_1;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bp0.C25689a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiCreateDispatchV1Response.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0001\"BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer;", "", "Lbp0/a;", "expiresAt", "", "maxDiscount", "messagePrice", "minDiscount", "", "name", "offerText", "slug", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer$Type;", "type", "<init>", "(Lbp0/a;Ljava/lang/Long;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer$Type;)V", "Lbp0/a;", "a", "()Lbp0/a;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "J", "getMessagePrice", "()J", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer$Type;", "g", "()Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer$Type;", "Type", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Offer {

    @c("expiresAt")
    @k
    private final C25689a expiresAt;

    @c("maxDiscount")
    @l
    private final Long maxDiscount;

    @c("messagePrice")
    private final long messagePrice;

    @c("minDiscount")
    @l
    private final Long minDiscount;

    @c("name")
    @k
    private final String name;

    @c("offerText")
    @k
    private final String offerText;

    @c("slug")
    @k
    private final String slug;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiCreateDispatchV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Discount", "Text", "DiscountPercent", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("discount")
        public static final Type Discount;

        @c("discount_percent")
        public static final Type DiscountPercent;

        @c("text")
        public static final Type Text;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f260167b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f260168c;

        static {
            Type type = new Type("Discount", 0, "discount");
            Discount = type;
            Type type2 = new Type("Text", 1, "text");
            Text = type2;
            Type type3 = new Type("DiscountPercent", 2, "discount_percent");
            DiscountPercent = type3;
            Type[] typeArr = {type, type2, type3};
            f260167b = typeArr;
            f260168c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f260167b.clone();
        }
    }

    public Offer(@k C25689a c25689a, @l Long l12, long j12, @l Long l13, @k String str, @k String str2, @k String str3, @k Type type) {
        this.expiresAt = c25689a;
        this.maxDiscount = l12;
        this.messagePrice = j12;
        this.minDiscount = l13;
        this.name = str;
        this.offerText = str2;
        this.slug = str3;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C25689a getExpiresAt() {
        return this.expiresAt;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getMaxDiscount() {
        return this.maxDiscount;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getMinDiscount() {
        return this.minDiscount;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getOfferText() {
        return this.offerText;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}

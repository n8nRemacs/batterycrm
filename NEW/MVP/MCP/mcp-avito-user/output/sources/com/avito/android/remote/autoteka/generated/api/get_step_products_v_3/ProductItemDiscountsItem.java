package com.avito.android.remote.autoteka.generated.api.get_step_products_v_3;

import Y61.k;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetStepProductsV3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/ProductItemDiscountsItem;", "", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/ProductItemDiscountsItem$Kind;", MessageBody.Location.KIND, "", "value", "<init>", "(Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/ProductItemDiscountsItem$Kind;Ljava/lang/String;)V", "Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/ProductItemDiscountsItem$Kind;", "a", "()Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/ProductItemDiscountsItem$Kind;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Kind", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProductItemDiscountsItem {

    @c(MessageBody.Location.KIND)
    @k
    private final Kind kind;

    @c("value")
    @k
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetStepProductsV3Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_products_v_3/ProductItemDiscountsItem$Kind;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "DynamicDiscount", "Discount", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Kind {

        @c("discount")
        public static final Kind Discount;

        @c("dynamicDiscount")
        public static final Kind DynamicDiscount;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Kind[] f253286b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f253287c;

        static {
            Kind kind = new Kind("DynamicDiscount", 0, "dynamicDiscount");
            DynamicDiscount = kind;
            Kind kind2 = new Kind("Discount", 1, "discount");
            Discount = kind2;
            Kind[] kindArr = {kind, kind2};
            f253286b = kindArr;
            f253287c = kotlin.enums.c.a(kindArr);
        }

        private Kind(String str, int i12, String str2) {
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f253286b.clone();
        }
    }

    public ProductItemDiscountsItem(@k Kind kind, @k String str) {
        this.kind = kind;
        this.value = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Kind getKind() {
        return this.kind;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}

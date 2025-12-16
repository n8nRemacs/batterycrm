package com.avito.android.remote.short_term_rent.generated.api.api_2_str_booking_request_pay_post;

import Il0.f;
import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api2StrBookingRequestPayPostRequest.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType;", "", "LIl0/f;", "installmentInfo", "Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType$Type;", "type", "<init>", "(LIl0/f;Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType$Type;)V", "LIl0/f;", "getInstallmentInfo", "()LIl0/f;", "Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType$Type;", "getType", "()Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType$Type;", "Type", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentType {

    @c("installmentInfo")
    @l
    private final f installmentInfo;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api2StrBookingRequestPayPostRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/short_term_rent/generated/api/api_2_str_booking_request_pay_post/PaymentType$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Prepaid", "Installment", "Autowriteoff", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("autowriteoff")
        public static final Type Autowriteoff;

        @c("installment")
        public static final Type Installment;

        @c("prepaid")
        public static final Type Prepaid;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f254363c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f254364d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f254365b;

        static {
            Type type = new Type("Prepaid", 0, "prepaid");
            Prepaid = type;
            Type type2 = new Type("Installment", 1, "installment");
            Installment = type2;
            Type type3 = new Type("Autowriteoff", 2, "autowriteoff");
            Autowriteoff = type3;
            Type[] typeArr = {type, type2, type3};
            f254363c = typeArr;
            f254364d = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
            this.f254365b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f254363c.clone();
        }
    }

    public PaymentType(@l f fVar, @k Type type) {
        this.installmentInfo = fVar;
        this.type = type;
    }
}

package com.avito.android.credits.web_logger;

import Y61.k;
import Y61.l;
import com.avito.android.util.R1;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TinkoffWebAnalyticsEventLogger.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/credits/web_logger/e;", "Lcom/avito/android/credits/web_logger/h;", "a", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.credits.e f129075b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Gson f129076c = new Gson();

    /* compiled from: TinkoffWebAnalyticsEventLogger.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/credits/web_logger/e$a;", "", "", "id", "", "desiredCreditAmount", "desiredCreditTerm", "downPayment", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getDesiredCreditAmount", "()Ljava/lang/Integer;", "getDesiredCreditTerm", "getDownPayment", "_avito_credits_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @com.google.gson.annotations.c("desired_credit_amount")
        @l
        private final Integer desiredCreditAmount;

        @com.google.gson.annotations.c("desired_credit_term")
        @l
        private final Integer desiredCreditTerm;

        @com.google.gson.annotations.c("down_payment")
        @l
        private final Integer downPayment;

        @com.google.gson.annotations.c("id")
        @l
        private final String id;

        public a(@l String str, @l Integer num, @l Integer num2, @l Integer num3) {
            this.id = str;
            this.desiredCreditAmount = num;
            this.desiredCreditTerm = num2;
            this.downPayment = num3;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/N1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<a> {
    }

    @Inject
    public e(@k com.avito.android.credits.e eVar) {
        this.f129075b = eVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.avito.android.credits.web_logger.h
    public final void a(@k String str, @l String str2) {
        try {
            int iHashCode = str.hashCode();
            com.avito.android.credits.e eVar = this.f129075b;
            switch (iHashCode) {
                case -75655684:
                    if (!str.equals("formSubmit")) {
                        break;
                    } else {
                        eVar.v();
                        break;
                    }
                case 103299:
                    if (!str.equals("hid")) {
                        break;
                    } else {
                        eVar.j(str2);
                        eVar.z();
                        break;
                    }
                case 391963045:
                    if (str.equals("autoLoanParams") && str2 != null) {
                        Gson gson = this.f129076c;
                        Type type = new b().getType();
                        eVar.t(((a) gson.e(str2, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type))).getId());
                        break;
                    }
                    break;
                case 1798647939:
                    if (!str.equals("formStep3")) {
                        break;
                    } else {
                        eVar.l();
                        break;
                    }
                case 1798647940:
                    if (!str.equals("formStep4")) {
                        break;
                    } else {
                        eVar.w();
                        break;
                    }
            }
        } catch (Exception e12) {
            V2.f318762a.a("TinkoffCreditPartner", "Web event handling error", e12);
        }
    }
}

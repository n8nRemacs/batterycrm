package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: IncomeResultV2.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/IncomeResultV2;", "", "income", "Lcom/avito/android/remote/model/IncomeResultV2$Income;", "(Lcom/avito/android/remote/model/IncomeResultV2$Income;)V", "getIncome", "()Lcom/avito/android/remote/model/IncomeResultV2$Income;", "Income", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IncomeResultV2 {

    @c("income")
    @l
    private final Income income;

    /* compiled from: IncomeResultV2.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/IncomeResultV2$Income;", "", "title", "", DeliverySubsidiesSlotKt.AMOUNT, "Lcom/avito/android/remote/model/IncomeResultV2$Income$Amount;", "(Ljava/lang/String;Lcom/avito/android/remote/model/IncomeResultV2$Income$Amount;)V", "getAmount", "()Lcom/avito/android/remote/model/IncomeResultV2$Income$Amount;", "getTitle", "()Ljava/lang/String;", "Amount", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Income {

        @c(DeliverySubsidiesSlotKt.AMOUNT)
        @k
        private final Amount amount;

        @c("title")
        @k
        private final String title;

        /* compiled from: IncomeResultV2.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/IncomeResultV2$Income$Amount;", "", "value", "", "currency", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getValue", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Amount {

            @c("currency")
            @k
            private final String currency;

            @c("value")
            @k
            private final String value;

            public Amount(@k String str, @k String str2) {
                this.value = str;
                this.currency = str2;
            }

            @k
            public final String getCurrency() {
                return this.currency;
            }

            @k
            public final String getValue() {
                return this.value;
            }
        }

        public Income(@k String str, @k Amount amount) {
            this.title = str;
            this.amount = amount;
        }

        @k
        public final Amount getAmount() {
            return this.amount;
        }

        @k
        public final String getTitle() {
            return this.title;
        }
    }

    public IncomeResultV2(@l Income income) {
        this.income = income;
    }

    @l
    public final Income getIncome() {
        return this.income;
    }
}

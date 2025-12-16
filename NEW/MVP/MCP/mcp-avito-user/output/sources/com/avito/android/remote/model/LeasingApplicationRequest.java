package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LeasingApplicationRequest.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB3\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003JD\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/LeasingApplicationRequest;", "", "brokerCodes", "", "", "downPayment", "", "termInMonths", "customer", "Lcom/avito/android/remote/model/LeasingApplicationRequest$LeasingApplicationCustomer;", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lcom/avito/android/remote/model/LeasingApplicationRequest$LeasingApplicationCustomer;)V", "getBrokerCodes", "()Ljava/util/List;", "getCustomer", "()Lcom/avito/android/remote/model/LeasingApplicationRequest$LeasingApplicationCustomer;", "getDownPayment", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTermInMonths", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lcom/avito/android/remote/model/LeasingApplicationRequest$LeasingApplicationCustomer;)Lcom/avito/android/remote/model/LeasingApplicationRequest;", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "LeasingApplicationCustomer", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LeasingApplicationRequest {

    @c("brokerCodes")
    @l
    private final List<String> brokerCodes;

    @c("customer")
    @l
    private final LeasingApplicationCustomer customer;

    @c("downPayment")
    @l
    private final Long downPayment;

    @c("termInMonths")
    @l
    private final Long termInMonths;

    /* compiled from: LeasingApplicationRequest.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/LeasingApplicationRequest$LeasingApplicationCustomer;", "", "phone", "", "inn", "(Ljava/lang/String;Ljava/lang/String;)V", "getInn", "()Ljava/lang/String;", "getPhone", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeasingApplicationCustomer {

        @c("inn")
        @l
        private final String inn;

        @c("phone")
        @l
        private final String phone;

        public LeasingApplicationCustomer(@l String str, @l String str2) {
            this.phone = str;
            this.inn = str2;
        }

        public static /* synthetic */ LeasingApplicationCustomer copy$default(LeasingApplicationCustomer leasingApplicationCustomer, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = leasingApplicationCustomer.phone;
            }
            if ((i12 & 2) != 0) {
                str2 = leasingApplicationCustomer.inn;
            }
            return leasingApplicationCustomer.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getInn() {
            return this.inn;
        }

        @k
        public final LeasingApplicationCustomer copy(@l String phone, @l String inn) {
            return new LeasingApplicationCustomer(phone, inn);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeasingApplicationCustomer)) {
                return false;
            }
            LeasingApplicationCustomer leasingApplicationCustomer = (LeasingApplicationCustomer) other;
            return L.f(this.phone, leasingApplicationCustomer.phone) && L.f(this.inn, leasingApplicationCustomer.inn);
        }

        @l
        public final String getInn() {
            return this.inn;
        }

        @l
        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            String str = this.phone;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.inn;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LeasingApplicationCustomer(phone=");
            sb2.append(this.phone);
            sb2.append(", inn=");
            return C22026a.c(sb2, this.inn, ')');
        }
    }

    public LeasingApplicationRequest(@l List<String> list, @l Long l12, @l Long l13, @l LeasingApplicationCustomer leasingApplicationCustomer) {
        this.brokerCodes = list;
        this.downPayment = l12;
        this.termInMonths = l13;
        this.customer = leasingApplicationCustomer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeasingApplicationRequest copy$default(LeasingApplicationRequest leasingApplicationRequest, List list, Long l12, Long l13, LeasingApplicationCustomer leasingApplicationCustomer, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = leasingApplicationRequest.brokerCodes;
        }
        if ((i12 & 2) != 0) {
            l12 = leasingApplicationRequest.downPayment;
        }
        if ((i12 & 4) != 0) {
            l13 = leasingApplicationRequest.termInMonths;
        }
        if ((i12 & 8) != 0) {
            leasingApplicationCustomer = leasingApplicationRequest.customer;
        }
        return leasingApplicationRequest.copy(list, l12, l13, leasingApplicationCustomer);
    }

    @l
    public final List<String> component1() {
        return this.brokerCodes;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Long getDownPayment() {
        return this.downPayment;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Long getTermInMonths() {
        return this.termInMonths;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final LeasingApplicationCustomer getCustomer() {
        return this.customer;
    }

    @k
    public final LeasingApplicationRequest copy(@l List<String> brokerCodes, @l Long downPayment, @l Long termInMonths, @l LeasingApplicationCustomer customer) {
        return new LeasingApplicationRequest(brokerCodes, downPayment, termInMonths, customer);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeasingApplicationRequest)) {
            return false;
        }
        LeasingApplicationRequest leasingApplicationRequest = (LeasingApplicationRequest) other;
        return L.f(this.brokerCodes, leasingApplicationRequest.brokerCodes) && L.f(this.downPayment, leasingApplicationRequest.downPayment) && L.f(this.termInMonths, leasingApplicationRequest.termInMonths) && L.f(this.customer, leasingApplicationRequest.customer);
    }

    @l
    public final List<String> getBrokerCodes() {
        return this.brokerCodes;
    }

    @l
    public final LeasingApplicationCustomer getCustomer() {
        return this.customer;
    }

    @l
    public final Long getDownPayment() {
        return this.downPayment;
    }

    @l
    public final Long getTermInMonths() {
        return this.termInMonths;
    }

    public int hashCode() {
        List<String> list = this.brokerCodes;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l12 = this.downPayment;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.termInMonths;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        LeasingApplicationCustomer leasingApplicationCustomer = this.customer;
        return iHashCode3 + (leasingApplicationCustomer != null ? leasingApplicationCustomer.hashCode() : 0);
    }

    @k
    public String toString() {
        return "LeasingApplicationRequest(brokerCodes=" + this.brokerCodes + ", downPayment=" + this.downPayment + ", termInMonths=" + this.termInMonths + ", customer=" + this.customer + ')';
    }
}

package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfilePhoneResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse;", "", "()V", "Failure", "Ok", "Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse$Failure;", "Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse$Ok;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ExtendedProfilePhoneResponse {

    /* compiled from: ExtendedProfilePhoneResponse.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse$Failure;", "Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse;", "dialogInfo", "Lcom/avito/android/remote/model/DialogInfo;", "(Lcom/avito/android/remote/model/DialogInfo;)V", "getDialogInfo", "()Lcom/avito/android/remote/model/DialogInfo;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure extends ExtendedProfilePhoneResponse {

        @c("dialog")
        @k
        private final DialogInfo dialogInfo;

        public Failure(@k DialogInfo dialogInfo) {
            super(null);
            this.dialogInfo = dialogInfo;
        }

        @k
        public final DialogInfo getDialogInfo() {
            return this.dialogInfo;
        }
    }

    /* compiled from: ExtendedProfilePhoneResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse$Ok;", "Lcom/avito/android/remote/model/ExtendedProfilePhoneResponse;", "phones", "", "Lcom/avito/android/remote/model/ExtendedProfilePhone;", ServiceTransportationWidget.DisclaimerField.TYPE, "Lcom/avito/android/remote/model/ExtendedProfilePhoneDisclaimer;", "(Ljava/util/List;Lcom/avito/android/remote/model/ExtendedProfilePhoneDisclaimer;)V", "getDisclaimer", "()Lcom/avito/android/remote/model/ExtendedProfilePhoneDisclaimer;", "getPhones", "()Ljava/util/List;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends ExtendedProfilePhoneResponse {

        @c(ServiceTransportationWidget.DisclaimerField.TYPE)
        @l
        private final ExtendedProfilePhoneDisclaimer disclaimer;

        @c("phones")
        @k
        private final List<ExtendedProfilePhone> phones;

        public Ok(@k List<ExtendedProfilePhone> list, @l ExtendedProfilePhoneDisclaimer extendedProfilePhoneDisclaimer) {
            super(null);
            this.phones = list;
            this.disclaimer = extendedProfilePhoneDisclaimer;
        }

        @l
        public final ExtendedProfilePhoneDisclaimer getDisclaimer() {
            return this.disclaimer;
        }

        @k
        public final List<ExtendedProfilePhone> getPhones() {
            return this.phones;
        }
    }

    public /* synthetic */ ExtendedProfilePhoneResponse(C42822w c42822w) {
        this();
    }

    private ExtendedProfilePhoneResponse() {
    }
}

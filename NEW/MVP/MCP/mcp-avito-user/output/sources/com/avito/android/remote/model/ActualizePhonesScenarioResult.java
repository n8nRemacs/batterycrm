package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActualizePhonesScenarioResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/ActualizePhonesScenarioResult;", "", "delayInterval", "", "getDelayInterval", "()I", "DoNotShow", "ShowAddNewPhone", "WithPayload", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$DoNotShow;", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$ShowAddNewPhone;", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$WithPayload;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ActualizePhonesScenarioResult {

    /* compiled from: ActualizePhonesScenarioResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$DoNotShow;", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult;", "delayInterval", "", "(I)V", "getDelayInterval", "()I", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DoNotShow implements ActualizePhonesScenarioResult {
        private final int delayInterval;

        public DoNotShow(int i12) {
            this.delayInterval = i12;
        }

        public static /* synthetic */ DoNotShow copy$default(DoNotShow doNotShow, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = doNotShow.delayInterval;
            }
            return doNotShow.copy(i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDelayInterval() {
            return this.delayInterval;
        }

        @k
        public final DoNotShow copy(int delayInterval) {
            return new DoNotShow(delayInterval);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DoNotShow) && this.delayInterval == ((DoNotShow) other).delayInterval;
        }

        @Override // com.avito.android.remote.model.ActualizePhonesScenarioResult
        public int getDelayInterval() {
            return this.delayInterval;
        }

        public int hashCode() {
            return Integer.hashCode(this.delayInterval);
        }

        @k
        public String toString() {
            return r.t(new StringBuilder("DoNotShow(delayInterval="), this.delayInterval, ')');
        }
    }

    /* compiled from: ActualizePhonesScenarioResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$ShowAddNewPhone;", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult;", "delayInterval", "", "(I)V", "getDelayInterval", "()I", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAddNewPhone implements ActualizePhonesScenarioResult {
        private final int delayInterval;

        public ShowAddNewPhone(int i12) {
            this.delayInterval = i12;
        }

        public static /* synthetic */ ShowAddNewPhone copy$default(ShowAddNewPhone showAddNewPhone, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = showAddNewPhone.delayInterval;
            }
            return showAddNewPhone.copy(i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDelayInterval() {
            return this.delayInterval;
        }

        @k
        public final ShowAddNewPhone copy(int delayInterval) {
            return new ShowAddNewPhone(delayInterval);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowAddNewPhone) && this.delayInterval == ((ShowAddNewPhone) other).delayInterval;
        }

        @Override // com.avito.android.remote.model.ActualizePhonesScenarioResult
        public int getDelayInterval() {
            return this.delayInterval;
        }

        public int hashCode() {
            return Integer.hashCode(this.delayInterval);
        }

        @k
        public String toString() {
            return r.t(new StringBuilder("ShowAddNewPhone(delayInterval="), this.delayInterval, ')');
        }
    }

    /* compiled from: ActualizePhonesScenarioResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$WithPayload;", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult;", "payload", "Lcom/avito/android/remote/model/PhonesPayload;", "getPayload", "()Lcom/avito/android/remote/model/PhonesPayload;", "ShowWithConfirmablePhones", "ShowWithPhones", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$WithPayload$ShowWithConfirmablePhones;", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$WithPayload$ShowWithPhones;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface WithPayload extends ActualizePhonesScenarioResult {

        /* compiled from: ActualizePhonesScenarioResult.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$WithPayload$ShowWithConfirmablePhones;", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$WithPayload;", "delayInterval", "", "payload", "Lcom/avito/android/remote/model/PhonesPayload;", "(ILcom/avito/android/remote/model/PhonesPayload;)V", "getDelayInterval", "()I", "getPayload", "()Lcom/avito/android/remote/model/PhonesPayload;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowWithConfirmablePhones implements WithPayload {
            private final int delayInterval;

            @k
            private final PhonesPayload payload;

            public ShowWithConfirmablePhones(int i12, @k PhonesPayload phonesPayload) {
                this.delayInterval = i12;
                this.payload = phonesPayload;
            }

            public static /* synthetic */ ShowWithConfirmablePhones copy$default(ShowWithConfirmablePhones showWithConfirmablePhones, int i12, PhonesPayload phonesPayload, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = showWithConfirmablePhones.delayInterval;
                }
                if ((i13 & 2) != 0) {
                    phonesPayload = showWithConfirmablePhones.payload;
                }
                return showWithConfirmablePhones.copy(i12, phonesPayload);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDelayInterval() {
                return this.delayInterval;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final PhonesPayload getPayload() {
                return this.payload;
            }

            @k
            public final ShowWithConfirmablePhones copy(int delayInterval, @k PhonesPayload payload) {
                return new ShowWithConfirmablePhones(delayInterval, payload);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowWithConfirmablePhones)) {
                    return false;
                }
                ShowWithConfirmablePhones showWithConfirmablePhones = (ShowWithConfirmablePhones) other;
                return this.delayInterval == showWithConfirmablePhones.delayInterval && L.f(this.payload, showWithConfirmablePhones.payload);
            }

            @Override // com.avito.android.remote.model.ActualizePhonesScenarioResult
            public int getDelayInterval() {
                return this.delayInterval;
            }

            @Override // com.avito.android.remote.model.ActualizePhonesScenarioResult.WithPayload
            @k
            public PhonesPayload getPayload() {
                return this.payload;
            }

            public int hashCode() {
                return this.payload.hashCode() + (Integer.hashCode(this.delayInterval) * 31);
            }

            @k
            public String toString() {
                return "ShowWithConfirmablePhones(delayInterval=" + this.delayInterval + ", payload=" + this.payload + ')';
            }
        }

        /* compiled from: ActualizePhonesScenarioResult.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$WithPayload$ShowWithPhones;", "Lcom/avito/android/remote/model/ActualizePhonesScenarioResult$WithPayload;", "delayInterval", "", "payload", "Lcom/avito/android/remote/model/PhonesPayload;", "(ILcom/avito/android/remote/model/PhonesPayload;)V", "getDelayInterval", "()I", "getPayload", "()Lcom/avito/android/remote/model/PhonesPayload;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowWithPhones implements WithPayload {
            private final int delayInterval;

            @k
            private final PhonesPayload payload;

            public ShowWithPhones(int i12, @k PhonesPayload phonesPayload) {
                this.delayInterval = i12;
                this.payload = phonesPayload;
            }

            public static /* synthetic */ ShowWithPhones copy$default(ShowWithPhones showWithPhones, int i12, PhonesPayload phonesPayload, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = showWithPhones.delayInterval;
                }
                if ((i13 & 2) != 0) {
                    phonesPayload = showWithPhones.payload;
                }
                return showWithPhones.copy(i12, phonesPayload);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDelayInterval() {
                return this.delayInterval;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final PhonesPayload getPayload() {
                return this.payload;
            }

            @k
            public final ShowWithPhones copy(int delayInterval, @k PhonesPayload payload) {
                return new ShowWithPhones(delayInterval, payload);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowWithPhones)) {
                    return false;
                }
                ShowWithPhones showWithPhones = (ShowWithPhones) other;
                return this.delayInterval == showWithPhones.delayInterval && L.f(this.payload, showWithPhones.payload);
            }

            @Override // com.avito.android.remote.model.ActualizePhonesScenarioResult
            public int getDelayInterval() {
                return this.delayInterval;
            }

            @Override // com.avito.android.remote.model.ActualizePhonesScenarioResult.WithPayload
            @k
            public PhonesPayload getPayload() {
                return this.payload;
            }

            public int hashCode() {
                return this.payload.hashCode() + (Integer.hashCode(this.delayInterval) * 31);
            }

            @k
            public String toString() {
                return "ShowWithPhones(delayInterval=" + this.delayInterval + ", payload=" + this.payload + ')';
            }
        }

        @k
        PhonesPayload getPayload();
    }

    int getDelayInterval();
}

package com.avito.android.remote.model.imei_recognition;

import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImeiRecognitionResult.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult;", "", "Error", "Success", "Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult$Error;", "Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult$Success;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ImeiRecognitionResult {

    /* compiled from: ImeiRecognitionResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult$Error;", "Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult;", "title", "", "message", "retryButtonLabel", "cancelButtonLabel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCancelButtonLabel", "()Ljava/lang/String;", "getMessage", "getRetryButtonLabel", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements ImeiRecognitionResult {

        @c("cancelButtonLabel")
        @k
        private final String cancelButtonLabel;

        @c("message")
        @l
        private final String message;

        @c("retryButtonLabel")
        @k
        private final String retryButtonLabel;

        @c("title")
        @k
        private final String title;

        public Error(@k String str, @l String str2, @k String str3, @k String str4) {
            this.title = str;
            this.message = str2;
            this.retryButtonLabel = str3;
            this.cancelButtonLabel = str4;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = error.title;
            }
            if ((i12 & 2) != 0) {
                str2 = error.message;
            }
            if ((i12 & 4) != 0) {
                str3 = error.retryButtonLabel;
            }
            if ((i12 & 8) != 0) {
                str4 = error.cancelButtonLabel;
            }
            return error.copy(str, str2, str3, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getRetryButtonLabel() {
            return this.retryButtonLabel;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getCancelButtonLabel() {
            return this.cancelButtonLabel;
        }

        @k
        public final Error copy(@k String title, @l String message, @k String retryButtonLabel, @k String cancelButtonLabel) {
            return new Error(title, message, retryButtonLabel, cancelButtonLabel);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return L.f(this.title, error.title) && L.f(this.message, error.message) && L.f(this.retryButtonLabel, error.retryButtonLabel) && L.f(this.cancelButtonLabel, error.cancelButtonLabel);
        }

        @k
        public final String getCancelButtonLabel() {
            return this.cancelButtonLabel;
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        @k
        public final String getRetryButtonLabel() {
            return this.retryButtonLabel;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.message;
            return this.cancelButtonLabel.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.retryButtonLabel);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Error(title=");
            sb2.append(this.title);
            sb2.append(", message=");
            sb2.append(this.message);
            sb2.append(", retryButtonLabel=");
            sb2.append(this.retryButtonLabel);
            sb2.append(", cancelButtonLabel=");
            return C22026a.c(sb2, this.cancelButtonLabel, ')');
        }
    }

    /* compiled from: ImeiRecognitionResult.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult$Success;", "Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult;", "imeiFieldId", "", "imeiFieldValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getImeiFieldId", "()Ljava/lang/String;", "getImeiFieldValue", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements ImeiRecognitionResult {

        @c("imeiFieldId")
        @k
        private final String imeiFieldId;

        @c("imeiFieldValue")
        @k
        private final String imeiFieldValue;

        public Success(@k String str, @k String str2) {
            this.imeiFieldId = str;
            this.imeiFieldValue = str2;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = success.imeiFieldId;
            }
            if ((i12 & 2) != 0) {
                str2 = success.imeiFieldValue;
            }
            return success.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getImeiFieldId() {
            return this.imeiFieldId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getImeiFieldValue() {
            return this.imeiFieldValue;
        }

        @k
        public final Success copy(@k String imeiFieldId, @k String imeiFieldValue) {
            return new Success(imeiFieldId, imeiFieldValue);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return L.f(this.imeiFieldId, success.imeiFieldId) && L.f(this.imeiFieldValue, success.imeiFieldValue);
        }

        @k
        public final String getImeiFieldId() {
            return this.imeiFieldId;
        }

        @k
        public final String getImeiFieldValue() {
            return this.imeiFieldValue;
        }

        public int hashCode() {
            return this.imeiFieldValue.hashCode() + (this.imeiFieldId.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Success(imeiFieldId=");
            sb2.append(this.imeiFieldId);
            sb2.append(", imeiFieldValue=");
            return C22026a.c(sb2, this.imeiFieldValue, ')');
        }
    }
}

package com.avito.android.remote.model.submission;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RealtyAddressSubmissionResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult;", "", "()V", "Error", "NetworkError", "Ok", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult$Error;", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult$NetworkError;", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult$Ok;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class RealtyAddressSubmissionResult {

    /* compiled from: RealtyAddressSubmissionResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult$Error;", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends RealtyAddressSubmissionResult {

        @c("errorText")
        @k
        private final String errorMessage;

        public Error(@k String str) {
            super(null);
            this.errorMessage = str;
        }

        @k
        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }

    /* compiled from: RealtyAddressSubmissionResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult$NetworkError;", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult;", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkError extends RealtyAddressSubmissionResult {

        @k
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
            super(null);
        }
    }

    /* compiled from: RealtyAddressSubmissionResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult$Ok;", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult;", "title", "", "description", "advertisement", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAdvert;", "activateAction", "Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAction;", "continueAction", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAdvert;Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAction;Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAction;)V", "getActivateAction", "()Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAction;", "getAdvertisement", "()Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResultAdvert;", "getContinueAction", "getDescription", "()Ljava/lang/String;", "getTitle", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends RealtyAddressSubmissionResult {

        @c("activateAction")
        @l
        private final RealtyAddressSubmissionResultAction activateAction;

        @c("advertisement")
        @l
        private final RealtyAddressSubmissionResultAdvert advertisement;

        @c("continueAction")
        @l
        private final RealtyAddressSubmissionResultAction continueAction;

        @c("description")
        @l
        private final String description;

        @c("title")
        @l
        private final String title;

        public /* synthetic */ Ok(String str, String str2, RealtyAddressSubmissionResultAdvert realtyAddressSubmissionResultAdvert, RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction, RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction2, int i12, C42822w c42822w) {
            this(str, str2, realtyAddressSubmissionResultAdvert, (i12 & 8) != 0 ? null : realtyAddressSubmissionResultAction, (i12 & 16) != 0 ? null : realtyAddressSubmissionResultAction2);
        }

        @l
        public final RealtyAddressSubmissionResultAction getActivateAction() {
            return this.activateAction;
        }

        @l
        public final RealtyAddressSubmissionResultAdvert getAdvertisement() {
            return this.advertisement;
        }

        @l
        public final RealtyAddressSubmissionResultAction getContinueAction() {
            return this.continueAction;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public Ok(@l String str, @l String str2, @l RealtyAddressSubmissionResultAdvert realtyAddressSubmissionResultAdvert, @l RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction, @l RealtyAddressSubmissionResultAction realtyAddressSubmissionResultAction2) {
            super(null);
            this.title = str;
            this.description = str2;
            this.advertisement = realtyAddressSubmissionResultAdvert;
            this.activateAction = realtyAddressSubmissionResultAction;
            this.continueAction = realtyAddressSubmissionResultAction2;
        }
    }

    public /* synthetic */ RealtyAddressSubmissionResult(C42822w c42822w) {
        this();
    }

    private RealtyAddressSubmissionResult() {
    }
}

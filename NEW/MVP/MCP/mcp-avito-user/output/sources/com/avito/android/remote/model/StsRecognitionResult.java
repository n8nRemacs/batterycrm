package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StsRecognitionResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/StsRecognitionResult;", "", "()V", "NotFound", "Ok", "Lcom/avito/android/remote/model/StsRecognitionResult$NotFound;", "Lcom/avito/android/remote/model/StsRecognitionResult$Ok;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class StsRecognitionResult {

    /* compiled from: StsRecognitionResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/StsRecognitionResult$NotFound;", "Lcom/avito/android/remote/model/StsRecognitionResult;", "message", "", "rejectCode", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getMessage", "()Ljava/lang/String;", "getRejectCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotFound extends StsRecognitionResult {

        @c("message")
        @k
        private final String message;

        @c("rejectCode")
        @l
        private final Integer rejectCode;

        public NotFound(@k String str, @l Integer num) {
            super(null);
            this.message = str;
            this.rejectCode = num;
        }

        @k
        public final String getMessage() {
            return this.message;
        }

        @l
        public final Integer getRejectCode() {
            return this.rejectCode;
        }
    }

    /* compiled from: StsRecognitionResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/StsRecognitionResult$Ok;", "Lcom/avito/android/remote/model/StsRecognitionResult;", "publishParams", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "(Lcom/avito/android/remote/model/category_parameters/CategoryParameters;)V", "getPublishParams", "()Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends StsRecognitionResult {

        @c("result")
        @k
        private final CategoryParameters publishParams;

        public Ok(@k CategoryParameters categoryParameters) {
            super(null);
            this.publishParams = categoryParameters;
        }

        @k
        public final CategoryParameters getPublishParams() {
            return this.publishParams;
        }
    }

    public /* synthetic */ StsRecognitionResult(C42822w c42822w) {
        this();
    }

    private StsRecognitionResult() {
    }
}

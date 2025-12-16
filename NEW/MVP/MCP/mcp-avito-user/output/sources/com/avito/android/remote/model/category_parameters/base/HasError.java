package com.avito.android.remote.model.category_parameters.base;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HasError.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u001c\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/HasError;", "", "", "hasError", "()Z", "hasErrorMessage", "Lcom/avito/android/remote/model/text/AttributedText;", "getErrorMessage", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lkotlin/G0;", "clearError", "()V", "Lcom/avito/android/remote/model/PretendErrorValue;", "result", "applyPretendResult", "(Lcom/avito/android/remote/model/PretendErrorValue;)V", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "getError", "()Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "setError", "(Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;)V", "getError$annotations", "error", "", "value", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "errorMessage", "Error", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface HasError {

    /* compiled from: HasError.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void applyPretendResult(@k HasError hasError, @l PretendErrorValue pretendErrorValue) {
            Error withMessage = null;
            if (pretendErrorValue instanceof PretendErrorValue.Message) {
                String message = ((PretendErrorValue.Message) pretendErrorValue).getMessage();
                if (message != null) {
                    withMessage = new Error.WithMessage(message);
                }
            } else if (pretendErrorValue instanceof PretendErrorValue.AttributedMessage) {
                AttributedText message2 = ((PretendErrorValue.AttributedMessage) pretendErrorValue).getMessage();
                if (message2 != null) {
                    withMessage = new Error.WithMessage(message2);
                }
            } else if (pretendErrorValue instanceof PretendErrorValue.WithoutMessage) {
                withMessage = Error.WithoutMessage.INSTANCE;
            }
            hasError.setError(withMessage);
        }

        public static void clearError(@k HasError hasError) {
            hasError.setError(null);
        }

        @l
        /* renamed from: getErrorMessage, reason: collision with other method in class */
        public static String m57getErrorMessage(@k HasError hasError) {
            AttributedText attributedError;
            Error error = hasError.getError();
            Error.WithMessage withMessage = error instanceof Error.WithMessage ? (Error.WithMessage) error : null;
            if (withMessage == null || (attributedError = withMessage.getAttributedError()) == null) {
                return null;
            }
            return attributedError.getText();
        }

        public static boolean hasError(@k HasError hasError) {
            return hasError.getError() != null;
        }

        public static boolean hasErrorMessage(@k HasError hasError) {
            return hasError.hasError() && (hasError.getError() instanceof Error.WithMessage);
        }

        public static void setErrorMessage(@k HasError hasError, @l String str) {
            hasError.setError(str != null ? new Error.WithMessage(str) : null);
        }

        @l
        public static AttributedText getErrorMessage(@k HasError hasError) {
            Error error = hasError.getError();
            Error.WithMessage withMessage = error instanceof Error.WithMessage ? (Error.WithMessage) error : null;
            if (withMessage != null) {
                return withMessage.getAttributedError();
            }
            return null;
        }

        public static /* synthetic */ void getError$annotations() {
        }
    }

    /* compiled from: HasError.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "", "()V", "WithMessage", "WithoutMessage", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error$WithMessage;", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error$WithoutMessage;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error {

        /* compiled from: HasError.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/HasError$Error$WithMessage;", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "message", "", "(Ljava/lang/String;)V", "attributedError", "Lcom/avito/android/remote/model/text/AttributedText;", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "getAttributedError", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class WithMessage extends Error {

            @k
            private final AttributedText attributedError;

            public WithMessage(@k AttributedText attributedText) {
                super(null);
                this.attributedError = attributedText;
            }

            @k
            public final AttributedText getAttributedError() {
                return this.attributedError;
            }

            public WithMessage(@k String str) {
                this(new AttributedText(str, C42784z0.f406748b, 0, 4, null));
            }
        }

        /* compiled from: HasError.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/HasError$Error$WithoutMessage;", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class WithoutMessage extends Error {

            @k
            public static final WithoutMessage INSTANCE = new WithoutMessage();

            private WithoutMessage() {
                super(null);
            }
        }

        public /* synthetic */ Error(C42822w c42822w) {
            this();
        }

        private Error() {
        }
    }

    void applyPretendResult(@l PretendErrorValue result);

    void clearError();

    @l
    Error getError();

    @l
    AttributedText getErrorMessage();

    @l
    /* renamed from: getErrorMessage */
    String mo56getErrorMessage();

    boolean hasError();

    boolean hasErrorMessage();

    void setError(@l Error error);

    void setErrorMessage(@l String str);
}

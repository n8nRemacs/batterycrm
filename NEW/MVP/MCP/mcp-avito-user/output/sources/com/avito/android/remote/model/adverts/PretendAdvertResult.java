package com.avito.android.remote.model.adverts;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PretendAdvertResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/adverts/PretendAdvertResult;", "", "()V", "InputErrors", "Ok", "Lcom/avito/android/remote/model/adverts/PretendAdvertResult$InputErrors;", "Lcom/avito/android/remote/model/adverts/PretendAdvertResult$Ok;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PretendAdvertResult {

    /* compiled from: PretendAdvertResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/adverts/PretendAdvertResult$InputErrors;", "Lcom/avito/android/remote/model/adverts/PretendAdvertResult;", "messages", "Lcom/avito/android/remote/model/PretendResult;", "(Lcom/avito/android/remote/model/PretendResult;)V", "getMessages", "()Lcom/avito/android/remote/model/PretendResult;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputErrors extends PretendAdvertResult {

        @c("messages")
        @k
        private final PretendResult messages;

        public InputErrors(@k PretendResult pretendResult) {
            super(null);
            this.messages = pretendResult;
        }

        public static /* synthetic */ InputErrors copy$default(InputErrors inputErrors, PretendResult pretendResult, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                pretendResult = inputErrors.messages;
            }
            return inputErrors.copy(pretendResult);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final PretendResult getMessages() {
            return this.messages;
        }

        @k
        public final InputErrors copy(@k PretendResult messages) {
            return new InputErrors(messages);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InputErrors) && L.f(this.messages, ((InputErrors) other).messages);
        }

        @k
        public final PretendResult getMessages() {
            return this.messages;
        }

        public int hashCode() {
            return this.messages.hashCode();
        }

        @k
        public String toString() {
            return "InputErrors(messages=" + this.messages + ')';
        }
    }

    /* compiled from: PretendAdvertResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/adverts/PretendAdvertResult$Ok;", "Lcom/avito/android/remote/model/adverts/PretendAdvertResult;", "()V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends PretendAdvertResult {

        @k
        public static final Ok INSTANCE = new Ok();

        private Ok() {
            super(null);
        }
    }

    public /* synthetic */ PretendAdvertResult(C42822w c42822w) {
        this();
    }

    private PretendAdvertResult() {
    }
}

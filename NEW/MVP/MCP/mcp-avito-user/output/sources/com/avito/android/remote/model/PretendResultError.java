package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PretendResultError.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/PretendResultError;", "Lcom/avito/android/remote/model/Error;", "code", "", "message", "", "pretendResult", "Lcom/avito/android/remote/model/PretendResult;", "(ILjava/lang/String;Lcom/avito/android/remote/model/PretendResult;)V", "getPretendResult", "()Lcom/avito/android/remote/model/PretendResult;", "toString", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PretendResultError extends Error {

    @c("messages")
    @l
    private final PretendResult pretendResult;

    public PretendResultError(int i12, @l String str, @l PretendResult pretendResult) {
        super(i12, str, null, 4, null);
        this.pretendResult = pretendResult;
    }

    @l
    public final PretendResult getPretendResult() {
        return this.pretendResult;
    }

    @Override // com.avito.android.remote.model.Error
    @k
    public String toString() {
        return "PretendResultError(pretendResult=" + this.pretendResult + ") " + super.toString();
    }
}

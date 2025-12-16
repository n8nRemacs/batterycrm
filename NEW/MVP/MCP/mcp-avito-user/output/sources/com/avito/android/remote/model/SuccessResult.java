package com.avito.android.remote.model;

import X41.j;
import Y61.l;
import aW.InterfaceC19823a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuccessResult.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SuccessResult;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SuccessResult {

    @l
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public SuccessResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @l
    public final String getMessage() {
        return this.message;
    }

    @j
    public SuccessResult(@l String str) {
        this.message = str;
    }

    public /* synthetic */ SuccessResult(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }
}

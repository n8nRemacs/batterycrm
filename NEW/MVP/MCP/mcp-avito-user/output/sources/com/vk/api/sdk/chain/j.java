package com.vk.api.sdk.chain;

import com.vk.api.sdk.p;
import kotlin.Metadata;

/* compiled from: RetryChainCall.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/chain/j;", "T", "Lcom/vk/api/sdk/chain/d;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class j<T> extends d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final int f366567b;

    public j(@Y61.k p pVar, int i12) {
        super(pVar);
        this.f366567b = i12;
        if (i12 < 0) {
            throw new IllegalArgumentException("retryLimit must be >= 0");
        }
    }
}

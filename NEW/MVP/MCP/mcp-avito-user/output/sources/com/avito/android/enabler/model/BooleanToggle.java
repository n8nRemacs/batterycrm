package com.avito.android.enabler.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: BooleanToggle.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/enabler/model/BooleanToggle;", "", "key", "", "value", "", "(Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getValue", "()Z", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BooleanToggle {

    @c("key")
    @k
    private final String key;

    @c("value")
    private final boolean value;

    public BooleanToggle(@k String str, boolean z12) {
        this.key = str;
        this.value = z12;
    }

    @k
    public final String getKey() {
        return this.key;
    }

    public final boolean getValue() {
        return this.value;
    }
}

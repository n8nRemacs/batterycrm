package com.avito.android.remote.model.messenger;

import Y61.k;
import kotlin.Metadata;

/* compiled from: MessengerTimestamp.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/messenger/MessengerTimestamp;", "", "()V", "fromMillis", "", "millis", "fromMillisToNanos", "toMillis", "timestamp", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MessengerTimestamp {

    @k
    public static final MessengerTimestamp INSTANCE = new MessengerTimestamp();

    private MessengerTimestamp() {
    }

    public final long fromMillis(long millis) {
        return millis * 10000;
    }

    public final long fromMillisToNanos(long millis) {
        return millis * 10000 * 100;
    }

    public final long toMillis(long timestamp) {
        return timestamp / 10000;
    }
}

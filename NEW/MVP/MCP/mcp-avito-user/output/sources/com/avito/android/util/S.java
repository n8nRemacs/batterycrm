package com.avito.android.util;

import android.content.ClipData;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ClipDataFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/S;", "Lcom/avito/android/util/Q;", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class S implements Q {
    @Inject
    public S() {
    }

    @Override // com.avito.android.util.Q
    @Y61.k
    public final ClipData a(@Y61.k String str) {
        return ClipData.newPlainText(null, str);
    }
}

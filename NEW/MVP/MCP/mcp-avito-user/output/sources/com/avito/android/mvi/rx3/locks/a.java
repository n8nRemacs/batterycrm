package com.avito.android.mvi.rx3.locks;

import kotlin.Metadata;

/* compiled from: OverlapChecker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mvi/rx3/locks/a;", "", "KeyT", "Lcom/avito/android/mvi/rx3/locks/h;", "<init>", "()V", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a<KeyT> implements h<KeyT> {
    @Override // com.avito.android.mvi.rx3.locks.h
    public final boolean a(@Y61.k KeyT keyt, @Y61.k KeyT keyt2) {
        return keyt.equals(keyt2);
    }
}

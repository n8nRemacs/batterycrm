package com.avito.android.mvi.rx3.locks;

import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.I;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: RxLock.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/locks/j;", "", "KeyT", "Lio/reactivex/rxjava3/disposables/d;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface j<KeyT> extends io.reactivex.rxjava3.disposables.d {
    @Y61.k
    <T> I<T> t(@Y61.k I<T> i12, @Y61.k String str, @Y61.k Set<? extends KeyT> set, @Y61.k H h12);
}

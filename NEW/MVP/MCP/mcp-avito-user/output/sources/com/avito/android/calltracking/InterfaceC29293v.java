package com.avito.android.calltracking;

import com.avito.android.calltracking.remote.model.CalltrackingAllocationResponse;
import com.avito.android.calltracking.remote.model.CalltrackingResponse;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: CalltrackingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/v;", "", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.calltracking.v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC29293v {
    @Y61.k
    io.reactivex.rxjava3.core.z<P2<CalltrackingAllocationResponse>> a(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.z<P2<CalltrackingResponse>> b(int i12, int i13, boolean z12);
}

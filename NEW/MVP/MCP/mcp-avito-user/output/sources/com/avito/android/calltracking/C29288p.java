package com.avito.android.calltracking;

import androidx.view.InterfaceC22983P;
import kotlin.Metadata;

/* compiled from: CalltrackingFragmentProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/p;", "Lcom/avito/android/calltracking/o;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.calltracking.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29288p implements InterfaceC29287o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CalltrackingFragment f113760a;

    public C29288p(@Y61.k CalltrackingFragment calltrackingFragment) {
        this.f113760a = calltrackingFragment;
    }

    @Override // com.avito.android.calltracking.InterfaceC29287o
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final CalltrackingFragment getF113760a() {
        return this.f113760a;
    }

    @Override // com.avito.android.calltracking.InterfaceC29287o
    @Y61.k
    public final InterfaceC22983P b() {
        return this.f113760a.getViewLifecycleOwner();
    }
}

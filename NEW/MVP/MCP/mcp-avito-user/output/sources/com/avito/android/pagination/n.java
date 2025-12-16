package com.avito.android.pagination;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.pagination.mvi.InterfaceC32952a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PaginationImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/pagination/n;", "Lcom/avito/android/pagination/d;", "_common_pagination_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32952a f210604a;

    public n(InterfaceC32952a interfaceC32952a, com.avito.android.pagination.mvi.i iVar, int i12, C42822w c42822w) {
        this.f210604a = (i12 & 1) != 0 ? new C31685o(7) : interfaceC32952a;
    }

    @Override // com.avito.android.pagination.d
    public final void a(@Y61.k A1.a aVar) {
    }
}

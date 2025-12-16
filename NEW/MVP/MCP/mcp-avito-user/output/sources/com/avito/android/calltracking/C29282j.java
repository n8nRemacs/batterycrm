package com.avito.android.calltracking;

import com.avito.android.calltracking.I;
import kotlin.Metadata;

/* compiled from: CalltrackingBottomSheetViewPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.calltracking.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29282j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C29283k f113741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.calltracking.item.e f113742c;

    public C29282j(C29283k c29283k, com.avito.android.calltracking.item.e eVar) {
        this.f113741b = c29283k;
        this.f113742c = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f113741b.f113746d.accept(new I.b(this.f113742c.f113719b.getCallId()));
    }
}

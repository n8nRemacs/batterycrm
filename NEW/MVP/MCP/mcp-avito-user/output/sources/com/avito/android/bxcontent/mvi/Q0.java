package com.avito.android.bxcontent.mvi;

import TV.e;
import kotlin.Metadata;

/* compiled from: BxContentSavedSearchPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTV/e;", "event", "", "test", "(LTV/e;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class Q0<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0 f111456b;

    public Q0(P0 p02) {
        this.f111456b = p02;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        String str;
        TV.e eVar = (TV.e) obj;
        return (eVar instanceof e.a) || ((eVar instanceof e.b) && ((str = ((e.b) eVar).f15685a) == null || kotlin.jvm.internal.L.f(str, this.f111456b.f111440k)));
    }
}

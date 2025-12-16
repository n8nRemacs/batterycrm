package com.avito.android.advert_core.safedeal;

import kotlin.Metadata;

/* compiled from: MyAdvertSafeDealServicesView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "test", "(Lkotlin/G0;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f84218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f84219c;

    public k(h hVar, String str) {
        this.f84218b = hVar;
        this.f84219c = str;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return !this.f84218b.f84212g.contains(this.f84219c);
    }
}

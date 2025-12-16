package com.avito.android.home.default_search_location;

import kotlin.Metadata;

/* compiled from: DefaultSearchLocationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f162387b;

    public j(s sVar) {
        this.f162387b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        s sVar = this.f162387b;
        sVar.f162398c.d(null, ((Throwable) obj).getMessage());
        sVar.f162408m = false;
    }
}

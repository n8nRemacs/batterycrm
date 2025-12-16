package com.avito.android.advertising.loaders;

import kotlin.Metadata;

/* compiled from: BitmapBgProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "color", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.b<Integer> f88384b;

    public g(com.jakewharton.rxrelay3.b<Integer> bVar) {
        this.f88384b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f88384b.accept(Integer.valueOf(((Number) obj).intValue()));
    }
}

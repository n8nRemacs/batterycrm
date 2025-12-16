package com.avito.android.messenger.map.viewing;

import com.avito.android.util.InterfaceC35741a1;
import kotlin.Metadata;

/* compiled from: PlatformMapPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class J<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f196790b;

    public J(A a12) {
        this.f196790b = a12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        A a12 = this.f196790b;
        a12.f196774c0.postValue(InterfaceC35741a1.a.a(a12.f196770Y, (Throwable) obj, null, null, 6));
    }
}

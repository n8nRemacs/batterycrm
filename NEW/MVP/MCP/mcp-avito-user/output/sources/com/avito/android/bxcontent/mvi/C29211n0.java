package com.avito.android.bxcontent.mvi;

import kotlin.Metadata;
import pb.InterfaceC47045a;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/collections/H0;", "Lcom/avito/android/serp/adapter/l1;", "it", "", "test", "(Lkotlin/collections/H0;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.mvi.n0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29211n0<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final C29211n0<T> f112489b = new C29211n0<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        T t12 = ((kotlin.collections.H0) obj).f406644b;
        InterfaceC47045a interfaceC47045a = t12 instanceof InterfaceC47045a ? (InterfaceC47045a) t12 : null;
        return interfaceC47045a != null && interfaceC47045a.getHasNotLoadedAd();
    }
}

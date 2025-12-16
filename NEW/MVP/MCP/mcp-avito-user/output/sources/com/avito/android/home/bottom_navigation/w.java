package com.avito.android.home.bottom_navigation;

import kotlin.Metadata;
import kotlin.Q;

/* compiled from: BottomNavigationViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isPro", "isEmployee", "Lkotlin/Q;", "Lcom/avito/android/passport_lib/u;", "apply", "(ZZ)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class w<T1, T2, R> implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.passport_lib.u f162368b;

    public w(com.avito.android.passport_lib.u uVar) {
        this.f162368b = uVar;
    }

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        return new Q(this.f162368b, Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue()));
    }
}

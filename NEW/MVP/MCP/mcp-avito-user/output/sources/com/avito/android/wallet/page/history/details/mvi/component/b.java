package com.avito.android.wallet.page.history.details.mvi.component;

import SO0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentHistoryDetailsActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSO0/a;", "action", "", "invoke", "(LSO0/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class b extends N implements Y41.l<SO0.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f327888l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(SO0.a aVar) {
        SO0.a aVar2 = aVar;
        return Boolean.valueOf(aVar2 instanceof a.c ? true : aVar2 instanceof a.f ? true : aVar2 instanceof a.d);
    }
}

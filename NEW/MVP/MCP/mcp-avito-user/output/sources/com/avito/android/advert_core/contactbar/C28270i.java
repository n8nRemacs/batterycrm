package com.avito.android.advert_core.contactbar;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert_core.contactbar.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28270i extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28266e f83234l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28270i(C28266e c28266e) {
        super(1);
        this.f83234l = c28266e;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        C28266e c28266e = this.f83234l;
        com.avito.android.advert_core.advert.c cVar = c28266e.f83171O;
        if (cVar != null) {
            cVar.la();
        }
        com.avito.android.advert_core.advert.c cVar2 = c28266e.f83171O;
        if (cVar2 != null) {
            cVar2.ka(th3);
        }
        return G0.f406611a;
    }
}

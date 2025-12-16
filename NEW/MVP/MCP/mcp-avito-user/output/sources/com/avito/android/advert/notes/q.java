package com.avito.android.advert.notes;

import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.advert_details.ContactBarData;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: EditAdvertNotePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isFavorite", "Lio/reactivex/rxjava3/core/O;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f80922b;

    public q(t tVar) {
        this.f80922b = tVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            return I.q(Boolean.FALSE);
        }
        t tVar = this.f80922b;
        com.avito.android.favorite.h hVar = tVar.f80931f;
        AbstractC30567a.f fVar = new AbstractC30567a.f("item", tVar.f80934i, null);
        ContactBarData contactBarData = tVar.f80927b;
        return hVar.g(tVar.f80926a, fVar, zBooleanValue, contactBarData != null ? contactBarData.getVerticalAlias() : null, contactBarData != null ? contactBarData.getCustomerValue() : null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : null, (2016 & 1024) != 0).r(new p());
    }
}

package com.avito.android.advert.item.note;

import com.avito.android.advert.item.W0;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;

/* compiled from: AdvertDetailsNotePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f77812b;

    public d(e eVar) {
        this.f77812b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        e eVar = this.f77812b;
        AdvertDetails advertDetails = eVar.f77817f;
        if (advertDetails != null) {
            eVar.f77814c.W1(advertDetails);
            W0 w02 = eVar.f77820i;
            if (w02 != null) {
                w02.e(advertDetails, eVar.f77815d);
            }
        }
    }
}

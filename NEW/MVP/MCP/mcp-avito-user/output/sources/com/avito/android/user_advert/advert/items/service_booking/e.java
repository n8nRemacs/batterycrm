package com.avito.android.user_advert.advert.items.service_booking;

import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbStatusBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f310131l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f310132m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a aVar) {
        super(0);
        this.f310131l = fVar;
        this.f310132m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f310131l.f310134c;
        if (myAdvertDetailsActivity != null) {
            MyAdvertDetails.SbStatusBlock.Action action = this.f310132m.f310123f;
            myAdvertDetailsActivity.f2(action != null ? action.getUri() : null);
        }
        return G0.f406611a;
    }
}

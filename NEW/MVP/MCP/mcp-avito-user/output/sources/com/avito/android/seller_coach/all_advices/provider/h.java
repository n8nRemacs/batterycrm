package com.avito.android.seller_coach.all_advices.provider;

import Aq0.InterfaceC13071a;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.seller_coach.all_advices.AllAdvicesFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AllAdvicesIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/all_advices/provider/h;", "LAq0/a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements InterfaceC13071a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f267354a;

    @Inject
    public h(@Y61.k L l12) {
        this.f267354a = l12;
    }

    @Override // Aq0.InterfaceC13071a
    @Y61.k
    public final Intent a() {
        return this.f267354a.d(new AllAdvicesFragmentData());
    }
}

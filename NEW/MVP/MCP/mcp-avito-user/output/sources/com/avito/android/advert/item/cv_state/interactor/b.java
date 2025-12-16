package com.avito.android.advert.item.cv_state.interactor;

import Y61.k;
import Zf.InterfaceC19551a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.cv_state.CvStateType;
import com.avito.android.util.R0;
import h31.e;
import io.reactivex.rxjava3.internal.operators.observable.C;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.rx3.K;

/* compiled from: AdvertCvStateInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/cv_state/interactor/b;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC19551a> f75081a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.cv_state.mapper.a f75082b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f75083c;

    @Inject
    public b(@k e<InterfaceC19551a> eVar, @k com.avito.android.advert.item.cv_state.mapper.a aVar, @k R0 r02) {
        this.f75081a = eVar;
        this.f75082b = aVar;
        this.f75083c = r02;
    }

    @k
    public final C a(@k String str, @k CvStateType cvStateType) {
        return K.a(this.f75083c.a(), new a(this, str, cvStateType, null));
    }
}

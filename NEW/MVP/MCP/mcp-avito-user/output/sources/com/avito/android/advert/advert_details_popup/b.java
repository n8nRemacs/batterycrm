package com.avito.android.advert.advert_details_popup;

import Ba1.B;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.W;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

/* compiled from: AdvertDetailsGetDownloadInfoInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/advert_details_popup/b;", "Lcom/avito/android/advert/advert_details_popup/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f68609a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.P f68610b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f68611c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h31.e<OkHttpClient> f68612d;

    @Inject
    public b(@k Gson gson, @k com.avito.android.P p12, @k InterfaceC35745a5 interfaceC35745a5, @k h31.e<OkHttpClient> eVar) {
        this.f68609a = gson;
        this.f68610b = p12;
        this.f68611c = interfaceC35745a5;
        this.f68612d = eVar;
    }

    @Override // com.avito.android.advert.advert_details_popup.a
    @k
    public final W a(@k String str) {
        return new C42006d(new B(20, this, str)).z(this.f68611c.a());
    }
}

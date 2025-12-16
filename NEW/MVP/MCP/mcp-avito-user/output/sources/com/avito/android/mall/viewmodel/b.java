package com.avito.android.mall.viewmodel;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.deep_linking.x;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MallViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mall/viewmodel/b;", "Landroidx/lifecycle/P0$c;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final MX.a f184355a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f184356b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.search.h f184357c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final KX.b f184358d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final z<LX.b> f184359e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final x f184360f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final KX.b f184361g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Gson f184362h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.mall.webview.b f184363i;

    @Inject
    public b(@k MX.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.search.h hVar, @k KX.b bVar, @k z<LX.b> zVar, @k x xVar, @k KX.b bVar2, @k Gson gson, @k com.avito.android.mall.webview.b bVar3) {
        this.f184355a = aVar;
        this.f184356b = interfaceC35745a5;
        this.f184357c = hVar;
        this.f184358d = bVar;
        this.f184359e = zVar;
        this.f184360f = xVar;
        this.f184361g = bVar2;
        this.f184362h = gson;
        this.f184363i = bVar3;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        return new g(this.f184355a, this.f184356b, this.f184357c, this.f184358d, this.f184359e, this.f184360f, this.f184361g, this.f184362h, this.f184363i);
    }
}

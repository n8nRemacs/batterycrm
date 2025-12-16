package com.avito.android.publish.publish_advert_request;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.photo_cache.j;
import com.avito.android.photo_picker.b0;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC33544d;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishAdvertRequestViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/g;", "Landroidx/lifecycle/P0$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.publish.publish_advert_request.data.a f239029a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f239030b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f239031c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b0 f239032d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final j f239033e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC33544d f239034f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C0 f239035g;

    @Inject
    public g(@k com.avito.android.publish.publish_advert_request.data.a aVar, @k InterfaceC28373a interfaceC28373a, @k InterfaceC35745a5 interfaceC35745a5, @k b0 b0Var, @k j jVar, @k InterfaceC33544d interfaceC33544d, @k C0 c02) {
        this.f239029a = aVar;
        this.f239030b = interfaceC28373a;
        this.f239031c = interfaceC35745a5;
        this.f239032d = b0Var;
        this.f239033e = jVar;
        this.f239034f = interfaceC33544d;
        this.f239035g = c02;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (!cls.isAssignableFrom(e.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        InterfaceC33544d interfaceC33544d = this.f239034f;
        C0 c02 = this.f239035g;
        return cls.cast(new e(this.f239029a, this.f239030b, this.f239031c, this.f239032d, this.f239033e, interfaceC33544d, c02));
    }
}

package com.avito.android.publish.edit_advert_request;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.util.InterfaceC35745a5;
import de0.InterfaceC39719d;
import javax.inject.Inject;
import kotlin.Metadata;
import nI0.InterfaceC44261b;
import yc.C50213a;

/* compiled from: EditAdvertRequestViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/edit_advert_request/m;", "Landroidx/lifecycle/P0$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39719d f235531a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235532b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f235533c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C50213a f235534d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C0 f235535e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f235536f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f235537g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final eH0.c f235538h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f235539i;

    @Inject
    public m(@Y61.k InterfaceC39719d interfaceC39719d, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a, @Y61.k C0 c02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a aVar2, @Y61.k eH0.c cVar, @Y61.k InterfaceC44261b interfaceC44261b) {
        this.f235531a = interfaceC39719d;
        this.f235532b = interfaceC35745a5;
        this.f235533c = interfaceC28373a;
        this.f235534d = c50213a;
        this.f235535e = c02;
        this.f235536f = aVar;
        this.f235537g = aVar2;
        this.f235538h = cVar;
        this.f235539i = interfaceC44261b;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(j.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        eH0.c cVar = this.f235538h;
        InterfaceC44261b interfaceC44261b = this.f235539i;
        return cls.cast(new j(this.f235531a, this.f235532b, this.f235533c, this.f235534d, this.f235535e, this.f235536f, this.f235537g, cVar, interfaceC44261b));
    }
}

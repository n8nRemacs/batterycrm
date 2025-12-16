package com.avito.android.user_adverts_views.advert_item.factory;

import Y61.k;
import Zx.C19616a;
import bW.InterfaceC25571b;
import com.avito.android.user_adverts_views.advert_item.factory.a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import ur.C49102c;
import wJ0.InterfaceC49523d;
import xJ0.InterfaceC49849a;
import xJ0.InterfaceC49850b;

/* compiled from: UserAdvertItemViewProviderFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views/advert_item/factory/f;", "LxJ0/b;", "_avito_user-adverts-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements InterfaceC49850b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C49102c f316504a;

    @Inject
    public f(@k C49102c c49102c) {
        this.f316504a = c49102c;
    }

    @Override // xJ0.InterfaceC49850b
    @k
    public final InterfaceC49849a a(@k com.avito.android.user_adverts_views_pub.a aVar, @k InterfaceC49523d interfaceC49523d, @k InterfaceC25571b interfaceC25571b, @k C19616a c19616a, @k InterfaceC49850b.InterfaceC12859b.a aVar2) {
        new a.b();
        return new a.c(new b(), aVar, interfaceC49523d, interfaceC25571b, c19616a, aVar2, this.f316504a, null);
    }
}

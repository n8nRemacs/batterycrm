package com.yandex.metrica.impl.ob;

import com.yandex.metrica.modules.api.CommonIdentifiers;
import com.yandex.metrica.modules.api.ModuleFullRemoteConfig;
import com.yandex.metrica.modules.api.RemoteConfigMetaInfo;

/* renamed from: com.yandex.metrica.impl.ob.id, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38878id {

    /* renamed from: a, reason: collision with root package name */
    private final CommonIdentifiers f380784a;

    /* renamed from: b, reason: collision with root package name */
    private final RemoteConfigMetaInfo f380785b;

    /* renamed from: c, reason: collision with root package name */
    private final C39057pi f380786c;

    public C38878id(@Y61.k C39057pi c39057pi) {
        this.f380786c = c39057pi;
        this.f380784a = new CommonIdentifiers(c39057pi.V(), c39057pi.i());
        this.f380785b = new RemoteConfigMetaInfo(c39057pi.o(), c39057pi.B());
    }

    @Y61.k
    public final ModuleFullRemoteConfig a(@Y61.k String str) {
        return new ModuleFullRemoteConfig(this.f380784a, this.f380785b, this.f380786c.A().get(str));
    }
}

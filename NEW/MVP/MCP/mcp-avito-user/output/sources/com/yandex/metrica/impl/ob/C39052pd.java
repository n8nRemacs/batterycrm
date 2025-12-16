package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.HostRetryInfoProvider;

/* renamed from: com.yandex.metrica.impl.ob.pd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39052pd implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    private final C38774e9 f381292a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC39076qd f381293b;

    public C39052pd(@Y61.k C38774e9 c38774e9, @Y61.k EnumC39076qd enumC39076qd) {
        this.f381292a = c38774e9;
        this.f381293b = enumC39076qd;
    }

    @Override // com.yandex.metrica.networktasks.api.HostRetryInfoProvider
    public long getLastAttemptTimeSeconds() {
        return this.f381292a.a(this.f381293b, 0L);
    }

    @Override // com.yandex.metrica.networktasks.api.HostRetryInfoProvider
    public int getNextSendAttemptNumber() {
        return this.f381292a.a(this.f381293b, 1);
    }

    @Override // com.yandex.metrica.networktasks.api.HostRetryInfoProvider
    public void saveLastAttemptTimeSeconds(long j12) {
        this.f381292a.b(this.f381293b, j12);
    }

    @Override // com.yandex.metrica.networktasks.api.HostRetryInfoProvider
    public void saveNextSendAttemptNumber(int i12) {
        this.f381292a.b(this.f381293b, i12);
    }
}

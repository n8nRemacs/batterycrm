package ru.avito.messenger;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: EndpointProvider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/m;", "Lru/avito/messenger/l;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47830m implements InterfaceC47829l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HttpUrl f431826a;

    public C47830m(@Y61.k String str) {
        HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str);
        if (httpUrl == null) {
            throw new IllegalArgumentException("invalid endpoint: ".concat(str).toString());
        }
        this.f431826a = httpUrl;
    }

    @Override // ru.avito.messenger.InterfaceC47829l
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.M a() {
        return io.reactivex.rxjava3.core.I.q(this.f431826a);
    }
}

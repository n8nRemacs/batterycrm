package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;

/* compiled from: SimpleDisposable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/core/k;", "Lru/rustore/sdk/reactive/core/g;", "<init>", "()V", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f436877a;

    @Override // ru.rustore.sdk.reactive.core.g
    public final void dispose() {
        this.f436877a = true;
    }
}

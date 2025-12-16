package com.avito.android.remote.analytics;

import javax.inject.Provider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class o implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253223a;

    public /* synthetic */ o(int i12) {
        this.f253223a = i12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f253223a) {
            case 0:
                int i12 = p.f253224c;
                return new jj0.b(100);
            case 1:
                int i13 = p.f253224c;
                return new jj0.b(100);
            default:
                return com.yandex.div.histogram.o.f370020a;
        }
    }
}

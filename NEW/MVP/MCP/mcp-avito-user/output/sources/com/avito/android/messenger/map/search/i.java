package com.avito.android.messenger.map.search;

import com.avito.android.messenger.map.search.h;
import com.avito.android.mvi.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f196566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f196567c;

    public /* synthetic */ i(h.a aVar, int i12) {
        this.f196566b = i12;
        this.f196567c = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f196566b) {
            case 0:
                return h.a.a(this.f196567c, null, new b.C6174b(th2), 1);
            default:
                return this.f196567c;
        }
    }
}

package com.avito.android.feedback_adverts;

import com.avito.android.feedback_adverts.g;
import com.avito.android.feedback_adverts.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class j implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f157836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f157837c;

    public /* synthetic */ j(Object obj, int i12) {
        this.f157836b = i12;
        this.f157837c = obj;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        switch (this.f157836b) {
            case 0:
                return new g.c.b(((h.c) this.f157837c).f157833d, null, (Throwable) obj, 2, null);
            default:
                g.c.C4611c c4611c = (g.c.C4611c) ((g.c) this.f157837c);
                return new g.c.C4611c(c4611c.f157826b, c4611c.f157827c, new g.a.C4610a((Throwable) obj));
        }
    }
}

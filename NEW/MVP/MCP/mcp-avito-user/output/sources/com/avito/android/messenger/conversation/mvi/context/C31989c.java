package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.messenger.conversation.OpenedFrom;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.conversation.mvi.context.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C31989c implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31988b f190295c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31987a.C5631a f190296d;

    public /* synthetic */ C31989c(C31988b c31988b, InterfaceC31987a.C5631a c5631a, int i12) {
        this.f190294b = i12;
        this.f190295c = c31988b;
        this.f190296d = c5631a;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f190294b) {
            case 0:
                C31988b c31988b = this.f190295c;
                c31988b.f190249d0.k(th2);
                Throwable thA = com.avito.android.messenger.util.q.a(th2);
                c31988b.f190246a0.b(c31988b.f190241V, c31988b.f190247b0 == OpenedFrom.f189129c ? "error on chat loading from push" : "error on chat loading from list");
                return InterfaceC31987a.C5631a.a(this.f190296d, null, new b.C6174b(thA), null, false, 13);
            default:
                this.f190295c.f190249d0.g(th2);
                return this.f190296d;
        }
    }
}

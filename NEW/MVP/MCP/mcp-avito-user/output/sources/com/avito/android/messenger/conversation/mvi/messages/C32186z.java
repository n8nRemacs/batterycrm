package com.avito.android.messenger.conversation.mvi.messages;

import Oq.InterfaceC14725a;
import com.avito.android.messenger.MessageListPaginationException;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import com.avito.android.util.V2;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C32186z implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f193653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e f193654c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c f193655d;

    public /* synthetic */ C32186z(C32141e c32141e, InterfaceC32129a.c cVar, int i12) {
        this.f193653b = i12;
        this.f193654c = c32141e;
        this.f193655d = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f193653b) {
            case 0:
                C32141e c32141e = this.f193654c;
                V2.f318762a.j(c32141e.f207131E, "LoadPrevPageForQuote error: " + th2, null);
                InterfaceC14725a.C0808a.a(c32141e.f192910d0, new MessageListPaginationException("Failed to load previous page", th2), null, 6);
                break;
            default:
                C32141e c32141e2 = this.f193654c;
                V2.f318762a.j(c32141e2.f207131E, "LoadPrevPage error: " + th2, null);
                InterfaceC14725a.C0808a.a(c32141e2.f192910d0, new MessageListPaginationException("Failed to load previous page", th2), null, 6);
                break;
        }
        return InterfaceC32129a.c.C5680c.a((InterfaceC32129a.c.C5680c) this.f193655d, null, new InterfaceC32129a.b.C5677a(null, 1, null), 0, 13);
    }
}

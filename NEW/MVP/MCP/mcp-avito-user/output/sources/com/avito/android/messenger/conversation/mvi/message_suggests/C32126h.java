package com.avito.android.messenger.conversation.mvi.message_suggests;

import arrow.core.AbstractC23662a;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C32126h implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f191978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32120b f191979c;

    public /* synthetic */ C32126h(C32120b c32120b, int i12) {
        this.f191978b = i12;
        this.f191979c = c32120b;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f191978b) {
            case 0:
                this.f191979c.f191952g.accept(new AbstractC23662a.b(th2));
                break;
            default:
                this.f191979c.f191952g.accept(new AbstractC23662a.b(th2));
                break;
        }
        return G0.f406611a;
    }
}

package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.messenger.conversation.mvi.context.C31988b;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32009x implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X81.i f190404c;

    public C32009x(C31988b c31988b, X81.i iVar) {
        this.f190403b = c31988b;
        this.f190404c = iVar;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        this.f190403b.le().s(new C31988b.c(this.f190404c.getFromId()));
    }
}

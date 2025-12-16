package com.avito.android.messenger.conversation.mvi.context;

import kotlin.Metadata;

/* compiled from: ChannelContextView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "collapse", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f190368b;

    public e0(f0 f0Var) {
        this.f190368b = f0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        f0 f0Var = this.f190368b;
        if (zBooleanValue) {
            f0Var.f190375f.ga(true);
        } else {
            f0Var.f190375f.j2();
        }
    }
}

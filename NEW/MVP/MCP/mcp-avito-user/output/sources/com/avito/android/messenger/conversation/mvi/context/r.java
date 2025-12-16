package com.avito.android.messenger.conversation.mvi.context;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "interlocutorIds", "Lkotlin/G0;", "accept", "(Ljava/util/Set;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190396b;

    public r(C31988b c31988b) {
        this.f190396b = c31988b;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C31988b c31988b = this.f190396b;
        c31988b.f190244Y.u8(c31988b.f190259n0, (Set) obj);
    }
}

package com.avito.android.messenger.conversation.mvi.channel_feature;

import com.avito.android.messenger.conversation.mvi.channel_feature.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: ChannelActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMY/a;", "action", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a;", "invoke", "(LMY/a;)Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements Y41.l<MY.a, a.InterfaceC5598a> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f189701l = new d();

    public d() {
        super(1);
    }

    @Override // Y41.l
    public final a.InterfaceC5598a invoke(MY.a aVar) {
        MY.a aVar2 = aVar;
        if (aVar2 instanceof MY.l) {
            return a.InterfaceC5598a.c.f189696a;
        }
        if (aVar2 instanceof MY.b) {
            return ((MY.b) aVar2) instanceof NY.i ? a.InterfaceC5598a.c.f189696a : a.InterfaceC5598a.b.f189695a;
        }
        if (aVar2 instanceof MY.d) {
            return a.InterfaceC5598a.C5599a.f189694a;
        }
        throw new NoWhenBranchMatchedException();
    }
}

package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.messenger.channels.mvi.sync.C31864v.b;
import com.avito.android.messenger.channels.mvi.sync.InterfaceC31860t;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ChannelSyncOnPushAgent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/t$a;", "oldState", "invoke", "(Lcom/avito/android/messenger/channels/mvi/sync/t$a;)Lcom/avito/android/messenger/channels/mvi/sync/t$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31862u extends kotlin.jvm.internal.N implements Y41.l<InterfaceC31860t.a, InterfaceC31860t.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f188567l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C31864v f188568m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31862u(C31864v c31864v, String str) {
        super(1);
        this.f188567l = str;
        this.f188568m = c31864v;
    }

    @Override // Y41.l
    public final InterfaceC31860t.a invoke(InterfaceC31860t.a aVar) {
        InterfaceC31860t.a aVar2 = aVar;
        Set<String> set = aVar2.f188564a;
        String str = this.f188567l;
        if (set.contains(str)) {
            return aVar2;
        }
        C31864v c31864v = this.f188568m;
        c31864v.le().s(c31864v.new b(str));
        return InterfaceC31860t.a.a(aVar2, null, aVar2.f188565b + 1, 1);
    }
}

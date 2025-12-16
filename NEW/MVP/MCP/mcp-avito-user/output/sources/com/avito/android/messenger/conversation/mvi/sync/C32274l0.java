package com.avito.android.messenger.conversation.mvi.sync;

import Oq.InterfaceC14725a;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.MessageSyncException;
import com.avito.android.util.X2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.l0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32274l0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f194802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f194803c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f194804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f194805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f194807g;

    public C32274l0(Long l12, String str, String str2, P p12, MessengerUserHashInfo messengerUserHashInfo, String str3) {
        this.f194802b = l12;
        this.f194803c = str;
        this.f194804d = str2;
        this.f194805e = p12;
        this.f194806f = messengerUserHashInfo;
        this.f194807g = str3;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder("onError syncMessagesToSearchTarget(before = ");
        sb2.append(this.f194802b);
        sb2.append(", targetMessageId=");
        sb2.append(this.f194803c);
        sb2.append(", searchQuery=");
        String strC = C22026a.c(sb2, this.f194804d, ')');
        InterfaceC14725a.C0808a.a(this.f194805e.f194647o, new MessageSyncException(strC, th2), com.avito.android.messenger.util.i.a(this.f194806f, new kotlin.Q("channelId", this.f194807g)), 2);
        X2.f318778a.a("MessageSyncAgent", strC, th2);
    }
}

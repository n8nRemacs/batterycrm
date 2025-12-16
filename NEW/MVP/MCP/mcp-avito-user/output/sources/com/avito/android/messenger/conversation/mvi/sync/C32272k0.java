package com.avito.android.messenger.conversation.mvi.sync;

import androidx.compose.runtime.C22026a;
import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/K$c;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/sync/K$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.k0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32272k0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f194796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f194797c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f194798d;

    public C32272k0(Long l12, String str, String str2) {
        this.f194796b = l12;
        this.f194797c = str;
        this.f194798d = str2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        X2 x22 = X2.f318778a;
        StringBuilder sb2 = new StringBuilder("onSuccess syncMessagesToSearchTarget(before = ");
        sb2.append(this.f194796b);
        sb2.append(", targetMessageId=");
        sb2.append(this.f194797c);
        sb2.append(", searchQuery=");
        x22.c("MessageSyncAgent", C22026a.c(sb2, this.f194798d, ')'), null);
    }
}

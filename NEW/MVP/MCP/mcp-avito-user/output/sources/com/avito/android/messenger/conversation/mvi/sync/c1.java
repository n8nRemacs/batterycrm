package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.util.V2;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: VoiceInfoSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X0 f194759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set<String> f194760c;

    public c1(X0 x02, Set<String> set) {
        this.f194759b = x02;
        this.f194760c = set;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        V2 v22 = V2.f318762a;
        int i12 = X0.f194726a0;
        v22.a(this.f194759b.f207131E, "Failed to load voice info for ids: " + this.f194760c, (Throwable) obj);
    }
}

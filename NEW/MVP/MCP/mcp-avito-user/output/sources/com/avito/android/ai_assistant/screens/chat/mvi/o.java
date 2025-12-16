package com.avito.android.ai_assistant.screens.chat.mvi;

import Vb.InterfaceC15661a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.N0;

/* compiled from: AiAssistantChatActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConcurrentHashMap<String, N0> f89418l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC15661a.h f89419m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ConcurrentHashMap<String, N0> concurrentHashMap, InterfaceC15661a.h hVar) {
        super(1);
        this.f89418l = concurrentHashMap;
        this.f89419m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        this.f89418l.remove(this.f89419m.f17220a);
        return G0.f406611a;
    }
}

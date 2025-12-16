package com.avito.android.connection_quality.connectivity;

import android.content.Context;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import l41.o;

/* compiled from: ConnectivityProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Z;", "Lcom/avito/android/connection_quality/reactive_network/a;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f125701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35745a5 f125702c;

    public f(b bVar, InterfaceC35745a5 interfaceC35745a5) {
        this.f125701b = bVar;
        this.f125702c = interfaceC35745a5;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.connection_quality.reactive_network.g gVar = com.avito.android.connection_quality.reactive_network.g.f125730a;
        Context context = this.f125701b.f125692b;
        InterfaceC35745a5 interfaceC35745a5 = this.f125702c;
        k kVar = new k(interfaceC35745a5);
        gVar.getClass();
        return kVar.b(context).j0(interfaceC35745a5.c()).d0(d.f125699b).m0(e.f125700b);
    }
}

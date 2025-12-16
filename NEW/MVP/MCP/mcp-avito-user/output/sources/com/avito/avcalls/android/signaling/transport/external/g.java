package com.avito.avcalls.android.signaling.transport.external;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.r;

/* compiled from: ExternalMessageSender.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f332181l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f332182m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, r rVar) {
        super(1);
        this.f332181l = hVar;
        this.f332182m = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        h.a(this.f332181l, new f(this.f332182m, th2));
        return G0.f406611a;
    }
}

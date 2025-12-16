package com.avito.android.connection_quality.connectivity;

import android.content.Context;
import android.net.NetworkInfo;
import com.avito.android.connection_quality.reactive_network.a;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ObservingStrategyWithRefresh.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class l extends N implements Y41.l<Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f125712l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.connection_quality.reactive_network.a f125713m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f125714n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, k kVar, com.avito.android.connection_quality.reactive_network.a aVar) {
        super(1);
        this.f125712l = context;
        this.f125713m = aVar;
        this.f125714n = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(Long l12) {
        com.avito.android.connection_quality.reactive_network.a.f125715f.getClass();
        Context context = this.f125712l;
        com.avito.android.connection_quality.reactive_network.a aVarA = a.C3733a.a(context);
        if (!this.f125713m.equals(aVarA)) {
            V2.f318762a.c("ObservingStrategyWithRefresh", "onRefresh: connectivity: " + aVarA, null);
            int i12 = k.f125707g;
            k kVar = this.f125714n;
            kVar.c(aVarA);
            kVar.f125709f.e();
            if (aVarA.f125716a != NetworkInfo.State.CONNECTED) {
                k.d(context, kVar, aVarA);
            }
        }
        return G0.f406611a;
    }
}

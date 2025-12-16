package com.esiasdk.android;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EsiaAuthVm.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.l<Exception, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f339682l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar) {
        super(1);
        this.f339682l = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(Exception exc) {
        n nVar = this.f339682l;
        nVar.ke(exc);
        nVar.f339723J.setValue(Boolean.FALSE);
        return G0.f406611a;
    }
}

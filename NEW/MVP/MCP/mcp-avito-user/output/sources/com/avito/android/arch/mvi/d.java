package com.avito.android.arch.mvi;

import com.avito.android.arch.mvi.log.f;
import com.avito.android.arch.mvi.utils.NotSubscribedFeatureException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Feature.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Action", "InternalAction", "State", "OneTimeEvent", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c<Object, Object, Object, Object> f91948l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f91949m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c<Object, Object, Object, Object> cVar, Object obj) {
        super(0);
        this.f91948l = cVar;
        this.f91949m = obj;
    }

    @Override // Y41.a
    public final G0 invoke() {
        c<Object, Object, Object, Object> cVar = this.f91948l;
        cVar.f91920i.a(cVar.f91922k, f.a.a("action"), new NotSubscribedFeatureException(String.valueOf(this.f91949m)));
        return G0.f406611a;
    }
}

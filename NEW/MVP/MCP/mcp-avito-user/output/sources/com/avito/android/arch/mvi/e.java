package com.avito.android.arch.mvi;

import com.avito.android.arch.mvi.log.f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Feature.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Action", "InternalAction", "State", "OneTimeEvent", "", "msg", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c<Object, Object, Object, Object> f91950l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c<Object, Object, Object, Object> cVar) {
        super(1);
        this.f91950l = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        c<Object, Object, Object, Object> cVar = this.f91950l;
        com.avito.android.arch.mvi.log.a aVar = cVar.f91920i;
        f.a aVarA = f.a.a("action");
        aVar.b(cVar.f91922k, aVarA, str);
        return G0.f406611a;
    }
}

package com.avito.android.payment.items.phone_item;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: InputPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f214489l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f214490m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, e eVar) {
        super(1);
        this.f214489l = gVar;
        this.f214490m = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        g gVar = this.f214489l;
        if (!L.f(gVar.f214494d, str2)) {
            this.f214490m.f214491b.accept(new g(gVar.f214492b, gVar.f214493c, str2, gVar.f214495e));
        }
        return G0.f406611a;
    }
}

package com.avito.android.inline_filters.dialog;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InlineFilterDialogOpener.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class q extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f171949l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f171950m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(Y41.l<? super Integer, G0> lVar, j jVar) {
        super(1);
        this.f171949l = lVar;
        this.f171950m = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        Y41.l<Integer, G0> lVar = this.f171949l;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(iIntValue));
        }
        this.f171950m.f171651g = null;
        return G0.f406611a;
    }
}

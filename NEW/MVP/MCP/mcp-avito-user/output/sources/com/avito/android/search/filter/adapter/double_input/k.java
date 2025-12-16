package com.avito.android.search.filter.adapter.double_input;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DoubleInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c<String> f262234l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.jakewharton.rxrelay3.c<String> cVar) {
        super(1);
        this.f262234l = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        if (str2 != null) {
            this.f262234l.accept(str2);
        }
        return G0.f406611a;
    }
}

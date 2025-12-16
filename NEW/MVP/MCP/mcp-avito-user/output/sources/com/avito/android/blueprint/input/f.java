package com.avito.android.blueprint.input;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishInputPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "", "value", "Lkotlin/G0;", "invoke", "(Ljava/lang/CharSequence;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.p<CharSequence, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f105522l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.d f105523m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, com.avito.android.items.d dVar) {
        super(2);
        this.f105522l = oVar;
        this.f105523m = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(CharSequence charSequence, String str) {
        o oVar = this.f105522l;
        oVar.getClass();
        com.avito.android.items.d dVar = this.f105523m;
        dVar.m(str);
        oVar.f105541g.accept(dVar);
        return G0.f406611a;
    }
}

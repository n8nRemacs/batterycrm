package com.avito.android.search.filter.adapter.input;

import Y41.l;
import com.avito.android.common.k;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasFocus", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f262417l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.o f262418m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.common.l f262419n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, f fVar, ParameterElement.o oVar, com.avito.android.common.l lVar) {
        super(1);
        this.f262417l = hVar;
        this.f262418m = oVar;
        this.f262419n = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        com.avito.android.common.l lVar;
        if (!bool.booleanValue()) {
            h hVar = this.f262417l;
            hVar.W();
            String str = this.f262418m.f262786e;
            if (str == null || (lVar = this.f262419n) == null) {
                hVar.m(str);
            } else {
                hVar.m(lVar.a(new k(0, 0, str)).f123766a.toString());
            }
        }
        return G0.f406611a;
    }
}

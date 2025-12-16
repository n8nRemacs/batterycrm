package com.avito.android.search.filter.adapter.input;

import Y41.l;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.o f262415l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f262416m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ParameterElement.o oVar, f fVar) {
        super(1);
        this.f262415l = oVar;
        this.f262416m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        ParameterElement.o oVar = this.f262415l;
        oVar.f262786e = str;
        this.f262416m.f262421c.accept(oVar);
        return G0.f406611a;
    }
}

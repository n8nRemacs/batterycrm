package com.avito.android.search.filter.adapter.keywords;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: KeywordsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f262472l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f262473m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.p f262474n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, g gVar, ParameterElement.p pVar) {
        super(1);
        this.f262472l = qVar;
        this.f262473m = gVar;
        this.f262474n = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        q qVar = this.f262472l;
        q.k(this.f262473m, str2);
        ParameterElement.p pVar = this.f262474n;
        qVar.f262480d.accept(new ParameterElement.p(pVar.f262802c, pVar.f262803d, pVar.f262804e, pVar.f262805f, pVar.f262806g, pVar.f262807h, str2, pVar.f262809j, pVar.f262810k));
        return G0.f406611a;
    }
}

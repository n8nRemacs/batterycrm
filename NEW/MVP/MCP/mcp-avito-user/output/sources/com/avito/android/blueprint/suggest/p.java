package com.avito.android.blueprint.suggest;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishInputWithSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isFocused", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class p extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f105725l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.H f105726m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f105727n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w wVar, y yVar, ParameterElement.H h12) {
        super(1);
        this.f105725l = wVar;
        this.f105726m = h12;
        this.f105727n = yVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        w.k(this.f105725l, this.f105726m, this.f105727n, zBooleanValue);
        return G0.f406611a;
    }
}

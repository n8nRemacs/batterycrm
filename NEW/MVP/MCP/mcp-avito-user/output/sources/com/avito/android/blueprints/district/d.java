package com.avito.android.blueprints.district;

import Y41.l;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiStateDistrictItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f105886l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C29379g f105887m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ParameterElement.C29379g c29379g) {
        super(1);
        this.f105886l = fVar;
        this.f105887m = c29379g;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        if (str.length() == 0) {
            this.f105886l.f105893e.accept(this.f105887m);
        }
        return G0.f406611a;
    }
}

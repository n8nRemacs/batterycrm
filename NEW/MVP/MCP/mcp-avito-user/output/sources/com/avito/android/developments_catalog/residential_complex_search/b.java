package com.avito.android.developments_catalog.residential_complex_search;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sx.InterfaceC48426a;

/* compiled from: ResidentialComplexActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "searchValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class b extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ResidentialComplexActivity f139166l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ResidentialComplexActivity residentialComplexActivity) {
        super(1);
        this.f139166l = residentialComplexActivity;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        int i12 = ResidentialComplexActivity.f139122v;
        this.f139166l.a2().accept(new InterfaceC48426a.d(str));
        return G0.f406611a;
    }
}

package com.avito.android.realty_agency.use_case;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: AddLotToSelectionUseCase.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f251760l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f251761m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f251762n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f251763o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, long j12, String str2) {
        super(0);
        this.f251760l = aVar;
        this.f251761m = str;
        this.f251762n = j12;
        this.f251763o = str2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        long j12 = this.f251762n;
        String str = this.f251763o;
        a aVar = this.f251760l;
        C43175k.K(aVar.a(j12, this.f251761m, str), aVar.f251754g);
        return G0.f406611a;
    }
}

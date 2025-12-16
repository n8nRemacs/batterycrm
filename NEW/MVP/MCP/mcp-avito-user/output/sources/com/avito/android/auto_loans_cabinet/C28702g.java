package com.avito.android.auto_loans_cabinet;

import Ke.InterfaceC14305a;
import androidx.compose.runtime.C22066f2;
import com.avito.android.auto_loans_cabinet.mvi.entity.AppBarData;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoLoanCabinetScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.auto_loans_cabinet.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28702g extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppBarData f95401l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC14305a, G0> f95402m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f95403n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28702g(AppBarData appBarData, Y41.l<? super InterfaceC14305a, G0> lVar, int i12) {
        super(2);
        this.f95401l = appBarData;
        this.f95402m = lVar;
        this.f95403n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f95403n | 1);
        C28710o.b(this.f95401l, this.f95402m, a12, iA2);
        return G0.f406611a;
    }
}

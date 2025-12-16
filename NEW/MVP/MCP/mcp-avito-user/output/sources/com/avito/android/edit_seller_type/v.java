package com.avito.android.edit_seller_type;

import androidx.compose.runtime.C22066f2;
import com.avito.android.edit_seller_type.mvi.entity.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditSellerTypeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class v extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.e f146868l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f146869m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f146870n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c.e eVar, Y41.a<G0> aVar, int i12) {
        super(2);
        this.f146868l = eVar;
        this.f146869m = aVar;
        this.f146870n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f146870n | 1);
        o.f(this.f146868l, this.f146869m, a12, iA2);
        return G0.f406611a;
    }
}

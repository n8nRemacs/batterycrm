package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.items;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import eM.InterfaceC40021a;
import eM.c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MicAccessItemView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class B extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.b.C11075c f168961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40021a, G0> f168962m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f168963n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f168964o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(c.b.C11075c c11075c, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f168961l = c11075c;
        this.f168962m = lVar;
        this.f168963n = aVar;
        this.f168964o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f168964o | 1);
        v.a aVar = this.f168963n;
        D.a(this.f168961l, this.f168962m, aVar, a12, iA2);
        return G0.f406611a;
    }
}

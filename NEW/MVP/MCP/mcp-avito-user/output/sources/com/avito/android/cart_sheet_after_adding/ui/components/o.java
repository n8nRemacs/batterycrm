package com.avito.android.cart_sheet_after_adding.ui.components;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CartSheetAfterAddingMainSnippet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class o extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f115571l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f115572m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f115573n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f115574o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i12, Integer num, String str, String str2) {
        super(2);
        this.f115571l = str;
        this.f115572m = str2;
        this.f115573n = num;
        this.f115574o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f115574o | 1);
        String str = this.f115572m;
        Integer num2 = this.f115573n;
        p.c(this.f115571l, str, num2, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.universal_transaction.transaction;

import androidx.compose.runtime.C22066f2;
import com.akita.compose.component.bottom_sheet.I;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TransactionDebugMenu.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class l extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BG0.a f306600l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<BG0.a, G0> f306601m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I f306602n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f306603o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(BG0.a aVar, Y41.l<? super BG0.a, G0> lVar, I i12, int i13) {
        super(2);
        this.f306600l = aVar;
        this.f306601m = lVar;
        this.f306602n = i12;
        this.f306603o = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f306603o | 1);
        Y41.l<BG0.a, G0> lVar = this.f306601m;
        I i12 = this.f306602n;
        m.c(this.f306600l, lVar, i12, a12, iA2);
        return G0.f406611a;
    }
}

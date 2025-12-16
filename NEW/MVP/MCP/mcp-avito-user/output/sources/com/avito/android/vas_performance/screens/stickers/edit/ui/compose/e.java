package com.avito.android.vas_performance.screens.stickers.edit.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f320851l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Boolean f320852m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Boolean f320853n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f320854o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f320855p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, Boolean bool, Boolean bool2, Y41.a<G0> aVar, int i12) {
        super(2);
        this.f320851l = str;
        this.f320852m = bool;
        this.f320853n = bool2;
        this.f320854o = aVar;
        this.f320855p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f320855p | 1);
        Boolean bool = this.f320853n;
        Y41.a<G0> aVar = this.f320854o;
        q.b(this.f320851l, this.f320852m, bool, aVar, a12, iA2);
        return G0.f406611a;
    }
}

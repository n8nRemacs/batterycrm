package com.avito.android.btob_business_trip.screens.infoScreen.composables;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConditionItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f107931l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f107932m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f107933n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f107934o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, v vVar, int i12) {
        super(2);
        this.f107931l = str;
        this.f107932m = str2;
        this.f107933n = vVar;
        this.f107934o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        g.a(C22066f2.a(this.f107934o | 1), a12, this.f107933n, this.f107931l, this.f107932m);
        return G0.f406611a;
    }
}

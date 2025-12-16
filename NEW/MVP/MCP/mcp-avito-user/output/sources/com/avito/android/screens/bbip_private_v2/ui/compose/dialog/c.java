package com.avito.android.screens.bbip_private_v2.ui.compose.dialog;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipPrivateV2DurationPickerSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State.e.a f261178l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f261179m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f261180n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f261181o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f261182p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BbipPrivateV2State.e.a aVar, int i12, Y41.l lVar, v.a aVar2, int i13) {
        super(2);
        this.f261178l = aVar;
        this.f261179m = i12;
        this.f261180n = lVar;
        this.f261181o = aVar2;
        this.f261182p = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        d.a(this.f261178l, this.f261179m, this.f261180n, this.f261181o, a12, C22066f2.a(this.f261182p | 1));
        return G0.f406611a;
    }
}

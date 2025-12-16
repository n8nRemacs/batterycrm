package com.akita.compose.component.date_picker.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WeekDaysHeader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class s extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f61397l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f61398m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f61399n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(K k12, F f12, v.a aVar, int i12) {
        super(2);
        this.f61397l = k12;
        this.f61398m = f12;
        this.f61399n = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        v.a aVar = this.f61399n;
        u.a(this.f61397l, this.f61398m, aVar, a12, iA2);
        return G0.f406611a;
    }
}

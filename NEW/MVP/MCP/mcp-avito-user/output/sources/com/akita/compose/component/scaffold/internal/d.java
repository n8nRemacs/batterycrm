package com.akita.compose.component.scaffold.internal;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScaffoldLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f62528l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f62529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ToastBarPosition> f62530n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f62531o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f62532p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f62533q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C22096n c22096n, C22096n c22096n2, Y41.a aVar, C22096n c22096n3, C22096n c22096n4, C22096n c22096n5, int i12) {
        super(2);
        this.f62528l = c22096n;
        this.f62529m = c22096n2;
        this.f62530n = aVar;
        this.f62531o = c22096n3;
        this.f62532p = c22096n4;
        this.f62533q = c22096n5;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3073);
        C22096n c22096n = this.f62531o;
        e.a(this.f62528l, this.f62529m, this.f62530n, c22096n, this.f62532p, this.f62533q, a12, iA2);
        return G0.f406611a;
    }
}

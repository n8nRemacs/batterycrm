package com.avito.android.iac_dialer_ui.pub.call_screen.toasts;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUICallToast.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacUICallToastState f167353l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f167354m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f167355n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f167356o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(IacUICallToastState iacUICallToastState, v.a aVar, Y41.a aVar2, int i12) {
        super(2);
        this.f167353l = iacUICallToastState;
        this.f167354m = aVar;
        this.f167355n = (N) aVar2;
        this.f167356o = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167356o | 1);
        ?? r02 = this.f167355n;
        i.a(this.f167353l, this.f167354m, r02, a12, iA2);
        return G0.f406611a;
    }
}

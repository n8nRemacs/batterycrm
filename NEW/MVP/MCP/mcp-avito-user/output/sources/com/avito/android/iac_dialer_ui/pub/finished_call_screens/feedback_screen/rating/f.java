package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIRatingPanel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f167668l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f167669m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f167670n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l<Integer, G0> f167671o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f167672p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f167673q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i12, boolean z12, boolean z13, l lVar, v vVar, int i13) {
        super(2);
        this.f167668l = i12;
        this.f167669m = z12;
        this.f167670n = z13;
        this.f167671o = lVar;
        this.f167672p = vVar;
        this.f167673q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167673q | 1);
        boolean z12 = this.f167670n;
        l<Integer, G0> lVar = this.f167671o;
        g.a(this.f167668l, this.f167669m, z12, lVar, this.f167672p, a12, iA2);
        return G0.f406611a;
    }
}

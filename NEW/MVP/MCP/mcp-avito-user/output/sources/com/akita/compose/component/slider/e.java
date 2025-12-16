package com.akita.compose.component.slider;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f62694l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f62695m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62696n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f62697o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f62698p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f62699q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f62700r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f62701s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, s sVar, androidx.compose.ui.v vVar, boolean z12, androidx.compose.foundation.interaction.m mVar, C22096n c22096n, C22096n c22096n2, int i12) {
        super(2);
        this.f62694l = qVar;
        this.f62695m = sVar;
        this.f62696n = vVar;
        this.f62697o = z12;
        this.f62698p = mVar;
        this.f62699q = c22096n;
        this.f62700r = c22096n2;
        this.f62701s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62701s | 1);
        C22096n c22096n = this.f62699q;
        C22096n c22096n2 = this.f62700r;
        q qVar = this.f62694l;
        boolean z12 = this.f62697o;
        androidx.compose.foundation.interaction.m mVar = this.f62698p;
        i.c(qVar, this.f62695m, this.f62696n, z12, mVar, c22096n, c22096n2, a12, iA2);
        return G0.f406611a;
    }
}

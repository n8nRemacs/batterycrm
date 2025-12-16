package com.akita.compose.component.toast_bar;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ToastBarHost.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class p extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f63268l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63269m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f63270n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f63271o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f63272p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, androidx.compose.ui.v vVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f63268l = uVar;
        this.f63269m = vVar;
        this.f63270n = c22096n;
        this.f63271o = i12;
        this.f63272p = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63271o | 1);
        u uVar = this.f63268l;
        q.b(uVar, this.f63269m, this.f63270n, a12, iA2, this.f63272p);
        return G0.f406611a;
    }
}

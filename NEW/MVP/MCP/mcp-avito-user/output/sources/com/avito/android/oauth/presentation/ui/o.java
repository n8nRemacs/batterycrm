package com.avito.android.oauth.presentation.ui;

import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import l40.c;

/* compiled from: ExtendedForm.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f208432l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c.b f208433m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f208434n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f208435o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(K k12, c.b bVar, Y41.l lVar, int i12) {
        super(2);
        this.f208432l = k12;
        this.f208433m = bVar;
        this.f208434n = (N) lVar;
        this.f208435o = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f208435o | 1);
        ?? r02 = this.f208434n;
        f.d(this.f208432l, this.f208433m, r02, a12, iA2);
        return G0.f406611a;
    }
}

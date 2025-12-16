package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36630c1 extends A {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A.a f349104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36630c1(A.a aVar, Feature[] featureArr, boolean z12, int i12) {
        super(featureArr, z12, i12);
        this.f349104d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.A
    public final void b(C36616a.b bVar, C37028k c37028k) {
        this.f349104d.f348952a.accept(bVar, c37028k);
    }
}

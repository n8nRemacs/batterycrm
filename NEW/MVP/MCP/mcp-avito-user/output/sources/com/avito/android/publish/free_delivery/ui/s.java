package com.avito.android.publish.free_delivery.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class s extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f236019l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.r f236020m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f236021n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, com.akita.compose.foundation.r rVar, int i12) {
        super(2);
        this.f236019l = str;
        this.f236020m = rVar;
        this.f236021n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f236021n | 1);
        e.g(this.f236019l, this.f236020m, a12, iA2);
        return G0.f406611a;
    }
}

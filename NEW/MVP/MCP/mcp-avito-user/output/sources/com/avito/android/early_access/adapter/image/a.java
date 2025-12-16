package com.avito.android.early_access.adapter.image;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessImage.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessImageItem f145137l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f145138m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EarlyAccessImageItem earlyAccessImageItem, v.a aVar, int i12) {
        super(2);
        this.f145137l = earlyAccessImageItem;
        this.f145138m = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(57);
        c.a(this.f145137l, this.f145138m, a12, iA2);
        return G0.f406611a;
    }
}

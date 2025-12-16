package com.avito.android.early_access.adapter.title;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessTitle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f145260l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ HeaderType f145261m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f145262n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, HeaderType headerType, v vVar, int i12) {
        super(2);
        this.f145260l = str;
        this.f145261m = headerType;
        this.f145262n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(385);
        v vVar = this.f145262n;
        c.a(this.f145260l, this.f145261m, vVar, a12, iA2);
        return G0.f406611a;
    }
}

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
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f145257l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ HeaderType f145258m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f145259n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, HeaderType headerType, v vVar, int i12) {
        super(2);
        this.f145257l = str;
        this.f145258m = headerType;
        this.f145259n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(385);
        v vVar = this.f145259n;
        c.a(this.f145257l, this.f145258m, vVar, a12, iA2);
        return G0.f406611a;
    }
}

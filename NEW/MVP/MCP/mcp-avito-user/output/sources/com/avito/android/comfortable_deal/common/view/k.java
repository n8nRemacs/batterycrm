package com.avito.android.comfortable_deal.common.view;

import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExpandedStepsList.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class k extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<y> f120738l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f120739m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f120740n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List list, String str, Y41.l lVar, int i12) {
        super(2);
        this.f120738l = list;
        this.f120739m = str;
        this.f120740n = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        Y41.l<Boolean, G0> lVar = this.f120740n;
        u.a(this.f120738l, this.f120739m, lVar, a12, iA2);
        return G0.f406611a;
    }
}

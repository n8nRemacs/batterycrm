package com.avito.android.tariff_lf_publication.level.ui;

import UD0.c;
import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffLfPublicationLevelChips.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.tariff_lf_publication.level.ui.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35231c extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<c.b> f300960l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<UD0.a, G0> f300961m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f300962n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f300963o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35231c(int i12, Y41.l lVar, androidx.compose.ui.v vVar, List list) {
        super(2);
        this.f300960l = list;
        this.f300961m = lVar;
        this.f300962n = vVar;
        this.f300963o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f300963o | 1);
        Y41.l<UD0.a, G0> lVar = this.f300961m;
        C35232d.a(this.f300960l, lVar, a12, iA2);
        return G0.f406611a;
    }
}

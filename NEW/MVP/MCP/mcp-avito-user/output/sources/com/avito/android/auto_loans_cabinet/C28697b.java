package com.avito.android.auto_loans_cabinet;

import androidx.compose.runtime.C22066f2;
import com.avito.android.auto_loans_cabinet.mvi.entity.BannerType;
import com.avito.android.auto_loans_cabinet.mvi.entity.Item;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AutoLoanCabinetBannerItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.auto_loans_cabinet.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28697b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Item.Banner f95340l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f95341m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<BannerType, G0> f95342n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f95343o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28697b(Item.Banner banner, androidx.compose.ui.v vVar, Y41.l lVar, int i12) {
        super(2);
        this.f95340l = banner;
        this.f95341m = vVar;
        this.f95342n = lVar;
        this.f95343o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f95343o | 1);
        Y41.l<BannerType, G0> lVar = this.f95342n;
        C28698c.a(this.f95340l, this.f95341m, lVar, a12, iA2);
        return G0.f406611a;
    }
}

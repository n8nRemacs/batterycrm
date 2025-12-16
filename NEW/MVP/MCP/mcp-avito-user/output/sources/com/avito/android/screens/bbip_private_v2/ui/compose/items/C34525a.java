package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipPrivateV2BudgetSetting.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.screens.bbip_private_v2.ui.compose.items.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34525a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f261215l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State.b.a.C7820a f261216m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State.a f261217n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, G0> f261218o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f261219p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34525a(String str, BbipPrivateV2State.b.a.C7820a c7820a, BbipPrivateV2State.a aVar, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f261215l = str;
        this.f261216m = c7820a;
        this.f261217n = aVar;
        this.f261218o = lVar;
        this.f261219p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        C34527c.a(this.f261215l, this.f261216m, this.f261217n, this.f261218o, this.f261219p, a12, iA2);
        return G0.f406611a;
    }
}

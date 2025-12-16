package com.avito.android.safety.safety_settings.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsTfa.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f257842l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f257843m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f257844n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f257845o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f257846p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f257847q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257848r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(String str, AttributedText attributedText, boolean z12, boolean z13, boolean z14, androidx.compose.ui.v vVar, Y41.l lVar, int i12) {
        super(2);
        this.f257842l = str;
        this.f257843m = attributedText;
        this.f257844n = z12;
        this.f257845o = z13;
        this.f257846p = z14;
        this.f257847q = vVar;
        this.f257848r = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(196673);
        boolean z12 = this.f257845o;
        boolean z13 = this.f257846p;
        S.a(this.f257842l, this.f257843m, this.f257844n, z12, z13, this.f257847q, this.f257848r, a12, iA2);
        return G0.f406611a;
    }
}

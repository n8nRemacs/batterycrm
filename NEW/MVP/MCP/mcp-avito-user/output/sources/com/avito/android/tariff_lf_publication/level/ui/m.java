package com.avito.android.tariff_lf_publication.level.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffLfPublicationLevelHeader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class m extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f300986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f300987m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<UD0.a, G0> f300988n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f300989o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f300990p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i12, Y41.l lVar, androidx.compose.ui.v vVar, AttributedText attributedText, String str) {
        super(2);
        this.f300986l = str;
        this.f300987m = attributedText;
        this.f300988n = lVar;
        this.f300989o = vVar;
        this.f300990p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f300990p | 1);
        n.a(this.f300986l, this.f300987m, this.f300988n, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.comfortable_deal.end_deal;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EndDealScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.comfortable_deal.end_deal.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29485o extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f122358l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f122359m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f122360n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f122361o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29485o(AttributedText attributedText, androidx.compose.ui.v vVar, float f12, float f13, float f14, C22096n c22096n, int i12) {
        super(2);
        this.f122358l = attributedText;
        this.f122359m = vVar;
        this.f122360n = c22096n;
        this.f122361o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f122361o | 1);
        C22096n c22096n = this.f122360n;
        L.c(this.f122358l, this.f122359m, c22096n, a12, iA2);
        return G0.f406611a;
    }
}

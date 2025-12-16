package com.avito.android.comfortable_deal.end_deal;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EndDealScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class I extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EndDealField.ChipDateInput f122062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f122063m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f122064n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f122065o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(EndDealField.ChipDateInput chipDateInput, Y41.l lVar, Y41.l lVar2, v.a aVar, int i12) {
        super(2);
        this.f122062l = chipDateInput;
        this.f122063m = lVar;
        this.f122064n = lVar2;
        this.f122065o = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        L.d(this.f122062l, this.f122063m, this.f122064n, this.f122065o, a12, iA2);
        return G0.f406611a;
    }
}

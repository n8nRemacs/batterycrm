package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HeaderItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class U extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f302396l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f302397m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f302398n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f302399o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f302400p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(AttributedText attributedText, AttributedText attributedText2, UniversalImage universalImage, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f302396l = attributedText;
        this.f302397m = attributedText2;
        this.f302398n = universalImage;
        this.f302399o = lVar;
        this.f302400p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(25161);
        AttributedText attributedText = this.f302397m;
        UniversalImage universalImage = this.f302398n;
        V.a(this.f302396l, attributedText, universalImage, this.f302399o, this.f302400p, a12, iA2);
        return G0.f406611a;
    }
}

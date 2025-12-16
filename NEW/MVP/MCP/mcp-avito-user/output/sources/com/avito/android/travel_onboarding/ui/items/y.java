package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConditionItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class y extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f302444l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f302445m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f302446n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f302447o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f302448p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f302449q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AttributedText attributedText, AttributedText attributedText2, UniversalImage universalImage, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f302444l = attributedText;
        this.f302445m = attributedText2;
        this.f302446n = universalImage;
        this.f302447o = lVar;
        this.f302448p = vVar;
        this.f302449q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f302449q | 1);
        AttributedText attributedText = this.f302445m;
        UniversalImage universalImage = this.f302446n;
        C.a(this.f302444l, attributedText, universalImage, this.f302447o, this.f302448p, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DisclaimerItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class M extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f302383l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f302384m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f302385n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f302386o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f302387p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(int i12, Y41.l lVar, androidx.compose.ui.v vVar, AttributedText attributedText, String str) {
        super(2);
        this.f302383l = str;
        this.f302384m = attributedText;
        this.f302385n = lVar;
        this.f302386o = vVar;
        this.f302387p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f302387p | 1);
        androidx.compose.ui.v vVar = this.f302386o;
        String str = this.f302383l;
        P.a(iA2, this.f302385n, a12, vVar, this.f302384m, str);
        return G0.f406611a;
    }
}

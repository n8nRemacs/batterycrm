package com.avito.android.travel_onboarding.ui.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConditionsHeader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class I extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f302374l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f302375m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f302376n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f302377o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f302378p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(int i12, Y41.l lVar, androidx.compose.ui.v vVar, AttributedText attributedText, String str) {
        super(2);
        this.f302374l = attributedText;
        this.f302375m = str;
        this.f302376n = lVar;
        this.f302377o = vVar;
        this.f302378p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f302378p | 1);
        K.a(iA2, this.f302376n, a12, this.f302377o, this.f302374l, this.f302375m);
        return G0.f406611a;
    }
}

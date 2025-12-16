package com.avito.android.advert.item.select.no_click_contact;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectNoClickContactScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f79473l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f79474m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f79475n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f79476o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f79477p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(UniversalImage universalImage, AttributedText attributedText, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f79473l = universalImage;
        this.f79474m = attributedText;
        this.f79475n = lVar;
        this.f79476o = vVar;
        this.f79477p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f79477p | 1);
        Y41.l<DeepLink, G0> lVar = this.f79475n;
        r.b(this.f79473l, this.f79474m, lVar, this.f79476o, a12, iA2);
        return G0.f406611a;
    }
}

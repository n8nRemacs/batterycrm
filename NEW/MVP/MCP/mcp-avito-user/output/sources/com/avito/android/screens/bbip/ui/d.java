package com.avito.android.screens.bbip.ui;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.screens.bbip.ui.BbipFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipFragment f260293l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BbipFragment bbipFragment) {
        super(1);
        this.f260293l = bbipFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        BbipFragment.a aVar = BbipFragment.f260259H0;
        this.f260293l.q5().Ea(deepLink);
        return G0.f406611a;
    }
}

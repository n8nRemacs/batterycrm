package com.avito.android.profile_settings_extended.adapter.about;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AboutItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f229113l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttributedText f229114m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, AttributedText attributedText) {
        super(0);
        this.f229113l = iVar;
        this.f229114m = attributedText;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f229113l.d(null);
        AttributedText attributedText = this.f229114m;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(null);
        }
        return G0.f406611a;
    }
}

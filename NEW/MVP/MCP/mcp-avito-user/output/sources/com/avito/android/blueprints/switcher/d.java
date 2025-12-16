package com.avito.android.blueprints.switcher;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import kotlin.Metadata;

/* compiled from: MultiStateSwitcherItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/switcher/d;", "Lcom/avito/android/deep_linking/links/w;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f106751b;

    public d(f fVar) {
        this.f106751b = fVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@k DeepLink deepLink) {
        this.f106751b.f106758f.accept(deepLink);
    }
}

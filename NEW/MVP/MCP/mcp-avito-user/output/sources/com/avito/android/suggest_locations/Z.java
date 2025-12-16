package com.avito.android.suggest_locations;

import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: SuggestLocationsToolbar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class Z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SuggestLocationsToolbarImpl f292212b;

    public Z(SuggestLocationsToolbarImpl suggestLocationsToolbarImpl) {
        this.f292212b = suggestLocationsToolbarImpl;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        D6.G(this.f292212b.f292158c, !C43066x.K((CharSequence) obj));
    }
}

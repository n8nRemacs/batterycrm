package com.avito.android.rating_form.deep_link.rating_form;

import android.os.Bundle;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingFormDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f248059l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RatingFormLink f248060m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Bundle f248061n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, RatingFormLink ratingFormLink, Bundle bundle) {
        super(0);
        this.f248059l = aVar;
        this.f248060m = ratingFormLink;
        this.f248061n = bundle;
    }

    @Override // Y41.a
    public final G0 invoke() {
        int i12 = a.f248049m;
        this.f248059l.l(this.f248060m, this.f248061n);
        return G0.f406611a;
    }
}

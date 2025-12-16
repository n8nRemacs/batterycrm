package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.details;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import wZ.C49578b;

/* compiled from: FeesMethodsV2DetailsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f158335l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f158336m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, f fVar) {
        super(0);
        this.f158335l = aVar;
        this.f158336m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        C49578b c49578b = this.f158335l.f158330d;
        if (c49578b != null && (deepLink = c49578b.f441547b) != null) {
            this.f158336m.f158337b.invoke(deepLink);
        }
        return G0.f406611a;
    }
}

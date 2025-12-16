package com.avito.android.serp.adapter.auto_model_widget;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.auto_model.AutoModelRating;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47691c;

/* compiled from: AutoModelWidgetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoModelWidgetItem f268964l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f268965m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AutoModelWidgetItem autoModelWidgetItem, j jVar) {
        super(0);
        this.f268964l = autoModelWidgetItem;
        this.f268965m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        AutoModelRating autoModelRating = this.f268964l.f268956i;
        if (autoModelRating != null && (deepLink = autoModelRating.getDeepLink()) != null) {
            InterfaceC47691c.a.a(this.f268965m.f268972b.get(), deepLink, null, 14);
        }
        return G0.f406611a;
    }
}

package com.avito.android.serp.adapter.model_card;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ModelCardWidgetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ModelCardWidget f270412l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f270413m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f270414n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i12, ModelCardWidget modelCardWidget, j jVar) {
        super(0);
        this.f270412l = modelCardWidget;
        this.f270413m = jVar;
        this.f270414n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ModelCardWidget modelCardWidget = this.f270412l;
        DeepLink deepLink = modelCardWidget.f270397e;
        j jVar = this.f270413m;
        if (deepLink != null) {
            b.a.a(jVar.f270431b, deepLink, null, null, 6);
        }
        d.a.a(jVar.f270432c, Integer.valueOf(this.f270414n), "catalogEntryPointWidget", modelCardWidget.f270395c, null, null, null, null, modelCardWidget.f270399g, 104);
        return G0.f406611a;
    }
}

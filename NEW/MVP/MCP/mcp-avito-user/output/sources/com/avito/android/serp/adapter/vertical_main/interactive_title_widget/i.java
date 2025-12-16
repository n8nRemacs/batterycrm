package com.avito.android.serp.adapter.vertical_main.interactive_title_widget;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InteractiveTitleWidgetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InteractiveTitleWidgetItem f272959l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f272960m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f272961n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InteractiveTitleWidgetItem interactiveTitleWidgetItem, j jVar, int i12) {
        super(0);
        this.f272959l = interactiveTitleWidgetItem;
        this.f272960m = jVar;
        this.f272961n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InteractiveTitleWidgetItem interactiveTitleWidgetItem = this.f272959l;
        DeepLink deepLink = interactiveTitleWidgetItem.f272941e;
        j jVar = this.f272960m;
        if (deepLink != null) {
            b.a.a(jVar.f272962b, deepLink, null, null, 6);
        }
        d.a.a(jVar.f272963c, Integer.valueOf(this.f272961n), "interactive_title_widget", interactiveTitleWidgetItem.f272938b, null, null, null, null, interactiveTitleWidgetItem.f272944h, 120);
        return G0.f406611a;
    }
}

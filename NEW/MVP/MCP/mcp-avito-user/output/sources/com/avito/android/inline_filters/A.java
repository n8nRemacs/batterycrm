package com.avito.android.inline_filters;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.inline_filters.link.InlineFiltersApplyLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class A extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InlineFiltersApplyLink f170977l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f170978m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(InlineFiltersApplyLink inlineFiltersApplyLink, z zVar) {
        super(0);
        this.f170977l = inlineFiltersApplyLink;
        this.f170978m = zVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f170977l.f172310c;
        if (deepLink != null) {
            b.a.a(this.f170978m.f172408b, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}

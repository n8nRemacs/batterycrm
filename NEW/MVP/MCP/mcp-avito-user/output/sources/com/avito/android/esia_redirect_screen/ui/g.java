package com.avito.android.esia_redirect_screen.ui;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EsiaRedirectRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Iz.e f148113l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f148114m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Iz.e eVar, h hVar) {
        super(1);
        this.f148113l = eVar;
        this.f148114m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        DeepLink deepLink = this.f148113l.f8685c;
        if (deepLink != null) {
            this.f148114m.f148115a.invoke(deepLink);
        }
        return G0.f406611a;
    }
}

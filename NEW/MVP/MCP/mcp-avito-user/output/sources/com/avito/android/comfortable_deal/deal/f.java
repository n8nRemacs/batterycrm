package com.avito.android.comfortable_deal.deal;

import Y41.l;
import android.net.Uri;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DealView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f121073l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f121073l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        b.a.a(this.f121073l.f121076c, new WebViewLink.OnlyAvitoDomain(Uri.parse(str), null, null, 6, null), null, null, 6);
        return G0.f406611a;
    }
}

package com.avito.android.gig_snippet;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigSnippetWidget.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ GigSnippetWidget f161005l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(GigSnippetWidget gigSnippetWidget) {
        super(1);
        this.f161005l = gigSnippetWidget;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f161005l.f160999g.invoke(deepLink);
        return G0.f406611a;
    }
}

package com.avito.android.user_adverts_common.safety;

import kotlin.Metadata;

/* compiled from: SafetyInfoProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f315920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f315921c;

    public e(g gVar, String str) {
        this.f315920b = gVar;
        this.f315921c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        g gVar = this.f315920b;
        gVar.f315927c.a(new a(gVar.f315928d.now()), this.f315921c);
    }
}

package com.avito.android.saved_searches.deeplinks;

import com.avito.android.saved_searches.model.SubscriptionResponse;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionOpenDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lcom/avito/android/saved_searches/model/SubscriptionResponse;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final k<T, R> f258277b = new k<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((SubscriptionResponse) obj).getResult().getDeepLink();
    }
}

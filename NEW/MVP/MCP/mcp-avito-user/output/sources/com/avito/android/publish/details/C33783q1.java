package com.avito.android.publish.details;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.details.K1;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: PublishDetailsSlotManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.q1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33783q1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33794u1 f234902b;

    public C33783q1(C33794u1 c33794u1) {
        this.f234902b = c33794u1;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f234902b.f235043f.setValue(new K1.AbstractC33668b.f((DeepLink) obj));
    }
}

package com.avito.android.publish.start_publish;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: PublishProfileSheetLegacy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.start_publish.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34132g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogC34131f f245413b;

    public C34132g(DialogC34131f dialogC34131f) {
        this.f245413b = dialogC34131f;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = DialogC34131f.f245403N;
        this.f245413b.V((DeepLink) obj);
    }
}

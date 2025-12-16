package com.avito.android.publish.start_publish;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: PublishProfileSheetRedesigned.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.start_publish.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34134i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogC34133h f245424b;

    public C34134i(DialogC34133h dialogC34133h) {
        this.f245424b = dialogC34133h;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int i12 = DialogC34133h.f245414N;
        this.f245424b.V((DeepLink) obj);
    }
}

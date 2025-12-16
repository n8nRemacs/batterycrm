package com.avito.android.publish.items.atributed_text;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishAttributedTextItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/atributed_text/e;", "Lcom/avito/android/publish/items/atributed_text/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f236776b = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        PublishAttributedTextItem publishAttributedTextItem = (PublishAttributedTextItem) aVar;
        gVar.setTitle(publishAttributedTextItem.f236769d);
        AttributedText attributedText = publishAttributedTextItem.f236768c;
        gVar.r(attributedText);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 9));
    }

    @Override // com.avito.android.publish.items.atributed_text.d
    public final z j() {
        return this.f236776b;
    }
}

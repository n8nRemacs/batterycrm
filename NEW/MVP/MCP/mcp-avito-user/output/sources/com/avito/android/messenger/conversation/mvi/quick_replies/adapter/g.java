package com.avito.android.messenger.conversation.mvi.quick_replies.adapter;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.adapter.q;
import com.avito.android.messenger.conversation.adapter.text.d;
import com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: QuickReplyItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/adapter/g;", "LTV0/d;", "Lcom/avito/android/messenger/conversation/adapter/text/d;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/adapter/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements TV0.d<com.avito.android.messenger.conversation.adapter.text.d, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<com.avito.android.messenger.conversation.mvi.quick_replies.d> f194088b;

    @Inject
    public g(@k h31.e<com.avito.android.messenger.conversation.mvi.quick_replies.d> eVar) {
        this.f194088b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.messenger.conversation.adapter.text.d dVar = (com.avito.android.messenger.conversation.adapter.text.d) eVar;
        a aVar2 = (a) aVar;
        dVar.W30(c.f194082l, Collections.singletonList(new d.b.c(aVar2.getF194078d())));
        if (dVar instanceof q) {
            if (aVar2 instanceof a.b) {
                dVar.c(d.f194083l);
                ((q) dVar).wb(new e(this, aVar2));
            } else if (aVar2 instanceof a.c) {
                dVar.c(new f(this, aVar2));
                ((q) dVar).QS();
            }
        }
    }
}

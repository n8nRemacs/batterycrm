package com.avito.android.ai_assistant.adapter.chat_list_item;

import Y61.k;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChatListItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/chat_list_item/f;", "LTV0/d;", "Lcom/avito/android/ai_assistant/adapter/chat_list_item/h;", "Lcom/avito/android/ai_assistant/adapter/chat_list_item/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f88798b;

    @Inject
    public f(@k d dVar) {
        this.f88798b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.itemView.setSelected(aVar2.f88790e);
        I5.a(hVar.f88801b, aVar2.f88788c, false);
        I5.a(hVar.f88802c, aVar2.f88789d, false);
        hVar.f88803d.setVisibility(aVar2.f88791f ? 0 : 8);
        hVar.itemView.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(4, new e(this, aVar2)));
    }
}

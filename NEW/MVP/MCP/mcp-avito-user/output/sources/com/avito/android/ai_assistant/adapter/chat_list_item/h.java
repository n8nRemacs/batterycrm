package com.avito.android.ai_assistant.adapter.chat_list_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChatListItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/chat_list_item/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f88800e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f88801b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f88802c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f88803d;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.buyer_assistant_chat_list_item_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88801b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.buyer_assistant_chat_list_item_time);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88802c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.buyer_assistant_chat_list_item_unread_indicator);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f88803d = viewFindViewById3;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(null);
    }
}

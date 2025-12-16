package com.avito.android.ai_assistant.adapter;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import j.U;
import kotlin.Metadata;

/* compiled from: ChatListDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/j;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f88808b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88810d;

    public j(@Y61.k Resources resources, @U int i12) {
        this.f88808b = i12;
        this.f88809c = resources.getDimensionPixelOffset(R.dimen.ai_assistant_actions_last_bottom_padding);
        this.f88810d = resources.getDimensionPixelOffset(R.dimen.ai_assistant_anim_last_bottom_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z12 = bindingAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) - 1;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (!z12) {
            rect.bottom = 0;
            return;
        }
        if (cW2 instanceof com.avito.android.ai_assistant.adapter.message_actions.e) {
            rect.bottom = this.f88809c;
        } else if (cW2 instanceof com.avito.android.ai_assistant.adapter.answer_loading.f) {
            rect.bottom = this.f88810d;
        } else {
            rect.bottom = this.f88808b;
        }
    }
}

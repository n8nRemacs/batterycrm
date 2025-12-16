package com.avito.android.ai_assistant.adapter.simple_snippet;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SimpleSnippetItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/simple_snippet/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f88894b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88895c;

    public d(@k Resources resources) {
        this.f88894b = resources.getDimensionPixelOffset(R.dimen.ai_assistant_vertical_offset);
        this.f88895c = resources.getDimensionPixelOffset(R.dimen.ai_assistant_horizontal_offset);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof g) {
            rect.top = this.f88894b;
            int i12 = this.f88895c;
            rect.left = i12;
            rect.right = i12;
        }
    }
}

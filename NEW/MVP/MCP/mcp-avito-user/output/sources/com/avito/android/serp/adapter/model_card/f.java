package com.avito.android.serp.adapter.model_card;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: ModelCardWidgetItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/model_card/f;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f270410b = y6.b(16);

    /* renamed from: c, reason: collision with root package name */
    public final int f270411c = y6.b(20);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof l) {
            rect.top = this.f270410b;
            rect.bottom = this.f270411c;
        }
    }
}

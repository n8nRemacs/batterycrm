package com.avito.android.ai_assistant.adapter.segment_buttons;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestButtonsItemDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/segment_buttons/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f88863b = C42727D.b(LazyThreadSafetyMode.f406616d, a.f88864l);

    /* compiled from: SuggestButtonsItemDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f88864l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(y6.b(24));
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof g) {
            rect.top = ((Number) this.f88863b.getValue()).intValue();
        }
    }
}

package com.avito.android.publish.view;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import m.C43852a;

/* compiled from: ShadowScrollListener.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/view/p;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f245670b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f245671c = C42727D.c(new a());

    /* compiled from: ShadowScrollListener.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Drawable> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Drawable invoke() {
            return C43852a.a(p.this.f245670b.getContext(), R.drawable.publish_shadow_toolbar);
        }
    }

    public p(@Y61.k FrameLayout frameLayout) {
        this.f245670b = frameLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        FrameLayout frameLayout = this.f245670b;
        if (zCanScrollVertically) {
            frameLayout.setForeground((Drawable) this.f245671c.getValue());
        } else {
            frameLayout.setForeground(null);
        }
    }
}

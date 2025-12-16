package com.avito.android.beduin.common.container.horizontal_slider;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecyclerItemClickListener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/q;", "Landroidx/recyclerview/widget/RecyclerView$q;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements RecyclerView.q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<View, Integer, G0> f103126b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GestureDetector f103127c;

    /* compiled from: RecyclerItemClickListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/common/container/horizontal_slider/q$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(@Y61.k MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@Y61.k Context context, @Y61.k Y41.p<? super View, ? super Integer, G0> pVar) {
        this.f103126b = pVar;
        this.f103127c = new GestureDetector(context, new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean b(@Y61.k RecyclerView recyclerView, @Y61.k MotionEvent motionEvent) {
        View viewJ;
        if (!this.f103127c.onTouchEvent(motionEvent) || (viewJ = recyclerView.J(motionEvent.getX(), motionEvent.getY())) == null) {
            return false;
        }
        int iU2 = RecyclerView.U(viewJ);
        Integer numValueOf = Integer.valueOf(iU2);
        if (iU2 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            ((c) this.f103126b).invoke(viewJ, Integer.valueOf(numValueOf.intValue()));
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(boolean z12) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void g2(@Y61.k MotionEvent motionEvent) {
    }
}

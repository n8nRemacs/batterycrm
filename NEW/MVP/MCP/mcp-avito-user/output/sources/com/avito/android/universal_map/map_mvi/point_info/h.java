package com.avito.android.universal_map.map_mvi.point_info;

import Ca1.ViewOnTouchListenerC13234a;
import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.view.C22832m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: UniversalMapPointInfoViewMviTouchListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/point_info/h;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f306309a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f306310b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f306311c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final BottomSheetBehavior<ViewGroup> f306312d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C22832m f306313e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final b f306314f = new b();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewOnTouchListenerC13234a f306315g = new ViewOnTouchListenerC13234a(this, 15);

    /* compiled from: UniversalMapPointInfoViewMviTouchListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/universal_map/map_mvi/point_info/h$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(@Y61.k MotionEvent motionEvent) {
            h hVar = h.this;
            hVar.f306309a.setOnTouchListener(null);
            RecyclerView recyclerView = hVar.f306310b;
            recyclerView.setOnTouchListener(null);
            RecyclerView recyclerView2 = hVar.f306311c;
            recyclerView2.setOnTouchListener(null);
            b bVar = hVar.f306314f;
            recyclerView.u0(bVar);
            recyclerView2.u0(bVar);
            BottomSheetBehavior<ViewGroup> bottomSheetBehavior = hVar.f306312d;
            if (bottomSheetBehavior.f355975L == 4) {
                bottomSheetBehavior.b(3);
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* compiled from: UniversalMapPointInfoViewMviTouchListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/universal_map/map_mvi/point_info/h$b", "Landroidx/recyclerview/widget/RecyclerView$x;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.x {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x, androidx.recyclerview.widget.RecyclerView.q
        public final boolean b(@Y61.k RecyclerView recyclerView, @Y61.k MotionEvent motionEvent) {
            h.this.f306313e.a(motionEvent);
            return false;
        }
    }

    public h(@Y61.k ViewGroup viewGroup, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView recyclerView2, @Y61.k BottomSheetBehavior<ViewGroup> bottomSheetBehavior) {
        this.f306309a = viewGroup;
        this.f306310b = recyclerView;
        this.f306311c = recyclerView2;
        this.f306312d = bottomSheetBehavior;
        this.f306313e = new C22832m(viewGroup.getContext(), new a(), null);
    }
}

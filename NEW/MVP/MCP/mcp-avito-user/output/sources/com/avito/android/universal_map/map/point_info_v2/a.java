package com.avito.android.universal_map.map.point_info_v2;

import Ca1.ViewOnTouchListenerC13234a;
import Y61.k;
import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.view.C22832m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: UniversalMapPointInfoViewTouchListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/point_info_v2/a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f305897a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView f305898b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RecyclerView f305899c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final BottomSheetBehavior<ViewGroup> f305900d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C22832m f305901e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f305902f = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ViewOnTouchListenerC13234a f305903g = new ViewOnTouchListenerC13234a(this, 14);

    /* compiled from: UniversalMapPointInfoViewTouchListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/universal_map/map/point_info_v2/a$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.universal_map.map.point_info_v2.a$a, reason: collision with other inner class name */
    public static final class C9394a extends GestureDetector.SimpleOnGestureListener {
        public C9394a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(@k MotionEvent motionEvent) {
            a aVar = a.this;
            aVar.f305897a.setOnTouchListener(null);
            RecyclerView recyclerView = aVar.f305898b;
            recyclerView.setOnTouchListener(null);
            RecyclerView recyclerView2 = aVar.f305899c;
            recyclerView2.setOnTouchListener(null);
            b bVar = aVar.f305902f;
            recyclerView.u0(bVar);
            recyclerView2.u0(bVar);
            BottomSheetBehavior<ViewGroup> bottomSheetBehavior = aVar.f305900d;
            if (bottomSheetBehavior.f355975L == 4) {
                bottomSheetBehavior.b(3);
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* compiled from: UniversalMapPointInfoViewTouchListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/universal_map/map/point_info_v2/a$b", "Landroidx/recyclerview/widget/RecyclerView$x;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends RecyclerView.x {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x, androidx.recyclerview.widget.RecyclerView.q
        public final boolean b(@k RecyclerView recyclerView, @k MotionEvent motionEvent) {
            a.this.f305901e.a(motionEvent);
            return false;
        }
    }

    public a(@k ViewGroup viewGroup, @k RecyclerView recyclerView, @k RecyclerView recyclerView2, @k BottomSheetBehavior<ViewGroup> bottomSheetBehavior) {
        this.f305897a = viewGroup;
        this.f305898b = recyclerView;
        this.f305899c = recyclerView2;
        this.f305900d = bottomSheetBehavior;
        this.f305901e = new C22832m(viewGroup.getContext(), new C9394a(), null);
    }
}

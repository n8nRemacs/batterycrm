package com.avito.android.lib.design.bottom_sheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.o0;

/* compiled from: BottomSheetBehavior.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/BottomSheetBehavior;", "Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BottomSheetBehavior<V extends View> extends com.google.android.material.bottomsheet.BottomSheetBehavior<V> {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f178494h0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f178495g0;

    /* compiled from: BottomSheetBehavior.kt */
    @s0
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u000e\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u00002F\u0010\u000b\u001aB\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u00124\u00122\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00040\u0002H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroid/view/View;", "V", "", "Ljava/lang/Class;", "Lkotlin/Function2;", "Lkotlin/S;", "name", "view", "Landroid/view/MotionEvent;", "event", "", "it", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Map.Entry<? extends Class<?>, ? extends Y41.p<? super View, ? super MotionEvent, ? extends Boolean>>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BottomSheetBehavior<V> f178496l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ V f178497m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f178498n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BottomSheetBehavior<V> bottomSheetBehavior, V v12, MotionEvent motionEvent) {
            super(1);
            this.f178496l = bottomSheetBehavior;
            this.f178497m = v12;
            this.f178498n = motionEvent;
        }

        @Override // Y41.l
        public final Boolean invoke(Map.Entry<? extends Class<?>, ? extends Y41.p<? super View, ? super MotionEvent, ? extends Boolean>> entry) {
            Map.Entry<? extends Class<?>, ? extends Y41.p<? super View, ? super MotionEvent, ? extends Boolean>> entry2 = entry;
            Class<?> key = entry2.getKey();
            int i12 = BottomSheetBehavior.f178494h0;
            V v12 = this.f178497m;
            this.f178496l.getClass();
            View viewW = BottomSheetBehavior.W(v12, key);
            return Boolean.valueOf(viewW != null ? entry2.getValue().invoke(viewW, this.f178498n).booleanValue() : true);
        }
    }

    public /* synthetic */ BottomSheetBehavior(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    public static View W(View view, Class cls) {
        if (L.f(cls, view.getClass())) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        if (childCount < 0) {
            return null;
        }
        int i12 = 0;
        while (true) {
            View viewW = W(viewGroup.getChildAt(i12), cls);
            if (viewW != null) {
                return viewW;
            }
            if (i12 == childCount) {
                return null;
            }
            i12++;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k V v12, @Y61.k MotionEvent motionEvent) {
        Object next;
        if (!super.i(coordinatorLayout, v12, motionEvent)) {
            return false;
        }
        o0.a aVar = new o0.a(new o0(P0.b(this.f178495g0), new a(this, v12, motionEvent)));
        while (true) {
            if (!aVar.f410559b.hasNext()) {
                next = null;
                break;
            }
            next = aVar.next();
            if (!((Boolean) next).booleanValue()) {
                break;
            }
        }
        Boolean bool = (Boolean) next;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @X41.j
    public BottomSheetBehavior(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f178495g0 = new LinkedHashMap();
    }
}

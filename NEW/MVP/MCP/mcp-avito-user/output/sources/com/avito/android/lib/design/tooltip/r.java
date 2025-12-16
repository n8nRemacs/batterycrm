package com.avito.android.lib.design.tooltip;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.i;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;

/* compiled from: TooltipPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/tooltip/r;", "", "<init>", "()V", "a", "b", "c", "d", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r {

    /* compiled from: TooltipPosition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/r$a;", "Lcom/avito/android/lib/design/tooltip/q;", "Lcom/avito/android/lib/design/tooltip/h;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends q implements h {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final h f181265f;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int a() {
            return this.f181265f.a();
        }

        @Override // com.avito.android.lib.design.tooltip.h
        @Y61.k
        @SuppressLint({"RtlHardcoded"})
        public final Q b(@Y61.k View view, @Y61.k n nVar) {
            return this.f181265f.b(view, nVar);
        }

        @Override // com.avito.android.lib.design.tooltip.q, com.avito.android.lib.design.tooltip.h
        public final int c() {
            return this.f181265f.c();
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int d(int i12, int i13) {
            return this.f181265f.d(i12, i13);
        }

        @Override // com.avito.android.lib.design.tooltip.q, com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
            super.e(aVar);
            this.f181265f.e(aVar);
            this.f181262c = R.style.Design_Animation_AppCompat_DropDownUp_Bottom;
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            return this.f181265f.f(i12, i13);
        }

        @Override // com.avito.android.lib.design.tooltip.q
        @Y61.k
        public final Rect g(@Y61.k View view, @Y61.k n nVar) {
            Rect rectL;
            s sVar = s.f181270a;
            View rootView = view.getRootView();
            sVar.getClass();
            Rect rectC = s.c(rootView);
            Rect rectC2 = s.c(view);
            Integer num = this.f181260a;
            int iIntValue = num != null ? num.intValue() : 0;
            h hVar = this.f181265f;
            int iMax = Math.max(iIntValue - hVar.a(), 0);
            Rect rect = new Rect(rectC.left + iMax, rectC.top + iMax, rectC.right - iMax, rectC.bottom - iMax);
            rect.top = h() + rectC2.bottom;
            if (!s.d(nVar, rect) && (rectL = l(view, nVar)) != null) {
                return rectL;
            }
            Rect rectC3 = s.c(nVar);
            rectC3.offset(rectC.left, rectC.top);
            Rect rect2 = new Rect(nVar.getPaddingLeft() + rectC3.left, nVar.getPaddingTop() + rectC3.top, rectC3.right - nVar.getPaddingRight(), rectC3.bottom - nVar.getPaddingBottom());
            rectC3.offset(hVar.f(rectC2.left, rectC2.right) - hVar.d(rect2.left, rect2.right), (h() + rectC2.bottom) - rectC3.top);
            s.b(rectC3, rect);
            rectC3.offset(-rectC.left, -rectC.top);
            return rectC3;
        }

        @Y61.k
        public final void m(int i12) {
            super.k(i12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ a(h hVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new i.a(null, 1, 0 == true ? 1 : 0) : hVar);
        }

        public a(@Y61.k h hVar) {
            this.f181265f = hVar;
        }
    }

    /* compiled from: TooltipPosition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/r$b;", "Lcom/avito/android/lib/design/tooltip/q;", "Lcom/avito/android/lib/design/tooltip/h;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends q implements h {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final h f181266f;

        /* renamed from: g, reason: collision with root package name */
        public int f181267g;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int a() {
            return this.f181266f.a();
        }

        @Override // com.avito.android.lib.design.tooltip.h
        @Y61.k
        @SuppressLint({"RtlHardcoded"})
        public final Q b(@Y61.k View view, @Y61.k n nVar) {
            return this.f181266f.b(view, nVar);
        }

        @Override // com.avito.android.lib.design.tooltip.q, com.avito.android.lib.design.tooltip.h
        public final int c() {
            return this.f181266f.c();
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int d(int i12, int i13) {
            return this.f181266f.d(i12, i13);
        }

        @Override // com.avito.android.lib.design.tooltip.q, com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
            super.e(aVar);
            this.f181266f.e(aVar);
            this.f181262c = R.style.Design_Animation_AppCompat_DropDownUp_Left;
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            return this.f181266f.f(i12, i13);
        }

        @Override // com.avito.android.lib.design.tooltip.q
        @Y61.k
        public final Rect g(@Y61.k View view, @Y61.k n nVar) {
            Rect rectL;
            s sVar = s.f181270a;
            View rootView = view.getRootView();
            sVar.getClass();
            Rect rectC = s.c(rootView);
            Rect rectC2 = s.c(view);
            Integer num = this.f181260a;
            int iIntValue = num != null ? num.intValue() : 0;
            h hVar = this.f181266f;
            int iMax = Math.max(iIntValue - hVar.a(), 0);
            Rect rect = new Rect(rectC.left + iMax, rectC.top + iMax, rectC.right - iMax, rectC.bottom - iMax);
            rect.right = rectC2.left - h();
            if (!s.d(nVar, rect) && (rectL = l(view, nVar)) != null) {
                return rectL;
            }
            Rect rectC3 = s.c(nVar);
            rectC3.offset(rectC.left, rectC.top);
            Rect rect2 = new Rect(nVar.getPaddingLeft() + rectC3.left, nVar.getPaddingTop() + rectC3.top, rectC3.right - nVar.getPaddingRight(), rectC3.bottom - nVar.getPaddingBottom());
            rectC3.offset((rectC2.left - h()) - rectC3.right, (hVar.f(rectC2.top, rectC2.bottom) - hVar.d(rect2.top, rect2.bottom)) + this.f181267g);
            s.b(rectC3, rect);
            rectC3.offset(-rectC.left, -rectC.top);
            return rectC3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ b(h hVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new i.a(null, 1, 0 == true ? 1 : 0) : hVar);
        }

        public b(@Y61.k h hVar) {
            this.f181266f = hVar;
        }
    }

    /* compiled from: TooltipPosition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/r$c;", "Lcom/avito/android/lib/design/tooltip/q;", "Lcom/avito/android/lib/design/tooltip/h;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends q implements h {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final h f181268f;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int a() {
            return this.f181268f.a();
        }

        @Override // com.avito.android.lib.design.tooltip.h
        @Y61.k
        @SuppressLint({"RtlHardcoded"})
        public final Q b(@Y61.k View view, @Y61.k n nVar) {
            return this.f181268f.b(view, nVar);
        }

        @Override // com.avito.android.lib.design.tooltip.q, com.avito.android.lib.design.tooltip.h
        public final int c() {
            return this.f181268f.c();
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int d(int i12, int i13) {
            return this.f181268f.d(i12, i13);
        }

        @Override // com.avito.android.lib.design.tooltip.q, com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
            super.e(aVar);
            this.f181268f.e(aVar);
            this.f181262c = R.style.Design_Animation_AppCompat_DropDownUp_Right;
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            return this.f181268f.f(i12, i13);
        }

        @Override // com.avito.android.lib.design.tooltip.q
        @Y61.k
        public final Rect g(@Y61.k View view, @Y61.k n nVar) {
            Rect rectL;
            s sVar = s.f181270a;
            View rootView = view.getRootView();
            sVar.getClass();
            Rect rectC = s.c(rootView);
            Rect rectC2 = s.c(view);
            Integer num = this.f181260a;
            int iIntValue = num != null ? num.intValue() : 0;
            h hVar = this.f181268f;
            int iMax = Math.max(iIntValue - hVar.a(), 0);
            Rect rect = new Rect(rectC.left + iMax, rectC.top + iMax, rectC.right - iMax, rectC.bottom - iMax);
            rect.left = h() + rectC2.right;
            if (!s.d(nVar, rect) && (rectL = l(view, nVar)) != null) {
                return rectL;
            }
            Rect rectC3 = s.c(nVar);
            rectC3.offset(rectC.left, rectC.top);
            Rect rect2 = new Rect(nVar.getPaddingLeft() + rectC3.left, nVar.getPaddingTop() + rectC3.top, rectC3.right - nVar.getPaddingRight(), rectC3.bottom - nVar.getPaddingBottom());
            rectC3.offset((h() + rectC2.right) - rectC3.left, hVar.f(rectC2.top, rectC2.bottom) - hVar.d(rect2.top, rect2.bottom));
            s.b(rectC3, rect);
            rectC3.offset(-rectC.left, -rectC.top);
            return rectC3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ c(h hVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new i.a(null, 1, 0 == true ? 1 : 0) : hVar);
        }

        public c(@Y61.k h hVar) {
            this.f181268f = hVar;
        }
    }

    /* compiled from: TooltipPosition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/r$d;", "Lcom/avito/android/lib/design/tooltip/q;", "Lcom/avito/android/lib/design/tooltip/h;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends q implements h {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final h f181269f;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int a() {
            return this.f181269f.a();
        }

        @Override // com.avito.android.lib.design.tooltip.h
        @Y61.k
        @SuppressLint({"RtlHardcoded"})
        public final Q b(@Y61.k View view, @Y61.k n nVar) {
            return this.f181269f.b(view, nVar);
        }

        @Override // com.avito.android.lib.design.tooltip.q, com.avito.android.lib.design.tooltip.h
        public final int c() {
            return this.f181269f.c();
        }

        @Override // com.avito.android.lib.design.tooltip.h
        public final int d(int i12, int i13) {
            return this.f181269f.d(i12, i13);
        }

        @Override // com.avito.android.lib.design.tooltip.q, com.avito.android.lib.design.tooltip.a
        public final void e(@Y61.k KV.a aVar) {
            super.e(aVar);
            this.f181269f.e(aVar);
            this.f181262c = R.style.Design_Animation_AppCompat_DropDownUp_Top;
        }

        @Override // com.avito.android.lib.design.tooltip.a
        public final int f(int i12, int i13) {
            return this.f181269f.f(i12, i13);
        }

        @Override // com.avito.android.lib.design.tooltip.q
        @Y61.k
        public final Rect g(@Y61.k View view, @Y61.k n nVar) {
            Rect rectL;
            s sVar = s.f181270a;
            View rootView = view.getRootView();
            sVar.getClass();
            Rect rectC = s.c(rootView);
            Rect rectC2 = s.c(view);
            Integer num = this.f181260a;
            int iIntValue = num != null ? num.intValue() : 0;
            h hVar = this.f181269f;
            int iMax = Math.max(iIntValue - hVar.a(), 0);
            Rect rect = new Rect(rectC.left + iMax, rectC.top + iMax, rectC.right - iMax, rectC.bottom - iMax);
            rect.bottom = rectC2.top - h();
            if (!s.d(nVar, rect) && (rectL = l(view, nVar)) != null) {
                return rectL;
            }
            Rect rectC3 = s.c(nVar);
            rectC3.offset(rectC.left, rectC.top);
            Rect rect2 = new Rect(nVar.getPaddingLeft() + rectC3.left, nVar.getPaddingTop() + rectC3.top, rectC3.right - nVar.getPaddingRight(), rectC3.bottom - nVar.getPaddingBottom());
            rectC3.offset(hVar.f(rectC2.left, rectC2.right) - hVar.d(rect2.left, rect2.right), (rectC2.top - h()) - rectC3.bottom);
            s.b(rectC3, rect);
            rectC3.offset(-rectC.left, -rectC.top);
            return rectC3;
        }

        @Y61.k
        public final void m(int i12) {
            super.k(i12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ d(h hVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new i.a(null, 1, 0 == true ? 1 : 0) : hVar);
        }

        public d(@Y61.k h hVar) {
            this.f181269f = hVar;
        }
    }

    static {
        new r();
    }
}

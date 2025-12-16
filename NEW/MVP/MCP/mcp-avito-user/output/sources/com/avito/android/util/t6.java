package com.avito.android.util;

import android.view.View;
import android.view.ViewTreeObserver;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/t6;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class t6 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f319058b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Y41.a<Boolean> f319059c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f319060d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f319061e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a f319062f;

    /* compiled from: Views.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/util/t6$a", "Landroid/view/View$OnAttachStateChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@Y61.k View view) {
            t6 t6Var = t6.this;
            if (t6Var.f319060d) {
                return;
            }
            Object tag = view.getTag(R.id.pre_draw_listener_tag);
            t6 t6Var2 = tag instanceof t6 ? (t6) tag : null;
            if (t6Var2 != null) {
                if (t6Var2.equals(t6Var)) {
                    return;
                }
                view.removeOnAttachStateChangeListener(this);
            } else {
                s6 s6Var = new s6(t6Var);
                if (view.getViewTreeObserver().isAlive()) {
                    s6Var.invoke(view.getViewTreeObserver());
                }
                view.setTag(R.id.pre_draw_listener_tag, t6Var);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@Y61.k View view) {
            t6 t6Var = t6.this;
            View.OnAttachStateChangeListener onAttachStateChangeListener = t6Var.f319060d ? this : null;
            if (onAttachStateChangeListener != null) {
                view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            v6 v6Var = new v6(t6Var);
            if (view.getViewTreeObserver().isAlive()) {
                v6Var.invoke(view.getViewTreeObserver());
            }
            view.setTag(R.id.pre_draw_listener_tag, null);
        }
    }

    public /* synthetic */ t6(View view, Y41.a aVar, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? true : z12, view, aVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.f319061e) {
            a aVar = this.f319062f;
            View view = this.f319058b;
            if (aVar != null) {
                view.removeOnAttachStateChangeListener(aVar);
            }
            v6 v6Var = new v6(this);
            if (view.getViewTreeObserver().isAlive()) {
                v6Var.invoke(view.getViewTreeObserver());
            }
            view.setTag(R.id.pre_draw_listener_tag, null);
            this.f319061e = false;
        }
        return this.f319059c.invoke().booleanValue();
    }

    public t6(boolean z12, @Y61.k View view, @Y61.k Y41.a aVar) {
        this.f319058b = view;
        this.f319059c = aVar;
        this.f319060d = z12;
        a aVar2 = new a();
        this.f319062f = aVar2;
        if (this.f319061e) {
            return;
        }
        view.addOnAttachStateChangeListener(aVar2);
        s6 s6Var = new s6(this);
        if (view.getViewTreeObserver().isAlive()) {
            s6Var.invoke(view.getViewTreeObserver());
        }
        this.f319061e = true;
    }
}

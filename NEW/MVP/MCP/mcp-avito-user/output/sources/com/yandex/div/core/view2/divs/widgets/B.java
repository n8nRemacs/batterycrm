package com.yandex.div.core.view2.divs.widgets;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ParentScrollRestrictor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/B;", "Lcom/yandex/div/internal/widget/g;", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class B implements com.yandex.div.internal.widget.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f368865a;

    /* renamed from: b, reason: collision with root package name */
    public int f368866b = -1;

    /* renamed from: c, reason: collision with root package name */
    public float f368867c;

    /* renamed from: d, reason: collision with root package name */
    public float f368868d;

    /* renamed from: e, reason: collision with root package name */
    public int f368869e;

    /* compiled from: ParentScrollRestrictor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/B$a;", "", "<init>", "()V", "", "DIRECTION_HORIZONTAL", "I", "DIRECTION_NONE", "DIRECTION_VERTICAL", "UNDEFINED_TOUCH_SLOP", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ParentScrollRestrictor.kt */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/widgets/B$b;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public @interface b {
    }

    static {
        new a(null);
    }

    public B(@b int i12) {
        this.f368865a = i12;
    }

    @Override // com.yandex.div.internal.widget.g
    public final void a(@Y61.k ViewGroup viewGroup, @Y61.k MotionEvent motionEvent) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return;
        }
        if (this.f368866b == -1) {
            this.f368866b = ViewConfiguration.get(viewGroup.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        int i12 = 1;
        if (actionMasked == 0) {
            this.f368867c = motionEvent.getX();
            this.f368868d = motionEvent.getY();
            this.f368869e = 0;
            parent.requestDisallowInterceptTouchEvent(true);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f368869e == 0) {
                    float fAbs = Math.abs(this.f368867c - motionEvent.getX());
                    float fAbs2 = Math.abs(this.f368868d - motionEvent.getY());
                    float f12 = this.f368866b;
                    if (fAbs < f12 && fAbs2 < f12) {
                        i12 = 0;
                    } else if (fAbs <= fAbs2) {
                        i12 = 2;
                    }
                    this.f368869e = i12;
                }
                int i13 = this.f368869e;
                if (i13 == 0 || (i13 & this.f368865a) != 0) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(false);
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        parent.requestDisallowInterceptTouchEvent(false);
    }
}

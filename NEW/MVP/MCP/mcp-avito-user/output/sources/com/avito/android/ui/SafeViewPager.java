package com.avito.android.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: SafeViewPager.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/ui/SafeViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "Lkotlin/G0;", "setPagingEnabled", "(Z)V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class SafeViewPager extends ViewPager {

    /* renamed from: i0, reason: collision with root package name */
    public boolean f304529i0;

    public SafeViewPager(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f304529i0 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Y61.l MotionEvent motionEvent) {
        try {
            if (this.f304529i0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        } catch (Exception e12) {
            V2.f318762a.j("ViewPager", "onInterceptTouchEvent", e12);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Y61.l MotionEvent motionEvent) {
        try {
            if (this.f304529i0) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        } catch (Exception e12) {
            V2.f318762a.j("ViewPager", "onTouchEvent", e12);
            return false;
        }
    }

    public final void setPagingEnabled(boolean enabled) {
        this.f304529i0 = enabled;
    }
}

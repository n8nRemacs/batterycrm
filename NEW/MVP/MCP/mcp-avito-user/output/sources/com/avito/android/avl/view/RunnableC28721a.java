package com.avito.android.avl.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.util.D6;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.avl.view.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class RunnableC28721a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AvlPlayerActivity f98376c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f98377d;

    public /* synthetic */ RunnableC28721a(AvlPlayerActivity avlPlayerActivity, int i12, int i13) {
        this.f98375b = i13;
        this.f98376c = avlPlayerActivity;
        this.f98377d = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98375b) {
            case 0:
                AvlPlayerActivity avlPlayerActivity = this.f98376c;
                ViewPager2 viewPager2 = avlPlayerActivity.f98299H;
                if (viewPager2 == null) {
                    viewPager2 = null;
                }
                viewPager2.g(this.f98377d, false);
                avlPlayerActivity.f98292A = null;
                break;
            default:
                AvlPlayerActivity avlPlayerActivity2 = this.f98376c;
                ViewPager2 viewPager22 = avlPlayerActivity2.f98299H;
                if (viewPager22 == null) {
                    viewPager22 = null;
                }
                View childAt = viewPager22.getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                int i12 = this.f98377d;
                RecyclerView.C cP2 = recyclerView != null ? recyclerView.P(i12) : null;
                B b12 = (B) (cP2 instanceof B ? cP2 : null);
                if (b12 != null) {
                    b12.G80();
                    D6.H(b12.f98336C);
                }
                for (int i13 = 1; i13 < 4; i13++) {
                    avlPlayerActivity2.c2(i12 - i13);
                    avlPlayerActivity2.c2(i12 + i13);
                }
                break;
        }
    }
}

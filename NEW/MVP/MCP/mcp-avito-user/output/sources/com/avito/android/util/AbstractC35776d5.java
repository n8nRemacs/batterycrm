package com.avito.android.util;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;

/* compiled from: ScreenLifecycleCallbacks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/util/d5;", "", "<init>", "()V", "a", "b", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.d5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC35776d5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f318859a = new a(this);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f318860b = new b(this);

    /* compiled from: ScreenLifecycleCallbacks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/d5$a;", "Lid/i;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.d5$a */
    public static final class a extends id.i {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AbstractC35776d5 f318861b;

        public a(@Y61.k AbstractC35776d5 abstractC35776d5) {
            this.f318861b = abstractC35776d5;
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
            AbstractC35776d5 abstractC35776d5 = this.f318861b;
            abstractC35776d5.getClass();
            if (activity instanceof ActivityC22955m) {
                ((ActivityC22955m) activity).getSupportFragmentManager().e0(abstractC35776d5.f318860b, true);
            }
            abstractC35776d5.c(activity);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@Y61.k Activity activity) {
            AbstractC35776d5 abstractC35776d5 = this.f318861b;
            abstractC35776d5.getClass();
            if (activity instanceof ActivityC22955m) {
                ((ActivityC22955m) activity).getSupportFragmentManager().v0(abstractC35776d5.f318860b);
            }
            abstractC35776d5.d(activity);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@Y61.k Activity activity) {
            this.f318861b.e(activity);
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@Y61.k Activity activity) {
            this.f318861b.f(activity);
        }
    }

    /* compiled from: ScreenLifecycleCallbacks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/d5$b;", "Landroidx/fragment/app/FragmentManager$n;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.d5$b */
    public static final class b extends FragmentManager.n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AbstractC35776d5 f318862a;

        public b(@Y61.k AbstractC35776d5 abstractC35776d5) {
            this.f318862a = abstractC35776d5;
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentCreated(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment, @Y61.l Bundle bundle) {
            this.f318862a.getClass();
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentDestroyed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
            this.f318862a.getClass();
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentPaused(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
            this.f318862a.g(fragment);
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentResumed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
            this.f318862a.h(fragment);
        }
    }

    public void c(@Y61.k Activity activity) {
    }

    public void d(@Y61.k Activity activity) {
    }

    public void e(@Y61.k Activity activity) {
    }

    public void f(@Y61.k Activity activity) {
    }

    public void g(@Y61.k Fragment fragment) {
    }

    public void h(@Y61.k Fragment fragment) {
    }
}

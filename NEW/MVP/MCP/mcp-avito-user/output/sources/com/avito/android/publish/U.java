package com.avito.android.publish;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;

/* compiled from: PublishActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/U;", "Landroidx/fragment/app/FragmentManager$n;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class U extends FragmentManager.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PublishActivity f232089a;

    public U(PublishActivity publishActivity) {
        this.f232089a = publishActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentPaused(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        if (fragment instanceof Id0.c) {
            ((Id0.c) fragment).g2();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentResumed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        if (fragment.getChildFragmentManager().L() > 0) {
            return;
        }
        PublishActivity.a2(this.f232089a, fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentViewDestroyed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null && parentFragment.isResumed()) {
            PublishActivity.a2(this.f232089a, parentFragment);
        }
    }
}

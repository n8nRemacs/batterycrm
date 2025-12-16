package com.avito.android.publish;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C22823h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: PublishActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/W;", "Landroidx/fragment/app/FragmentManager$n;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class W extends FragmentManager.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PublishActivity f232100a;

    public W(PublishActivity publishActivity) {
        this.f232100a = publishActivity;
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentPaused(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
        super.onFragmentPaused(fragmentManager, fragment);
        View view = fragment.getView();
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && viewGroup.getId() == R.id.full_screen_fragment_container) {
            int i12 = PublishActivity.f231968H;
            PublishActivity publishActivity = this.f232100a;
            View viewK1 = publishActivity.K1();
            if (Build.VERSION.SDK_INT < 30) {
                com.avito.android.lib.util.i.f181373a.getClass();
                if (!com.avito.android.lib.util.i.f181377e) {
                    androidx.core.view.F0.a(publishActivity.getWindow(), true);
                    return;
                }
            }
            com.avito.android.lib.util.i.g(com.avito.android.lib.util.i.f181373a, publishActivity.K1());
            C22823h0.A(viewK1);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentResumed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        View view = fragment.getView();
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && viewGroup.getId() == R.id.full_screen_fragment_container) {
            int i12 = PublishActivity.f231968H;
            PublishActivity publishActivity = this.f232100a;
            View viewK1 = publishActivity.K1();
            C22823h0.K(viewK1, null);
            androidx.core.view.F0.a(publishActivity.getWindow(), false);
            viewK1.setPadding(viewK1.getPaddingLeft(), 0, viewK1.getPaddingRight(), 0);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentViewCreated(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment, @Y61.k View view, @Y61.l Bundle bundle) {
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && viewGroup.getId() == R.id.full_screen_fragment_container) {
            D6.G(viewGroup, true);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentViewDestroyed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        PublishActivity publishActivity = this.f232100a;
        if (publishActivity.getSupportFragmentManager().G(R.id.full_screen_fragment_container) == null) {
            D6.w(publishActivity.findViewById(R.id.full_screen_fragment_container));
        }
    }
}

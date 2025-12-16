package org.koin.androidx.scope;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScopeFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/koin/androidx/scope/ScopeFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/android/scope/a;", "koin-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ScopeFragment extends Fragment implements org.koin.android.scope.a {

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f421404f0;

    public ScopeFragment() {
        this(0, 1, null);
    }

    @Override // org.koin.android.scope.a
    @Y61.k
    public final org.koin.core.scope.a C0() {
        return (org.koin.core.scope.a) this.f421404f0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C0() == null) {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public ScopeFragment(int i12, int i13, C42822w c42822w) {
        super((i13 & 1) != 0 ? 0 : i12);
        this.f421404f0 = C42727D.c(new h(this));
    }
}

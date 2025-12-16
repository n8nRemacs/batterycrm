package androidx.view;

import Y61.k;
import androidx.view.P0;
import kotlin.Metadata;
import z1.AbstractC50339a;

/* compiled from: HasDefaultViewModelProviderFactory.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/B;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22969B {
    @k
    default AbstractC50339a getDefaultViewModelCreationExtras() {
        return AbstractC50339a.C12939a.f443748b;
    }

    @k
    P0.c getDefaultViewModelProviderFactory();
}

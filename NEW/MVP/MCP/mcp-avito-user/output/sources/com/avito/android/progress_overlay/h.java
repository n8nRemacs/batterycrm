package com.avito.android.progress_overlay;

import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

/* compiled from: ProgressDialogRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_overlay/h;", "", "_avito_progress-overlay_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f231587a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DialogFragment f231588b;

    public h(@Y61.k ActivityC22955m activityC22955m) {
        this.f231587a = activityC22955m;
        Fragment fragmentH = activityC22955m.getSupportFragmentManager().H("progress_dialog");
        this.f231588b = fragmentH instanceof DialogFragment ? (DialogFragment) fragmentH : null;
    }
}

package com.avito.android.deeplink_handler.view.impl;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.spinner_overlay_fragment.SpinnerOverlayDialogFragment;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SimpleDialogLoadingRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink_handler/view/impl/i;", "Lcom/avito/android/deeplink_handler/view/impl/j;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class i implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f134625b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f134626c = C42727D.b(LazyThreadSafetyMode.f406616d, a.f134628l);

    /* renamed from: d, reason: collision with root package name */
    public boolean f134627d;

    /* compiled from: SimpleDialogLoadingRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/spinner_overlay_fragment/SpinnerOverlayDialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<SpinnerOverlayDialogFragment> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f134628l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final SpinnerOverlayDialogFragment invoke() {
            SpinnerOverlayDialogFragment.f284839f0.getClass();
            SpinnerOverlayDialogFragment spinnerOverlayDialogFragment = new SpinnerOverlayDialogFragment();
            spinnerOverlayDialogFragment.setStyle(2, R.style.Theme_DesignSystem_LookAndFeel_Transparent);
            return spinnerOverlayDialogFragment;
        }
    }

    public i(@Y61.k ActivityC22955m activityC22955m) {
        this.f134625b = activityC22955m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final void a(boolean z12) {
        ?? r02 = this.f134626c;
        if (z12 && !this.f134627d) {
            ((SpinnerOverlayDialogFragment) r02.getValue()).show(this.f134625b.getSupportFragmentManager(), (String) null);
            this.f134627d = true;
        } else {
            if (z12 || !this.f134627d) {
                return;
            }
            ((SpinnerOverlayDialogFragment) r02.getValue()).dismiss();
            this.f134627d = false;
        }
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public void g(@Y61.l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        a(z12);
    }
}

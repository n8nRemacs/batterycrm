package Da1;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.l0;

/* loaded from: classes9.dex */
public final class a extends BottomSheetBehavior.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f3242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.e f3243c;

    public a(BottomSheetBehavior bottomSheetBehavior, l0.e eVar) {
        this.f3242b = bottomSheetBehavior;
        this.f3243c = eVar;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onSlide(View view, float f12) {
        this.f3243c.f406839b = f12;
        if (f12 == -1.0f) {
            this.f3242b.b(5);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
    public final void onStateChanged(View view, int i12) {
        if (i12 == 2) {
            this.f3242b.b(this.f3243c.f406839b <= -0.2f ? 5 : 3);
        }
    }
}

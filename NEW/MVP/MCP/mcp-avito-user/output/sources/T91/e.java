package T91;

import android.view.View;
import com.avito.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.h f15450c;

    public /* synthetic */ e(ru.mts.biometry.sdk.feature.documentResult.ui.h hVar, int i12) {
        this.f15449b = i12;
        this.f15450c = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ru.mts.biometry.sdk.feature.documentResult.ui.h hVar = this.f15450c;
        switch (this.f15449b) {
            case 0:
                C15343a c15343a = ru.mts.biometry.sdk.feature.documentResult.ui.h.f436451k0;
                A91.b.a(A91.r.a(hVar.getResources().getStringArray(R.array.sdk_bio_inn_info_list)), hVar.getResources().getString(R.string.sdk_bio_inn_info_title)).show(hVar.getParentFragmentManager(), "BottomSheetContainer");
                break;
            default:
                hVar.f436453h0.d(true);
                break;
        }
    }
}

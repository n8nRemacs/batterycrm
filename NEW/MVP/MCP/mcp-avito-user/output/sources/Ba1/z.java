package Ba1;

import androidx.fragment.app.Fragment;
import com.avito.android.R;

/* loaded from: classes9.dex */
public abstract class z {
    public static final void a(Fragment fragment, String[] strArr) {
        A91.b.a(A91.r.a(strArr), fragment.getResources().getString(R.string.sdk_bio_recommendation_dialog_title)).show(fragment.getParentFragmentManager(), "BottomSheetContainer");
    }
}

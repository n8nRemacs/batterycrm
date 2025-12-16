package B91;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioEditText;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class v implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1178a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkBioEditText f1179b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView f1180c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioButton f1181d;

    /* renamed from: e, reason: collision with root package name */
    public final SdkBioToolbar f1182e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f1183f;

    public v(ConstraintLayout constraintLayout, SdkBioEditText sdkBioEditText, RecyclerView recyclerView, SdkBioButton sdkBioButton, SdkBioToolbar sdkBioToolbar, TextView textView) {
        this.f1178a = constraintLayout;
        this.f1179b = sdkBioEditText;
        this.f1180c = recyclerView;
        this.f1181d = sdkBioButton;
        this.f1182e = sdkBioToolbar;
        this.f1183f = textView;
    }

    public static v a(View view) {
        int i12 = R.id.btn_layout;
        if (((LinearLayout) g2.d.a(view, R.id.btn_layout)) != null) {
            i12 = R.id.search;
            SdkBioEditText sdkBioEditText = (SdkBioEditText) g2.d.a(view, R.id.search);
            if (sdkBioEditText != null) {
                i12 = R.id.search_results;
                RecyclerView recyclerView = (RecyclerView) g2.d.a(view, R.id.search_results);
                if (recyclerView != null) {
                    i12 = R.id.startButton;
                    SdkBioButton sdkBioButton = (SdkBioButton) g2.d.a(view, R.id.startButton);
                    if (sdkBioButton != null) {
                        i12 = R.id.toolbar;
                        SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) g2.d.a(view, R.id.toolbar);
                        if (sdkBioToolbar != null) {
                            i12 = R.id.tv_bottom_sheet_title;
                            if (((TextView) g2.d.a(view, R.id.tv_bottom_sheet_title)) != null) {
                                i12 = R.id.tv_nothing_found;
                                TextView textView = (TextView) g2.d.a(view, R.id.tv_nothing_found);
                                if (textView != null) {
                                    return new v((ConstraintLayout) view, sdkBioEditText, recyclerView, sdkBioButton, sdkBioToolbar, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i12)));
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1178a;
    }
}

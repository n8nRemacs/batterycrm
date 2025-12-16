package B91;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.avito.android.R;
import ru.mts.biometry.sdk.view.SdkBioButton;
import ru.mts.biometry.sdk.view.SdkBioList;
import ru.mts.biometry.sdk.view.SdkBioToolbar;

/* loaded from: classes9.dex */
public final class G implements g2.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1033a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f1034b;

    /* renamed from: c, reason: collision with root package name */
    public final SdkBioButton f1035c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkBioButton f1036d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f1037e;

    /* renamed from: f, reason: collision with root package name */
    public final SdkBioList f1038f;

    /* renamed from: g, reason: collision with root package name */
    public final NestedScrollView f1039g;

    /* renamed from: h, reason: collision with root package name */
    public final SdkBioToolbar f1040h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f1041i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f1042j;

    public G(ConstraintLayout constraintLayout, LinearLayout linearLayout, SdkBioButton sdkBioButton, SdkBioButton sdkBioButton2, AppCompatImageView appCompatImageView, SdkBioList sdkBioList, NestedScrollView nestedScrollView, SdkBioToolbar sdkBioToolbar, TextView textView, TextView textView2) {
        this.f1033a = constraintLayout;
        this.f1034b = linearLayout;
        this.f1035c = sdkBioButton;
        this.f1036d = sdkBioButton2;
        this.f1037e = appCompatImageView;
        this.f1038f = sdkBioList;
        this.f1039g = nestedScrollView;
        this.f1040h = sdkBioToolbar;
        this.f1041i = textView;
        this.f1042j = textView2;
    }

    public static G a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_passport_intro, viewGroup, false);
        int i12 = R.id.btn_layout;
        LinearLayout linearLayout = (LinearLayout) g2.d.a(viewInflate, R.id.btn_layout);
        if (linearLayout != null) {
            i12 = R.id.btnPhoto;
            SdkBioButton sdkBioButton = (SdkBioButton) g2.d.a(viewInflate, R.id.btnPhoto);
            if (sdkBioButton != null) {
                i12 = R.id.btn_show_recommends;
                SdkBioButton sdkBioButton2 = (SdkBioButton) g2.d.a(viewInflate, R.id.btn_show_recommends);
                if (sdkBioButton2 != null) {
                    i12 = R.id.iv_passport;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) g2.d.a(viewInflate, R.id.iv_passport);
                    if (appCompatImageView != null) {
                        i12 = R.id.list_recommendations;
                        SdkBioList sdkBioList = (SdkBioList) g2.d.a(viewInflate, R.id.list_recommendations);
                        if (sdkBioList != null) {
                            i12 = R.id.scroll_layout;
                            NestedScrollView nestedScrollView = (NestedScrollView) g2.d.a(viewInflate, R.id.scroll_layout);
                            if (nestedScrollView != null) {
                                i12 = R.id.toolbar;
                                SdkBioToolbar sdkBioToolbar = (SdkBioToolbar) g2.d.a(viewInflate, R.id.toolbar);
                                if (sdkBioToolbar != null) {
                                    i12 = R.id.tv_footer;
                                    TextView textView = (TextView) g2.d.a(viewInflate, R.id.tv_footer);
                                    if (textView != null) {
                                        i12 = R.id.tv_main_title;
                                        TextView textView2 = (TextView) g2.d.a(viewInflate, R.id.tv_main_title);
                                        if (textView2 != null) {
                                            return new G((ConstraintLayout) viewInflate, linearLayout, sdkBioButton, sdkBioButton2, appCompatImageView, sdkBioList, nestedScrollView, sdkBioToolbar, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // g2.c
    public final View getRoot() {
        return this.f1033a;
    }
}

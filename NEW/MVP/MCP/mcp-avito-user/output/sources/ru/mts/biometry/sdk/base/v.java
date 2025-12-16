package ru.mts.biometry.sdk.base;

import B91.J;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import g2.d;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import ru.mts.biometry.sdk.view.SdkBioList;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/base/v;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "ru/mts/biometry/sdk/base/t", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class v extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public J f436390f0;

    /* renamed from: g0, reason: collision with root package name */
    public final InterfaceC42726C f436391g0 = C42727D.c(new A91.s(this));

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sdk_bio_fragment_recommendation, viewGroup, false);
        SdkBioList sdkBioList = (SdkBioList) d.a(viewInflate, R.id.sbl_items);
        if (sdkBioList == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.sbl_items)));
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        this.f436390f0 = new J(frameLayout, sdkBioList);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SdkBioList sdkBioList;
        super.onViewCreated(view, bundle);
        J j12 = this.f436390f0;
        if (j12 == null || (sdkBioList = j12.f1071b) == null) {
            return;
        }
        sdkBioList.setItems((List) this.f436391g0.getValue());
    }
}

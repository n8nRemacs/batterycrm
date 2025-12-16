package com.avito.android.comfortable_deal_info;

import Y61.k;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.comfortable_deal_info.dto.Screen;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealInfoRouter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal_info/g;", "Lcom/avito/android/comfortable_deal_info/f;", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DialogFragment f123489a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f123490b;

    public g(@k DialogFragment dialogFragment, @k ArrayList arrayList) {
        this.f123489a = dialogFragment;
        this.f123490b = arrayList;
    }

    @Override // com.avito.android.comfortable_deal_info.f
    public final void a(int i12) {
        c(i12, true);
    }

    @Override // com.avito.android.comfortable_deal_info.f
    public final void b(int i12) {
        c(i12, false);
    }

    public final void c(int i12, boolean z12) {
        Screen screen = (Screen) C42745f0.K(i12, this.f123490b);
        if (screen == null) {
            dismiss();
            return;
        }
        int i13 = z12 ? R.anim.comfortable_deal_info_enter_from_right : R.anim.comfortable_deal_info_enter_from_left;
        int i14 = z12 ? R.anim.comfortable_deal_info_exit_to_left : R.anim.comfortable_deal_info_exit_to_right;
        H hE2 = this.f123489a.getChildFragmentManager().e();
        hE2.o(i13, i14, 0, 0);
        ComfortableDealInfoFragment.f123452q0.getClass();
        ComfortableDealInfoFragment comfortableDealInfoFragment = new ComfortableDealInfoFragment();
        comfortableDealInfoFragment.f123455o0.setValue(comfortableDealInfoFragment, ComfortableDealInfoFragment.f123453r0[0], new ComfortableDealInfoParams(screen.f123485b, screen.f123486c, screen.f123487d, i12));
        hE2.n(R.id.fragment_container, comfortableDealInfoFragment, null);
        hE2.e();
    }

    @Override // com.avito.android.comfortable_deal_info.f
    public final void dismiss() {
        this.f123489a.dismiss();
    }
}

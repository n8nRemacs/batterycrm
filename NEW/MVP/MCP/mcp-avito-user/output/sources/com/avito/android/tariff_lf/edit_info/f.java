package com.avito.android.tariff_lf.edit_info;

import Y41.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.tariff.remote.model.edit.TariffAlertAction;
import com.avito.android.tariff_lf.edit_info.EditInfoFragment;
import com.avito.android.tariff_lf.edit_info.viewmodel.k;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: EditInfoFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LaD0/e;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(LaD0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements l<aD0.e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditInfoFragment f298872l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(EditInfoFragment editInfoFragment) {
        super(1);
        this.f298872l = editInfoFragment;
    }

    @Override // Y41.l
    public final G0 invoke(aD0.e eVar) {
        final int i12 = 1;
        final int i13 = 0;
        aD0.e eVar2 = eVar;
        final EditInfoFragment editInfoFragment = this.f298872l;
        G0 g02 = null;
        if (eVar2 != null) {
            EditInfoFragment.a aVar = EditInfoFragment.f298742F0;
            D6.H(editInfoFragment.r5());
            D6.c(editInfoFragment.s5(), null, Integer.valueOf(y6.b(12)), null, null, 13);
            Banner bannerR5 = editInfoFragment.r5();
            bannerR5.i(R.layout.promo_block_content_layout, eVar2.f20826a);
            bannerR5.setTitle(eVar2.f20827b);
            I5.a((TextView) editInfoFragment.r5().findViewById(R.id.tv_content), eVar2.f20828c, false);
            ArrayList arrayList = eVar2.f20829d;
            final aD0.d dVar = arrayList != null ? (aD0.d) C42745f0.G(arrayList) : null;
            TariffAlertAction.ButtonStyle buttonStyle = dVar != null ? dVar.f20825b : null;
            int i14 = buttonStyle == null ? -1 : EditInfoFragment.b.f298762a[buttonStyle.ordinal()];
            if (i14 == 1) {
                Button button = (Button) editInfoFragment.r5().findViewById(R.id.action_button);
                D6.H(button);
                button.setText(dVar.f20824a);
                button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                k kVar = editInfoFragment.f298751p0;
                                if (kVar == null) {
                                    kVar = null;
                                }
                                kVar.n3(dVar);
                                break;
                            default:
                                k kVar2 = editInfoFragment.f298751p0;
                                if (kVar2 == null) {
                                    kVar2 = null;
                                }
                                kVar2.n3(dVar);
                                break;
                        }
                    }
                });
            } else if (i14 != 2) {
                D6.w(editInfoFragment.r5().findViewById(R.id.action_button));
                D6.w(editInfoFragment.r5().findViewById(R.id.action_link));
            } else {
                TextView textView = (TextView) editInfoFragment.r5().findViewById(R.id.action_link);
                D6.H(textView);
                textView.setText(dVar.f20824a);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.tariff_lf.edit_info.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                k kVar = editInfoFragment.f298751p0;
                                if (kVar == null) {
                                    kVar = null;
                                }
                                kVar.n3(dVar);
                                break;
                            default:
                                k kVar2 = editInfoFragment.f298751p0;
                                if (kVar2 == null) {
                                    kVar2 = null;
                                }
                                kVar2.n3(dVar);
                                break;
                        }
                    }
                });
            }
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            EditInfoFragment.a aVar2 = EditInfoFragment.f298742F0;
            D6.w(editInfoFragment.r5());
        }
        return G0.f406611a;
    }
}

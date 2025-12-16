package com.avito.android.advert.item.rent_agreement;

import Y61.k;
import Y61.l;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RentAgreementView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/rent_agreement/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/rent_agreement/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f78578d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f78579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f78580c;

    public h(@k View view) {
        super(view);
        this.f78579b = view;
        this.f78580c = (Button) view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence] */
    @Override // com.avito.android.advert.item.rent_agreement.g
    public final void Fk(@k String str, @l String str2) {
        String strI = str;
        if (str2 != null) {
            Integer numM = com.avito.android.lib.util.f.m(str2);
            strI = str;
            if (numM != null) {
                int iIntValue = numM.intValue();
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f78579b.getContext(), R.style.Theme_DesignSystem_Re23);
                FV.a aVar = FV.a.f4720a;
                int iB2 = y6.b(4);
                aVar.getClass();
                strI = FV.a.i(str, contextThemeWrapper, iIntValue, iB2);
            }
        }
        this.f78580c.setText(strI);
    }

    @Override // com.avito.android.advert.item.rent_agreement.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f78580c.setOnClickListener(new com.avito.android.advert.item.parking.h(9, aVar));
    }
}

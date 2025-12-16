package com.avito.android.advert.item.cv_phone_actualization;

import Y41.l;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.view.o0;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCvPhoneActualizationView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/cv_phone_actualization/i;", "Lcom/avito/android/advert/item/cv_phone_actualization/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f75049e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f75050b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f75051c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FlexboxLayout f75052d;

    /* compiled from: AdvertCvPhoneActualizationView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75053a;

        static {
            int[] iArr = new int[AdvertCvPhoneActualizationActionType.values().length];
            try {
                AdvertCvPhoneActualizationActionType advertCvPhoneActualizationActionType = AdvertCvPhoneActualizationActionType.f75029b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f75053a = iArr;
        }
    }

    public i(@k View view) {
        super(view);
        this.f75050b = (Banner) view.findViewById(R.id.cv_phone_actualization_promoblock);
        this.f75051c = (TextView) view.findViewById(R.id.cv_phone_actualization_subtitle);
        this.f75052d = (FlexboxLayout) view.findViewById(R.id.cv_phone_actualization_actions_container);
    }

    @Override // com.avito.android.advert.item.cv_phone_actualization.h
    public final void HN(@k String str, @k String str2, @k List<AdvertCvPhoneActualizationAction> list, @k l<? super AdvertCvPhoneActualizationAction, G0> lVar) {
        Banner banner = this.f75050b;
        banner.setTitle(str);
        I5.a(this.f75051c, str2, false);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(banner.getThemedContext());
        FlexboxLayout flexboxLayout = this.f75052d;
        flexboxLayout.removeAllViews();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            AdvertCvPhoneActualizationAction advertCvPhoneActualizationAction = (AdvertCvPhoneActualizationAction) obj;
            layoutInflaterFrom.inflate(a.f75053a[advertCvPhoneActualizationAction.f75027c.ordinal()] == 1 ? R.layout.advert_details_cv_phone_actualization_keep_button : R.layout.advert_details_cv_phone_actualization_change_button, (ViewGroup) flexboxLayout, true);
            Button button = (Button) o0.a(flexboxLayout, i12).findViewById(R.id.cv_phone_actualization_button);
            com.avito.android.lib.design.button.b.a(button, advertCvPhoneActualizationAction.f75026b, false);
            button.setOnClickListener(new com.avito.android.advert.closed.b(20, lVar, advertCvPhoneActualizationAction));
            i12 = i13;
        }
    }
}

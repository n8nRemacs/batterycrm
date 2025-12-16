package com.avito.android.blueprints.select;

import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.validation.InterfaceC36016k;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiStateSelectItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/select/k;", "LTV0/e;", "Lcom/avito/android/validation/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface k extends TV0.e, InterfaceC36016k {

    /* compiled from: MultiStateSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(k kVar, CharSequence charSequence, CharSequence charSequence2, int i12) {
            if ((i12 & 1) != 0) {
                charSequence = null;
            }
            if ((i12 & 2) != 0) {
                charSequence2 = null;
            }
            kVar.K1(charSequence, charSequence2);
        }
    }

    void Fv(@Y61.l CustomPaddings customPaddings);

    void K(@Y61.l Y41.l<? super String, G0> lVar);

    void K1(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2);

    void NL(@Y61.k AddressParameter.InputStyle inputStyle);

    void Rg(@Y61.k AddressParameter.MotivationPosition motivationPosition);

    void a(@Y61.k Y41.a<G0> aVar);

    void b3(@Y61.l String str);

    void cH(@Y61.l AttributedText attributedText, @Y61.l Y41.a<G0> aVar);

    void i4(@Y61.l Y41.a<G0> aVar);

    void k(@Y61.l AttributedText attributedText);

    void k0(@Y61.l CustomPaddings customPaddings);

    void m(@Y61.l String str);

    void o(@Y61.l String str);

    void p2(boolean z12);

    void pb(boolean z12);

    void setEnabled(boolean z12);

    void setTitle(@Y61.k CharSequence charSequence);

    void tW(@Y61.l AttributedText attributedText, @Y61.l Y41.a<G0> aVar);

    void u(@Y61.l CharSequence charSequence);
}

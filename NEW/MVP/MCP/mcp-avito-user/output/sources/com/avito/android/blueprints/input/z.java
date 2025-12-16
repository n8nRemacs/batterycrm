package com.avito.android.blueprints.input;

import android.text.TextWatcher;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35938s1;
import com.avito.android.validation.InterfaceC36016k;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiStateInputItemView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/blueprints/input/z;", "LTV0/e;", "Lcom/avito/android/util/s1;", "Lcom/avito/android/blueprints/publish/html_editor/f;", "Lcom/avito/android/validation/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface z extends TV0.e, InterfaceC35938s1, com.avito.android.blueprints.publish.html_editor.f, InterfaceC36016k {

    /* compiled from: MultiStateInputItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(z zVar, CharSequence charSequence, CharSequence charSequence2, int i12) {
            if ((i12 & 1) != 0) {
                charSequence = null;
            }
            if ((i12 & 2) != 0) {
                charSequence2 = null;
            }
            zVar.K1(charSequence, charSequence2);
        }
    }

    void C2(@Y61.k Y41.l<? super String, G0> lVar);

    void Ga(boolean z12);

    void H20(@Y61.k Y41.a<G0> aVar);

    void I0(int i12);

    void J1(int i12, int i13);

    void K1(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2);

    void M2(boolean z12);

    void Nb(@Y61.l AttributedText attributedText);

    void S7(@Y61.l Y41.a<G0> aVar);

    void T0(@Y61.k FormatterType formatterType);

    void T2(@Y61.l String str);

    void Tk(@Y61.l TextWatcher textWatcher);

    void WE(@InterfaceC42150f @Y61.l Integer num, @InterfaceC42150f @Y61.l Integer num2);

    void Y1(@Y61.l AttributedText attributedText);

    void c2(@Y61.l Y41.l<? super String, G0> lVar);

    void h(@Y61.l String str);

    void h0();

    void h3(@Y61.l String str, boolean z12);

    void h6();

    void he(@Y61.l String str);

    void k0(@Y61.l CustomPaddings customPaddings);

    void n0(@Y61.l String str);

    void n2(@Y61.k Y41.a<G0> aVar);

    void o(@Y61.l String str);

    void q2(boolean z12);

    void s(@Y61.l String str);

    void setAppearance(@InterfaceC42150f int i12);

    void setEnabled(boolean z12);

    void setTitle(@Y61.k CharSequence charSequence);

    void u(@Y61.l CharSequence charSequence);

    void x2(@Y61.k String str);

    void x5(@Y61.l String str);

    void y2(@Y61.k Y41.a<G0> aVar);
}

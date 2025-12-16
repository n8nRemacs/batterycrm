package com.avito.android.compose_items.views;

import Y41.p;
import Y61.l;
import androidx.compose.runtime.A;
import com.avito.android.validation.InterfaceC36016k;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComposeItemViewWithContainer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/compose_items/views/b;", "LTV0/e;", "Lcom/avito/android/validation/k;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b extends TV0.e, InterfaceC36016k {

    /* compiled from: ComposeItemViewWithContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(b bVar, CharSequence charSequence, CharSequence charSequence2, int i12) {
            if ((i12 & 1) != 0) {
                charSequence = null;
            }
            if ((i12 & 2) != 0) {
                charSequence2 = null;
            }
            bVar.K1(charSequence, charSequence2);
        }
    }

    void K1(@l CharSequence charSequence, @l CharSequence charSequence2);

    void i4(@l Y41.a<G0> aVar);

    void setTitle(@Y61.k CharSequence charSequence);

    void u(@l CharSequence charSequence);

    void z7(@Y61.k p<? super A, ? super Integer, G0> pVar);
}

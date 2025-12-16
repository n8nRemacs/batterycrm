package com.avito.android.publish.items.tagged_input;

import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.widget.tagged_input.e;
import com.avito.android.validation.InterfaceC36016k;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MultiStateInputWithTagsItemView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/items/tagged_input/A;", "Lcom/avito/android/ui/widget/tagged_input/e;", "Lcom/avito/android/ui/widget/tagged_input/e$a;", "LTV0/e;", "Lcom/avito/android/ui/widget/tagged_input/g;", "Lcom/avito/android/validation/k;", "Lcom/avito/android/blueprints/publish/html_editor/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface A extends com.avito.android.ui.widget.tagged_input.e, e.a, TV0.e, com.avito.android.ui.widget.tagged_input.g, InterfaceC36016k, com.avito.android.blueprints.publish.html_editor.f {

    /* compiled from: MultiStateInputWithTagsItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(A a12, CharSequence charSequence, CharSequence charSequence2, int i12) {
            if ((i12 & 1) != 0) {
                charSequence = null;
            }
            if ((i12 & 2) != 0) {
                charSequence2 = null;
            }
            a12.K1(charSequence, charSequence2);
        }
    }

    void C2(@Y61.k Y41.l<? super String, G0> lVar);

    void K1(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2);

    void M2(boolean z12);

    void Nb(@Y61.l AttributedText attributedText);

    void T0(@Y61.k FormatterType formatterType);

    void c2(@Y61.l Y41.l<? super String, G0> lVar);

    void f8(@Y61.l String str);

    void h(@Y61.l String str);

    void h0();

    void h3(@Y61.l String str, boolean z12);

    void h6();

    void i0();

    void n0(@Y61.l String str);

    void n2(@Y61.k Y41.a<G0> aVar);

    void o(@Y61.l String str);

    void o9(int i12);

    void q2(boolean z12);

    void setTitle(@Y61.l CharSequence charSequence);

    void t(@Y61.k Y41.a<G0> aVar);

    void u(@Y61.l CharSequence charSequence);

    void x2(@Y61.k String str);

    void y2(@Y61.k Y41.a<G0> aVar);
}

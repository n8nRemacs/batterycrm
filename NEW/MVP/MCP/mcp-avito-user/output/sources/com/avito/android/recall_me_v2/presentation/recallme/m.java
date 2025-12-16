package com.avito.android.recall_me_v2.presentation.recallme;

import Di0.AbstractC13405c;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.R;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: RecallMeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f252118l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i12) {
        super(2);
        this.f252118l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f252118l | 1);
        B bE2 = a12.E(801987685);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            k.c(new AbstractC13405c.a(new RecallMeParams("", "", null), false, "Заявка на звонок", "Вам позвонят, как только смогут.", "Ruben Garrison", false, "9871112233", true, C42784z0.f406748b, new AttributedText(u0.i.c(bE2, R.string.recall_me_agreement_attr_text), Collections.singletonList(new LinkAttribute(u0.i.c(bE2, R.string.recall_me_agreement_attr_text_policy_name), u0.i.c(bE2, R.string.recall_me_agreement_attr_text_policy_title), u0.i.c(bE2, R.string.recall_me_agreement_attr_text_policy_link), Collections.singletonList(FontParameter.UnderlineParameter.INSTANCE))), 0, 4, null)), C43175k.w(), l.f252117l, bE2, 456);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(iA2);
        }
        return G0.f406611a;
    }
}

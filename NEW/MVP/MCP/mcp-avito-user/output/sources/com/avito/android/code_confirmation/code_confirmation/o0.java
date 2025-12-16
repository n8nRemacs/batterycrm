package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.util.C5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: PhoneAttributer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_confirmation/code_confirmation/o0;", "Lcom/avito/android/code_confirmation/code_confirmation/n0;", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f119585a;

    @Inject
    public o0(@N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f119585a = interfaceC35945t1;
    }

    @Override // com.avito.android.code_confirmation.code_confirmation.n0
    @Y61.l
    public final AttributedText a(@Y61.k String str, @Y61.k String str2) {
        String strA0;
        String strA = this.f119585a.a(str2);
        if (str.length() != 0 && str2.length() != 0) {
            C43059p c43059p = C5.f318568b;
            if (c43059p.e(str2) || c43059p.e(strA)) {
                String strA02 = C43066x.a0(strA, " ", " ", false);
                if (C43066x.q(str, strA, false)) {
                    strA0 = C43066x.a0(str, strA, "{{phone}}", false);
                } else if (C43066x.q(str, strA02, false)) {
                    strA0 = C43066x.a0(str, strA02, "{{phone}}", false);
                } else {
                    if (!C43066x.q(str, str2, false)) {
                        return null;
                    }
                    strA0 = C43066x.a0(str, str2, "{{phone}}", false);
                }
                return new AttributedText(strA0, Collections.singletonList(new FontAttribute("phone", strA02, com.avito.android.advert.item.delivery_suggests.l.u(null, "textH5"))), 0);
            }
        }
        return null;
    }
}

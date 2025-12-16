package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.util.C5;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;

/* compiled from: BoldPhoneFormatter.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/tfa_enable_confirm/code_check/interactor/b;", "Lcom/avito/android/safety/tfa_enable_confirm/code_check/interactor/a;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.safety.tfa_enable_confirm.code_check.interactor.a
    @Y61.k
    public final AttributedText a(@Y61.k String str) {
        InterfaceC43057n interfaceC43057nB = C43059p.b(C5.f318568b, str);
        if (interfaceC43057nB == null) {
            return new AttributedText(str, C42784z0.f406748b, 0, 4, null);
        }
        return new AttributedText(str.substring(0, interfaceC43057nB.b().f406905b) + "{{phone_placeholder}}" + str.substring(interfaceC43057nB.b().f406906c + 1), Collections.singletonList(new FontAttribute("phone_placeholder", interfaceC43057nB.getValue(), Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD)))), 0);
    }
}

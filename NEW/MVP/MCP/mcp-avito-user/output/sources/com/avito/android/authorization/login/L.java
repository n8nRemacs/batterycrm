package com.avito.android.authorization.login;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.util.C5;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: LoginSubtitleProvider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/login/L;", "Lcom/avito/android/authorization/login/K;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class L implements K {
    @Inject
    public L() {
    }

    @Override // com.avito.android.authorization.login.K
    @Y61.k
    public final AttributedText a(@Y61.k Resources resources, @Y61.k String str) throws Resources.NotFoundException {
        String string;
        if (C5.f318568b.e(C43066x.a0(str, " ", "", false))) {
            string = resources.getString(R.string.hidden_phone_text, "{{login_ph}}");
        } else {
            if (C5.f318567a.e(str)) {
                str = C5.f318569c.f(str, "$1*");
            }
            string = resources.getString(R.string.hidden_email_text, "{{login_ph}}");
        }
        return new AttributedText(string, Collections.singletonList(new FontAttribute("login_ph", str, Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD)))), 0);
    }

    @Override // com.avito.android.authorization.login.K
    @Y61.k
    public final AttributedText b(@Y61.k Resources resources, @Y61.k String str) {
        return new AttributedText(resources.getString(R.string.login_phone_hint), Collections.singletonList(new FontAttribute("number", str, Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD)))), 0, 4, null);
    }
}

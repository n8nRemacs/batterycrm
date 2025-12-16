package np;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.text.C22602e;
import com.akita.compose.component.input.transformation.j;
import com.avito.android.btob_business_trip.screens.selectItemScreen.t;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.verification.verification_finish.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: np.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44460a {
    @k
    public static final AttributedText a(@k l lVar, @k AttributedText attributedText) {
        AttributedText attributedTextCopy$default = AttributedText.copy$default(attributedText, null, null, 0, 7, null);
        attributedTextCopy$default.setOnDeepLinkClickListener(new q(2, lVar));
        return attributedTextCopy$default;
    }

    @k
    public static final AttributedText b(@k l lVar, @k AttributedText attributedText) {
        AttributedText attributedTextCopy$default = AttributedText.copy$default(attributedText, null, null, 0, 7, null);
        attributedTextCopy$default.setOnUrlClickListener(new t(3, lVar));
        return attributedTextCopy$default;
    }

    @InterfaceC22132o
    @k
    public static final String c(@Y61.l A a12, int i12) {
        a12.C(5209051);
        String str = new j().c(new C22602e(String.valueOf(i12), null, 2, null)).f42449a.f42127c;
        a12.h();
        return str;
    }
}

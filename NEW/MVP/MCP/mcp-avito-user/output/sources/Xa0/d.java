package XA0;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ViewExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {
    public static final void a(@k TextView textView, @l com.avito.android.util.text.a aVar, @l AttributedText attributedText, @l Y41.l<? super DeepLink, G0> lVar) {
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new SE0.a(1, lVar));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        j.a(textView, attributedText, aVar);
    }
}

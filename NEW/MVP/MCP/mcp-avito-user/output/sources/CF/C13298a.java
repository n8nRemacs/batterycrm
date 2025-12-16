package Cf;

import Y61.k;
import com.avito.android.remote.model.autotekateaser.StandaloneAutotekaLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.LinkAttribute;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: StandaloneAutotekaLinkExtension.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_autoteka_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13298a {
    @k
    public static final AttributedText a(@k StandaloneAutotekaLink standaloneAutotekaLink) {
        return new AttributedText(standaloneAutotekaLink.getText() + " \n {{link}}", Collections.singletonList(new LinkAttribute("link", standaloneAutotekaLink.getLink().getText(), standaloneAutotekaLink.getLink().getUrl(), null, 8, null)), 0, 4, null);
    }
}

package Zd;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.authorization.PlaceholderType;
import com.avito.android.deep_linking.links.InfoPageLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: UserAgreementBuilder.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZd/q;", "LZd/p;", "<init>", "()V", "_avito_authorization_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q implements p {

    /* compiled from: UserAgreementBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PlaceholderType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PlaceholderType placeholderType = PlaceholderType.f92738b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public q() {
    }

    @Override // Zd.p
    @Y61.k
    public final AttributedText a(@Y61.k Resources resources, @Y61.k PlaceholderType placeholderType) {
        int i12;
        List listU = C42745f0.U(FontParameter.UnderlineParameter.INSTANCE, new FontParameter.ColorParameter(null, null, "gray54"));
        List listU2 = C42745f0.U(new DeepLinkAttribute("user_agreement", resources.getString(R.string.user_agreement_link_title), new InfoPageLink("user_agreement", resources.getString(R.string.read_licence)), null, null, listU, 24, null), new DeepLinkAttribute("data_policy", resources.getString(R.string.data_policy_link_title), new InfoPageLink("data_policy", resources.getString(R.string.read_data_policy)), null, null, listU, 24, null));
        int iOrdinal = placeholderType.ordinal();
        if (iOrdinal == 0) {
            i12 = R.string.service_agreement_text;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.reg_agreement_text;
        }
        return new AttributedText(resources.getString(i12), listU2, 1);
    }
}

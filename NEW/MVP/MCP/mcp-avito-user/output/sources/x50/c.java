package X50;

import Y61.k;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.deep_linking.links.InfoPageLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LegalsText.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX50/c;", "", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f18586a = new c();

    @k
    public static AttributedText a(@k Context context, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        List listU = C42745f0.U(FontParameter.UnderlineParameter.INSTANCE, new FontParameter.ColorParameter(null, null, "gray54"));
        AttributedText attributedText = new AttributedText(context.getString(R.string.passport_add_profile_select_vertical_legals_template), C42745f0.U(new DeepLinkAttribute("user_agreement", context.getString(R.string.passport_add_profile_select_vertical_user_agreement), new InfoPageLink("user_agreement", context.getString(R.string.read_licence)), null, null, listU, 24, null), new DeepLinkAttribute("data_policy", context.getString(R.string.passport_add_profile_select_vertical_user_data_policy), new InfoPageLink("data_policy", context.getString(R.string.read_data_policy)), null, null, listU, 24, null)), 1);
        attributedText.setOnDeepLinkClickListener(new b(aVar, 0));
        return attributedText;
    }
}

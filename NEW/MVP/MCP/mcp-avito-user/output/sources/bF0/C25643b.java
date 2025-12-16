package bf0;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.publish.deeplink.IacForProInfoSheetShowDeeplink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactMethodResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbf0/b;", "Lbf0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bf0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C25643b implements InterfaceC25642a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f57318a;

    @Inject
    public C25643b(@Y61.k Context context) {
        this.f57318a = context;
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String a() {
        return this.f57318a.getString(R.string.contact_method_only_messenger_banner_title);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String b() {
        return this.f57318a.getString(R.string.iac_for_pro_banner_re_title);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String c() {
        return this.f57318a.getString(R.string.iac_incoming_calls);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String d() {
        return this.f57318a.getString(R.string.contact_method_only_messenger_banner_text);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String e() {
        return this.f57318a.getString(R.string.iac_calls_by_avito);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String f() {
        return this.f57318a.getString(R.string.contact_method_only_calls_banner_text);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final AttributedText g() {
        Context context = this.f57318a;
        return new AttributedText(context.getString(R.string.iac_for_pro_enabled_text), Collections.singletonList(new DeepLinkAttribute(context.getString(R.string.iac_for_pro_enabled_text_link_name), context.getString(R.string.iac_for_pro_link), new IacForProInfoSheetShowDeeplink(), null, null, Collections.singletonList(FontParameter.UnderlineParameter.INSTANCE), 24, null)), 0, 4, null);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String h() {
        return this.f57318a.getString(R.string.contact_method_only_calls_banner_title);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String i() {
        return this.f57318a.getString(R.string.iac_for_pro_banner_re_text);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String j() {
        return this.f57318a.getString(R.string.contact_method_banner_text);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String k() {
        return this.f57318a.getString(R.string.contact_method_calls);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String l() {
        return this.f57318a.getString(R.string.contact_method_messeges);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String m() {
        return this.f57318a.getString(R.string.iac_incoming_calls);
    }

    @Override // bf0.InterfaceC25642a
    @Y61.k
    public final String n() {
        return this.f57318a.getString(R.string.contact_method_banner_title);
    }
}

package com.avito.android.external_apps.deep_linking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Context;
import android.os.Bundle;
import com.avito.android.InterfaceC32900o;
import com.avito.android.R;
import com.avito.android.account.G;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SendEmailLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/m;", "Lev/b;", "Lcom/avito/android/external_apps/deep_linking/SendEmailLink;", "a", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m extends AbstractC40162b<SendEmailLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f155049d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f155050e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C f155051f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32900o f155052g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final G f155053h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Context f155054i;

    /* compiled from: SendEmailLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/m$a;", "", "<init>", "()V", "", "CONTENT_SEPARATOR", "Ljava/lang/String;", "EMAIL_TEXT_BODY_LINES_SEPARATOR", "TAG", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public m(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k C c12, @Y61.k InterfaceC32900o interfaceC32900o, @Y61.k G g12, @Y61.k Context context) {
        this.f155049d = interfaceC4053a;
        this.f155050e = interfaceC35845m2;
        this.f155051f = c12;
        this.f155052g = interfaceC32900o;
        this.f155053h = g12;
        this.f155054i = context;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        SendEmailLink sendEmailLink = (SendEmailLink) deepLink;
        C c12 = this.f155051f;
        Object[] objArr = {c12.getF125482b()};
        Context context = this.f155054i;
        String string = context.getString(R.string.send_email_link_device_model_name, objArr);
        String string2 = context.getString(R.string.send_email_link_os_version, c12.getF125484d(), Integer.valueOf(c12.getF125487g()));
        String email = this.f155053h.e().getEmail();
        String string3 = email != null ? context.getString(R.string.send_email_link_user_info, email) : null;
        String string4 = context.getString(R.string.send_email_link_app_version, this.f155052g.f().getValue());
        String str2 = sendEmailLink.f155028d;
        if (str2 == null) {
            str2 = "";
        }
        this.f155049d.R(this.f155050e.c(sendEmailLink.f155026b, sendEmailLink.f155027c, C42745f0.O(C42756l.B(new String[]{str2, "\n", "________", string, string2, string3, string4}), "\n", null, null, null, 62)), n.f155055l);
        return AbstractC14250d.c.f9171c;
    }
}

package com.avito.android.mortgage_invite.lead.mvi;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import com.avito.android.mortgage.deeplink.MortgageLandingLink;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationContactInfoLink;
import com.avito.android.mortgage_invite.lead.mvi.entity.ApplicationLeadInternalAction;
import com.avito.android.mortgage_invite.lead.mvi.entity.LeadType;
import com.avito.android.remote.model.SearchParamsConverterKt;
import d20.C39487a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import m20.InterfaceC43866b;
import n20.InterfaceC44171a;
import okhttp3.HttpUrl;

/* compiled from: ApplicationLeadActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/lead/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Ln20/a;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction;", "Ln20/c;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC44171a, ApplicationLeadInternalAction, n20.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f205896a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C39487a f205897b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43866b f205898c;

    /* compiled from: ApplicationLeadActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage_invite.lead.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6137a {
        static {
            int[] iArr = new int[LeadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LeadType leadType = LeadType.f205910b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.P p12, @Y61.k C39487a c39487a, @Y61.k InterfaceC43866b interfaceC43866b) {
        this.f205896a = p12;
        this.f205897b = c39487a;
        this.f205898c = interfaceC43866b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ApplicationLeadInternalAction> b(InterfaceC44171a interfaceC44171a, n20.c cVar) {
        C43210w c43210w;
        DeepLink onlyAvitoDomain;
        InterfaceC44171a interfaceC44171a2 = interfaceC44171a;
        n20.c cVar2 = cVar;
        boolean zEquals = interfaceC44171a2.equals(InterfaceC44171a.d.f414858a);
        String str = cVar2.f414864c;
        InterfaceC43866b interfaceC43866b = this.f205898c;
        if (zEquals) {
            LeadType leadType = LeadType.f205910b;
            interfaceC43866b.c(leadType, str);
            return new C43210w(new ApplicationLeadInternalAction.SelectLead(leadType));
        }
        if (interfaceC44171a2.equals(InterfaceC44171a.c.f414857a)) {
            LeadType leadType2 = LeadType.f205911c;
            interfaceC43866b.c(leadType2, str);
            return new C43210w(new ApplicationLeadInternalAction.SelectLead(leadType2));
        }
        if (interfaceC44171a2.equals(InterfaceC44171a.C11853a.f414855a)) {
            LeadType leadType3 = cVar2.f414865d;
            interfaceC43866b.b(leadType3);
            int iOrdinal = leadType3.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                C39487a c39487a = this.f205897b;
                c39487a.getClass();
                n<Object> nVar = C39487a.f393624d[1];
                boolean zBooleanValue = ((Boolean) c39487a.f393626c.a().invoke()).booleanValue();
                String str2 = cVar2.f414863b;
                String str3 = cVar2.f414864c;
                if (zBooleanValue) {
                    onlyAvitoDomain = new MortgageLandingLink(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str3, null, null, null, null, "new_landing_professional", "professional", str2, false, 9404415, null);
                } else {
                    String strA0 = C43066x.a0(HttpUrl.INSTANCE.get(this.f205896a.a()).host(), "app.k.avito.ru", "m.k.avito.ru", false);
                    if (strA0.equals("app.avito.ru")) {
                        strA0 = "m.avito.ru";
                    }
                    onlyAvitoDomain = new WebViewLink.OnlyAvitoDomain(Uri.parse("https://" + strA0 + "/mortgage/pro-application").buildUpon().appendQueryParameter(SearchParamsConverterKt.SOURCE, str2).appendQueryParameter("utm_source", str3).appendQueryParameter("leadType", "agent-leads").build(), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2045, null), null, 4, null);
                }
                return new C43207v(new ApplicationLeadInternalAction[]{new ApplicationLeadInternalAction.OpenDeeplink(onlyAvitoDomain), ApplicationLeadInternalAction.Close.f205906b});
            }
            c43210w = new C43210w(new ApplicationLeadInternalAction.OpenDeeplink(new MortgageApplicationContactInfoLink(cVar2.f414863b, str)));
        } else {
            if (!interfaceC44171a2.equals(InterfaceC44171a.b.f414856a)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(ApplicationLeadInternalAction.CloseWithDismissed.f205907b);
        }
        return c43210w;
    }
}

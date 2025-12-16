package com.avito.android.esia_sdk.mvi;

import Lz.AbstractC14458b;
import Lz.AbstractC14459c;
import android.net.Uri;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.t;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.esiasdk.android.data.network.model.ClientSessionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;
import okio.C44805o;

/* compiled from: EsiaSdkOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/esia_sdk/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "LLz/b;", "LLz/c;", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements t<AbstractC14458b, AbstractC14459c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.esia_sdk.utils.a f148151b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f148152c;

    @Inject
    public i(@Y61.k com.avito.android.esia_sdk.utils.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f148151b = aVar;
        this.f148152c = interfaceC28373a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.t
    public final AbstractC14459c b(AbstractC14458b abstractC14458b) {
        AbstractC14459c c0654c;
        C42784z0 c42784z0;
        String strO;
        AbstractC14458b abstractC14458b2 = abstractC14458b;
        if (abstractC14458b2 instanceof AbstractC14458b.C0653b) {
            return AbstractC14459c.a.f10324a;
        }
        if (abstractC14458b2 instanceof AbstractC14458b.a) {
            return null;
        }
        if (abstractC14458b2 instanceof AbstractC14458b.c) {
            Uri uri = Uri.parse(((AbstractC14458b.c) abstractC14458b2).f10322a);
            this.f148151b.getClass();
            String queryParameter = uri.getQueryParameter("client_id");
            String str = "";
            String str2 = queryParameter == null ? "" : queryParameter;
            String queryParameter2 = uri.getQueryParameter("client_secret");
            String str3 = queryParameter2 == null ? "" : queryParameter2;
            String queryParameter3 = uri.getQueryParameter("timestamp");
            String str4 = queryParameter3 == null ? "" : queryParameter3;
            String queryParameter4 = uri.getQueryParameter(VoiceInfo.STATE);
            String str5 = queryParameter4 == null ? "" : queryParameter4;
            String queryParameter5 = uri.getQueryParameter("scope");
            if (queryParameter5 != null) {
                List listF0 = C43066x.f0(queryParameter5, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C42745f0.q(listF0, 10));
                Iterator it = listF0.iterator();
                while (it.hasNext()) {
                    arrayList.add(C43066x.A0((String) it.next()).toString());
                }
                c42784z0 = arrayList;
            } else {
                c42784z0 = C42784z0.f406748b;
            }
            ClientSessionInfo clientSessionInfo = new ClientSessionInfo(str2, str3, str4, str5, "com.avito://1/gigger/kyc/esia/sdkResult", c42784z0);
            String queryParameter6 = uri.getQueryParameter("permissions");
            if (queryParameter6 != null) {
                C44805o.f420139e.getClass();
                C44805o c44805oA = C44805o.a.a(queryParameter6);
                if (c44805oA != null && (strO = c44805oA.o(C43047d.f410589b)) != null) {
                    str = strO;
                }
            }
            c0654c = new AbstractC14459c.b(clientSessionInfo, str, uri.getScheme() + "://" + uri.getAuthority() + '/');
        } else {
            if (!(abstractC14458b2 instanceof AbstractC14458b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c0654c = new AbstractC14459c.C0654c(((AbstractC14458b.d) abstractC14458b2).f10323a);
        }
        return c0654c;
    }
}

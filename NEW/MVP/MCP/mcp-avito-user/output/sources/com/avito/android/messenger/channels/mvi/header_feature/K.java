package com.avito.android.messenger.channels.mvi.header_feature;

import FY.b;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.WebViewLinkSettings;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ChannelsHeaderReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/header_feature/K;", "Lcom/avito/android/arch/mvi/u;", "LFY/b;", "LFY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class K implements com.avito.android.arch.mvi.u<FY.b, FY.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GY.c f187500b;

    @Inject
    public K(@Y61.k GY.c cVar) {
        this.f187500b = cVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final FY.d a(FY.b bVar, FY.d dVar) {
        FY.b bVar2 = bVar;
        FY.d dVarA = dVar;
        if (bVar2 instanceof b.e) {
            boolean z12 = ((b.e) bVar2).f4760a;
            if (z12 != dVarA.f4767a) {
                dVarA = FY.d.a(dVarA, z12, null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
        } else if (bVar2 instanceof b.f) {
            b.f fVar = (b.f) bVar2;
            if (!kotlin.jvm.internal.L.f(fVar.f4761a, dVarA.f4768b)) {
                dVarA = FY.d.a(dVarA, false, fVar.f4761a, null, null, null, false, null, 125);
            }
        } else if (bVar2 instanceof b.c) {
            String str = ((b.c) bVar2).f4758a;
            WebViewLink.OnlyAvitoDomain onlyAvitoDomain = (str == null || C43066x.K(str)) ? null : new WebViewLink.OnlyAvitoDomain(Uri.parse(str), new WebViewLinkSettings(false, true, false, false, false, null, null, false, false, false, false, 2045, null), null, 4, null);
            if (!kotlin.jvm.internal.L.f(onlyAvitoDomain, dVarA.f4771e)) {
                dVarA = FY.d.a(dVarA, false, null, null, null, onlyAvitoDomain, false, null, 111);
            }
        } else {
            if (!(bVar2 instanceof b.C0292b)) {
                if (bVar2 instanceof b.d) {
                    com.avito.android.messenger.channels.filter.i iVar = ((b.d) bVar2).f4759a;
                    GY.c cVar = this.f187500b;
                    return FY.d.a(dVarA, false, null, cVar.a(), cVar.b(iVar), null, false, null, 115);
                }
                if (bVar2 instanceof b.a) {
                    return FY.d.a(dVarA, false, null, null, null, null, false, ((b.a) bVar2).f4756a, 63);
                }
                if (bVar2.equals(b.g.f4762a) ? true : bVar2.equals(b.h.f4763a)) {
                    return dVarA;
                }
                throw new NoWhenBranchMatchedException();
            }
            boolean z13 = ((b.C0292b) bVar2).f4757a;
            if (z13 != dVarA.f4772f) {
                dVarA = FY.d.a(dVarA, false, null, null, null, null, z13, null, 95);
            }
        }
        return dVarA;
    }
}

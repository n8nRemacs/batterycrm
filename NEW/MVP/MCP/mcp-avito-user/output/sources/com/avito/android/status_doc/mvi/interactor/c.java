package com.avito.android.status_doc.mvi.interactor;

import Ax0.C13097a;
import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig.status_doc_public.generated.api.get_medical_status.GetMedicalStatusRespAction;
import com.avito.android.remote.H;
import com.avito.android.status_doc.mvi.entities.ButtonStyle;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigStatusDocInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/status_doc/mvi/interactor/c;", "Lcom/avito/android/status_doc/mvi/interactor/a;", "_avito_gig_status-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final WG.a f284923a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f284924b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final E f284925c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final H f284926d;

    @Inject
    public c(@k WG.a aVar, @k InterfaceC28373a interfaceC28373a, @k E e12, @k H h12) {
        this.f284923a = aVar;
        this.f284924b = interfaceC28373a;
        this.f284925c = e12;
        this.f284926d = h12;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.android.status_doc.mvi.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r19, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.status_doc.mvi.interactor.c.a(kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final C13097a b(GetMedicalStatusRespAction getMedicalStatusRespAction) {
        ButtonStyle buttonStyle = getMedicalStatusRespAction.getStyle() == GetMedicalStatusRespAction.Style.Default ? ButtonStyle.f284906b : ButtonStyle.f284907c;
        String title = getMedicalStatusRespAction.getTitle();
        DeepLink uri = getMedicalStatusRespAction.getUri();
        XG.a event = getMedicalStatusRespAction.getEvent();
        return new C13097a(buttonStyle, title, uri, event != null ? c(event) : null);
    }

    public final ParametrizedClickStreamEvent c(XG.a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVar.b());
        String strA = this.f284925c.a();
        if (strA == null) {
            strA = "";
        }
        linkedHashMap.put("uid", strA);
        linkedHashMap.put("u", this.f284926d.getF253025a());
        linkedHashMap.put("business_platform", "3");
        return new ParametrizedClickStreamEvent((int) aVar.getId(), (int) aVar.getVersion(), linkedHashMap, null, 8, null);
    }
}

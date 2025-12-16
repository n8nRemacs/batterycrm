package com.avito.android.work_profile.deeplink_handling;

import Y61.k;
import bv.C25719a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.work_profile.deeplink.JobSeekerCvsLink;
import com.avito.android.work_profile.intent_factory.WorkProfileTab;
import ev.AbstractC40161a;
import fQ0.InterfaceC40329a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobSeekerCvsDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/deeplink_handling/a;", "Lev/a;", "Lcom/avito/android/work_profile/deeplink/JobSeekerCvsLink;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40161a<JobSeekerCvsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC40329a f330620f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f330621g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f330622h;

    /* compiled from: JobSeekerCvsDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.work_profile.deeplink_handling.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10262a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<WorkProfileTab> f330623a = kotlin.enums.c.a(WorkProfileTab.values());
    }

    @Inject
    public a(@k InterfaceC40329a interfaceC40329a, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a) {
        this.f330620f = interfaceC40329a;
        this.f330621g = interfaceC4053a;
        this.f330622h = c25719a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    @Override // ev.AbstractC40161a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r2, com.avito.android.deep_linking.links.DeepLink r3, java.lang.String r4) {
        /*
            r1 = this;
            com.avito.android.work_profile.deeplink.JobSeekerCvsLink r3 = (com.avito.android.work_profile.deeplink.JobSeekerCvsLink) r3
            java.lang.String r2 = r3.f330618b
            int r4 = r2.hashCode()
            r0 = -793235316(0xffffffffd0b8308c, float:-2.4721514E10)
            if (r4 == r0) goto L30
            r0 = 98912(0x18260, float:1.38605E-40)
            if (r4 == r0) goto L24
            r0 = 92611469(0x585238d, float:1.2520319E-35)
            if (r4 == r0) goto L18
            goto L38
        L18:
            java.lang.String r4 = "about"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L21
            goto L38
        L21:
            com.avito.android.authorization.AuthSource r2 = com.avito.android.authorization.AuthSource.f92697d0
            goto L3c
        L24:
            java.lang.String r4 = "cvs"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L2d
            goto L38
        L2d:
            com.avito.android.authorization.AuthSource r2 = com.avito.android.authorization.AuthSource.f92693b0
            goto L3c
        L30:
            java.lang.String r4 = "applies"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3a
        L38:
            r2 = 0
            goto L3c
        L3a:
            com.avito.android.authorization.AuthSource r2 = com.avito.android.authorization.AuthSource.f92695c0
        L3c:
            com.avito.android.work_profile.deeplink_handling.b r4 = new com.avito.android.work_profile.deeplink_handling.b
            r4.<init>(r1, r3)
            bv.a r0 = r1.f330622h
            r0.a(r3, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.deeplink_handling.a.a(android.os.Bundle, com.avito.android.deep_linking.links.DeepLink, java.lang.String):void");
    }
}

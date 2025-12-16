package com.avito.android.profile_phones.deep_linking;

import com.avito.android.N1;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.deep_linking.RatingPublishLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.PhoneAddLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PhoneAddAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/e;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends AbstractC40161a<PhoneAddLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f227130f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f227131g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f227132h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final N1 f227133i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final PhoneManagementIntentFactory f227134j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f227135k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PhoneAddAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(e.this);
        }
    }

    @Inject
    public e(@Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k N1 n12, @Y61.k PhoneManagementIntentFactory phoneManagementIntentFactory) {
        this.f227130f = bVar;
        this.f227131g = interfaceC4053a;
        this.f227132h = aVar;
        this.f227133i = n12;
        this.f227134j = phoneManagementIntentFactory;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    @Override // ev.AbstractC40161a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r3, com.avito.android.deep_linking.links.DeepLink r4, java.lang.String r5) {
        /*
            r2 = this;
            com.avito.android.deep_linking.links.auth.PhoneAddLink r4 = (com.avito.android.deep_linking.links.auth.PhoneAddLink) r4
            java.lang.String r3 = r4.f133940c
            int r5 = r3.hashCode()
            com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory r0 = r2.f227134j
            switch(r5) {
                case -1895812294: goto L49;
                case -1428484082: goto L40;
                case -1367425298: goto L37;
                case -859238727: goto L2e;
                case -854240093: goto L25;
                case -795192327: goto L1c;
                case 176907088: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L51
        Le:
            java.lang.String r4 = "profile:add"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L17
            goto L51
        L17:
            android.content.Intent r3 = r0.a(r3)
            goto L62
        L1c:
            java.lang.String r5 = "wallet"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L56
            goto L51
        L25:
            java.lang.String r5 = "extended_profile"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L56
            goto L51
        L2e:
            java.lang.String r5 = "favorites_add"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L56
            goto L51
        L37:
            java.lang.String r5 = "phone_verification_onboarding"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L56
            goto L51
        L40:
            java.lang.String r5 = "self-employed"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L56
            goto L51
        L49:
            java.lang.String r5 = "review_add"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L56
        L51:
            android.content.Intent r3 = r0.a(r3)
            goto L62
        L56:
            com.avito.android.N1 r5 = r2.f227133i
            java.lang.String r0 = r4.f133941d
            java.lang.String r1 = r4.f133942e
            java.lang.String r4 = r4.f133939b
            android.content.Intent r3 = r5.g(r0, r1, r3, r4)
        L62:
            int r4 = sv.C48421d.a(r2)
            com.avito.android.deeplink_handler.view.a$a r5 = r2.f227131g
            com.avito.android.deeplink_handler.view.a.InterfaceC4053a.C4054a.b(r5, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.deep_linking.e.a(android.os.Bundle, com.avito.android.deep_linking.links.DeepLink, java.lang.String):void");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f227135k.b(this.f227130f.Q().N(new a()).t0(new l41.g() { // from class: com.avito.android.profile_phones.deep_linking.e.b
            @Override // l41.g
            public final void accept(Object obj) {
                C47918a c47918a = (C47918a) obj;
                e eVar = e.this;
                if (c47918a.f437156b != -1) {
                    eVar.j(PhoneAddLink.c.a.f133944b);
                    return;
                }
                PhoneAddLink phoneAddLinkC = eVar.c();
                DeepLink deepLink = phoneAddLinkC != null ? phoneAddLinkC.f133943f : null;
                if (deepLink instanceof RatingPublishLink) {
                    eVar.j(new PhoneAddLink.c.d((RatingPublishLink) deepLink));
                } else if (deepLink == null) {
                    eVar.j(new PhoneAddLink.c.C4027c(c47918a.f437157c));
                } else {
                    eVar.i(new PhoneAddLink.c.b(deepLink), eVar.f227132h, deepLink);
                }
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f227135k.e();
    }
}

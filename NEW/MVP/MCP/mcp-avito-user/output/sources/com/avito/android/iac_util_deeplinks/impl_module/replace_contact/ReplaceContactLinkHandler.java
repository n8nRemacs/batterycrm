package com.avito.android.iac_util_deeplinks.impl_module.replace_contact;

import Y41.l;
import Y61.k;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink;
import com.avito.android.permissions.u;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReplaceContactLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/replace_contact/ReplaceContactLinkHandler;", "Lev/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/replace_contact/ReplaceContactLink;", "ReplaceContactLinkHandlerError", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReplaceContactLinkHandler extends AbstractC40161a<ReplaceContactLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f169206f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final u f169207g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f169208h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC28373a f169209i;

    /* compiled from: ReplaceContactLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/replace_contact/ReplaceContactLinkHandler$ReplaceContactLinkHandlerError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReplaceContactLinkHandlerError extends RuntimeException {
    }

    /* compiled from: ReplaceContactLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Context, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ReplaceContactLink f169211m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReplaceContactLink replaceContactLink) {
            super(1);
            this.f169211m = replaceContactLink;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00fa  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(android.content.Context r17) throws android.os.RemoteException, android.content.OperationApplicationException {
            /*
                Method dump skipped, instructions count: 473
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_util_deeplinks.impl_module.replace_contact.ReplaceContactLinkHandler.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public ReplaceContactLinkHandler(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k u uVar, @k a.InterfaceC4053a interfaceC4053a, @k InterfaceC28373a interfaceC28373a) {
        this.f169206f = aVar;
        this.f169207g = uVar;
        this.f169208h = interfaceC4053a;
        this.f169209i = interfaceC28373a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    @Override // ev.AbstractC40161a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.os.Bundle r11, com.avito.android.deep_linking.links.DeepLink r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r11 = "ReplaceContactLinkHandler"
            com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink r12 = (com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink) r12
            com.avito.android.deeplink_handler.handler.composite.a r13 = r10.f169206f
            com.avito.android.analytics.a r0 = r10.f169209i
            r1 = 0
            r2 = 0
            r10.k(r12)     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            com.avito.android.deep_linking.links.DeepLink r3 = r10.c()
            com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink r3 = (com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink) r3
            if (r3 == 0) goto L1d
            java.lang.String r3 = r3.f169319b
            goto L1e
        L1d:
            r3 = r1
        L1e:
            if (r3 != 0) goto L22
            java.lang.String r3 = ""
        L22:
            r12.append(r3)
            java.lang.String r3 = ": "
            r12.append(r3)
            com.avito.android.deep_linking.links.DeepLink r3 = r10.c()
            com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink r3 = (com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink) r3
            if (r3 == 0) goto L35
            java.util.List<java.lang.String> r3 = r3.f169320c
            goto L36
        L35:
            r3 = r1
        L36:
            if (r3 != 0) goto L3a
            kotlin.collections.z0 r3 = kotlin.collections.C42784z0.f406748b
        L3a:
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r7 = 0
            r8 = 0
            java.lang.String r5 = ","
            r6 = 0
            r9 = 62
            java.lang.String r3 = kotlin.collections.C42745f0.O(r4, r5, r6, r7, r8, r9)
            r4 = 125(0x7d, float:1.75E-43)
            java.lang.String r12 = androidx.compose.runtime.C22026a.c(r12, r3, r4)
            com.avito.android.iac_util_deeplinks.impl_module.replace_contact.d r3 = new com.avito.android.iac_util_deeplinks.impl_module.replace_contact.d
            r3.<init>(r12)
            r0.c(r3)
            com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink$b$b r12 = com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink.b.C5008b.f169324b
            com.avito.android.deep_linking.links.DeepLink r0 = r10.c()
            com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink r0 = (com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink) r0
            if (r0 == 0) goto L63
            com.avito.android.deep_linking.links.DeepLink r0 = r0.f169321d
            goto L64
        L63:
            r0 = r1
        L64:
            java.util.List r0 = kotlin.collections.C42745f0.V(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            com.avito.android.deep_linking.links.DeepLink[] r2 = new com.avito.android.deep_linking.links.DeepLink[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            com.avito.android.deep_linking.links.DeepLink[] r0 = (com.avito.android.deep_linking.links.DeepLink[]) r0
            int r2 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            com.avito.android.deep_linking.links.DeepLink[] r0 = (com.avito.android.deep_linking.links.DeepLink[]) r0
            r10.i(r12, r13, r0)
            com.avito.android.util.V2 r12 = com.avito.android.util.V2.f318762a
            java.lang.String r13 = "success"
            r12.c(r11, r13, r1)
            goto Lcd
        L84:
            r12 = move-exception
            java.lang.String r3 = r12.getMessage()
            if (r3 == 0) goto L95
            boolean r4 = kotlin.text.C43066x.K(r3)
            if (r4 != 0) goto L92
            goto L93
        L92:
            r3 = r1
        L93:
            if (r3 != 0) goto L97
        L95:
            java.lang.String r3 = "Unknown error with empty body"
        L97:
            com.avito.android.iac_util_deeplinks.impl_module.replace_contact.a r4 = new com.avito.android.iac_util_deeplinks.impl_module.replace_contact.a
            r4.<init>(r3)
            r0.c(r4)
            com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink$b$a r0 = new com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink$b$a
            r0.<init>(r12)
            com.avito.android.deep_linking.links.DeepLink r3 = r10.c()
            com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink r3 = (com.avito.android.iac_util_deeplinks.public_module.replace_contact.ReplaceContactLink) r3
            if (r3 == 0) goto Lae
            com.avito.android.deep_linking.links.DeepLink r1 = r3.f169322e
        Lae:
            java.util.List r1 = kotlin.collections.C42745f0.V(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            com.avito.android.deep_linking.links.DeepLink[] r2 = new com.avito.android.deep_linking.links.DeepLink[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            com.avito.android.deep_linking.links.DeepLink[] r1 = (com.avito.android.deep_linking.links.DeepLink[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            com.avito.android.deep_linking.links.DeepLink[] r1 = (com.avito.android.deep_linking.links.DeepLink[]) r1
            r10.i(r0, r13, r1)
            com.avito.android.util.V2 r13 = com.avito.android.util.V2.f318762a
            java.lang.String r0 = "error:"
            r13.a(r11, r0, r12)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_util_deeplinks.impl_module.replace_contact.ReplaceContactLinkHandler.a(android.os.Bundle, com.avito.android.deep_linking.links.DeepLink, java.lang.String):void");
    }

    public final void k(ReplaceContactLink replaceContactLink) {
        u uVar = this.f169207g;
        if (!uVar.b("android.permission.WRITE_CONTACTS")) {
            throw new ReplaceContactLinkHandlerError("No permission to write contacts");
        }
        if (!uVar.b("android.permission.READ_CONTACTS")) {
            throw new ReplaceContactLinkHandlerError("No permission to read contacts");
        }
        this.f169208h.g1(new a(replaceContactLink));
    }
}

package com.avito.android.installments.form.deeplink;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_shared.common.action.BeduinSendActionsToFormAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InstallmentsFormShowLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import ev.AbstractC40161a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.InterfaceC49066a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: InstallmentsFormShowDeeplinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments/form/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/InstallmentsFormShowLink;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<InstallmentsFormShowLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RN.a f172617f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f172618g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f172619h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f172620i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49066a f172621j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f172622k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: InstallmentsFormShowDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.installments.form.deeplink.a$a, reason: collision with other inner class name */
    public static final class C5087a<T> implements r {
        public C5087a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: InstallmentsFormShowDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str;
            ArrayList<String> stringArrayListExtra;
            Object objE;
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            a aVar = a.this;
            if (i12 == -1) {
                aVar.j(InstallmentsFormShowLink.c.f133393b);
                return;
            }
            if (i12 != 0) {
                return;
            }
            h31.e<Gson> eVar = aVar.f172620i;
            List list = null;
            Object objE2 = null;
            list = null;
            Intent intent = c47918a.f437157c;
            if (intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("extra_post_message_actions")) != null) {
                for (String str2 : stringArrayListExtra) {
                    Gson gson = eVar.get();
                    try {
                        Type type = new com.avito.android.installments.form.deeplink.b().getType();
                        objE = gson.e(str2, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
                    } catch (Throwable unused) {
                        objE = null;
                    }
                    BeduinSendActionsToFormAction beduinSendActionsToFormAction = objE instanceof BeduinSendActionsToFormAction ? (BeduinSendActionsToFormAction) objE : null;
                    String formId = beduinSendActionsToFormAction != null ? beduinSendActionsToFormAction.getFormId() : null;
                    if (beduinSendActionsToFormAction != null && formId != null) {
                        aVar.f172621j.a(formId, Collections.singletonList(beduinSendActionsToFormAction));
                    }
                }
            }
            InstallmentsFormShowLink installmentsFormShowLinkC = aVar.c();
            if (installmentsFormShowLinkC != null && (str = installmentsFormShowLinkC.f133388i) != null) {
                Gson gson2 = eVar.get();
                try {
                    Type type2 = new c().getType();
                    objE2 = gson2.e(str, ((type2 instanceof ParameterizedType) && R1.a((ParameterizedType) type2)) ? ((ParameterizedType) type2).getRawType() : R1.b(type2));
                } catch (Throwable unused2) {
                }
                list = (List) objE2;
            }
            aVar.j(new InstallmentsFormShowLink.a(list));
        }
    }

    @Inject
    public a(@Y61.k RN.a aVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k h31.e<Gson> eVar, @Y61.k InterfaceC49066a interfaceC49066a) {
        this.f172617f = aVar;
        this.f172618g = interfaceC4053a;
        this.f172619h = bVar;
        this.f172620i = eVar;
        this.f172621j = interfaceC49066a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        InstallmentsFormShowLink installmentsFormShowLink = (InstallmentsFormShowLink) deepLink;
        this.f172618g.J(this.f172617f.a(installmentsFormShowLink.f133381b, installmentsFormShowLink.f133382c, installmentsFormShowLink.f133383d, installmentsFormShowLink.f133384e, installmentsFormShowLink.f133385f, installmentsFormShowLink.f133386g, installmentsFormShowLink.f133387h, installmentsFormShowLink.f133389j, installmentsFormShowLink.f133390k, installmentsFormShowLink.f133391l), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f172622k.b(this.f172619h.Q().N(new C5087a()).t0(new b()));
    }
}

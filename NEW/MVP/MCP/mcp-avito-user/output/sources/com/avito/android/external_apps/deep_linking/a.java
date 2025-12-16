package com.avito.android.external_apps.deep_linking;

import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExternalAppLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/a;", "Lev/b;", "Lcom/avito/android/external_apps/deep_linking/ExternalAppLink;", "a", "b", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends AbstractC40162b<ExternalAppLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f155029d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f155030e;

    /* compiled from: ExternalAppLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.external_apps.deep_linking.a$a, reason: collision with other inner class name */
    public static final class C4541a {
        public /* synthetic */ C4541a(C42822w c42822w) {
            this();
        }

        public C4541a() {
        }
    }

    /* compiled from: ExternalAppLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/a$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/external_apps/deep_linking/a$b$a;", "Lcom/avito/android/external_apps/deep_linking/a$b$b;", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: ExternalAppLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/a$b$a;", "Lcom/avito/android/external_apps/deep_linking/a$b;", "<init>", "()V", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.external_apps.deep_linking.a$b$a, reason: collision with other inner class name */
        public static final class C4542a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4542a f155031b = new C4542a();

            public C4542a() {
                super(null);
            }
        }

        /* compiled from: ExternalAppLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/a$b$b;", "Lcom/avito/android/external_apps/deep_linking/a$b;", "<init>", "()V", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.external_apps.deep_linking.a$b$b, reason: collision with other inner class name */
        public static final class C4543b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4543b f155032b = new C4543b();

            public C4543b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new C4541a(null);
    }

    @Inject
    public a(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC35845m2 interfaceC35845m2) {
        this.f155029d = interfaceC4053a;
        this.f155030e = interfaceC35845m2;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ExternalAppLink externalAppLink = (ExternalAppLink) deepLink;
        Intent intentQ = this.f155030e.q(externalAppLink.f155024b, externalAppLink.f155025c);
        if (intentQ == null) {
            return b.C4542a.f155031b;
        }
        this.f155029d.R(intentQ, com.avito.android.external_apps.deep_linking.b.f155033l);
        return b.C4543b.f155032b;
    }
}

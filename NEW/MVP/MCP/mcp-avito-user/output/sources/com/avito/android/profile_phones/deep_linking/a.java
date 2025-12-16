package com.avito.android.profile_phones.deep_linking;

import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.avito.android.N1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.LandlinePhoneVerificationLink;
import com.avito.android.deep_linking.links.auth.PhoneVerificationLinkContext;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import com.avito.android.remote.model.text.AttributedText;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: LandlinePhoneVerificationAsyncLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/LandlinePhoneVerificationLink;", "a", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends AbstractC40161a<LandlinePhoneVerificationLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final N1 f227102f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f227103g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f227104h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f227105i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: LandlinePhoneVerificationAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/a$a;", "LJu/c$b;", "a", "b", "Lcom/avito/android/profile_phones/deep_linking/a$a$a;", "Lcom/avito/android/profile_phones/deep_linking/a$a$b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.deep_linking.a$a, reason: collision with other inner class name */
    public interface InterfaceC6897a extends InterfaceC14249c.b {

        /* compiled from: LandlinePhoneVerificationAsyncLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/a$a$a;", "Lcom/avito/android/profile_phones/deep_linking/a$a;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.deep_linking.a$a$a, reason: collision with other inner class name */
        public static final class C6898a implements InterfaceC6897a {
        }

        /* compiled from: LandlinePhoneVerificationAsyncLinkHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/a$a$b;", "Lcom/avito/android/profile_phones/deep_linking/a$a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.deep_linking.a$a$b */
        public static final class b implements InterfaceC6897a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f227106b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final LandlinePhoneVerificationViewModel.ResultStatus f227107c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f227108d;

            public b(@Y61.l LandlinePhoneVerificationViewModel.ResultStatus resultStatus, @Y61.k String str, @Y61.k String str2) {
                this.f227106b = str;
                this.f227107c = resultStatus;
                this.f227108d = str2;
            }
        }
    }

    /* compiled from: LandlinePhoneVerificationAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    @Inject
    public a(@Y61.k N1 n12, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar) {
        this.f227102f = n12;
        this.f227103g = interfaceC4053a;
        this.f227104h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        LandlinePhoneVerificationLink landlinePhoneVerificationLink = (LandlinePhoneVerificationLink) deepLink;
        PhoneVerificationLinkContext phoneVerificationLinkContext = landlinePhoneVerificationLink.f133914b;
        Integer callId = phoneVerificationLinkContext.getCallId();
        int iIntValue = callId != null ? callId.intValue() : 0;
        String title = phoneVerificationLinkContext.getTitle();
        String subtitle = phoneVerificationLinkContext.getSubtitle();
        AttributedText description = phoneVerificationLinkContext.getDescription();
        String str2 = landlinePhoneVerificationLink.f133916d;
        if (str2 == null) {
            str2 = "";
        }
        this.f227103g.J(this.f227102f.c(iIntValue, title, subtitle, description, str2, landlinePhoneVerificationLink.f133915c), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f227105i.b(this.f227104h.Q().N(new b()).t0(new l41.g() { // from class: com.avito.android.profile_phones.deep_linking.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                LandlinePhoneVerificationViewModel.ResultStatus resultStatus;
                Object serializableExtra;
                C47918a c47918a = (C47918a) obj;
                a aVar = a.this;
                if (c47918a.f437156b != -1) {
                    aVar.j(new InterfaceC6897a.C6898a());
                    return;
                }
                Intent intent = c47918a.f437157c;
                String stringExtra = intent != null ? intent.getStringExtra("extra_phone") : null;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (intent != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializableExtra = intent.getSerializableExtra("extra_result_status", LandlinePhoneVerificationViewModel.ResultStatus.class);
                    } else {
                        Object serializableExtra2 = intent.getSerializableExtra("extra_result_status");
                        if (!(serializableExtra2 instanceof LandlinePhoneVerificationViewModel.ResultStatus)) {
                            serializableExtra2 = null;
                        }
                        serializableExtra = (LandlinePhoneVerificationViewModel.ResultStatus) serializableExtra2;
                    }
                    resultStatus = (LandlinePhoneVerificationViewModel.ResultStatus) serializableExtra;
                } else {
                    resultStatus = null;
                }
                if (resultStatus == null) {
                    resultStatus = null;
                }
                String stringExtra2 = intent != null ? intent.getStringExtra("result_message") : null;
                aVar.j(new InterfaceC6897a.b(resultStatus, stringExtra, stringExtra2 != null ? stringExtra2 : ""));
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f227105i.e();
    }
}

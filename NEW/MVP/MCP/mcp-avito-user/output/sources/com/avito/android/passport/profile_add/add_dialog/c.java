package com.avito.android.passport.profile_add.add_dialog;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.R;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.deep_linking.links.ProfileLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.passport.profile_add.onboarding.AddProfileResult;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import ev.AbstractC40161a;
import java.io.Serializable;
import javax.inject.Inject;
import k60.C42524a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kv.C43501a;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PassportAddProfileDialogAsyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/add_dialog/c;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PassportAddProfileLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends AbstractC40161a<PassportAddProfileLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f211189f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C25719a f211190g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f211191h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f211192i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Resources f211193j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a.i f211194k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C42524a f211195l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final G50.a f211196m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f211197n = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PassportAddProfileDialogAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(c.this);
        }
    }

    /* compiled from: PassportAddProfileDialogAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* compiled from: PassportAddProfileDialogAsyncLinkHandler.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[AddProfileResult.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AddProfileResult addProfileResult = AddProfileResult.f213540b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AddProfileResult addProfileResult2 = AddProfileResult.f213540b;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            AddProfileResult addProfileResult;
            Object serializableExtra;
            Intent intent = ((C47918a) obj).f437157c;
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = intent.getSerializableExtra("PassportAddProfileDialogActivity_addProfileResult", AddProfileResult.class);
                } else {
                    Object serializableExtra2 = intent.getSerializableExtra("PassportAddProfileDialogActivity_addProfileResult");
                    if (!(serializableExtra2 instanceof AddProfileResult)) {
                        serializableExtra2 = null;
                    }
                    serializableExtra = (AddProfileResult) serializableExtra2;
                }
                addProfileResult = serializableExtra instanceof AddProfileResult ? (AddProfileResult) serializableExtra : null;
                if (addProfileResult == null) {
                    addProfileResult = AddProfileResult.f213542d;
                }
            } else {
                addProfileResult = AddProfileResult.f213542d;
            }
            int iOrdinal = addProfileResult.ordinal();
            c cVar = c.this;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    c.k(cVar, intent != null ? com.avito.android.passport.profile_add.merge.b.d(intent) : null);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    cVar.j(PassportAddProfileLink.b.a.f133527b);
                    return;
                }
            }
            C42524a c42524a = cVar.f211195l;
            c42524a.getClass();
            n<Object> nVar = C42524a.f406098e[2];
            if (!((Boolean) c42524a.f406101d.a().invoke()).booleanValue()) {
                b.a.a(cVar.f211192i, new ScreenFlowLink(new ProfileLink(false, 1, null), new ToastMessageLink(cVar.f211193j.getString(R.string.passport_add_profile_dialog_profile_created), ToastMessageLink.ToastType.f133735d, ToastMessageLink.ToastBarPosition.f133726d, null, null, false, ToastMessageLink.ToastTheme.f133730c, 56, null)), null, null, 6);
            }
            cVar.j(PassportAddProfileLink.b.C4010b.f133528b);
        }
    }

    /* compiled from: PassportAddProfileDialogAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.passport.profile_add.add_dialog.c$c, reason: collision with other inner class name */
    public static final class C6310c<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final C6310c<T> f211200b = new C6310c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C43501a) obj).f413261b instanceof m;
        }
    }

    /* compiled from: PassportAddProfileDialogAsyncLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            G0 g02;
            String string;
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof m.c;
            c cVar = c.this;
            if (!z12) {
                cVar.j(PassportAddProfileLink.b.a.f133527b);
                return;
            }
            Bundle bundle = ((m.c) interfaceC14249c).f105170b;
            if (bundle == null || (string = bundle.getString("completionMessage")) == null) {
                g02 = null;
            } else {
                c.k(cVar, com.avito.android.printable_text.b.f(string));
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                PrintableText printableTextF = com.avito.android.printable_text.b.f(cVar.f211193j.getString(R.string.passport_add_profile_dialog_profile_removed));
                i.f181082D.getClass();
                i.a.b();
                a.i.C4057a.d(cVar.f211194k, printableTextF, null, null, null, 0, null, null, null, 2046);
                cVar.j(PassportAddProfileLink.b.a.f133527b);
            }
        }
    }

    @Inject
    public c(@k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @k a.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k Resources resources, @k a.i iVar, @k C42524a c42524a, @k G50.a aVar2) {
        this.f211189f = interfaceC4053a;
        this.f211190g = c25719a;
        this.f211191h = bVar;
        this.f211192i = aVar;
        this.f211193j = resources;
        this.f211194k = iVar;
        this.f211195l = c42524a;
        this.f211196m = aVar2;
    }

    public static final void k(c cVar, PrintableText printableText) {
        C42524a c42524a = cVar.f211195l;
        c42524a.getClass();
        n<Object> nVar = C42524a.f406098e[2];
        if (!((Boolean) c42524a.f406101d.a().invoke()).booleanValue()) {
            PrintableText printableTextC = printableText == null ? com.avito.android.printable_text.b.c(R.string.passport_lib_public_passport_accounts_merge_finish_success_toast, new Serializable[0]) : printableText;
            i.f181082D.getClass();
            i.a.b();
            ToastMessageLink.ToastTheme toastTheme = ToastMessageLink.ToastTheme.f133730c;
            a.i.C4057a.d(cVar.f211194k, printableTextC, null, null, null, 0, null, null, "avitoRe23", 1022);
        }
        cVar.j(new PassportAddProfileLink.b.c(printableText));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PassportAddProfileLink passportAddProfileLink = (PassportAddProfileLink) deepLink;
        this.f211189f.g1(new com.avito.android.passport.profile_add.add_dialog.a(this));
        this.f211190g.b(passportAddProfileLink, this, null, new com.avito.android.passport.profile_add.add_dialog.b(passportAddProfileLink, this));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f211191h.Q().N(new a()).t0(new b());
        io.reactivex.rxjava3.disposables.c cVar = this.f211197n;
        cVar.b(dVarT0);
        cVar.b(this.f211192i.d9().N(C6310c.f211200b).t0(new d()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f211197n.e();
    }
}

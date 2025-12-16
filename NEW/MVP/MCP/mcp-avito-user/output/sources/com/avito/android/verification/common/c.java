package com.avito.android.verification.common;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.O;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import ev.AbstractC40161a;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: VerificationResultAsyncDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/common/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lev/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class c<D extends DeepLink> extends AbstractC40161a<D> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f323393f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f323394g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.i f323395h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f323396i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: VerificationResultAsyncDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<D> f323397b;

        public a(c<D> cVar) {
            this.f323397b = cVar;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(this.f323397b);
        }
    }

    /* compiled from: VerificationResultAsyncDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "D", "Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<D> f323398b;

        public b(c<D> cVar) {
            this.f323398b = cVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            Intent intent = c47918a.f437157c;
            String stringExtra = intent != null ? intent.getStringExtra("key.verification_result_message") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = intent != null ? intent.getStringExtra("key.verification_result_error_message") : null;
            String str = stringExtra2 != null ? stringExtra2 : "";
            int length = stringExtra.length();
            c<D> cVar = this.f323398b;
            if (length > 0) {
                a.i.C4057a.d(cVar.f323395h, com.avito.android.printable_text.b.f(stringExtra), null, null, null, 0, null, null, null, 2046);
            }
            if (str.length() > 0) {
                PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
                f.c.f125255c.getClass();
                a.i.C4057a.d(cVar.f323395h, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
            }
            if (c47918a.f437156b == -1) {
                cVar.j(O.b.f133518b);
            } else {
                cVar.j(O.a.f133517b);
            }
        }
    }

    public c(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k a.i iVar) {
        this.f323393f = bVar;
        this.f323394g = interfaceC4053a;
        this.f323395h = iVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
        this.f323394g.J(k(deepLink), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f323396i.b(this.f323393f.Q().N(new a(this)).t0(new b(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f323396i.e();
    }

    @k
    public abstract Intent k(@k D d12);
}

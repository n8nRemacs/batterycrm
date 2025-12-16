package com.avito.android.auto_reseller_contacts.deepLink;

import Ju.AbstractC14250d;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.auto_reseller_contacts.spend_contact_dialog.SpendContactDialogActivity;
import com.avito.android.auto_reseller_contacts.spend_contact_dialog.SpendContactOpenParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.SpendContactsLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.J0;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47918a;
import sv.C48421d;

/* compiled from: SpendContactsDeepLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/deepLink/u;", "Lev/a;", "Lcom/avito/android/deep_linking/links/SpendContactsLink;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u extends AbstractC40161a<SpendContactsLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f95770f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f95771g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f95772h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f95773i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public y f95774j;

    /* compiled from: SpendContactsDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(u.this);
        }
    }

    @Inject
    public u(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f95770f = context;
        this.f95771g = interfaceC4053a;
        this.f95772h = bVar;
        this.f95773i = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SpendContactDialogActivity.a aVar = SpendContactDialogActivity.f95792p;
        SpendContactOpenParams spendContactOpenParams = new SpendContactOpenParams(((SpendContactsLink) deepLink).f133675b);
        aVar.getClass();
        this.f95771g.J(new Intent(this.f95770f, (Class<?>) SpendContactDialogActivity.class).putExtra("open_params", spendContactOpenParams), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        O oK2 = this.f95772h.Q().N(new a()).K(new l41.g() { // from class: com.avito.android.auto_reseller_contacts.deepLink.u.b
            @Override // l41.g
            public final void accept(Object obj) {
                C47918a c47918a = (C47918a) obj;
                u uVar = u.this;
                if (c47918a.f437156b != -1) {
                    uVar.j(AbstractC14250d.b.f9170c);
                }
                Intent intent = c47918a.f437157c;
                if (intent != null) {
                    DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_call_link", DeepLink.class) : intent.getParcelableExtra("key_call_link"));
                    if (deepLink != null) {
                        b.a.a(uVar.f95773i, deepLink, null, null, 6);
                        uVar.j(AbstractC14250d.c.f9171c);
                        return;
                    }
                }
                uVar.j(AbstractC14250d.b.f9170c);
            }
        });
        l41.r<Object> rVar = io.reactivex.rxjava3.internal.functions.a.f401998h;
        Objects.requireNonNull(rVar, "predicate is null");
        this.f95774j = (y) new J0(oK2, rVar).s0();
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f95774j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}

package com.avito.android.details_sheet;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.analytics.a0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: DetailsSheetDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/details_sheet/f;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DetailsSheetLink;", "_avito_details-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends AbstractC40161a<DetailsSheetLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h f135943f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f135944g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f135945h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.b f135946i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f135947j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DetailsSheetDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(f.this);
        }
    }

    @Inject
    public f(@Y61.k h hVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k a.b bVar) {
        this.f135943f = hVar;
        this.f135944g = interfaceC4053a;
        this.f135945h = aVar;
        this.f135946i = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DetailsSheetLink detailsSheetLink = (DetailsSheetLink) deepLink;
        ParametrizedEvent parametrizedEvent = detailsSheetLink.f133238c;
        this.f135944g.J(this.f135943f.a(detailsSheetLink.f133237b, parametrizedEvent != null ? a0.a(parametrizedEvent) : null), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wN2 = this.f135946i.Q().N(new a());
        l41.g gVar = new l41.g() { // from class: com.avito.android.details_sheet.f.b
            @Override // l41.g
            public final void accept(Object obj) {
                C47918a c47918a = (C47918a) obj;
                f fVar = f.this;
                Intent intent = c47918a.f437157c;
                DeepLink deepLink = intent != null ? (DeepLink) intent.getParcelableExtra("extra_details_sheet_deeplink") : null;
                if (c47918a.f437156b != 1 || deepLink == null) {
                    fVar.j(DetailsSheetLink.b.a.f133239b);
                } else {
                    fVar.i(DetailsSheetLink.b.C3995b.f133240b, fVar.f135945h, deepLink);
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f135947j.b(wN2.v0(gVar, new l41.g() { // from class: com.avito.android.details_sheet.f.c
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f135947j.e();
    }
}

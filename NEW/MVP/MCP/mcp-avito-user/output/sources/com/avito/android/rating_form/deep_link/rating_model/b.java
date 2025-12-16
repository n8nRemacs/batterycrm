package com.avito.android.rating_form.deep_link.rating_model;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating_form.deep_link.RatingModelLink;
import com.avito.android.rating_form.o;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: RatingModelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/deep_link/rating_model/b;", "Lev/a;", "Lcom/avito/android/rating_form/deep_link/RatingModelLink;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends AbstractC40161a<RatingModelLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f248072f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f248073g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f248074h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.i f248075i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final o f248076j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f248077k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: RatingModelDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: RatingModelDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.rating_form.deep_link.rating_model.b$b, reason: collision with other inner class name */
    public static final class C7461b<T> implements g {
        public C7461b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
        @Override // l41.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void accept(java.lang.Object r14) {
            /*
                r13 = this;
                rv.a r14 = (rv.C47918a) r14
                android.content.Intent r0 = r14.f437157c
                if (r0 == 0) goto L20
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 33
                if (r1 < r2) goto L13
                java.lang.Object r0 = com.avito.android.publish.screen.objects.a.w(r0)
                android.os.Parcelable r0 = (android.os.Parcelable) r0
                goto L19
            L13:
                java.lang.String r1 = "key_toast_info"
                android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            L19:
                com.avito.android.rating_form.ToastInfo r0 = (com.avito.android.rating_form.ToastInfo) r0
                if (r0 == 0) goto L20
                java.lang.String r0 = r0.f247926b
                goto L21
            L20:
                r0 = 0
            L21:
                com.avito.android.rating_form.deep_link.rating_model.b r1 = com.avito.android.rating_form.deep_link.rating_model.b.this
                int r14 = r14.f437156b
                r2 = -1
                if (r14 != r2) goto L3d
                if (r0 == 0) goto L3d
                com.avito.android.printable_text.PrintableText r4 = com.avito.android.printable_text.b.f(r0)
                com.avito.android.lib.design.toast_bar.ToastBarPosition r9 = com.avito.android.lib.design.toast_bar.ToastBarPosition.f181047e
                r8 = 0
                r12 = 1982(0x7be, float:2.777E-42)
                com.avito.android.deeplink_handler.view.a$i r3 = r1.f248075i
                r5 = 0
                r6 = 0
                r7 = 0
                r10 = 0
                r11 = 0
                com.avito.android.deeplink_handler.view.a.i.C4057a.d(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            L3d:
                Ju.d$c r14 = Ju.AbstractC14250d.c.f9171c
                r1.j(r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.deep_link.rating_model.b.C7461b.accept(java.lang.Object):void");
        }
    }

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k C25719a c25719a, @k a.i iVar, @k o oVar) {
        this.f248072f = interfaceC4053a;
        this.f248073g = bVar;
        this.f248074h = c25719a;
        this.f248075i = iVar;
        this.f248076j = oVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        RatingModelLink ratingModelLink = (RatingModelLink) deepLink;
        this.f248074h.b(ratingModelLink, this, null, new com.avito.android.rating_form.deep_link.rating_model.a(ratingModelLink, this));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f248077k.b(this.f248073g.Q().N(new a()).t0(new C7461b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f248077k.e();
    }
}

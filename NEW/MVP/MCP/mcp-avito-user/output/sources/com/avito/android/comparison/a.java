package com.avito.android.comparison;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.comparison.ComparisonDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ComparisonDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/a;", "Lev/a;", "Lcom/avito/android/comparison/ComparisonDeepLink;", "a", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<ComparisonDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f123821f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f123822g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f123823h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f123824i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ComparisonDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comparison/a$a;", "", "<init>", "()V", "", "COMPARISON_ITEM_LIST", "Ljava/lang/String;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comparison.a$a, reason: collision with other inner class name */
    public static final class C3699a {
        public /* synthetic */ C3699a(C42822w c42822w) {
            this();
        }

        public C3699a() {
        }
    }

    /* compiled from: ComparisonDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: ComparisonDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String[] stringArrayExtra;
            Intent intent = ((C47918a) obj).f437157c;
            a.this.j(new ComparisonDeepLink.b.a((intent == null || (stringArrayExtra = intent.getStringArrayExtra("comparison_list")) == null) ? null : C42756l.g0(stringArrayExtra)));
        }
    }

    static {
        new C3699a(null);
    }

    @Inject
    public a(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar) {
        this.f123821f = context;
        this.f123822g = interfaceC4053a;
        this.f123823h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ComparisonDeepLink comparisonDeepLink = (ComparisonDeepLink) deepLink;
        ComparisonActivity.f123771m.getClass();
        this.f123822g.J(new Intent(this.f123821f, (Class<?>) ComparisonActivity.class).putExtra("category_id", comparisonDeepLink.f123772b).putExtra("from_page", comparisonDeepLink.f123773c), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f123824i.b(this.f123823h.Q().N(new b()).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f123824i.e();
    }
}

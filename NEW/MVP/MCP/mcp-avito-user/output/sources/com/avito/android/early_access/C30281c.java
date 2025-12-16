package com.avito.android.early_access;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.early_access.deeplink.EarlyAccessLink;
import com.avito.android.early_access.q;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47919b;

/* compiled from: EarlyAccessDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/c;", "Lev/a;", "Lcom/avito/android/early_access/deeplink/EarlyAccessLink;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.early_access.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30281c extends AbstractC40161a<EarlyAccessLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final o f145266f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.d f145267g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f145268h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25719a f145269i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.f f145270j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f145271k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public DeepLink f145272l;

    @Inject
    public C30281c(@Y61.k o oVar, @Y61.k a.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k C25719a c25719a, @Y61.k a.f fVar) {
        this.f145266f = oVar;
        this.f145267g = dVar;
        this.f145268h = aVar;
        this.f145269i = c25719a;
        this.f145270j = fVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        EarlyAccessLink earlyAccessLink = (EarlyAccessLink) deepLink;
        this.f145269i.b(earlyAccessLink, this, null, new C30280b(this, earlyAccessLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f145270j.l1(this.f395444b);
        l41.g gVar = new l41.g() { // from class: com.avito.android.early_access.c.a
            @Override // l41.g
            public final void accept(Object obj) {
                C30281c c30281c = C30281c.this;
                boolean z12 = ((C47919b) obj).f437159b.getBoolean("EarlyAccessDialogKeyResult");
                DeepLink deepLink = c30281c.f145272l;
                if (!z12 || deepLink == null) {
                    c30281c.j(q.a.f145568b);
                } else {
                    c30281c.i(q.b.f145569b, c30281c.f145268h, deepLink);
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f145271k.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.early_access.c.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f145271k.e();
    }
}

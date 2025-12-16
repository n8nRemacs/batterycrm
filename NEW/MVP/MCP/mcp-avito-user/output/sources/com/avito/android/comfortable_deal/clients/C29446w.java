package com.avito.android.comfortable_deal.clients;

import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kp.C43476b;

/* compiled from: ClientsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.comfortable_deal.clients.w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29446w extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20644z f120466l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C43476b f120467m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f120468n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f120469o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f120470p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29446w(C20644z c20644z, C43476b c43476b, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f120466l = c20644z;
        this.f120467m = c43476b;
        this.f120468n = lVar;
        this.f120469o = aVar;
        this.f120470p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f120470p | 1);
        C43476b c43476b = this.f120467m;
        Y41.l<DeepLink, G0> lVar = this.f120468n;
        C29444u.b(this.f120466l, c43476b, lVar, this.f120469o, a12, iA2);
        return G0.f406611a;
    }
}

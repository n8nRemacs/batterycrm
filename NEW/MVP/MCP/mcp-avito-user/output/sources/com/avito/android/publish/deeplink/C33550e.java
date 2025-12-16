package com.avito.android.publish.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.util.C35967w2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: AdvertPublicationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.deeplink.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33550e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33551f f232551l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertPublicationLink.Public f232552m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f232553n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f232554o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33550e(C33551f c33551f, AdvertPublicationLink.Public r22, boolean z12, Bundle bundle) {
        super(0);
        this.f232551l = c33551f;
        this.f232552m = r22;
        this.f232553n = z12;
        this.f232554o = bundle;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C33551f c33551f = this.f232551l;
        AdvertPublicationLink.Public r12 = this.f232552m;
        Intent intentE = c33551f.f232557h.e(r12.f132999b, r12.f133000c, this.f232553n, r12.f133002e, r12.f133003f, r12.f133004g, r12.f133005h, r12.f133006i, r12.f133008k);
        Bundle bundle = this.f232554o;
        C35967w2.c(intentE, bundle != null ? com.avito.android.util.H.b(bundle) : null);
        c33551f.f232558i.J(intentE, C48421d.a(c33551f), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}

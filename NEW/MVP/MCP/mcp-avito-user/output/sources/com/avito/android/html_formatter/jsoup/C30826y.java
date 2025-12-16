package com.avito.android.html_formatter.jsoup;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: JsoupExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "Lkotlin/G0;", "invoke", "(Lorg/jsoup/nodes/k;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.html_formatter.jsoup.y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30826y extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<org.jsoup.nodes.n> f164238l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f164239m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30826y(l0.h<org.jsoup.nodes.n> hVar, int i12) {
        super(2);
        this.f164238l = hVar;
        this.f164239m = i12;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, org.jsoup.nodes.k] */
    @Override // Y41.p
    public final G0 invoke(org.jsoup.nodes.k kVar, Integer num) {
        org.jsoup.nodes.k kVar2 = kVar;
        if (num.intValue() == 0 && (kVar2 instanceof org.jsoup.nodes.n)) {
            this.f164238l.f406842b = kVar2;
            org.jsoup.nodes.n nVar = (org.jsoup.nodes.n) kVar2;
            nVar.R(nVar.M().substring(0, this.f164239m));
        }
        return G0.f406611a;
    }
}

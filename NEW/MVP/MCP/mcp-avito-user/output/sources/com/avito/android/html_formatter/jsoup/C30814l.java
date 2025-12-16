package com.avito.android.html_formatter.jsoup;

import kotlin.Metadata;

/* compiled from: JsoupExtensions.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/jsoup/nodes/k;", "node", "", "side", "", "invoke", "(Lorg/jsoup/nodes/k;I)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.html_formatter.jsoup.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30814l extends kotlin.jvm.internal.N implements Y41.p<org.jsoup.nodes.k, Integer, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final C30814l f164225l = new C30814l();

    public C30814l() {
        super(2);
    }

    @Override // Y41.p
    public final Boolean invoke(org.jsoup.nodes.k kVar, Integer num) {
        org.jsoup.nodes.k kVar2 = kVar;
        num.intValue();
        boolean z12 = false;
        if (kVar2 != null && kVar2.r("label")) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}

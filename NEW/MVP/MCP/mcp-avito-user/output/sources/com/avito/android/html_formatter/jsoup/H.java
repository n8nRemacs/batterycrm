package com.avito.android.html_formatter.jsoup;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: JsoupHtmlNode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/H;", "Lorg/jsoup/select/f;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class H implements org.jsoup.select.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.a f164179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f164180b;

    public H(l0.a aVar, E e12) {
        this.f164179a = aVar;
        this.f164180b = e12;
    }

    @Override // org.jsoup.select.f
    public final void b(@Y61.l org.jsoup.nodes.k kVar, int i12) {
        l0.a aVar = this.f164179a;
        aVar.f406838b = aVar.f406838b || kVar.equals(this.f164180b.f164169a);
    }

    @Override // org.jsoup.select.f
    public final void a(@Y61.l org.jsoup.nodes.k kVar, int i12) {
    }
}

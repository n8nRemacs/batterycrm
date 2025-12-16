package com.avito.android.html_formatter.jsoup;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JsoupExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_formatter/jsoup/e;", "Lorg/jsoup/select/f;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.html_formatter.jsoup.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30807e implements org.jsoup.select.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.p<org.jsoup.nodes.k, Integer, Boolean> f164210a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f164211b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f164212c;

    /* renamed from: d, reason: collision with root package name */
    public int f164213d = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public C30807e(@Y61.k Y41.p<? super org.jsoup.nodes.k, ? super Integer, Boolean> pVar, @Y61.k Y41.p<? super org.jsoup.nodes.k, ? super Integer, G0> pVar2, @Y61.k Y41.p<? super org.jsoup.nodes.k, ? super Integer, G0> pVar3) {
        this.f164210a = pVar;
        this.f164211b = (kotlin.jvm.internal.N) pVar2;
        this.f164212c = (kotlin.jvm.internal.N) pVar3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // org.jsoup.select.f
    public final void a(@Y61.l org.jsoup.nodes.k kVar, int i12) {
        this.f164212c.invoke(kVar, Integer.valueOf(this.f164213d));
        int i13 = this.f164213d;
        if (i13 == 0) {
            if (this.f164210a.invoke(kVar, Integer.valueOf(i13)).booleanValue()) {
                this.f164213d = 1;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // org.jsoup.select.f
    public final void b(@Y61.l org.jsoup.nodes.k kVar, int i12) {
        int i13 = this.f164213d;
        if (i13 == -1) {
            if (this.f164210a.invoke(kVar, Integer.valueOf(i13)).booleanValue()) {
                this.f164213d = 0;
            }
        }
        this.f164211b.invoke(kVar, Integer.valueOf(this.f164213d));
    }
}

package com.avito.android.lib.beduin_v2.component.webview.impl;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WebViewState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/impl/b;", "", "a", "b", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f175967a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f175968b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final a f175969c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C5210b f175970d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.l<String, G0> f175971e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Y41.a<G0> f175972f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Y41.l<Boolean, G0> f175973g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Y41.l<Map<String, String>, G0> f175974h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Boolean f175975i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Y41.a<G0> f175976j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Y41.a<G0> f175977k;

    /* compiled from: WebViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/impl/b$a;", "", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f175978a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f175979b;

        public a(@k String str, @l String str2) {
            this.f175978a = str;
            this.f175979b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f175978a, aVar.f175978a) && L.f(this.f175979b, aVar.f175979b);
        }

        public final int hashCode() {
            int iHashCode = this.f175978a.hashCode() * 31;
            String str = this.f175979b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorPlaceholder(title=");
            sb2.append(this.f175978a);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.f175979b, ')');
        }
    }

    /* compiled from: WebViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/impl/b$b;", "", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.component.webview.impl.b$b, reason: collision with other inner class name */
    public static final /* data */ class C5210b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f175980a;

        public C5210b(@k String str) {
            this.f175980a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5210b) && L.f(this.f175980a, ((C5210b) obj).f175980a);
        }

        public final int hashCode() {
            return this.f175980a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadingPlaceholder(title="), this.f175980a, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k String str, @l Boolean bool, @l a aVar, @l C5210b c5210b, @l Y41.l<? super String, G0> lVar, @l Y41.a<G0> aVar2, @l Y41.l<? super Boolean, G0> lVar2, @l Y41.l<? super Map<String, String>, G0> lVar3, @l Boolean bool2, @l Y41.a<G0> aVar3, @l Y41.a<G0> aVar4) {
        this.f175967a = str;
        this.f175968b = bool;
        this.f175969c = aVar;
        this.f175970d = c5210b;
        this.f175971e = lVar;
        this.f175972f = aVar2;
        this.f175973g = lVar2;
        this.f175974h = lVar3;
        this.f175975i = bool2;
        this.f175976j = aVar3;
        this.f175977k = aVar4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f175967a, bVar.f175967a) && L.f(this.f175968b, bVar.f175968b) && L.f(this.f175969c, bVar.f175969c) && L.f(this.f175970d, bVar.f175970d) && L.f(this.f175971e, bVar.f175971e) && L.f(this.f175972f, bVar.f175972f) && L.f(this.f175973g, bVar.f175973g) && L.f(this.f175974h, bVar.f175974h) && L.f(this.f175975i, bVar.f175975i) && L.f(this.f175976j, bVar.f175976j) && L.f(this.f175977k, bVar.f175977k);
    }

    public final int hashCode() {
        int iHashCode = this.f175967a.hashCode() * 31;
        Boolean bool = this.f175968b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        a aVar = this.f175969c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C5210b c5210b = this.f175970d;
        int iHashCode4 = (iHashCode3 + (c5210b == null ? 0 : c5210b.f175980a.hashCode())) * 31;
        Y41.l<String, G0> lVar = this.f175971e;
        int iHashCode5 = (iHashCode4 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f175972f;
        int iHashCode6 = (iHashCode5 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Y41.l<Boolean, G0> lVar2 = this.f175973g;
        int iHashCode7 = (iHashCode6 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Y41.l<Map<String, String>, G0> lVar3 = this.f175974h;
        int iHashCode8 = (iHashCode7 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        Boolean bool2 = this.f175975i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Y41.a<G0> aVar3 = this.f175976j;
        int iHashCode10 = (iHashCode9 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Y41.a<G0> aVar4 = this.f175977k;
        return iHashCode10 + (aVar4 != null ? aVar4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebViewState(url=");
        sb2.append(this.f175967a);
        sb2.append(", enabled=");
        sb2.append(this.f175968b);
        sb2.append(", errorPlaceholder=");
        sb2.append(this.f175969c);
        sb2.append(", loadingPlaceholder=");
        sb2.append(this.f175970d);
        sb2.append(", onDeeplinkRedirect=");
        sb2.append(this.f175971e);
        sb2.append(", onSuccess=");
        sb2.append(this.f175972f);
        sb2.append(", onError=");
        sb2.append(this.f175973g);
        sb2.append(", onPostMessage=");
        sb2.append(this.f175974h);
        sb2.append(", visible=");
        sb2.append(this.f175975i);
        sb2.append(", onShow=");
        sb2.append(this.f175976j);
        sb2.append(", onHide=");
        return r.v(sb2, this.f175977k, ')');
    }

    public /* synthetic */ b(String str, Boolean bool, a aVar, C5210b c5210b, Y41.l lVar, Y41.a aVar2, Y41.l lVar2, Y41.l lVar3, Boolean bool2, Y41.a aVar3, Y41.a aVar4, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? null : aVar, (i12 & 8) != 0 ? null : c5210b, (i12 & 16) != 0 ? null : lVar, (i12 & 32) != 0 ? null : aVar2, (i12 & 64) != 0 ? null : lVar2, (i12 & 128) != 0 ? null : lVar3, (i12 & 256) != 0 ? null : bool2, (i12 & 512) != 0 ? null : aVar3, (i12 & 1024) == 0 ? aVar4 : null);
    }
}

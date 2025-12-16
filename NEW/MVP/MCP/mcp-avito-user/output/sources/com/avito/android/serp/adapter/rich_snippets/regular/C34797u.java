package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30070i4;
import com.avito.android.di.module.InterfaceC30073i7;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.rich_snippets.AdvertGalleryState;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;

/* compiled from: AdvertRichItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/regular/u;", "Lcom/avito/android/serp/adapter/rich_snippets/regular/e;", "Lcom/avito/android/serp/adapter/rich_snippets/regular/e0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34797u implements InterfaceC34782e, e0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f271211b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.serp.adapter.rich_snippets.a> f271212c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.date_time_formatter.b> f271213d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f271214e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC28616b> f271215f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.async_phone.A f271216g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f271217h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.rich_snippets.e f271218i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f271219j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final SearchParams f271220k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.account.E f271221l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0 f271222m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final AdvertGalleryState f271223n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f271224o;

    @Inject
    public C34797u(@Y61.k h31.e<InterfaceC47690b> eVar, @Y61.k h31.e<com.avito.android.serp.adapter.rich_snippets.a> eVar2, @C30070i4.h @Y61.k h31.e<com.avito.android.date_time_formatter.b> eVar3, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.l @InterfaceC30073i7 Kundle kundle, @Y61.k h31.e<InterfaceC28616b> eVar4, @Y61.k com.avito.android.async_phone.A a12, @Y61.k C36135w2 c36135w2, @Y61.k com.avito.android.serp.adapter.rich_snippets.e eVar5, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.l SearchParams searchParams, @Y61.l com.avito.android.account.E e12) {
        AdvertGalleryState advertGalleryState;
        this.f271211b = eVar;
        this.f271212c = eVar2;
        this.f271213d = eVar3;
        this.f271214e = interfaceC28373a;
        this.f271215f = eVar4;
        this.f271216g = a12;
        this.f271217h = c36135w2;
        this.f271218i = eVar5;
        this.f271219j = interfaceC34864v0;
        this.f271220k = searchParams;
        this.f271221l = e12;
        this.f271222m = new f0(interfaceC28373a);
        this.f271223n = (kundle == null || (advertGalleryState = (AdvertGalleryState) kundle.d("advert_gallery_state")) == null) ? new AdvertGalleryState(null, 1, null) : advertGalleryState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0421  */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.avito.android.serp.adapter.rich_snippets.regular.f0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [Q81.a, com.avito.android.serp.adapter.rich_snippets.regular.x, com.avito.android.serp.adapter.serp_advert_card.h, ru.avito.component.serp.AsyncViewportTracker] */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.avito.android.async_phone.b] */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.avito.android.async_phone.A] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List<com.avito.android.remote.model.DimmedImage>] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Set] */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r31, TV0.a r32, int r33) {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.rich_snippets.regular.C34797u.O5(TV0.e, TV0.a, int):void");
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.regular.InterfaceC34782e
    public final void Q(boolean z12) {
        this.f271224o = z12;
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.j
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f271223n, "advert_gallery_state");
        return kundle;
    }

    public /* synthetic */ C34797u(h31.e eVar, h31.e eVar2, h31.e eVar3, InterfaceC28373a interfaceC28373a, Kundle kundle, h31.e eVar4, com.avito.android.async_phone.A a12, C36135w2 c36135w2, com.avito.android.serp.adapter.rich_snippets.e eVar5, InterfaceC34864v0 interfaceC34864v0, SearchParams searchParams, com.avito.android.account.E e12, int i12, C42822w c42822w) {
        this(eVar, eVar2, eVar3, interfaceC28373a, kundle, eVar4, a12, c36135w2, eVar5, interfaceC34864v0, (i12 & 1024) != 0 ? null : searchParams, (i12 & 2048) != 0 ? null : e12);
    }
}

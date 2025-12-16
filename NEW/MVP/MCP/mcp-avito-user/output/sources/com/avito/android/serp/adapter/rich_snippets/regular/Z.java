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

/* compiled from: AdvertXlRichItemPresenter.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/regular/Z;", "Lcom/avito/android/serp/adapter/rich_snippets/regular/L;", "Lcom/avito/android/serp/adapter/rich_snippets/regular/e0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Z implements L, e0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.serp.adapter.rich_snippets.a> f271108b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f271109c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.date_time_formatter.b> f271110d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.rich_snippets.m f271111e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f271112f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC28616b> f271113g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.async_phone.A f271114h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f271115i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.rich_snippets.e f271116j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f271117k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final SearchParams f271118l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.account.E f271119m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f0 f271120n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final AdvertGalleryState f271121o;

    @Inject
    public Z(@Y61.k h31.e<com.avito.android.serp.adapter.rich_snippets.a> eVar, @Y61.k h31.e<InterfaceC47690b> eVar2, @C30070i4.h @Y61.k h31.e<com.avito.android.date_time_formatter.b> eVar3, @Y61.k com.avito.android.serp.adapter.rich_snippets.m mVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k h31.e<InterfaceC28616b> eVar4, @Y61.k com.avito.android.async_phone.A a12, @Y61.k C36135w2 c36135w2, @Y61.k com.avito.android.serp.adapter.rich_snippets.e eVar5, @Y61.l @InterfaceC30073i7 Kundle kundle, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.l SearchParams searchParams, @Y61.l com.avito.android.account.E e12) {
        AdvertGalleryState advertGalleryState;
        this.f271108b = eVar;
        this.f271109c = eVar2;
        this.f271110d = eVar3;
        this.f271111e = mVar;
        this.f271112f = interfaceC28373a;
        this.f271113g = eVar4;
        this.f271114h = a12;
        this.f271115i = c36135w2;
        this.f271116j = eVar5;
        this.f271117k = interfaceC34864v0;
        this.f271118l = searchParams;
        this.f271119m = e12;
        this.f271120n = new f0(interfaceC28373a);
        this.f271121o = (kundle == null || (advertGalleryState = (AdvertGalleryState) kundle.d("advert_xl_gallery_state")) == null) ? new AdvertGalleryState(null, 1, null) : advertGalleryState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030b  */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.avito.android.serp.adapter.rich_snippets.regular.f0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.avito.android.async_phone.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Q81.a, com.avito.android.serp.adapter.rich_snippets.regular.x, com.avito.android.serp.adapter.serp_advert_card.h, ru.avito.component.serp.AsyncViewportTracker] */
    /* JADX WARN: Type inference failed for: r8v8, types: [com.avito.android.async_phone.A] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Set] */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r28, TV0.a r29, int r30) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.rich_snippets.regular.Z.O5(TV0.e, TV0.a, int):void");
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.j
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f271121o, "advert_xl_gallery_state");
        return kundle;
    }

    public /* synthetic */ Z(h31.e eVar, h31.e eVar2, h31.e eVar3, com.avito.android.serp.adapter.rich_snippets.m mVar, InterfaceC28373a interfaceC28373a, h31.e eVar4, com.avito.android.async_phone.A a12, C36135w2 c36135w2, com.avito.android.serp.adapter.rich_snippets.e eVar5, Kundle kundle, InterfaceC34864v0 interfaceC34864v0, SearchParams searchParams, com.avito.android.account.E e12, int i12, C42822w c42822w) {
        this(eVar, eVar2, eVar3, mVar, interfaceC28373a, eVar4, a12, c36135w2, eVar5, kundle, interfaceC34864v0, (i12 & 2048) != 0 ? null : searchParams, (i12 & 4096) != 0 ? null : e12);
    }
}

package com.avito.android.serp.adapter.advert_xl;

import androidx.collection.C20199a;
import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30070i4;
import com.avito.android.di.module.Q;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.p1;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import sN0.InterfaceC48080b;

/* compiled from: AdvertXlItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/advert_xl/u;", "Lcom/avito/android/serp/adapter/advert_xl/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<g> f268867b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f268868c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.b f268869d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34681a f268870e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28616b f268871f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.async_phone.A f268872g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f268873h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f268874i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f268875j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final p1 f268876k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final SearchParams f268877l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.video_snippets.g f268878m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48080b f268879n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final AdvertXlPicturesState f268880o;

    @Inject
    public u(@Y61.k h31.e<g> eVar, @Y61.k h31.e<InterfaceC47690b> eVar2, @C30070i4.h @Y61.k com.avito.android.date_time_formatter.b bVar, @Y61.k InterfaceC34681a interfaceC34681a, @Y61.k InterfaceC28616b interfaceC28616b, @Y61.k com.avito.android.async_phone.A a12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C36135w2 c36135w2, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.l p1 p1Var, @Y61.l SearchParams searchParams, @Q @Y61.l Kundle kundle, @Y61.k com.avito.android.video_snippets.g gVar, @Y61.k InterfaceC48080b interfaceC48080b) {
        AdvertXlPicturesState advertXlPicturesState;
        this.f268867b = eVar;
        this.f268868c = eVar2;
        this.f268869d = bVar;
        this.f268870e = interfaceC34681a;
        this.f268871f = interfaceC28616b;
        this.f268872g = a12;
        this.f268873h = interfaceC28373a;
        this.f268874i = c36135w2;
        this.f268875j = interfaceC34864v0;
        this.f268876k = p1Var;
        this.f268877l = searchParams;
        this.f268878m = gVar;
        this.f268879n = interfaceC48080b;
        this.f268880o = (kundle == null || (advertXlPicturesState = (AdvertXlPicturesState) kundle.d("advert_xl_state")) == null) ? new AdvertXlPicturesState(null, 1, null) : advertXlPicturesState;
        new C20199a();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0266  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r13, TV0.a r14, int r15) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.advert_xl.u.O5(TV0.e, TV0.a, int):void");
    }

    @Override // com.avito.android.serp.adapter.advert_xl.z
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f268880o, "advert_xl_state");
        return kundle;
    }

    public /* synthetic */ u(h31.e eVar, h31.e eVar2, com.avito.android.date_time_formatter.b bVar, InterfaceC34681a interfaceC34681a, InterfaceC28616b interfaceC28616b, com.avito.android.async_phone.A a12, InterfaceC28373a interfaceC28373a, C36135w2 c36135w2, InterfaceC34864v0 interfaceC34864v0, p1 p1Var, SearchParams searchParams, Kundle kundle, com.avito.android.video_snippets.g gVar, InterfaceC48080b interfaceC48080b, int i12, C42822w c42822w) {
        this(eVar, eVar2, bVar, interfaceC34681a, interfaceC28616b, a12, interfaceC28373a, c36135w2, interfaceC34864v0, (i12 & 512) != 0 ? null : p1Var, (i12 & 1024) != 0 ? null : searchParams, kundle, gVar, interfaceC48080b);
    }
}

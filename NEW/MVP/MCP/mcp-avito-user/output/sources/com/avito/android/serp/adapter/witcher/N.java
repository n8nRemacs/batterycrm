package com.avito.android.serp.adapter.witcher;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.serp.adapter.d1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WitcherResourceProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/N;", "Lcom/avito/android/serp/adapter/witcher/M;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class N implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f273783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f273785c;

    /* renamed from: d, reason: collision with root package name */
    public final int f273786d;

    /* renamed from: e, reason: collision with root package name */
    public final int f273787e;

    /* renamed from: f, reason: collision with root package name */
    public final int f273788f;

    /* renamed from: g, reason: collision with root package name */
    public final int f273789g;

    /* renamed from: h, reason: collision with root package name */
    public final int f273790h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f273791i;

    /* renamed from: j, reason: collision with root package name */
    public final int f273792j;

    /* renamed from: k, reason: collision with root package name */
    public final int f273793k;

    /* renamed from: l, reason: collision with root package name */
    public final int f273794l;

    /* renamed from: m, reason: collision with root package name */
    public final int f273795m;

    /* renamed from: n, reason: collision with root package name */
    public final int f273796n;

    @Inject
    public N(@Y61.k Resources resources, @d1 int i12) {
        this.f273783a = resources;
        this.f273784b = i12;
        this.f273785c = resources.getDimensionPixelSize(R.dimen.witcher_extra_padding_top);
        this.f273786d = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f273787e = resources.getDimensionPixelSize(R.dimen.witcher_title_padding_start);
        this.f273788f = resources.getDimensionPixelSize(R.dimen.witcher_title_padding_end);
        this.f273789g = resources.getDimensionPixelSize(R.dimen.witcher_button_padding);
        this.f273790h = resources.getDimensionPixelSize(R.dimen.witcher_button_increased_margin);
        this.f273791i = resources.getBoolean(R.bool.is_tablet);
        this.f273792j = resources.getDimensionPixelSize(R.dimen.witcher_bottom_padding_for_empty_button);
        this.f273793k = resources.getDimensionPixelSize(R.dimen.serp_witcher_horizontal_margin);
        this.f273794l = resources.getDimensionPixelSize(R.dimen.serp_witcher_title_top_margin);
        this.f273795m = resources.getDimensionPixelSize(R.dimen.serp_vm_witcher_recycler_padding);
        this.f273796n = resources.getDimensionPixelSize(R.dimen.serp_witcher_container_top_margin);
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: a, reason: from getter */
    public final int getF273786d() {
        return this.f273786d;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: b, reason: from getter */
    public final int getF273787e() {
        return this.f273787e;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: c, reason: from getter */
    public final boolean getF273791i() {
        return this.f273791i;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: d, reason: from getter */
    public final int getF273793k() {
        return this.f273793k;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    public final int e(int i12) {
        return (int) this.f273783a.getDimension(i12);
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: f, reason: from getter */
    public final int getF273784b() {
        return this.f273784b;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: g, reason: from getter */
    public final int getF273792j() {
        return this.f273792j;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: h, reason: from getter */
    public final int getF273789g() {
        return this.f273789g;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: i, reason: from getter */
    public final int getF273794l() {
        return this.f273794l;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: j, reason: from getter */
    public final int getF273790h() {
        return this.f273790h;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: k, reason: from getter */
    public final int getF273796n() {
        return this.f273796n;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: l, reason: from getter */
    public final int getF273795m() {
        return this.f273795m;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: m, reason: from getter */
    public final int getF273788f() {
        return this.f273788f;
    }

    @Override // com.avito.android.serp.adapter.witcher.M
    /* renamed from: n, reason: from getter */
    public final int getF273785c() {
        return this.f273785c;
    }
}

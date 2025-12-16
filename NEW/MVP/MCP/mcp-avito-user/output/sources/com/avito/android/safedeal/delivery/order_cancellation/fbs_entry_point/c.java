package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FbsEntryPointResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/c;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f256317a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f256318b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f256319c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f256320d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f256321e;

    @Inject
    public c(@k Resources resources) {
        this.f256317a = resources.getString(R.string.fbs_title);
        this.f256318b = resources.getString(R.string.fbs_description);
        this.f256319c = resources.getString(R.string.fbs_button);
        this.f256320d = resources.getString(R.string.fbs_cancel_button);
        this.f256321e = resources.getString(R.string.order_cancel_toast);
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b
    @k
    /* renamed from: a, reason: from getter */
    public final String getF256321e() {
        return this.f256321e;
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF256317a() {
        return this.f256317a;
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b
    @k
    /* renamed from: c, reason: from getter */
    public final String getF256320d() {
        return this.f256320d;
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b
    @k
    /* renamed from: d, reason: from getter */
    public final String getF256319c() {
        return this.f256319c;
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b
    @k
    /* renamed from: e, reason: from getter */
    public final String getF256318b() {
        return this.f256318b;
    }
}

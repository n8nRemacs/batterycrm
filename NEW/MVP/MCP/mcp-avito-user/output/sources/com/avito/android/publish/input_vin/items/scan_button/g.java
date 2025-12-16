package com.avito.android.publish.input_vin.items.scan_button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ScanVinButtonItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/input_vin/items/scan_button/g;", "Lcom/avito/android/publish/input_vin/items/scan_button/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<c> f236590b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<c> f236591c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f236592d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f236593e;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<c> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f236590b = cVar;
        com.jakewharton.rxrelay3.c<c> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f236591c = cVar2;
        this.f236592d = cVar;
        this.f236593e = cVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        iVar.Ib(new e(this, cVar));
        iVar.YJ(new f(this, cVar));
    }

    @Override // com.avito.android.publish.input_vin.items.scan_button.d
    @k
    /* renamed from: U, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF236592d() {
        return this.f236592d;
    }

    @Override // com.avito.android.publish.input_vin.items.scan_button.d
    @k
    /* renamed from: V3, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF236593e() {
        return this.f236593e;
    }
}

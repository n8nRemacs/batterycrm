package com.avito.android.publish.input_imei.items.scan_button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ScanImeiButtonItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/input_imei/items/scan_button/f;", "Lcom/avito/android/publish/input_imei/items/scan_button/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<c> f236362b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f236363c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<c> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f236362b = cVar;
        this.f236363c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.Ui(cVar.f236359b);
        hVar.Ib(new e(this, cVar));
    }

    @Override // com.avito.android.publish.input_imei.items.scan_button.d
    @k
    /* renamed from: U, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF236363c() {
        return this.f236363c;
    }
}

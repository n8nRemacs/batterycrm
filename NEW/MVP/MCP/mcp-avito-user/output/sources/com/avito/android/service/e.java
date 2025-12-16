package com.avito.android.service;

import Y61.k;
import com.avito.android.service.d;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ServiceCountdownHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/e;", "Lcom/avito/android/service/d;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f274011a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d.a f274012b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f274013c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @J41.a
    public int f274014d;

    /* renamed from: e, reason: collision with root package name */
    @J41.a
    public int f274015e;

    @Inject
    public e(@k String str, @k d.a aVar) {
        this.f274011a = str;
        this.f274012b = aVar;
    }

    @Override // com.avito.android.service.d
    public final void a() {
        V2.f318762a.i(this.f274011a, "onActionDone: startId=" + this.f274014d + "; actions=" + this.f274015e, null);
        synchronized (this.f274013c) {
            try {
                int i12 = this.f274015e - 1;
                this.f274015e = i12;
                if (i12 <= 0) {
                    this.f274012b.a(this.f274014d);
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.avito.android.service.d
    public final void b(int i12) {
        V2.f318762a.i(this.f274011a, "onStartAction: startId=" + this.f274014d + "; actions=" + this.f274015e, null);
        synchronized (this.f274013c) {
            try {
                this.f274014d = i12;
                int i13 = this.f274015e + 1;
                this.f274015e = i13;
                if (i13 == 1) {
                    this.f274012b.onStart();
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

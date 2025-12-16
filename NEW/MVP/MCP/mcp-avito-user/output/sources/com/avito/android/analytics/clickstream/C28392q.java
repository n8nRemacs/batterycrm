package com.avito.android.analytics.clickstream;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.analytics.clickstream.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C28392q implements Call.Factory {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h31.e f89825c;

    public /* synthetic */ C28392q(h31.e eVar, int i12) {
        this.f89824b = i12;
        this.f89825c = eVar;
    }

    @Override // okhttp3.Call.Factory
    public final Call newCall(Request request) {
        h31.e eVar = this.f89825c;
        switch (this.f89824b) {
            case 0:
                int i12 = r.f89826a;
                break;
        }
        return ((OkHttpClient) eVar.get()).newCall(request);
    }
}

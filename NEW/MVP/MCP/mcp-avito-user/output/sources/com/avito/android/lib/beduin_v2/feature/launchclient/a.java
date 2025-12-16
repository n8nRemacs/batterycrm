package com.avito.android.lib.beduin_v2.feature.launchclient;

import com.avito.beduin.v2.utils.network.b;
import okhttp3.Call;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f176196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f176197c;

    public /* synthetic */ a(int i12, Object obj, Object obj2) {
        this.f176195a = i12;
        this.f176196b = obj;
        this.f176197c = obj2;
    }

    @Override // HV0.b
    public final void close() {
        Object obj = this.f176197c;
        Object obj2 = this.f176196b;
        switch (this.f176195a) {
            case 0:
                b bVar = (b) obj2;
                String str = (String) obj;
                bVar.f176201e.remove(str);
                bVar.f176198b.h(str);
                break;
            default:
                b.a aVar = com.avito.beduin.v2.utils.network.b.f338456e;
                com.avito.beduin.v2.utils.network.e eVar = ((com.avito.beduin.v2.utils.network.b) obj2).f338459c;
                if (eVar == null) {
                    eVar = null;
                }
                eVar.f338471c = null;
                ((Call) obj).cancel();
                break;
        }
    }
}

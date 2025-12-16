package com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory;

import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class a implements HV0.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f176419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N0 f176420c;

    public /* synthetic */ a(N0 n02, int i12) {
        this.f176419b = i12;
        this.f176420c = n02;
    }

    @Override // HV0.c
    public final void dispose() {
        N0 n02 = this.f176420c;
        switch (this.f176419b) {
            case 0:
                ((V0) n02).c(null);
                break;
            case 1:
                ((V0) n02).c(null);
                break;
            case 2:
                int i12 = com.avito.android.lib.beduin_v2.repository.favorite_item.a.f176588g;
                ((V0) n02).c(null);
                break;
            default:
                ((V0) n02).c(null);
                break;
        }
    }
}

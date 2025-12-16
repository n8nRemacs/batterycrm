package com.avito.avcalls.android.network_test;

import com.avito.avcalls.android.network_test.p;
import com.avito.avcalls.network_test.o;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o implements com.avito.avcalls.android.utils.g, com.avito.avcalls.utils.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f331825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C43238h f331826c;

    public /* synthetic */ o(C43238h c43238h, int i12) {
        this.f331825b = i12;
        this.f331826c = c43238h;
    }

    @Override // com.avito.avcalls.android.utils.g
    public final void cancel() {
        C43238h c43238h = this.f331826c;
        switch (this.f331825b) {
            case 0:
                p.b bVar = p.Companion;
                U.b(c43238h, null);
                break;
            default:
                o.b bVar2 = com.avito.avcalls.network_test.o.Companion;
                U.b(c43238h, null);
                break;
        }
    }
}

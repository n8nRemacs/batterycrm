package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wo;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class Z1 implements ju0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383361b;

    public /* synthetic */ Z1(int i12) {
        this.f383361b = i12;
    }

    @Override // com.yandex.mobile.ads.impl.ju0
    public final boolean apply(Object obj) {
        switch (this.f383361b) {
            case 0:
                return wo.b.a((String) obj);
            default:
                return wo.b.a((Map.Entry) obj);
        }
    }
}

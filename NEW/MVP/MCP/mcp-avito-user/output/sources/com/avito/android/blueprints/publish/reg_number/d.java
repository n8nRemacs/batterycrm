package com.avito.android.blueprints.publish.reg_number;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.util.P2;
import com.avito.android.validation.l1;
import com.avito.android.validation.n1;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.reactivex.rxjava3.core.E;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.core.O;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class d implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f106401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f106402c;

    public /* synthetic */ d(int i12, Y41.l lVar) {
        this.f106401b = i12;
        this.f106402c = lVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        switch (this.f106401b) {
            case 0:
                return (String) this.f106402c.invoke(obj);
            case 1:
                return (String) this.f106402c.invoke(obj);
            case 2:
                return (P2) this.f106402c.invoke(obj);
            case 3:
                return (P2) this.f106402c.invoke(obj);
            case 4:
                return (P2) this.f106402c.invoke(obj);
            case 5:
                return (P2) this.f106402c.invoke(obj);
            case 6:
                return (P2) this.f106402c.invoke(obj);
            case 7:
                return (P2) this.f106402c.invoke(obj);
            case 8:
                return (AvitoMapPoint) this.f106402c.invoke(obj);
            case 9:
                return (AvitoMapPoint) this.f106402c.invoke(obj);
            case 10:
                return (O) this.f106402c.invoke(obj);
            case 11:
                return (O) this.f106402c.invoke(obj);
            case 12:
                return (E) this.f106402c.invoke(obj);
            case 13:
                return (G0) this.f106402c.invoke(obj);
            case 14:
                return (E) this.f106402c.invoke(obj);
            case 15:
                return (G0) this.f106402c.invoke(obj);
            case 16:
                return this.f106402c.invoke(obj);
            case 17:
                return (Q) this.f106402c.invoke(obj);
            case 18:
                return (ArrayList) this.f106402c.invoke(obj);
            case 19:
                return (List) this.f106402c.invoke(obj);
            case 20:
                return (Iterable) this.f106402c.invoke(obj);
            case 21:
                return (n1) this.f106402c.invoke(obj);
            case 22:
                return (org.reactivestreams.c) this.f106402c.invoke(obj);
            case 23:
                return (Iterable) this.f106402c.invoke(obj);
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                return (l1.b) this.f106402c.invoke(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (InterfaceC41774g) this.f106402c.invoke(obj);
            default:
                return (G0) this.f106402c.invoke(obj);
        }
    }
}

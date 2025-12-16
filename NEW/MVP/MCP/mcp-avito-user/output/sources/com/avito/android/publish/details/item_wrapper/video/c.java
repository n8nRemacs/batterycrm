package com.avito.android.publish.details.item_wrapper.video;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VideoInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/item_wrapper/video/c;", "Lcom/avito/android/publish/details/item_wrapper/video/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f234788a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f234789b;

    @Inject
    public c(@k H0 h02, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f234788a = h02;
        this.f234789b = interfaceC35745a5;
    }

    @Override // com.avito.android.publish.details.item_wrapper.video.a
    @k
    public final I0 a(@k String str) {
        z<U> zVarR0 = this.f234788a.a(str).d0(b.f234787b).r0(P2.c.f318721a);
        InterfaceC35745a5 interfaceC35745a5 = this.f234789b;
        return zVarR0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
    }
}

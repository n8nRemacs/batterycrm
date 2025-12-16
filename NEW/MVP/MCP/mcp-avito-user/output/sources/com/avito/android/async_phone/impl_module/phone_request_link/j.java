package com.avito.android.async_phone.impl_module.phone_request_link;

import com.avito.android.lib.design.toast_bar.i;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;

/* compiled from: PhoneRequestLinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class j implements i.b, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<G0> f92185b;

    public j(io.reactivex.rxjava3.subjects.e<G0> eVar) {
        this.f92185b = eVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof i.b) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new H(0, this.f92185b, io.reactivex.rxjava3.subjects.e.class, "onComplete", "onComplete()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.avito.android.lib.design.toast_bar.i.b
    public final void invoke() {
        this.f92185b.e();
    }
}

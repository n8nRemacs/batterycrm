package com.avito.android.publish.details;

import com.avito.android.details.b;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResultListenerProvider.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/x2;", "Lcom/avito/android/details/b$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class x2 implements b.InterfaceC4110b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<b.InterfaceC4110b> f235087b;

    @Inject
    public x2(@Y61.k Set<b.InterfaceC4110b> set) {
        this.f235087b = set;
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void C5(@Y61.k AddressParameter addressParameter) {
        Iterator<T> it = this.f235087b.iterator();
        while (it.hasNext()) {
            ((b.InterfaceC4110b) it.next()).C5(addressParameter);
        }
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void I9(@Y61.k String str) {
        Iterator<T> it = this.f235087b.iterator();
        while (it.hasNext()) {
            ((b.InterfaceC4110b) it.next()).I9(str);
        }
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void N7(@Y61.k PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
        Iterator<T> it = this.f235087b.iterator();
        while (it.hasNext()) {
            ((b.InterfaceC4110b) it.next()).N7(publishMethodWithAllSelectedValueParameter);
        }
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void c3(@Y61.l ParameterSlot parameterSlot, @Y61.l String str) {
        Iterator<T> it = this.f235087b.iterator();
        while (it.hasNext()) {
            ((b.InterfaceC4110b) it.next()).c3(parameterSlot, str);
        }
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void h5(@Y61.l String str) {
        Iterator<T> it = this.f235087b.iterator();
        while (it.hasNext()) {
            ((b.InterfaceC4110b) it.next()).h5(str);
        }
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void n9() {
        Iterator<T> it = this.f235087b.iterator();
        while (it.hasNext()) {
            ((b.InterfaceC4110b) it.next()).n9();
        }
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void vd() {
        Iterator<T> it = this.f235087b.iterator();
        while (it.hasNext()) {
            ((b.InterfaceC4110b) it.next()).vd();
        }
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void Nc() {
    }
}

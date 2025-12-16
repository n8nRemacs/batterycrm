package com.avito.android.beduin.common.form.actionbus;

import Y41.p;
import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC49066a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinFormsActionBusImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/actionbus/a;", "Luj/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC49066a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashSet f103323a = new LinkedHashSet();

    @Override // kotlin.InterfaceC49066a
    public final void a(@k String str, @k List<? extends BeduinAction> list) {
        Iterator it = this.f103323a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).invoke(str, list);
        }
    }

    @Override // kotlin.InterfaceC49066a
    public final void b(@k p<? super String, ? super List<? extends BeduinAction>, G0> pVar) {
        this.f103323a.add(pVar);
    }

    @Override // kotlin.InterfaceC49066a
    public final void c(@k p<? super String, ? super List<? extends BeduinAction>, G0> pVar) {
        this.f103323a.remove(pVar);
    }
}

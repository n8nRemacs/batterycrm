package com.avito.android.publish.details.seller_protection;

import Wd0.C15747a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.j;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import jf0.C42368a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: SellerProtectionInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/seller_protection/d;", "Lcom/avito/android/publish/details/seller_protection/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Q1 f234935a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f234936b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C15747a f234937c;

    /* compiled from: SellerProtectionInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SellerProtectionDialogResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SellerProtectionDialogResult sellerProtectionDialogResult = SellerProtectionDialogResult.f234927b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SellerProtectionDialogResult sellerProtectionDialogResult2 = SellerProtectionDialogResult.f234927b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public d(@k Q1 q12, @k InterfaceC28373a interfaceC28373a, @k C50213a c50213a) {
        this.f234935a = q12;
        this.f234937c = new C15747a(interfaceC28373a, c50213a);
    }

    @Override // com.avito.android.publish.details.seller_protection.c
    public final void a() {
        this.f234936b = true;
        C15747a c15747a = this.f234937c;
        c15747a.f17995a.c(new ParametrizedClickStreamEvent(10171, 1, Collections.singletonMap("esid", c15747a.f17996b.b()), null, 8, null));
    }

    @Override // com.avito.android.publish.details.seller_protection.c
    public final void b(@k SellerProtectionDialogResult sellerProtectionDialogResult, @k Set<? extends j<? extends Slot<?>>> set, @k Y41.a<G0> aVar) {
        Object next;
        int iOrdinal = sellerProtectionDialogResult.ordinal();
        C15747a c15747a = this.f234937c;
        InterfaceC28373a interfaceC28373a = c15747a.f17995a;
        C50213a c50213a = c15747a.f17996b;
        if (iOrdinal == 0) {
            interfaceC28373a.c(new ParametrizedClickStreamEvent(10193, 1, Collections.singletonMap("esid", c50213a.b()), null, 8, null));
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            interfaceC28373a.c(new ParametrizedClickStreamEvent(10192, 1, Collections.singletonMap("esid", c50213a.b()), null, 8, null));
            aVar.invoke();
            return;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof C42368a) {
                    break;
                }
            }
        }
        if (!(next instanceof C42368a)) {
            next = null;
        }
        C42368a c42368a = (C42368a) next;
        if (c42368a != null) {
            BooleanParameter booleanParameterQ = c42368a.q();
            if (booleanParameterQ.get_value() == null) {
                booleanParameterQ = null;
            }
            InterfaceC33535v interfaceC33535v = c42368a.f405750c;
            if (booleanParameterQ != null) {
                booleanParameterQ.setValue(Boolean.TRUE);
                interfaceC33535v.J0(true);
            }
            BooleanParameter booleanParameterM = c42368a.m();
            if (booleanParameterM.get_value() == null) {
                booleanParameterM = null;
            }
            if (booleanParameterM != null) {
                booleanParameterM.setValue(Boolean.TRUE);
                interfaceC33535v.m0(true);
            }
            BooleanParameter booleanParameterP = c42368a.p();
            if (booleanParameterP != null) {
                if (booleanParameterP.get_value() == null) {
                    booleanParameterP = null;
                }
                if (booleanParameterP != null) {
                    booleanParameterP.setValue(Boolean.TRUE);
                    interfaceC33535v.V(true);
                }
            }
            SlotType slotType = SlotType.DELIVERY_TOGGLES;
            f.b bVar = new f.b(slotType, null);
            com.jakewharton.rxrelay3.c<f> cVar = c42368a.f405753f;
            cVar.accept(bVar);
            cVar.accept(new f.a(slotType, c42368a.f405749b));
        }
        interfaceC28373a.c(new ParametrizedClickStreamEvent(10191, 1, Collections.singletonMap("esid", c50213a.b()), null, 8, null));
        aVar.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x017d  */
    @Override // com.avito.android.publish.details.seller_protection.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(@Y61.k java.util.Set<? extends com.avito.android.category_parameters.j<? extends com.avito.android.remote.model.category_parameters.slot.Slot<?>>> r8) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.details.seller_protection.d.c(java.util.Set):boolean");
    }
}

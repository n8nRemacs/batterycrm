package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.common.api.internal.C36660o;
import com.google.android.gms.common.api.internal.C36671u;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.InterfaceC37027j;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class A extends com.google.android.gms.common.api.h implements VX0.c {

    /* renamed from: k, reason: collision with root package name */
    public static final C36616a f349511k = new C36616a("ModuleInstall.API", new s(), new C36616a.g());

    public final Task<ModuleAvailabilityResponse> d(com.google.android.gms.common.api.k... kVarArr) {
        C36729v.a("Please provide at least one OptionalModuleApi.", kVarArr.length > 0);
        for (com.google.android.gms.common.api.k kVar : kVarArr) {
            C36729v.k(kVar, "Requested API must not be null.");
        }
        final ApiFeatureRequest apiFeatureRequestH = ApiFeatureRequest.h(Arrays.asList(kVarArr), false);
        if (apiFeatureRequestH.f349513b.isEmpty()) {
            return C37030m.f(new ModuleAvailabilityResponse(true, 0));
        }
        A.a aVarA = com.google.android.gms.common.api.internal.A.a();
        aVarA.f348954c = new Feature[]{zav.zaa};
        aVarA.f348955d = 27301;
        aVarA.f348953b = false;
        aVarA.f348952a = new InterfaceC36673v(this) { // from class: com.google.android.gms.common.moduleinstall.internal.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                t tVar = new t((C37028k) obj2);
                h hVar = (h) ((B) obj).getService();
                Parcel parcelE4 = hVar.e4();
                zac.zad(parcelE4, tVar);
                zac.zac(parcelE4, apiFeatureRequestH);
                hVar.f4(parcelE4, 1);
            }
        };
        return doRead(aVarA.a());
    }

    public final Task<ModuleInstallResponse> e(VX0.d dVar) {
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        final ApiFeatureRequest apiFeatureRequestH = ApiFeatureRequest.h(dVar.f17183a, true);
        if (apiFeatureRequestH.f349513b.isEmpty()) {
            return C37030m.f(new ModuleInstallResponse(0, false));
        }
        final VX0.a aVar = dVar.f17184b;
        if (aVar == null) {
            A.a aVarA = com.google.android.gms.common.api.internal.A.a();
            aVarA.f348954c = new Feature[]{zav.zaa};
            aVarA.f348953b = true;
            aVarA.f348955d = 27304;
            aVarA.f348952a = new InterfaceC36673v(this) { // from class: com.google.android.gms.common.moduleinstall.internal.q
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
                public final void accept(Object obj, Object obj2) {
                    ((h) ((B) obj).getService()).g4(new v((C37028k) obj2), apiFeatureRequestH, null);
                }
            };
            return doRead(aVarA.a());
        }
        Executor executor = dVar.f17185c;
        C36658n c36658nRegisterListener = executor == null ? registerListener(aVar, VX0.a.class.getSimpleName()) : C36660o.b(aVar, VX0.a.class.getSimpleName(), executor);
        final c cVar = new c(c36658nRegisterListener);
        final AtomicReference atomicReference = new AtomicReference();
        InterfaceC36673v interfaceC36673v = new InterfaceC36673v() { // from class: com.google.android.gms.common.moduleinstall.internal.k
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                VX0.a aVar2 = aVar;
                ((h) ((B) obj).getService()).g4(new w(this.f349519a, atomicReference, (C37028k) obj2, aVar2), apiFeatureRequestH, cVar);
            }
        };
        InterfaceC36673v interfaceC36673v2 = new InterfaceC36673v(this) { // from class: com.google.android.gms.common.moduleinstall.internal.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                x xVar = new x((C37028k) obj2);
                h hVar = (h) ((B) obj).getService();
                Parcel parcelE4 = hVar.e4();
                zac.zad(parcelE4, xVar);
                zac.zad(parcelE4, cVar);
                hVar.f4(parcelE4, 6);
            }
        };
        C36671u.a aVar2 = new C36671u.a(null);
        aVar2.f349222d = c36658nRegisterListener;
        aVar2.f349223e = new Feature[]{zav.zaa};
        aVar2.f349224f = true;
        aVar2.f349219a = interfaceC36673v;
        aVar2.f349220b = interfaceC36673v2;
        aVar2.f349225g = 27305;
        return doRegisterEventListener(aVar2.a()).s(new InterfaceC37027j() { // from class: com.google.android.gms.common.moduleinstall.internal.m
            @Override // com.google.android.gms.tasks.InterfaceC37027j
            public final Task a(Object obj) {
                C36616a c36616a = A.f349511k;
                AtomicReference atomicReference2 = atomicReference;
                return atomicReference2.get() != null ? C37030m.f((ModuleInstallResponse) atomicReference2.get()) : C37030m.e(new ApiException(Status.f348902h));
            }
        });
    }
}

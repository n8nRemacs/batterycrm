package com.avito.android.early_access.mvi;

import Lx.InterfaceC14447b;
import Mx.InterfaceC14538a;
import Qx.InterfaceC14946b;
import com.avito.android.arch.mvi.a;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import com.avito.android.early_access.mvi.entity.EarlyAccessState;
import com.avito.android.early_access.mvi.entity.PopupContentType;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EarlyAccessActor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/early_access/mvi/i;", "Lcom/avito/android/arch/mvi/a;", "LMx/a;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessState;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.early_access.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30292i implements com.avito.android.arch.mvi.a<InterfaceC14538a, EarlyAccessInternalAction, EarlyAccessState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ReEarlyAccessData f145498a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14946b f145499b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14447b f145500c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30301s f145501d;

    @Inject
    public C30292i(@Y61.k ReEarlyAccessData reEarlyAccessData, @Y61.k InterfaceC14946b interfaceC14946b, @Y61.k InterfaceC14447b interfaceC14447b, @Y61.k InterfaceC30301s interfaceC30301s) {
        this.f145498a = reEarlyAccessData;
        this.f145499b = interfaceC14946b;
        this.f145500c = interfaceC14447b;
        this.f145501d = interfaceC30301s;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<EarlyAccessInternalAction> b(InterfaceC14538a interfaceC14538a, EarlyAccessState earlyAccessState) {
        InterfaceC14538a interfaceC14538a2 = interfaceC14538a;
        EarlyAccessState earlyAccessState2 = earlyAccessState;
        if (interfaceC14538a2 instanceof InterfaceC14538a.C0709a) {
            return C43175k.G(new C30284a(interfaceC14538a2, null));
        }
        if (interfaceC14538a2 instanceof InterfaceC14538a.e) {
            return C43175k.G(new C30285b(this, interfaceC14538a2, null));
        }
        if (interfaceC14538a2 instanceof InterfaceC14538a.c) {
            return C43175k.G(new C30286c(this, null));
        }
        if (interfaceC14538a2 instanceof InterfaceC14538a.d) {
            return C43175k.G(new C30287d(this, interfaceC14538a2, null));
        }
        boolean z12 = interfaceC14538a2 instanceof InterfaceC14538a.b;
        InterfaceC30301s interfaceC30301s = this.f145501d;
        InterfaceC14447b interfaceC14447b = this.f145500c;
        if (!z12) {
            if (!interfaceC14538a2.equals(InterfaceC14538a.f.f11109a)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC14447b.e(null);
            return interfaceC30301s.a(null);
        }
        if (!(earlyAccessState2 instanceof EarlyAccessState.Content)) {
            throw new NoWhenBranchMatchedException();
        }
        PopupContentType.Default r52 = PopupContentType.Default.f145482b;
        PopupContentType popupContentType = ((EarlyAccessState.Content) earlyAccessState2).f145477g;
        if (kotlin.jvm.internal.L.f(popupContentType, r52)) {
            interfaceC14447b.e(null);
            return interfaceC30301s.a(null);
        }
        if (popupContentType instanceof PopupContentType.ShortPackage) {
            return d(((PopupContentType.ShortPackage) popupContentType).f145488b);
        }
        if (popupContentType instanceof PopupContentType.LongPackage.FirstPage) {
            return C43175k.G(new C30288e(this, null));
        }
        if (popupContentType instanceof PopupContentType.LongPackage.SecondPage) {
            return d(((PopupContentType.LongPackage.SecondPage) popupContentType).f145485b);
        }
        if (popupContentType instanceof PopupContentType.Bundles.FirstPage) {
            return C43175k.G(new C30289f(this, null));
        }
        if (popupContentType instanceof PopupContentType.Bundles.SecondPage) {
            return d(((PopupContentType.Bundles.SecondPage) popupContentType).f145481b);
        }
        if (popupContentType instanceof PopupContentType.SecretItems.FirstPage) {
            return C43175k.G(new C30290g(this, null));
        }
        if (popupContentType instanceof PopupContentType.SecretItems.SecondPage) {
            return d(((PopupContentType.SecretItems.SecondPage) popupContentType).f145487b);
        }
        if (popupContentType instanceof PopupContentType.Fakedoor) {
            return interfaceC30301s.a(null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ReEarlyAccessData.Package c(String str) {
        ReEarlyAccessData.Package r02;
        List<ReEarlyAccessData.Package> list;
        Object next;
        ReEarlyAccessData reEarlyAccessData = this.f145498a;
        ReEarlyAccessData.PackagesInfo packagesInfo = reEarlyAccessData.f145334n;
        if (packagesInfo != null && (list = packagesInfo.f145360b) != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((ReEarlyAccessData.Package) next).f145354h, str)) {
                    break;
                }
            }
            ReEarlyAccessData.Package r32 = (ReEarlyAccessData.Package) next;
            if (r32 != null) {
                return r32;
            }
        }
        ReEarlyAccessData.PackagesInfo packagesInfo2 = reEarlyAccessData.f145334n;
        if (packagesInfo2 == null || (r02 = packagesInfo2.f145367i) == null || !kotlin.jvm.internal.L.f(r02.f145354h, str)) {
            return null;
        }
        return r02;
    }

    public final InterfaceC43160i<EarlyAccessInternalAction> d(String str) {
        G0 g02;
        ReEarlyAccessData.Package.AnalyticsData analyticsData;
        String str2;
        ReEarlyAccessData.Package packageC = c(str);
        InterfaceC14447b interfaceC14447b = this.f145500c;
        if (packageC == null || (analyticsData = packageC.f145357k) == null || (str2 = analyticsData.f145359c) == null) {
            g02 = null;
        } else {
            interfaceC14447b.g(str2);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            interfaceC14447b.e(packageC != null ? Integer.valueOf(packageC.f145350d) : null);
        }
        if (packageC == null || packageC.f145350d <= 1) {
            return this.f145501d.a(packageC != null ? packageC.f145354h : null);
        }
        return C43175k.G(new C30291h(this, null));
    }
}

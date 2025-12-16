package com.avito.android.publish.scanner_v2.vinscanner.mvi;

import De0.InterfaceC13390a;
import De0.InterfaceC13391b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.R0;
import com.avito.android.remote.model.category_parameters.VinScanner;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VinScannerActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/scanner_v2/vinscanner/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LDe0/a;", "LDe0/b;", "LDe0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.arch.mvi.a<InterfaceC13390a, InterfaceC13391b, De0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f239503a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VinScanner f239504b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f239505c;

    @Inject
    public e(@Y61.k R0 r02, @Y61.k VinScanner vinScanner, @Y61.k com.avito.android.util.R0 r03) {
        this.f239503a = r02;
        this.f239504b = vinScanner;
        this.f239505c = r03;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC13391b> b(InterfaceC13390a interfaceC13390a, De0.d dVar) {
        InterfaceC13390a interfaceC13390a2 = interfaceC13390a;
        if (interfaceC13390a2 instanceof InterfaceC13390a.e ? true : interfaceC13390a2 instanceof InterfaceC13390a.C0176a) {
            return new C43210w(InterfaceC13391b.C0177b.f3321a);
        }
        if (interfaceC13390a2 instanceof InterfaceC13390a.b) {
            return new C43210w(InterfaceC13391b.a.f3320a);
        }
        if (interfaceC13390a2 instanceof InterfaceC13390a.d) {
            return new C43210w(InterfaceC13391b.e.f3324a);
        }
        if (interfaceC13390a2 instanceof InterfaceC13390a.g) {
            return new C43210w(InterfaceC13391b.f.f3325a);
        }
        if (interfaceC13390a2 instanceof InterfaceC13390a.c) {
            return new C43210w(InterfaceC13391b.d.f3323a);
        }
        if (interfaceC13390a2 instanceof InterfaceC13390a.f) {
            return C43175k.G(new a(this, interfaceC13390a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}

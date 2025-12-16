package com.avito.android.similar_adverts.mvi;

import Lw0.InterfaceC14445b;
import Mw0.InterfaceC14537a;
import Ow0.InterfaceC14743a;
import com.avito.android.arch.mvi.a;
import com.avito.android.section.SectionItemConverter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SimilarAdvertsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/similar_adverts/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LOw0/a;", "LOw0/b;", "LOw0/c;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC14743a, Ow0.b, Ow0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.similar_adverts.d f283943a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SectionItemConverter f283944b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f283945c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f283946d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14445b f283947e;

    @Inject
    public b(@Y61.k com.avito.android.similar_adverts.d dVar, @Y61.k SectionItemConverter sectionItemConverter, @Y61.k String str, @InterfaceC14537a boolean z12, @Y61.k InterfaceC14445b interfaceC14445b) {
        this.f283943a = dVar;
        this.f283944b = sectionItemConverter;
        this.f283945c = str;
        this.f283946d = z12;
        this.f283947e = interfaceC14445b;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Ow0.b> b(InterfaceC14743a interfaceC14743a, Ow0.c cVar) {
        InterfaceC14743a interfaceC14743a2 = interfaceC14743a;
        if (interfaceC14743a2 instanceof InterfaceC14743a.b) {
            InterfaceC14445b interfaceC14445b = this.f283947e;
            return new C43152f0(C43175k.G(new e(interfaceC14445b, this.f283943a, this.f283945c, null)), new f(interfaceC14445b, null));
        }
        if (interfaceC14743a2 instanceof InterfaceC14743a.C0819a) {
            return C43175k.G(new a(interfaceC14743a2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}

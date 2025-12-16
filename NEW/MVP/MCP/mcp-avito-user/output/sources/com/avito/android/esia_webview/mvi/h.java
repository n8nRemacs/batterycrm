package com.avito.android.esia_webview.mvi;

import Oz.AbstractC14757a;
import Oz.AbstractC14758b;
import Oz.C14760d;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EsiaWebViewActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/esia_webview/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "LOz/a;", "LOz/b;", "LOz/d;", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements com.avito.android.arch.mvi.a<AbstractC14757a, AbstractC14758b, C14760d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f148188a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f148189b;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k x xVar) {
        this.f148188a = aVar;
        this.f148189b = xVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AbstractC14758b> b(AbstractC14757a abstractC14757a, C14760d c14760d) {
        AbstractC14757a abstractC14757a2 = abstractC14757a;
        if (abstractC14757a2 instanceof AbstractC14757a.C0823a) {
            return C43175k.G(new f(2, null));
        }
        if (abstractC14757a2 instanceof AbstractC14757a.b) {
            return C43175k.G(new g(this, abstractC14757a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}

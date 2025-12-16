package com.avito.android.categories_global.compose;

import Ln.C14417b;
import Ln.C14418c;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoriesScreenContentUi.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements Y41.q<T1, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f116338l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f116339m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f116340n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f116341o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C14418c f116342p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C14417b, G0> f116343q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(String str, Y41.a<G0> aVar, boolean z12, String str2, C14418c c14418c, Y41.l<? super C14417b, G0> lVar) {
        super(3);
        this.f116338l = str;
        this.f116339m = aVar;
        this.f116340n = z12;
        this.f116341o = str2;
        this.f116342p = c14418c;
        this.f116343q = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(T1 t12, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else if (this.f116338l != null) {
            a13.C(-1831524464);
            t.f116375a.getClass();
            C22096n c22096n = t.f116376b;
            String strC = u0.i.c(a13, R.string.categories_global_error);
            String strC2 = u0.i.c(a13, R.string.categories_global_retry);
            v.a aVar = v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.d0(fillElement);
            com.akita.compose.component.content_placeholder.b.a(c22096n, strC, this.f116338l, strC2, this.f116339m, fillElement, null, null, false, false, a13, 196614, 960);
            a13.h();
        } else {
            a13.C(-1831158013);
            g.c(this.f116340n, this.f116341o, this.f116342p, this.f116343q, null, a13, 0);
            a13.h();
        }
        return G0.f406611a;
    }
}

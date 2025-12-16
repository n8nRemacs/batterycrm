package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.publish.details.S0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class I extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241141l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C34076c c34076c) {
        super(0);
        this.f241141l = c34076c;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C34076c c34076c = this.f241141l;
        S0 s02 = c34076c.f241202q;
        CategoryParameters categoryParametersC0 = s02.C0();
        if (categoryParametersC0 != null) {
            c34076c.f241175E.b(A1.e(c34076c.f241187b.a(s02.U(), categoryParametersC0).s(c34076c.f241189d.e()), new M(c34076c), new N(c34076c)));
        }
        return G0.f406611a;
    }
}

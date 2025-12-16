package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.json.ParsingException;
import com.yandex.div2.H0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Div2View.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38032n extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C38029k f369166l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f369167m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H0.d f369168n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.state.f f369169o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38032n(C38029k c38029k, View view, H0.d dVar, com.yandex.div.core.state.f fVar) {
        super(0);
        this.f369166l = c38029k;
        this.f369167m = view;
        this.f369168n = dVar;
        this.f369169o = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        C38029k c38029k = this.f369166l;
        View view = this.f369167m;
        H0.d dVar = this.f369168n;
        try {
            c38029k.getDiv2Component().s().b(view, dVar.f372521a, c38029k, this.f369169o);
        } catch (ParsingException e12) {
            if (!com.yandex.div.core.expression.b.a(e12)) {
                throw e12;
            }
        }
        c38029k.getDiv2Component().s().a();
        return G0.f406611a;
    }
}

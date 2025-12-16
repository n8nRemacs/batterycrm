package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ComponentPreviewContainer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.akita.compose.theme.re23.preview.q0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27443q0 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.lazy.m0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<U2.a> f65800l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<kotlin.Q<String, Object>> f65801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.q<kotlin.Q<String, Object>, androidx.compose.runtime.A, Integer, kotlin.G0> f65802n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f65803o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27443q0(List<U2.a> list, List<? extends kotlin.Q<String, Object>> list2, Y41.q<? super kotlin.Q<String, Object>, ? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> qVar, Y41.a<kotlin.G0> aVar) {
        super(1);
        this.f65800l = list;
        this.f65801m = list2;
        this.f65802n = qVar;
        this.f65803o = aVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.foundation.lazy.m0 m0Var) {
        androidx.compose.foundation.lazy.m0 m0Var2 = m0Var;
        List<U2.a> list = this.f65800l;
        int size = list.size();
        C27418l0 c27418l0 = new C27418l0(list);
        List<kotlin.Q<String, Object>> list2 = this.f65801m;
        m0Var2.a(size, null, c27418l0, new C22096n(-1091073711, new C27423m0(list, list, list2), true));
        m0Var2.a(list2.size(), null, new C27433o0(list2), new C22096n(-1091073711, new C27438p0(list2, this.f65802n, list2), true));
        m0Var2.c(null, null, new C22096n(-1250047816, new C27408j0(list, list2, this.f65803o), true));
        return kotlin.G0.f406611a;
    }
}

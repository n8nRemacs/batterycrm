package com.avito.android.mortgage.document_upload;

import android.content.Context;
import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.deep_linking.links.DeepLink;
import e00.C39840a;
import f00.d;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DocumentUploadScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class O extends kotlin.jvm.internal.N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d.a f199072l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f199073m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f199074n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199075o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199076p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C39840a, G0> f199077q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C39840a, G0> f199078r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public O(d.a aVar, Y41.l<? super DeepLink, G0> lVar, Context context, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.l<? super C39840a, G0> lVar2, Y41.l<? super C39840a, G0> lVar3) {
        super(1);
        this.f199072l = aVar;
        this.f199073m = lVar;
        this.f199074n = context;
        this.f199075o = aVar2;
        this.f199076p = aVar3;
        this.f199077q = lVar2;
        this.f199078r = lVar3;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        m0 m0Var2 = m0Var;
        C32611a.f199136a.getClass();
        m0Var2.c(null, null, C32611a.f199137b);
        d.a aVar = this.f199072l;
        Y41.l<DeepLink, G0> lVar = this.f199073m;
        Context context = this.f199074n;
        m0Var2.c(null, null, new C22096n(-1605107181, new D(aVar, lVar, context), true));
        m0Var2.c(null, null, C32611a.f199138c);
        m0Var2.c(null, null, new C22096n(-140756271, new G(aVar, context, this.f199075o, this.f199076p), true));
        m0Var2.c(null, null, C32611a.f199139d);
        ArrayList arrayList = aVar.f395563a;
        H h12 = H.f199059l;
        m0Var2.a(arrayList.size(), h12 != null ? new L(h12, arrayList) : null, new M(K.f199064l, arrayList), new C22096n(-632812321, new N(arrayList, this.f199077q, this.f199078r), true));
        m0Var2.c(null, null, C32611a.f199140e);
        return G0.f406611a;
    }
}

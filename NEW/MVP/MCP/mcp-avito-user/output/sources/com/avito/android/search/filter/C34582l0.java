package com.avito.android.search.filter;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/search/filter/ParametersTreeWithAdditional;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34582l0 extends kotlin.jvm.internal.N implements Y41.l<P2<? super ParametersTreeWithAdditional>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f263385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263386m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f263387n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<ParcelableEntity<String>> f263388o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f263389p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C34582l0(l0.a aVar, C34574h0 c34574h0, String str, List<? extends ParcelableEntity<String>> list, String str2) {
        super(1);
        this.f263385l = aVar;
        this.f263386m = c34574h0;
        this.f263387n = str;
        this.f263388o = list;
        this.f263389p = str2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(P2<? super ParametersTreeWithAdditional> p22) {
        P2<? super ParametersTreeWithAdditional> p23 = p22;
        l0.a aVar = this.f263385l;
        if (!aVar.f406838b && (p23 instanceof P2.b)) {
            aVar.f406838b = true;
            List<ParcelableEntity<String>> list = this.f263388o;
            this.f263386m.i(this.f263387n, this.f263389p, list);
        }
        return kotlin.G0.f406611a;
    }
}

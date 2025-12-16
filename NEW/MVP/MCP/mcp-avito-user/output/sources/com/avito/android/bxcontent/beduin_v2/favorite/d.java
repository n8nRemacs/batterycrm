package com.avito.android.bxcontent.beduin_v2.favorite;

import Y41.l;
import Y41.p;
import com.avito.android.serp.adapter.S;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BxFavoriteButtonComponentFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/favorite/d;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/bxcontent/beduin_v2/favorite/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends n<c> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l<S, G0> f109529c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p<String, Boolean, I<Boolean>> f109530d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f109531e;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@Y61.k l<? super S, G0> lVar, @Y61.k p<? super String, ? super Boolean, ? extends I<Boolean>> pVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k i iVar) {
        super(iVar);
        this.f109529c = lVar;
        this.f109530d = pVar;
        this.f109531e = interfaceC35745a5;
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @Y61.k
    public final InterfaceC36343m b(@Y61.k A a12) {
        return new c(this.f109529c, this.f109530d, this.f109531e);
    }
}

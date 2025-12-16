package com.avito.android.api;

import android.content.DialogInterface;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class p extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f91335l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f91336m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f91337n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Action f91338o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f91339p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(DialogInterface dialogInterface, r rVar, androidx.appcompat.app.m mVar, Action action, Y41.l<? super DeepLink, G0> lVar) {
        super(0);
        this.f91335l = dialogInterface;
        this.f91336m = rVar;
        this.f91337n = mVar;
        this.f91338o = action;
        this.f91339p = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f91335l.dismiss();
        r.a(this.f91336m, this.f91337n, this.f91338o, this.f91339p);
        return G0.f406611a;
    }
}

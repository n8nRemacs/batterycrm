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
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f91330l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f91331m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.m f91332n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Action f91333o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f91334p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(DialogInterface dialogInterface, r rVar, androidx.appcompat.app.m mVar, Action action, Y41.l<? super DeepLink, G0> lVar) {
        super(0);
        this.f91330l = dialogInterface;
        this.f91331m = rVar;
        this.f91332n = mVar;
        this.f91333o = action;
        this.f91334p = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f91330l.dismiss();
        r.a(this.f91331m, this.f91332n, this.f91333o, this.f91334p);
        return G0.f406611a;
    }
}

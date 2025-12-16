package com.avito.android.publish.edit_advert_request;

import androidx.view.C23038g0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.publish.edit_advert_request.j;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditAdvertRequestViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Action f235529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f235530m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Action action, j jVar) {
        super(0);
        this.f235529l = action;
        this.f235530m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f235529l.getDeepLink();
        j jVar = this.f235530m;
        b.a.a(jVar.f235510N, deepLink, null, null, 6);
        C23038g0<j.a> c23038g0 = jVar.f235516T;
        j.a.b bVar = new j.a.b(null, jVar.me());
        jVar.f235507K.c(new ce0.c(jVar.me()));
        c23038g0.setValue(bVar);
        return G0.f406611a;
    }
}

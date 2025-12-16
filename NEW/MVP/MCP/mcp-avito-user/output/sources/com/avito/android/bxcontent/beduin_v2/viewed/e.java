package com.avito.android.bxcontent.beduin_v2.viewed;

import Y41.l;
import Y61.k;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BxViewedTagComponentFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/viewed/e;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/bxcontent/beduin_v2/viewed/d;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends n<d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<String, Boolean> f109547c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super String, Boolean> lVar, @k b bVar) {
        super(bVar);
        this.f109547c = lVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    public final InterfaceC36343m b(@k A a12) {
        return new d(this.f109547c);
    }
}

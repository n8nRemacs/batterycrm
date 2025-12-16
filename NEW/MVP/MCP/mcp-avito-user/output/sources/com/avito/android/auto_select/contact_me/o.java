package com.avito.android.auto_select.contact_me;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeContact;
import com.avito.android.deep_linking.links.DeepLink;
import gf.C40672c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectContactMeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C40672c f96026l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<AutoSelectContactMeContact, G0> f96027m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f96028n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f96029o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C40672c c40672c, Y41.l lVar, Y41.l lVar2, v.a aVar, int i12) {
        super(2);
        this.f96026l = c40672c;
        this.f96027m = lVar;
        this.f96028n = lVar2;
        this.f96029o = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        Y41.l<DeepLink, G0> lVar = this.f96028n;
        Y41.l<AutoSelectContactMeContact, G0> lVar2 = this.f96027m;
        p.b(this.f96026l, lVar2, lVar, this.f96029o, a12, iA2);
        return G0.f406611a;
    }
}

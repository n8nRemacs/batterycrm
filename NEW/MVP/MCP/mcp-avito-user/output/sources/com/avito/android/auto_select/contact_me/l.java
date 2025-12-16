package com.avito.android.auto_select.contact_me;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeContact;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectContactMeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectContactMeContact f95981l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<AutoSelectContactMeContact, G0> f95982m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f95983n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f95984o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f95985p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AutoSelectContactMeContact autoSelectContactMeContact, Y41.l lVar, Y41.l lVar2, v vVar, int i12) {
        super(2);
        this.f95981l = autoSelectContactMeContact;
        this.f95982m = lVar;
        this.f95983n = lVar2;
        this.f95984o = vVar;
        this.f95985p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f95985p | 1);
        Y41.l<AutoSelectContactMeContact, G0> lVar = this.f95982m;
        Y41.l<DeepLink, G0> lVar2 = this.f95983n;
        p.a(this.f95981l, lVar, lVar2, a12, iA2);
        return G0.f406611a;
    }
}

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
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectContactMeContact f95976l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<AutoSelectContactMeContact, G0> f95977m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f95978n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f95979o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f95980p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AutoSelectContactMeContact autoSelectContactMeContact, Y41.l lVar, Y41.l lVar2, v vVar, int i12) {
        super(2);
        this.f95976l = autoSelectContactMeContact;
        this.f95977m = lVar;
        this.f95978n = lVar2;
        this.f95979o = vVar;
        this.f95980p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f95980p | 1);
        Y41.l<AutoSelectContactMeContact, G0> lVar = this.f95977m;
        Y41.l<DeepLink, G0> lVar2 = this.f95978n;
        p.a(this.f95976l, lVar, lVar2, a12, iA2);
        return G0.f406611a;
    }
}

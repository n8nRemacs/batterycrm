package com.akita.compose.component.avatar.group;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvatarGroup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f60314l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f60315m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f60316n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l<f, G0> f60317o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, v.a aVar, String str, l lVar, int i12) {
        super(2);
        this.f60314l = kVar;
        this.f60315m = aVar;
        this.f60316n = str;
        this.f60317o = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3073);
        l<f, G0> lVar = this.f60317o;
        e.a(this.f60314l, this.f60315m, this.f60316n, lVar, a12, iA2);
        return G0.f406611a;
    }
}

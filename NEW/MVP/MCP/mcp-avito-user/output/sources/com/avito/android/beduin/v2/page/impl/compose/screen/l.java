package com.avito.android.beduin.v2.page.impl.compose.screen;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.beduin.v2.render.compose.G;
import kotlin.AbstractC40048c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinV2PageScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC40048c.a f105070l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G f105071m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.theme.k f105072n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f105073o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f105074p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractC40048c.a aVar, G g12, com.avito.beduin.v2.theme.k kVar, boolean z12, int i12) {
        super(2);
        this.f105070l = aVar;
        this.f105071m = g12;
        this.f105072n = kVar;
        this.f105073o = z12;
        this.f105074p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f105074p | 1);
        com.avito.beduin.v2.theme.k kVar = this.f105072n;
        boolean z12 = this.f105073o;
        j.b(this.f105070l, this.f105071m, kVar, z12, a12, iA2);
        return G0.f406611a;
    }
}

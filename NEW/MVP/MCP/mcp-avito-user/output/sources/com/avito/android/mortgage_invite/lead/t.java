package com.avito.android.mortgage_invite.lead;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationLeadScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class t extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f205945l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f205946m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f205947n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List<Q<String, String>> f205948o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205949p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f205950q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f205951r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z12, UniversalImage universalImage, String str, List list, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f205945l = z12;
        this.f205946m = universalImage;
        this.f205947n = str;
        this.f205948o = list;
        this.f205949p = aVar;
        this.f205950q = vVar;
        this.f205951r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f205951r | 1);
        List<Q<String, String>> list = this.f205948o;
        Y41.a<G0> aVar = this.f205949p;
        x.b(this.f205945l, this.f205946m, this.f205947n, list, aVar, a12, iA2);
        return G0.f406611a;
    }
}

package com.avito.android.mortgage_invite.lead;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationLeadScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class w extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f205954l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f205955m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f205956n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205957o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f205958p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f205959q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z12, UniversalImage universalImage, String str, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f205954l = z12;
        this.f205955m = universalImage;
        this.f205956n = str;
        this.f205957o = aVar;
        this.f205958p = vVar;
        this.f205959q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f205959q | 1);
        String str = this.f205956n;
        Y41.a<G0> aVar = this.f205957o;
        x.c(this.f205954l, this.f205955m, str, aVar, a12, iA2);
        return G0.f406611a;
    }
}

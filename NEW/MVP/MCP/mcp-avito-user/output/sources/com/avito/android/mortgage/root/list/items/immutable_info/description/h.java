package com.avito.android.mortgage.root.list.items.immutable_info.description;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImmutableInfoDescriptionScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f202597l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f202598m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f202599n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f202600o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f202597l = str;
        this.f202598m = aVar;
        this.f202599n = vVar;
        this.f202600o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f202600o | 1);
        j.a(this.f202597l, this.f202598m, this.f202599n, a12, iA2);
        return G0.f406611a;
    }
}

package com.akita.compose.component.base_select;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.akita.compose.component.input.InputState;
import com.akita.compose.component.input.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseSelect.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f60484l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60485m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f60486n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f60487o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f60488p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f60489q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InputState f60490r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f60491s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f60492t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Y41.a aVar, v vVar, androidx.compose.ui.v vVar2, String str2, boolean z12, InputState inputState, int i12, int i13) {
        super(2);
        this.f60484l = str;
        this.f60485m = aVar;
        this.f60486n = vVar;
        this.f60487o = vVar2;
        this.f60488p = str2;
        this.f60489q = z12;
        this.f60490r = inputState;
        this.f60491s = i12;
        this.f60492t = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60491s | 1);
        boolean z12 = this.f60489q;
        e.a(this.f60484l, this.f60485m, this.f60486n, this.f60487o, this.f60488p, z12, this.f60490r, a12, iA2, this.f60492t);
        return G0.f406611a;
    }
}

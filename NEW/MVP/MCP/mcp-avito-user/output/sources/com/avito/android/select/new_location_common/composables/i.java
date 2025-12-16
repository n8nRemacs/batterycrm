package com.avito.android.select.new_location_common.composables;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.android.select.new_location_common.ui.CheckBoxExpandableLineState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckboxExpandableLine.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f265877l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CheckBoxExpandableLineState f265878m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f265879n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f265880o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f265881p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f265882q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f265883r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f265884s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f265885t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(C22096n c22096n, CheckBoxExpandableLineState checkBoxExpandableLineState, boolean z12, Y41.a aVar, Y41.a aVar2, v vVar, String str, String str2, int i12) {
        super(2);
        this.f265877l = c22096n;
        this.f265878m = checkBoxExpandableLineState;
        this.f265879n = z12;
        this.f265880o = aVar;
        this.f265881p = (N) aVar2;
        this.f265882q = vVar;
        this.f265883r = str;
        this.f265884s = str2;
        this.f265885t = i12;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f265885t | 1);
        C22096n c22096n = this.f265877l;
        ?? r42 = this.f265881p;
        v vVar = this.f265882q;
        q.a(c22096n, this.f265878m, this.f265879n, this.f265880o, r42, vVar, this.f265883r, this.f265884s, a12, iA2);
        return G0.f406611a;
    }
}

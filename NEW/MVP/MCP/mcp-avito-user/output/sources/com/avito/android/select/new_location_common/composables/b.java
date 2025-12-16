package com.avito.android.select.new_location_common.composables;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.select.new_location_common.ui.CheckBoxExpandableLineState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckboxExpandableLine.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f265859l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CheckBoxExpandableLineState f265860m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f265861n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f265862o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f265863p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v.a f265864q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f265865r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f265866s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f265867t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f265868u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, CheckBoxExpandableLineState checkBoxExpandableLineState, boolean z12, Y41.a aVar, Y41.a aVar2, v.a aVar3, String str2, String str3, int i12, int i13) {
        super(2);
        this.f265859l = str;
        this.f265860m = checkBoxExpandableLineState;
        this.f265861n = z12;
        this.f265862o = aVar;
        this.f265863p = (N) aVar2;
        this.f265864q = aVar3;
        this.f265865r = str2;
        this.f265866s = str3;
        this.f265867t = i12;
        this.f265868u = i13;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f265867t | 1);
        ?? r42 = this.f265863p;
        v.a aVar = this.f265864q;
        q.b(this.f265859l, this.f265860m, this.f265861n, this.f265862o, r42, aVar, this.f265865r, this.f265866s, a12, iA2, this.f265868u);
        return G0.f406611a;
    }
}

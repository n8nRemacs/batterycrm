package com.akita.compose.component.date_picker;

import com.akita.compose.component.date_picker.data.DatePickerSelectionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: DatePickerState.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/akita/compose/component/date_picker/C;", "invoke", "()Lcom/akita/compose/component/date_picker/C;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class D extends N implements Y41.a<C> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<kotlin.ranges.o> f61117l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f61118m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f61119n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Long f61120o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ DatePickerSelectionType f61121p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f61122q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f61123r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f61124s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f61125t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(List<kotlin.ranges.o> list, Long l12, int i12, Long l13, DatePickerSelectionType datePickerSelectionType, boolean z12, boolean z13, boolean z14, boolean z15) {
        super(0);
        this.f61117l = list;
        this.f61118m = l12;
        this.f61119n = i12;
        this.f61120o = l13;
        this.f61121p = datePickerSelectionType;
        this.f61122q = z12;
        this.f61123r = z13;
        this.f61124s = z14;
        this.f61125t = z15;
    }

    @Override // Y41.a
    public final C invoke() {
        List<kotlin.ranges.o> list = this.f61117l;
        Long lValueOf = this.f61120o;
        if (lValueOf == null) {
            kotlin.ranges.o oVar = (kotlin.ranges.o) C42745f0.G(list);
            lValueOf = oVar != null ? Long.valueOf(oVar.f406915b) : null;
        }
        return new C(new K(this.f61124s, lValueOf, list, this.f61122q, this.f61123r, this.f61121p, this.f61118m, this.f61119n, this.f61125t, null, 512, null));
    }
}

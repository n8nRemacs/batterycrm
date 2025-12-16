package com.avito.android.profile_phones.phones_list.phones_list_screen_ui;

import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import com.avito.android.profile_phones.phones_list.device_list_item.DeviceListItem;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhonesListScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f228175l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f228176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PhonesListMviState f228177n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d2 f228178o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228179p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228180q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228181r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228182s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.l<PhoneListItem, G0> f228183t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228184u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228185v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228186w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228187x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeviceListItem, G0> f228188y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(v vVar, Y41.a<G0> aVar, PhonesListMviState phonesListMviState, d2 d2Var, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, Y41.a<G0> aVar5, Y41.l<? super PhoneListItem, G0> lVar, Y41.a<G0> aVar6, Y41.a<G0> aVar7, Y41.a<G0> aVar8, Y41.a<G0> aVar9, Y41.l<? super DeviceListItem, G0> lVar2) {
        super(2);
        this.f228175l = vVar;
        this.f228176m = (N) aVar;
        this.f228177n = phonesListMviState;
        this.f228178o = d2Var;
        this.f228179p = aVar2;
        this.f228180q = aVar3;
        this.f228181r = aVar4;
        this.f228182s = aVar5;
        this.f228183t = lVar;
        this.f228184u = aVar6;
        this.f228185v = aVar7;
        this.f228186w = aVar8;
        this.f228187x = aVar9;
        this.f228188y = lVar2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.component.scaffold.g.a(this.f228175l.d0(C20588k2.f28682c), r.c(-1075230270, new a(this.f228176m), a13), null, null, null, null, null, r.c(1816848011, new b(this.f228177n, this.f228178o, this.f228179p, this.f228180q, this.f228181r, this.f228182s, this.f228183t, this.f228184u, this.f228185v, this.f228186w, this.f228187x, this.f228188y), a13), a13, 12582960, 124);
        }
        return G0.f406611a;
    }
}

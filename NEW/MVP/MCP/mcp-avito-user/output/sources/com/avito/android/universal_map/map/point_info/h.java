package com.avito.android.universal_map.map.point_info;

import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements RecyclerView.j.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC25658a f305820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f305821c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e f305822d;

    public /* synthetic */ h(AbstractC25658a abstractC25658a, List list, io.reactivex.rxjava3.subjects.e eVar, int i12) {
        this.f305819a = i12;
        this.f305820b = abstractC25658a;
        this.f305821c = list;
        this.f305822d = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j.b
    public final void a() {
        switch (this.f305819a) {
            case 0:
                this.f305820b.l(this.f305821c, new i(this.f305822d, 0));
                break;
            case 1:
                this.f305820b.l(this.f305821c, new i(this.f305822d, 1));
                break;
            default:
                this.f305820b.l(this.f305821c, new i(this.f305822d, 8));
                break;
        }
    }
}

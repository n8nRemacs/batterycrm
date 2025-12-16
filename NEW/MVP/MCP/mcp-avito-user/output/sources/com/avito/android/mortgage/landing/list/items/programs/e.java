package com.avito.android.mortgage.landing.list.items.programs;

import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProgramsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f199897l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f199898m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ProgramsItem f199899n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, h hVar, ProgramsItem programsItem) {
        super(0);
        this.f199897l = jVar;
        this.f199898m = hVar;
        this.f199899n = programsItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Parcelable parcelableL1 = this.f199897l.l1();
        if (parcelableL1 != null) {
            this.f199898m.f199903c.b(parcelableL1, this.f199899n.f199878b);
        }
        return G0.f406611a;
    }
}

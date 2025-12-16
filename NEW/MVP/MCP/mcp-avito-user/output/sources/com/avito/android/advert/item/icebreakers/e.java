package com.avito.android.advert.item.icebreakers;

import Y41.p;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IceBreakersPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/advert/item/icebreakers/a;", "iceBreakerButton", "", "position", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert/item/icebreakers/a;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements p<a, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f76458l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f76459m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f76460n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f76461o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f76462p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m f76463q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, boolean z12, boolean z13, boolean z14, m mVar, m mVar2) {
        super(2);
        this.f76458l = jVar;
        this.f76459m = z12;
        this.f76460n = z13;
        this.f76461o = z14;
        this.f76462p = mVar;
        this.f76463q = mVar2;
    }

    @Override // Y41.p
    public final G0 invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        j jVar = this.f76458l;
        u3.g<SimpleTestGroupWithNone> gVar = jVar.f76476f;
        SimpleTestGroupWithNone simpleTestGroupWithNone = gVar.f439742a.f439749b;
        com.avito.android.advert_core.analytics.a aVar3 = jVar.f76472b;
        aVar3.X2(simpleTestGroupWithNone);
        if (this.f76459m) {
            gVar.b();
            if (this.f76460n) {
                int i12 = aVar2.f76452b;
                jVar.f76478h = i12;
                aVar3.L1(iIntValue, i12, aVar2.f76453c);
                String strO = jVar.O();
                if (!this.f76461o) {
                    this.f76462p.y0(strO);
                }
                j.k(jVar, this.f76463q, strO);
            }
        }
        return G0.f406611a;
    }
}

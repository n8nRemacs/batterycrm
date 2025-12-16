package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import com.avito.android.paranja.f;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.shortcut_navigation_bar.m0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class t0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Filter.Onboarding f283567l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0.a f283568m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f283569n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f283570o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f283571p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f283572q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f283573r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t0(Filter.Onboarding onboarding, m0.a aVar, View view, Y41.a<G0> aVar2, Y41.a<G0> aVar3, float f12, Y41.a<G0> aVar4) {
        super(0);
        this.f283567l = onboarding;
        this.f283568m = aVar;
        this.f283569n = view;
        this.f283570o = (kotlin.jvm.internal.N) aVar2;
        this.f283571p = (kotlin.jvm.internal.N) aVar3;
        this.f283572q = f12;
        this.f283573r = (kotlin.jvm.internal.N) aVar4;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v4, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v3, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        m0 m0Var = m0.f283432a;
        Filter.Onboarding onboarding = this.f283567l;
        m0.b bVar = new m0.b(onboarding.getTitle(), onboarding.getText(), onboarding.getButtonTitle());
        m0.a aVar = this.f283568m;
        Integer num = aVar.f283434b;
        int iIntValue = aVar.f283433a;
        int iIntValue2 = num != null ? num.intValue() : iIntValue;
        Integer num2 = aVar.f283435c;
        int iIntValue3 = num2 != null ? num2.intValue() : iIntValue;
        Integer num3 = aVar.f283436d;
        int iIntValue4 = num3 != null ? num3.intValue() : iIntValue;
        Integer num4 = aVar.f283437e;
        if (num4 != null) {
            iIntValue = num4.intValue();
        }
        f.a aVar2 = new f.a(iIntValue2, iIntValue3, iIntValue4, iIntValue);
        m0.a(m0Var, this.f283569n, bVar, this.f283570o, new s0(this.f283573r), this.f283571p, this.f283572q, null, aVar2, 448);
        return G0.f406611a;
    }
}

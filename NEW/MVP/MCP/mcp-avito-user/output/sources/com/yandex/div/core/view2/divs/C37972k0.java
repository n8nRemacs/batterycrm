package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivContainer;
import kotlin.Metadata;

/* compiled from: DivContainerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.k0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37972k0 extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f368530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.json.expressions.e f368531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DivContainer f368532n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f368533o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37972k0(com.yandex.div2.H h12, com.yandex.div.json.expressions.e eVar, DivContainer divContainer, View view) {
        super(1);
        this.f368530l = h12;
        this.f368531m = eVar;
        this.f368532n = divContainer;
        this.f368533o = view;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.yandex.div2.H, java.lang.Object] */
    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        DivAlignmentHorizontal divAlignmentHorizontalA;
        ?? r72 = this.f368530l;
        com.yandex.div.json.expressions.b<DivAlignmentHorizontal> bVarM = r72.m();
        com.yandex.div.json.expressions.e eVar = this.f368531m;
        DivAlignmentVertical divAlignmentVerticalA = null;
        DivContainer divContainer = this.f368532n;
        if (bVarM != null) {
            divAlignmentHorizontalA = bVarM.a(eVar);
        } else if (C37931a.A(divContainer, eVar)) {
            divAlignmentHorizontalA = null;
        } else {
            int iOrdinal = divContainer.f371369l.a(eVar).ordinal();
            divAlignmentHorizontalA = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? DivAlignmentHorizontal.LEFT : DivAlignmentHorizontal.RIGHT : DivAlignmentHorizontal.CENTER : DivAlignmentHorizontal.LEFT;
        }
        com.yandex.div.json.expressions.b<DivAlignmentVertical> bVarU = r72.u();
        if (bVarU != null) {
            divAlignmentVerticalA = bVarU.a(eVar);
        } else if (!C37931a.A(divContainer, eVar)) {
            int iOrdinal2 = divContainer.f371370m.a(eVar).ordinal();
            divAlignmentVerticalA = iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? DivAlignmentVertical.TOP : DivAlignmentVertical.BASELINE : DivAlignmentVertical.BOTTOM : DivAlignmentVertical.CENTER : DivAlignmentVertical.TOP;
        }
        C37931a.a(this.f368533o, divAlignmentHorizontalA, divAlignmentVerticalA);
        return kotlin.G0.f406611a;
    }
}

package com.avito.android.blueprints.publish.header;

import Jj.C14202a;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f106211l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SectionSeparatorSlotConfig.Tooltip f106212m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, SectionSeparatorSlotConfig.Tooltip tooltip) {
        super(0);
        this.f106211l = hVar;
        this.f106212m = tooltip;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f106211l;
        String tag = this.f106212m.getTag();
        C14202a c14202a = hVar.f106213b;
        c14202a.getClass();
        c14202a.f9125a.putBoolean("header_tooltip_was_shown:" + tag, true);
        return G0.f406611a;
    }
}

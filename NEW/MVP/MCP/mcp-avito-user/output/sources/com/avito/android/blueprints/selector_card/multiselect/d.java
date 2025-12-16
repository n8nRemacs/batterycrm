package com.avito.android.blueprints.selector_card.multiselect;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bj.InterfaceC25659b;
import gj.InterfaceC40691b;
import kotlin.Metadata;

/* compiled from: MultiselectSelectorCardGroupContentBinder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card/multiselect/d;", "Lcom/avito/android/lib/design/selector_card/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.lib.design.selector_card.g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40691b f106641a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f106642b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f106643c;

    public d(@k InterfaceC40691b interfaceC40691b, @k InterfaceC25659b interfaceC25659b, @l Integer num) {
        this.f106641a = interfaceC40691b;
        this.f106642b = interfaceC25659b;
        this.f106643c = num;
    }

    @Override // com.avito.android.lib.design.selector_card.g
    @k
    public final com.avito.android.lib.design.selector_card.f create() {
        return new c(this.f106641a, this.f106642b, this.f106643c);
    }
}

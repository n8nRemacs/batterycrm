package com.avito.android.lib.deprecated_design.input;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: Delegates.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/properties/a", "Lkotlin/properties/e;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends kotlin.properties.e<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextInputView f178031b;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(TextInputView textInputView) {
        Boolean bool = Boolean.FALSE;
        this.f178031b = textInputView;
        super(bool);
    }

    @Override // kotlin.properties.e
    public final void afterChange(@k n<?> nVar, Boolean bool, Boolean bool2) {
        Boolean bool3 = bool2;
        if (bool3.booleanValue() != bool.booleanValue()) {
            TextInputView textInputView = this.f178031b;
            j jVar = textInputView.f178014c;
            jVar.f178039c.setValue(jVar, j.f178036u[1], bool3);
            TextInputView.a(textInputView);
        }
    }
}

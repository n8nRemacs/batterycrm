package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchQueryItems.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class U extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f221614l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(AttributedText attributedText) {
        super(2);
        this.f221614l = attributedText;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.lib.compose.design.component.attributedtext.a.b(this.f221614l, null, R.attr.textS20, null, null, 0, a13, 8, 58);
        }
        return G0.f406611a;
    }
}

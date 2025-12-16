package com.avito.android.messenger.conversation.adapter.quote;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: QuoteView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f189282l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(2);
        this.f189282l = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            QuoteViewData quoteViewData = (QuoteViewData) C22126m3.b(this.f189282l.f189283b, a13).getF42167b();
            if (quoteViewData != null) {
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.quotes.b.a(quoteViewData, null, null, null, a13, 56, 12);
            }
        }
        return G0.f406611a;
    }
}

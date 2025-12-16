package com.avito.android.messenger.conversation.adapter.quote;

import Y41.p;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: QuoteView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/b;", "Lcom/avito/android/messenger/conversation/adapter/quote/c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Z1<QuoteViewData> f189283b;

    /* compiled from: QuoteView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(1800352358, new com.avito.android.messenger.conversation.adapter.quote.a(b.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public b(@k View view) {
        ComposeView composeView = (ComposeView) view.findViewById(R.id.message_quote_compose);
        this.f189283b = p2.a(null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(92027425, new a(), true));
    }
}

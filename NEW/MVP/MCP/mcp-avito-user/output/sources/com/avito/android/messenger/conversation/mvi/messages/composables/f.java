package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.C22554b;
import androidx.compose.ui.semantics.F;
import com.avito.android.messenger.conversation.T1;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageList.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<F, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<T1> f192197l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(List<? extends T1> list) {
        super(1);
        this.f192197l = list;
    }

    @Override // Y41.l
    public final G0 invoke(F f12) {
        C.k(f12, new C22554b(this.f192197l.size(), 1));
        return G0.f406611a;
    }
}

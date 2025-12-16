package com.avito.android.comfortable_deal.comment.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.comment.model.CommentResult;
import com.avito.android.comfortable_deal.comment.model.CommentResultStrategy;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mp.C44116d;
import mp.InterfaceC44113a;
import mp.InterfaceC44114b;

/* compiled from: CommentActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lmp/a;", "Lmp/b;", "Lmp/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC44113a, InterfaceC44114b, C44116d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.repository.a f120548a;

    @Inject
    public b(@k com.avito.android.comfortable_deal.repository.a aVar) {
        this.f120548a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC44114b> b(InterfaceC44113a interfaceC44113a, C44116d c44116d) {
        InterfaceC44113a interfaceC44113a2 = interfaceC44113a;
        C44116d c44116d2 = c44116d;
        if (interfaceC44113a2 instanceof InterfaceC44113a.c) {
            return C43175k.G(new a(c44116d2, this, null));
        }
        if (interfaceC44113a2 instanceof InterfaceC44113a.b) {
            String str = c44116d2.f414761d;
            return new C43210w(new InterfaceC44114b.a(new CommentResult((str == null || C43066x.K(str)) ? CommentResultStrategy.f120541d : CommentResultStrategy.f120540c, str)));
        }
        if (interfaceC44113a2 instanceof InterfaceC44113a.C11842a) {
            return new C43210w(new InterfaceC44114b.e(((InterfaceC44113a.C11842a) interfaceC44113a2).f414748a));
        }
        throw new NoWhenBranchMatchedException();
    }
}

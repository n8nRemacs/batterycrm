package androidx.compose.foundation.text;

import androidx.compose.foundation.text.C20862e2;
import androidx.compose.foundation.text.C20985q1;
import androidx.compose.ui.text.input.C22648n;
import androidx.compose.ui.text.input.InterfaceC22645k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TextFieldDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/input/k;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20854c2 extends kotlin.jvm.internal.N implements Y41.l<List<? extends InterfaceC22645k>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22648n f30668l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> f30669m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h<androidx.compose.ui.text.input.i0> f30670n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20854c2(C22648n c22648n, Y41.l<? super androidx.compose.ui.text.input.W, kotlin.G0> lVar, l0.h<androidx.compose.ui.text.input.i0> hVar) {
        super(1);
        this.f30668l = c22648n;
        this.f30669m = lVar;
        this.f30670n = hVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(List<? extends InterfaceC22645k> list) {
        C20862e2.a aVar = C20862e2.f30700a;
        androidx.compose.ui.text.input.i0 i0Var = this.f30670n.f406842b;
        Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> lVar = this.f30669m;
        aVar.getClass();
        androidx.compose.ui.text.input.W wA2 = this.f30668l.a(list);
        if (i0Var != null && kotlin.jvm.internal.L.f(i0Var.f42445a.f42389b.get(), i0Var)) {
            i0Var.f42446b.b(null, wA2);
        }
        ((C20985q1.b) lVar).invoke(wA2);
        return kotlin.G0.f406611a;
    }
}

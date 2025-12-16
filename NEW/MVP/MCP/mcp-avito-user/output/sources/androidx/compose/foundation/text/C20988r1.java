package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.g;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.C22061e3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LinkStateInteractionSourceObserver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20988r1<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.collection.N0<androidx.compose.foundation.interaction.j> f31811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C20992s1 f31812c;

    public C20988r1(androidx.collection.N0<androidx.compose.foundation.interaction.j> n02, C20992s1 c20992s1) {
        this.f31811b = n02;
        this.f31812c = c20992s1;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        androidx.compose.foundation.interaction.j jVar = (androidx.compose.foundation.interaction.j) obj;
        boolean z12 = jVar instanceof g.a ? true : jVar instanceof d.a ? true : jVar instanceof o.b;
        androidx.collection.N0<androidx.compose.foundation.interaction.j> n02 = this.f31811b;
        if (z12) {
            n02.f(jVar);
        } else if (jVar instanceof g.b) {
            n02.j(((g.b) jVar).f28141a);
        } else if (jVar instanceof d.b) {
            n02.j(((d.b) jVar).f28135a);
        } else if (jVar instanceof o.c) {
            n02.j(((o.c) jVar).f28150a);
        } else if (jVar instanceof o.a) {
            n02.j(((o.a) jVar).f28148a);
        }
        Object[] objArr = n02.f25659a;
        int i12 = n02.f25660b;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            C20992s1 c20992s1 = this.f31812c;
            if (i13 >= i12) {
                ((C22061e3) c20992s1.f31816b).L3(i14);
                return kotlin.G0.f406611a;
            }
            androidx.compose.foundation.interaction.j jVar2 = (androidx.compose.foundation.interaction.j) objArr[i13];
            if (jVar2 instanceof g.a) {
                c20992s1.getClass();
                i14 |= 2;
            } else if (jVar2 instanceof d.a) {
                c20992s1.getClass();
                i14 |= 1;
            } else if (jVar2 instanceof o.b) {
                c20992s1.getClass();
                i14 |= 4;
            }
            i13++;
        }
    }
}

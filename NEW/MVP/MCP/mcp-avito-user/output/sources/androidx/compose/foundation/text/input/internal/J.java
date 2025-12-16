package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import kotlin.Metadata;

/* compiled from: ImeEditCommand.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/J;", "Landroidx/compose/foundation/text/input/internal/Y;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J implements Y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final t1 f30847a;

    /* renamed from: b, reason: collision with root package name */
    public int f30848b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<Y41.l<androidx.compose.foundation.text.input.i, kotlin.G0>> f30849c = new androidx.compose.runtime.collection.e<>(new Y41.l[16], 0);

    public J(@Y61.k t1 t1Var) {
        this.f30847a = t1Var;
    }

    public final void a() {
        this.f30848b++;
    }

    public final boolean b() {
        int i12 = this.f30848b - 1;
        this.f30848b = i12;
        if (i12 == 0) {
            androidx.compose.runtime.collection.e<Y41.l<androidx.compose.foundation.text.input.i, kotlin.G0>> eVar = this.f30849c;
            if (eVar.f38262d != 0) {
                t1 t1Var = this.f30847a;
                androidx.compose.foundation.text.input.p pVar = t1Var.f31452a;
                androidx.compose.foundation.text.input.c cVar = t1Var.f31453b;
                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
                pVar.f31519b.a().b();
                androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
                Y41.l<androidx.compose.foundation.text.input.i, kotlin.G0>[] lVarArr = eVar.f38260b;
                int i13 = eVar.f38262d;
                for (int i14 = 0; i14 < i13; i14++) {
                    lVarArr[i14].invoke(iVar);
                }
                t1Var.m(iVar);
                androidx.compose.foundation.text.input.p.a(pVar, cVar, false, textFieldEditUndoBehavior);
                eVar.g();
            }
        }
        return this.f30848b > 0;
    }
}

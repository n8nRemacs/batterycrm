package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.util.share.ShareData;

/* loaded from: classes2.dex */
public final class ste extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ tte Y;
    public final /* synthetic */ CharSequence Z;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ste(tte tteVar, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = tteVar;
        this.Z = charSequence;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ste) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ste(this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        List listA;
        int i = this.X;
        CharSequence charSequence = this.Z;
        tte tteVar = this.Y;
        if (i == 0) {
            g8j.b(obj);
            listA = ((ft6) tteVar.h.getValue()).a(null, charSequence);
            fde fdeVar = tteVar.c;
            this.o = listA;
            this.X = 1;
            obj = fdeVar.u(this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listA = (List) this.o;
            g8j.b(obj);
        }
        mue mueVar = (mue) tteVar.g.getValue();
        ShareData shareData = tteVar.a;
        List listD0 = ue3.d0((Set) obj);
        if (charSequence == null) {
            charSequence = "";
        }
        mueVar.b(shareData, listD0, charSequence.toString(), listA);
        return qqg.a;
    }
}

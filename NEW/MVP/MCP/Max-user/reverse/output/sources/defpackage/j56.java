package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes.dex */
public final class j56 implements z26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uid b;

    public /* synthetic */ j56(uid uidVar, int i) {
        this.a = i;
        this.b = uidVar;
    }

    @Override // defpackage.z26
    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.a = obj;
                throw new AbortFlowException(this);
            case 1:
                this.b.a = obj;
                throw new AbortFlowException(this);
            default:
                uid uidVar = this.b;
                if (uidVar.a != bqa.a) {
                    throw new IllegalArgumentException("Flow has more than one element");
                }
                uidVar.a = obj;
                return qqg.a;
        }
    }
}

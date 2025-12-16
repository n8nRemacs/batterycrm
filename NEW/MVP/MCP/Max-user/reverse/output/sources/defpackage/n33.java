package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.search.DuplicateDetectException;

/* loaded from: classes2.dex */
public final class n33 extends dtf implements sm6 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public x23 o;
    public final /* synthetic */ b43 s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ List u0;
    public final /* synthetic */ boolean v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n33(b43 b43Var, String str, List list, boolean z, Continuation continuation) {
        super(2, continuation);
        this.s0 = b43Var;
        this.t0 = str;
        this.u0 = list;
        this.v0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        n33 n33Var = new n33(this.s0, this.t0, this.u0, this.v0, continuation);
        n33Var.Z = obj;
        return n33Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        x23 x23Var;
        long jNanoTime;
        Object objB;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.Z;
            if (((y23) this.s0.H0.getValue()).b.equals(this.t0)) {
                x23Var = !this.u0.isEmpty() ? x23.d : x23.o;
                jNanoTime = System.nanoTime();
                wqi.h(this.s0.O0, "chats search: start UI mapping", null);
                svi.e(f84Var, ((q2b) this.s0.Y).a().plus(f84Var.getCoroutineContext()), null, new l33(this.u0, this.s0, null), 2);
                List list = this.u0;
                b43 b43Var = this.s0;
                ContextScope contextScopeA = d7j.a(this.b);
                ArrayList arrayList = new ArrayList(we3.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(svi.b(contextScopeA, null, new m33(it.next(), null, b43Var), 3));
                }
                this.Z = f84Var;
                this.o = x23Var;
                this.X = jNanoTime;
                this.Y = 1;
                objB = hui.b(arrayList, this);
                if (objB == g84Var) {
                    return g84Var;
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j = this.X;
        x23Var = this.o;
        f84Var = (f84) this.Z;
        g8j.b(obj);
        jNanoTime = j;
        objB = obj;
        x23 x23Var2 = x23Var;
        List<j6e> list2 = (List) objB;
        String str = this.s0.O0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.o;
            if (l6bVar.b(lg8Var)) {
                int i2 = s65.d;
                l6bVar.c(lg8Var, str, "chats search: UI mapping finish: ".concat(s65.n(v9j.i(System.nanoTime() - jNanoTime, y65.NANOSECONDS))), null);
            }
        }
        if (((y23) this.s0.H0.getValue()).b.equals(this.t0)) {
            wqi.h(this.s0.O0, "chats search: update_search_state", null);
            ArrayList arrayList2 = new ArrayList(list2.size());
            n8a n8aVar = new n8a((Object) null);
            n8a n8aVar2 = new n8a((Object) null);
            n8a n8aVar3 = new n8a((Object) null);
            for (j6e j6eVar : list2) {
                if (!d7j.f(f84Var)) {
                    break;
                }
                if (j6eVar instanceof cy2) {
                    cy2 cy2Var = (cy2) j6eVar;
                    if (!n8aVar.d(cy2Var.c)) {
                        n8aVar.a(cy2Var.c);
                        arrayList2.add(j6eVar);
                    }
                }
                if (j6eVar instanceof q04) {
                    q04 q04Var = (q04) j6eVar;
                    if (!n8aVar2.d(q04Var.c)) {
                        n8aVar2.a(q04Var.c);
                        arrayList2.add(j6eVar);
                    }
                }
                if (j6eVar instanceof fm9) {
                    fm9 fm9Var = (fm9) j6eVar;
                    if (!n8aVar3.d(fm9Var.o.a)) {
                        n8aVar3.a(fm9Var.o.a);
                        arrayList2.add(j6eVar);
                    }
                }
                arrayList2.add(j6eVar);
            }
            if (d7j.f(f84Var) && ((y23) this.s0.H0.getValue()).b.equals(this.t0)) {
                if (arrayList2.size() != list2.size()) {
                    DuplicateDetectException duplicateDetectException = new DuplicateDetectException(ho7.f(list2.size() - arrayList2.size(), "diff="));
                    ((j94) this.s0.D0.getValue()).a("ONEME-15837", duplicateDetectException);
                    String str2 = this.s0.O0;
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null) {
                        lg8 lg8Var2 = lg8.X;
                        if (l6bVar2.b(lg8Var2)) {
                            l6bVar2.c(lg8Var2, str2, wy1.h("found duplicates for ONEME-15837! ", duplicateDetectException.getMessage()), null);
                        }
                    }
                }
                boolean z = (this.v0 || ((y23) this.s0.H0.getValue()).a == x23.b) ? false : true;
                tcf tcfVar = this.s0.H0;
                tcfVar.m(null, y23.a((y23) tcfVar.getValue(), x23Var2, tc7.d, arrayList2, z, this.s0.x(), 2));
            }
        }
        return qqgVar;
    }
}

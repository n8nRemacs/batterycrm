package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class hde extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ boolean Z;
    public Object o;
    public final /* synthetic */ CharSequence s0;
    public final /* synthetic */ ide t0;
    public final /* synthetic */ long u0;
    public final /* synthetic */ Long v0;
    public final /* synthetic */ vf6 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hde(List list, boolean z, CharSequence charSequence, ide ideVar, long j, Long l, vf6 vf6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = list;
        this.Z = z;
        this.s0 = charSequence;
        this.t0 = ideVar;
        this.u0 = j;
        this.v0 = l;
        this.w0 = vf6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hde) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hde(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.Queue] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        a8c a8cVar;
        Object objA;
        g84 g84Var;
        LinkedList linkedList;
        List list;
        boolean z;
        ide ideVar;
        int iM;
        String string;
        ide ideVar2;
        Object objB;
        int i = this.X;
        boolean z2 = this.Z;
        int i2 = 2;
        long j = this.u0;
        ide ideVar3 = this.t0;
        CharSequence charSequence = this.s0;
        g84 g84Var2 = g84.a;
        if (i == 0) {
            g8j.b(obj);
            List list2 = this.Y;
            wqi.h("SendMessageWithMediaUseCase", "Sending messages with media. Media count " + list2.size(), null);
            a8cVar = new a8c(list2, !z2 && list2.size() > 1, charSequence);
            uq9 uq9Var = (uq9) ideVar3.e.getValue();
            this.o = a8cVar;
            this.X = 1;
            objA = uq9Var.a(j, this.v0, this);
            if (objA == g84Var2) {
                return g84Var2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r0 = (Queue) this.o;
                g8j.b(obj);
                linkedList = r0;
                ideVar2 = ideVar3;
                objB = obj;
                linkedList.addAll((List) objB);
                ((c6i) ideVar2.b.getValue()).b(new ihe(new lge(j, linkedList, i2)));
                return qqg.a;
            }
            a8c a8cVar2 = (a8c) this.o;
            g8j.b(obj);
            a8cVar = a8cVar2;
            objA = obj;
        }
        sk9 sk9Var = (sk9) objA;
        List listB = ((ft6) ideVar3.f.getValue()).b(charSequence, j);
        LinkedList linkedList2 = new LinkedList();
        if (!z2 || charSequence == null || charSequence.length() == 0) {
            g84Var = g84Var2;
            linkedList = linkedList2;
            list = listB;
            z = false;
        } else {
            linkedList = linkedList2;
            g84Var = g84Var2;
            jhe jheVar = new jhe(this.u0, charSequence.toString(), true, listB);
            list = listB;
            jheVar.b = sk9Var;
            linkedList.add(new lhe(jheVar));
            z = true;
        }
        ac9 ac9Var = (ac9) ideVar3.c.getValue();
        ac9Var.getClass();
        boolean z3 = a8cVar.b;
        List list3 = a8cVar.a;
        if (z3) {
            l5c l5cVar = (l5c) ac9Var.a;
            l5cVar.getClass();
            ideVar = ideVar3;
            iM = (int) l5cVar.m(PmsKey.f78maxattachcount, 12);
        } else {
            ideVar = ideVar3;
            iM = 1;
        }
        int size = list3.size();
        if (size == 0 && !l8g.c(a8cVar.c)) {
            wqi.e("SendMessageWithMediaUseCase", "Unexpected empty media list", null);
        } else if (size > 0) {
            boolean z4 = z;
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + iM;
                try {
                    dhe dheVar = new dhe(j, new ArrayList(list3.subList(i3, Math.min(size, i4))));
                    if (!z4) {
                        if (charSequence != null) {
                            try {
                                string = charSequence.toString();
                            } catch (Throwable th) {
                                th = th;
                                z4 = true;
                                wqi.e("ac9", "splitMedias: Exception after split medias for send", th);
                                i3 = i4;
                            }
                        } else {
                            string = null;
                        }
                        dheVar.h = string;
                        dheVar.i = list;
                        dheVar.b = sk9Var;
                        z4 = true;
                    }
                    linkedList.add(new ehe(dheVar));
                } catch (Throwable th2) {
                    th = th2;
                }
                i3 = i4;
            }
        }
        ideVar2 = ideVar;
        zs6 zs6Var = (zs6) ideVar2.d.getValue();
        this.o = linkedList;
        i2 = 2;
        this.X = 2;
        objB = zs6Var.b(this.w0, this);
        g84 g84Var3 = g84Var;
        if (objB == g84Var3) {
            return g84Var3;
        }
        linkedList.addAll((List) objB);
        ((c6i) ideVar2.b.getValue()).b(new ihe(new lge(j, linkedList, i2)));
        return qqg.a;
    }
}

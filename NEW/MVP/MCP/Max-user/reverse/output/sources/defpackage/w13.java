package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final /* synthetic */ class w13 implements z26, en6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w13(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.z26
    public final Object a(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object objA = ((z26) this.b).a((v03) obj, continuation);
                if (objA != g84.a) {
                    break;
                }
                break;
            default:
                Object objH = ((pac) ((sac) this.b)).a.h((ttg) obj, continuation);
                if (objH != g84.a) {
                    break;
                }
                break;
        }
        return qqg.a;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof z26) && (obj instanceof en6)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof z26) && (obj instanceof en6)) {
                    break;
                }
                break;
        }
        return getFunctionDelegate().equals(((en6) obj).getFunctionDelegate());
    }

    @Override // defpackage.en6
    public final xm6 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new hn6(2, 0, z26.class, (z26) this.b, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            default:
                return new hn6(2, 0, sac.class, (sac) this.b, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mtf extends dtf implements sm6 {
    public final /* synthetic */ ytf X;
    public final /* synthetic */ bug Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtf(ytf ytfVar, bug bugVar, Continuation continuation) {
        super(2, continuation);
        this.X = ytfVar;
        this.Y = bugVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mtf) l((ttg) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mtf mtfVar = new mtf(this.X, this.Y, continuation);
        mtfVar.o = obj;
        return mtfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        lg8 lg8Var = lg8.d;
        g8j.b(obj);
        ttg ttgVar = (ttg) this.o;
        if (!ttgVar.a()) {
            String str = this.X.b;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Requested upload to server", null);
            }
            ytf ytfVar = this.X;
            return gw0.l(new g56(gw0.s(new g56(new uxb(new g56(new uxb(new uxb(new m11(13, ttgVar), ytfVar, 23), ytfVar, 24), new ir9(2, ytfVar, ytf.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 16), 1), ytfVar, 25), new ir9(2, ytfVar, ytf.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 17), 1), new bzb(2, ytfVar, ytf.class, "uploadFile", "uploadFile(Lone/me/sdk/transfer/domain/Upload;)Lkotlinx/coroutines/flow/Flow;", 4, 25)), new xtf(ytfVar, null), 1), new hwd(5));
        }
        tgg tggVar = this.X.a;
        String str2 = this.Y.d;
        tggVar.getClass();
        kvg kvgVar = kvg.g;
        kvgVar.getClass();
        kvgVar.a(str2, new imb("warm_upload", 1));
        String str3 = this.X.b;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, str3, "No need for uploading due it already finished", null);
        }
        return new m11(13, ttgVar);
    }
}

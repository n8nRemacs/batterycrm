package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m7h extends dtf implements sm6 {
    public final /* synthetic */ File X;
    public final /* synthetic */ byte[] Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7h(File file, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.X = file;
        this.Y = bArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        m7h m7hVar = (m7h) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        m7hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        m7h m7hVar = new m7h(this.X, this.Y, continuation);
        m7hVar.o = obj;
        return m7hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        File file = this.X;
        byte[] bArr = this.Y;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, "placeholder_videomsg.jpeg"));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            String name = f84Var.getClass().getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.Y;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, "Couldn't save a video msg placeholder in file", null);
                }
            }
        }
        return qqg.a;
    }
}

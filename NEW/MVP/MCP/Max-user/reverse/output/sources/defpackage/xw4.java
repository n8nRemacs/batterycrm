package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class xw4 implements su0 {
    public static final /* synthetic */ yy7[] c = {new toc(xw4.class, "cleanerGetter", "getCleanerGetter()Ljava/lang/reflect/Method;", 0), ho7.d(vid.a, xw4.class, "cleanMethod", "getCleanMethod()Ljava/lang/reflect/Method;", 0)};
    public final dh4 a = new dh4(new yo3(7, "sun.nio.ch.DirectBuffer"), "cleaner");
    public final dh4 b = new dh4(new yo3(7, "sun.misc.Cleaner"), "clean");

    @Override // defpackage.su0
    public final ByteBuffer a(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    @Override // defpackage.su0
    public final void b(ByteBuffer byteBuffer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        yy7[] yy7VarArr = c;
        Method method = (Method) this.a.D(this, yy7VarArr[0]);
        if (method == null || (objInvoke = method.invoke(byteBuffer, null)) == null) {
            return;
        }
        Method method2 = (Method) this.b.D(this, yy7VarArr[1]);
        if (method2 != null) {
            method2.invoke(objInvoke, null);
        }
    }
}

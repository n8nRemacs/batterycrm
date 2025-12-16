package AW;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.ui.platform.C22491k0;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.Metadata;

/* compiled from: StdoutLogger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAW/d;", "LAW/b;", "<init>", "()V", "_common_logger_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f431a = new d();

    public static String b(String str, Throwable th2) {
        if (th2 == null) {
            return str;
        }
        StringBuilder sbB = C22491k0.b(str, '\n');
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        sbB.append(stringWriter.toString());
        return sbB.toString();
    }

    @Override // AW.b
    public final void a(@k String str, @k String str2, @k Throwable th2) {
        PrintStream printStream = System.err;
        StringBuilder sbZ = r.z(str, ": ");
        sbZ.append(b(str2, th2));
        printStream.println(sbZ.toString());
    }

    @Override // AW.b
    public final void c(@k String str, @k String str2, @l Throwable th2) {
        StringBuilder sbZ = r.z(str, "-d: ");
        sbZ.append(b(str2, th2));
        System.out.println((Object) sbZ.toString());
    }

    @Override // AW.b
    public final void g(@k String str, @k String str2) {
        System.out.println((Object) r.r(str, "-i: ", str2));
    }

    @Override // AW.b
    public final void h(@k String str, @k Throwable th2, @k Y41.a<String> aVar) {
        PrintStream printStream = System.err;
        StringBuilder sbZ = r.z(str, ": ");
        sbZ.append(b(aVar.invoke(), th2));
        printStream.println(sbZ.toString());
    }

    @Override // AW.b
    public final void i(@k String str, @k String str2, @l Throwable th2) {
        StringBuilder sbZ = r.z(str, "-v: ");
        sbZ.append(b(str2, th2));
        System.out.println((Object) sbZ.toString());
    }

    @Override // AW.b
    public final void j(@k String str, @k String str2, @l Throwable th2) {
        StringBuilder sbZ = r.z(str, "-w: ");
        sbZ.append(b(str2, th2));
        System.out.println((Object) sbZ.toString());
    }

    @Override // AW.b
    public final void k(@k String str, @k Y41.a aVar) {
        StringBuilder sbZ = r.z(str, "-d: ");
        sbZ.append((String) aVar.invoke());
        System.out.println((Object) sbZ.toString());
    }

    @Override // AW.b
    public final void l(@k String str, @l Throwable th2, @k Y41.a<String> aVar) {
        StringBuilder sbZ = r.z(str, "-i: ");
        sbZ.append(b(aVar.invoke(), th2));
        System.out.println((Object) sbZ.toString());
    }
}

package Fc1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.text.C43047d;

@Singleton
/* renamed from: Fc1.f5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13611f5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13753v4 f5505a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z0 f5506b;

    @Inject
    public C13611f5(@Y61.k InterfaceC13753v4 interfaceC13753v4, @Y61.k Z0 z02, @Y61.k @Named("logTag") String str) {
        this.f5505a = interfaceC13753v4;
        this.f5506b = z02;
    }

    public final synchronized void a(@Y61.k Throwable th2) {
        if (this.f5505a.c()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                th2.printStackTrace(printStream);
                printStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Charset charset = C43047d.f410589b;
                String.format("Exception: %s", Arrays.copyOf(new Object[]{new String(byteArray, charset)}, 1));
                this.f5506b.a(String.format("Exception: %s", Arrays.copyOf(new Object[]{new String(byteArrayOutputStream.toByteArray(), charset)}, 1)));
                byteArrayOutputStream.close();
            } catch (Exception unused) {
                th2.printStackTrace();
            }
        }
    }

    public final synchronized void b(@Y61.k xyz.n.a.j2 j2Var) {
        if (this.f5505a.c()) {
            this.f5506b.a(j2Var.f442781b);
        }
    }

    public final synchronized void c(@Y61.k xyz.n.a.j2 j2Var, @Y61.k String... strArr) {
        if (this.f5505a.c()) {
            String str = j2Var.f442781b;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
            String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Z0 z02 = this.f5506b;
            String str2 = j2Var.f442781b;
            Object[] objArrCopyOf2 = Arrays.copyOf(strArr, strArr.length);
            z02.a(String.format(str2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)));
        }
    }
}

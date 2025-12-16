package defpackage;

import android.net.Uri;
import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class hy5 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty5 b;

    public /* synthetic */ hy5(ty5 ty5Var, int i) {
        this.a = i;
        this.b = ty5Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ty5 ty5Var = this.b;
                URI uri = ty5Var.i;
                String str = ty5Var.a == 1 ? "application/octet-stream" : "application/x-binary; charset=x-user-defined";
                StringBuilder sb = new StringBuilder("POST ");
                sb.append(uri.getRawPath());
                sb.append('?');
                sb.append(uri.getRawQuery());
                sb.append(" HTTP/1.1\nHost: ");
                sb.append(uri.getHost());
                sb.append("\nContent-Type: ");
                sb.append(str);
                sb.append('\n');
                File file = ty5Var.j;
                String str2 = ty5Var.b;
                sb.append("Content-Disposition: attachment; filename=" + (ty5Var.a == 5 ? (str2 == null || str2.length() == 0) ? file.getName() : Uri.encode(str2) : (str2 == null || str2.length() == 0) ? String.valueOf(file.getName().hashCode()) : Uri.encode(str2)) + "\n");
                sb.append("X-Uploading-Mode: parallel\nConnection: keep-alive\nUser-Agent: ");
                String strL = u45.l(sb, (String) ty5Var.c.d.getValue(), '\n');
                if (ty5Var.v) {
                    String str3 = ty5Var.d;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str3, "Prepared sharedHeaders: ".concat(strL), null);
                        }
                    }
                }
                byte[] bytes = strL.getBytes(lb2.a);
                ByteBuffer byteBufferPut = ty5Var.c().a(bytes.length).put(bytes);
                byteBufferPut.flip();
                return byteBufferPut;
            case 1:
                return d7j.a(((q2b) ((lzf) this.b.e.getValue())).d());
            default:
                ty5 ty5Var2 = this.b;
                return AsynchronousFileChannel.open(Paths.get(ty5Var2.j.getPath(), new String[0]), Collections.singleton(StandardOpenOption.READ), (ExecutorService) ty5Var2.f.getValue(), new FileAttribute[0]);
        }
    }
}

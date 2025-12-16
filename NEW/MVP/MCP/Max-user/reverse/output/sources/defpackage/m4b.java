package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m4b extends dtf implements em6 {
    public final /* synthetic */ Path X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4b(Path path, Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.o = i;
        this.X = path;
        this.Y = obj;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) throws IOException {
        Continuation continuation = (Continuation) obj;
        switch (this.o) {
            case 0:
                m4b m4bVar = new m4b(this.X, (x4b) this.Y, continuation, 0);
                qqg qqgVar = qqg.a;
                m4bVar.n(qqgVar);
                return qqgVar;
            default:
                m4b m4bVar2 = new m4b(this.X, (dh4) this.Y, continuation, 1);
                qqg qqgVar2 = qqg.a;
                m4bVar2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        ZipOutputStream zipOutputStream;
        switch (this.o) {
            case 0:
                g8j.b(obj);
                zipOutputStream = new ZipOutputStream(Files.newOutputStream(this.X, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)));
                try {
                    File[] fileArrListFiles = ((x4b) this.Y).f().toFile().listFiles(new i4b(1));
                    if (fileArrListFiles == null) {
                        fileArrListFiles = new File[0];
                    }
                    for (File file : fileArrListFiles) {
                        zipOutputStream.setLevel(0);
                        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                        zipOutputStream.write(jz5.d(file));
                        zipOutputStream.closeEntry();
                    }
                    zipOutputStream.close();
                    return qqg.a;
                } finally {
                }
            default:
                g8j.b(obj);
                zipOutputStream = new ZipOutputStream(Files.newOutputStream(this.X, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)));
                try {
                    for (File file2 : ((Path) ((bwf) ((dh4) this.Y).b).getValue()).toFile().listFiles()) {
                        zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                        zipOutputStream.write(jz5.d(file2));
                        zipOutputStream.closeEntry();
                    }
                    zipOutputStream.close();
                    return qqg.a;
                } finally {
                }
        }
    }
}

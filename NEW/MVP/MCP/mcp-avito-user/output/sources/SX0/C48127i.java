package sX0;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.std.G;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

/* compiled from: NioPathDeserializer.java */
/* renamed from: sX0.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C48127i extends G<Path> {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f437703e;
    private static final long serialVersionUID = 1;

    static {
        File[] fileArrListRoots = File.listRoots();
        int length = fileArrListRoots.length;
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String path = fileArrListRoots[i12].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z12 = true;
                break;
            }
            i12++;
        }
        f437703e = z12;
    }

    public C48127i() {
        super(Path.class);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws ValueInstantiationException, MismatchedInputException {
        Class<?> cls = this.f341716b;
        if (!jsonParser.Y(JsonToken.VALUE_STRING)) {
            fVar.E(Path.class, jsonParser);
            throw null;
        }
        String strL = jsonParser.L();
        if (strL.indexOf(58) < 0) {
            return Paths.get(strL, new String[0]);
        }
        if (f437703e && strL.length() >= 2 && Character.isLetter(strL.charAt(0)) && strL.charAt(1) == ':') {
            return Paths.get(strL, new String[0]);
        }
        try {
            URI uri = new URI(strL);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e12) {
                try {
                    String scheme = uri.getScheme();
                    Iterator it = ServiceLoader.load(FileSystemProvider.class).iterator();
                    while (it.hasNext()) {
                        FileSystemProvider fileSystemProvider = (FileSystemProvider) it.next();
                        if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProvider.getPath(uri);
                        }
                    }
                    throw null;
                } catch (Throwable e122) {
                    e122.addSuppressed(e122);
                    throw null;
                }
            } finally {
                fVar.x(cls, e122);
            }
        } catch (URISyntaxException e1222) {
            throw null;
        }
    }
}

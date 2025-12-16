package coil.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import okio.AbstractC44811v;
import okio.S;

/* compiled from: FileSystems.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class e {
    public static final void a(@Y61.k AbstractC44811v abstractC44811v, @Y61.k S s5) throws IOException {
        try {
            IOException iOException = null;
            for (S s12 : abstractC44811v.c(s5)) {
                try {
                    if (abstractC44811v.e(s12).f420154b) {
                        a(abstractC44811v, s12);
                    }
                    abstractC44811v.a(s12);
                } catch (IOException e12) {
                    if (iOException == null) {
                        iOException = e12;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}

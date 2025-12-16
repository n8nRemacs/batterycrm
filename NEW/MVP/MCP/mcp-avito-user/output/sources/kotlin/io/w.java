package kotlin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43018a;

/* compiled from: ReadWrite.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class w {
    @Y61.k
    public static final C43018a a(@Y61.k BufferedReader bufferedReader) {
        return new C43018a(new s(bufferedReader));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final ArrayList b(@Y61.k InputStreamReader inputStreamReader) {
        ArrayList arrayList = new ArrayList();
        v vVar = new v(arrayList);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader, 8192);
        try {
            Iterator it = a(bufferedReader).iterator();
            while (it.hasNext()) {
                vVar.invoke(it.next());
            }
            G0 g02 = G0.f406611a;
            c.a(bufferedReader, null);
            return arrayList;
        } finally {
        }
    }

    @Y61.k
    public static final String c(@Y61.k Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i12 = reader.read(cArr);
        while (i12 >= 0) {
            stringWriter.write(cArr, 0, i12);
            i12 = reader.read(cArr);
        }
        return stringWriter.toString();
    }
}

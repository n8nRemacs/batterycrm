package okio;

import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okio.S;

/* compiled from: FileSystem.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokio/v;", "", "<init>", "()V", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC44811v {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final I f420161a;

    /* compiled from: FileSystem.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokio/v$a;", "", "<init>", "()V", "Lokio/v;", "RESOURCES", "Lokio/v;", "SYSTEM", "Lokio/S;", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/S;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.v$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        I i12;
        new a(null);
        try {
            Class.forName("java.nio.file.Files");
            i12 = new L();
        } catch (ClassNotFoundException unused) {
            i12 = new I();
        }
        f420161a = i12;
        S.a.b(S.f420033c, System.getProperty("java.io.tmpdir"));
        new okio.internal.n(okio.internal.n.class.getClassLoader(), false, null, 4, null);
    }

    public abstract void a(@Y61.k S s5);

    public final boolean b(@Y61.k S s5) {
        return f(s5) != null;
    }

    @Y61.k
    public abstract List<S> c(@Y61.k S s5);

    @Y61.l
    public abstract List<S> d(@Y61.k S s5);

    @Y61.k
    public final C44810u e(@Y61.k S s5) throws FileNotFoundException {
        C44810u c44810uF = f(s5);
        if (c44810uF != null) {
            return c44810uF;
        }
        throw new FileNotFoundException("no such file: " + s5);
    }

    @Y61.l
    public abstract C44810u f(@Y61.k S s5);

    @Y61.k
    public abstract AbstractC44809t g(@Y61.k S s5);

    @Y61.k
    public abstract c0 h(@Y61.k S s5);

    @Y61.k
    public abstract e0 i(@Y61.k S s5);
}

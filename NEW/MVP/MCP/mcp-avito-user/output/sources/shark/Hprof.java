package shark;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Hprof.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lshark/Hprof;", "Ljava/io/Closeable;", "a", "HprofVersion", "shark-hprof"}, k = 1, mv = {1, 4, 1})
@InterfaceC42830m
/* loaded from: classes9.dex */
public final class Hprof implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f438049b = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Hprof.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lshark/Hprof$HprofVersion;", "", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    @InterfaceC42830m
    public static final class HprofVersion {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ HprofVersion[] f438050b = {new HprofVersion("JDK1_2_BETA3", 0), new HprofVersion("JDK1_2_BETA4", 1), new HprofVersion("JDK_6", 2), new HprofVersion("ANDROID", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        HprofVersion EF5;

        public HprofVersion() {
            throw null;
        }

        public static HprofVersion valueOf(String str) {
            return (HprofVersion) Enum.valueOf(HprofVersion.class, str);
        }

        public static HprofVersion[] values() {
            return (HprofVersion[]) f438050b.clone();
        }
    }

    /* compiled from: Hprof.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/Hprof$a;", "", "<init>", "()V", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        new a(null);
    }

    public Hprof(File file, C48236b2 c48236b2, C42822w c42822w) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f438049b.iterator();
        while (it.hasNext()) {
            ((Closeable) it.next()).close();
        }
    }
}

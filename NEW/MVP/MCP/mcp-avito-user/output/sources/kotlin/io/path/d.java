package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/path/d;", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f406800a;

    /* renamed from: b, reason: collision with root package name */
    public int f406801b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f406802c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Path f406803d;

    public d() {
        this(0, 1, null);
    }

    public final void a(@Y61.k Exception exc) {
        this.f406801b++;
        ArrayList arrayList = this.f406802c;
        if (arrayList.size() < this.f406800a) {
            if (this.f406803d != null) {
                exc = (FileSystemException) new FileSystemException(String.valueOf(this.f406803d)).initCause(exc);
            }
            arrayList.add(exc);
        }
    }

    public d(int i12, int i13, C42822w c42822w) {
        this.f406800a = (i13 & 1) != 0 ? 64 : i12;
        this.f406802c = new ArrayList();
    }
}

package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JsonToStringWriter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/T;", "Lkotlinx/serialization/json/internal/z;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class T implements InterfaceC43474z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public char[] f413023a = C43461l.f413108c.a(128);

    /* renamed from: b, reason: collision with root package name */
    public int f413024b;

    public final void a(int i12, int i13) {
        int i14 = i13 + i12;
        char[] cArr = this.f413023a;
        if (cArr.length <= i14) {
            int i15 = i12 * 2;
            if (i14 < i15) {
                i14 = i15;
            }
            this.f413023a = Arrays.copyOf(cArr, i14);
        }
    }

    public final void b() {
        C43461l c43461l = C43461l.f413108c;
        char[] cArr = this.f413023a;
        synchronized (c43461l) {
            try {
                int i12 = c43461l.f413111b;
                if (cArr.length + i12 < C43457h.f413088a) {
                    c43461l.f413111b = i12 + cArr.length;
                    c43461l.f413110a.addLast(cArr);
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(@Y61.k String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.f413024b, length);
        str.getChars(0, str.length(), this.f413023a, this.f413024b);
        this.f413024b += length;
    }

    public final void d(long j12) {
        c(String.valueOf(j12));
    }

    @Y61.k
    public final String toString() {
        return new String(this.f413023a, 0, this.f413024b);
    }
}

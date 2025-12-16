package kotlin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: ReadWrite.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/io/s;", "Lkotlin/sequences/m;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class s implements InterfaceC43030m<String> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BufferedReader f406812a;

    /* compiled from: ReadWrite.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"kotlin/io/s$a", "", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<String>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public String f406813b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f406814c;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            if (this.f406813b == null && !this.f406814c) {
                String line = s.this.f406812a.readLine();
                this.f406813b = line;
                if (line == null) {
                    this.f406814c = true;
                }
            }
            return this.f406813b != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f406813b;
            this.f406813b = null;
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(@Y61.k BufferedReader bufferedReader) {
        this.f406812a = bufferedReader;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<String> iterator() {
        return new a();
    }
}

package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42736b;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: FileTreeWalk.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/i;", "Lkotlin/sequences/m;", "Ljava/io/File;", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i implements InterfaceC43030m<File> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final File f406773a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FileWalkDirection f406774b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y41.l<File, Boolean> f406775c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.l<File, G0> f406776d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.p<File, IOException, G0> f406777e;

    /* renamed from: f, reason: collision with root package name */
    public final int f406778f;

    /* compiled from: FileTreeWalk.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/i$a;", "Lkotlin/io/i$c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends c {
    }

    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/i$b;", "Lkotlin/collections/b;", "Ljava/io/File;", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends AbstractC42736b<File> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayDeque<c> f406779d;

        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/i$b$a;", "Lkotlin/io/i$a;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f406781b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public File[] f406782c;

            /* renamed from: d, reason: collision with root package name */
            public int f406783d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f406784e;

            public a(@Y61.k File file) {
                super(file);
            }

            @Override // kotlin.io.i.c
            @Y61.l
            public final File a() {
                int i12;
                boolean z12 = this.f406784e;
                b bVar = b.this;
                File file = this.f406791a;
                if (!z12 && this.f406782c == null) {
                    Y41.l<File, Boolean> lVar = i.this.f406775c;
                    if (lVar != null && !lVar.invoke(file).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = file.listFiles();
                    this.f406782c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Y41.p<File, IOException, G0> pVar = i.this.f406777e;
                        if (pVar != null) {
                            pVar.invoke(file, new AccessDeniedException(this.f406791a, null, "Cannot list files in a directory", 2, null));
                        }
                        this.f406784e = true;
                    }
                }
                File[] fileArr = this.f406782c;
                if (fileArr != null && (i12 = this.f406783d) < fileArr.length) {
                    this.f406783d = i12 + 1;
                    return fileArr[i12];
                }
                if (!this.f406781b) {
                    this.f406781b = true;
                    return file;
                }
                Y41.l<File, G0> lVar2 = i.this.f406776d;
                if (lVar2 != null) {
                    lVar2.invoke(file);
                }
                return null;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/i$b$b;", "Lkotlin/io/i$c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.io.i$b$b, reason: collision with other inner class name */
        public final class C11636b extends c {

            /* renamed from: b, reason: collision with root package name */
            public boolean f406786b;

            public C11636b() {
                throw null;
            }

            @Override // kotlin.io.i.c
            @Y61.l
            public final File a() {
                if (this.f406786b) {
                    return null;
                }
                this.f406786b = true;
                return this.f406791a;
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/i$b$c;", "Lkotlin/io/i$a;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f406787b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public File[] f406788c;

            /* renamed from: d, reason: collision with root package name */
            public int f406789d;

            public c(@Y61.k File file) {
                super(file);
            }

            @Override // kotlin.io.i.c
            @Y61.l
            public final File a() {
                Y41.p<File, IOException, G0> pVar;
                boolean z12 = this.f406787b;
                b bVar = b.this;
                File file = this.f406791a;
                if (!z12) {
                    Y41.l<File, Boolean> lVar = i.this.f406775c;
                    if (lVar != null && !lVar.invoke(file).booleanValue()) {
                        return null;
                    }
                    this.f406787b = true;
                    return file;
                }
                File[] fileArr = this.f406788c;
                if (fileArr != null && this.f406789d >= fileArr.length) {
                    Y41.l<File, G0> lVar2 = i.this.f406776d;
                    if (lVar2 != null) {
                        lVar2.invoke(file);
                    }
                    return null;
                }
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f406788c = fileArrListFiles;
                    if (fileArrListFiles == null && (pVar = i.this.f406777e) != null) {
                        pVar.invoke(file, new AccessDeniedException(this.f406791a, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f406788c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Y41.l<File, G0> lVar3 = i.this.f406776d;
                        if (lVar3 != null) {
                            lVar3.invoke(file);
                        }
                        return null;
                    }
                }
                File[] fileArr3 = this.f406788c;
                int i12 = this.f406789d;
                this.f406789d = i12 + 1;
                return fileArr3[i12];
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class d {
            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    FileWalkDirection fileWalkDirection = FileWalkDirection.f406764b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f406779d = arrayDeque;
            File file = i.this.f406773a;
            if (file.isDirectory()) {
                arrayDeque.push(b(file));
            } else if (file.isFile()) {
                arrayDeque.push(new C11636b(file));
            } else {
                this.f406664b = 2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC42736b
        public final void a() {
            T t12;
            File fileA;
            while (true) {
                ArrayDeque<c> arrayDeque = this.f406779d;
                c cVarPeek = arrayDeque.peek();
                if (cVarPeek == null) {
                    t12 = 0;
                    break;
                }
                fileA = cVarPeek.a();
                if (fileA == null) {
                    arrayDeque.pop();
                } else if (fileA.equals(cVarPeek.f406791a) || !fileA.isDirectory() || arrayDeque.size() >= i.this.f406778f) {
                    break;
                } else {
                    arrayDeque.push(b(fileA));
                }
            }
            t12 = fileA;
            if (t12 == 0) {
                this.f406664b = 2;
            } else {
                this.f406665c = t12;
                this.f406664b = 1;
            }
        }

        public final a b(File file) {
            int iOrdinal = i.this.f406774b.ordinal();
            if (iOrdinal == 0) {
                return new c(file);
            }
            if (iOrdinal == 1) {
                return new a(file);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/i$c;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final File f406791a;

        public c(@Y61.k File file) {
            this.f406791a = file;
        }

        @Y61.l
        public abstract File a();
    }

    public i() {
        throw null;
    }

    public i(File file, FileWalkDirection fileWalkDirection, Y41.l lVar, Y41.l lVar2, Y41.p pVar, int i12, int i13, C42822w c42822w) {
        fileWalkDirection = (i13 & 2) != 0 ? FileWalkDirection.f406764b : fileWalkDirection;
        i12 = (i13 & 32) != 0 ? Integer.MAX_VALUE : i12;
        this.f406773a = file;
        this.f406774b = fileWalkDirection;
        this.f406775c = lVar;
        this.f406776d = lVar2;
        this.f406777e = pVar;
        this.f406778f = i12;
    }

    @Override // kotlin.sequences.InterfaceC43030m
    @Y61.k
    public final Iterator<File> iterator() {
        return new b();
    }

    public i(@Y61.k File file, @Y61.k FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
    }

    public /* synthetic */ i(File file, FileWalkDirection fileWalkDirection, int i12, C42822w c42822w) {
        this(file, (i12 & 2) != 0 ? FileWalkDirection.f406764b : fileWalkDirection);
    }
}

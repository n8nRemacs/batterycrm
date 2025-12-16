package com.google.common.io;

import com.google.common.collect.H1;
import com.google.common.graph.o0;
import java.io.File;

/* compiled from: Files.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* loaded from: classes6.dex */
public final class C {

    /* compiled from: Files.java */
    public class a implements o0<File> {
    }

    /* compiled from: Files.java */
    public static final class b extends AbstractC37510l {

        /* renamed from: a, reason: collision with root package name */
        public final File f360307a;

        /* renamed from: b, reason: collision with root package name */
        public final H1<FileWriteMode> f360308b;

        public b(File file, FileWriteMode[] fileWriteModeArr, B b12) {
            file.getClass();
            this.f360307a = file;
            this.f360308b = H1.w(fileWriteModeArr);
        }

        public final String toString() {
            return "Files.asByteSink(" + this.f360307a + ", " + this.f360308b + ")";
        }
    }

    /* compiled from: Files.java */
    public static final class c extends AbstractC37511m {

        /* renamed from: a, reason: collision with root package name */
        public final File f360309a;

        public c(File file, B b12) {
            file.getClass();
            this.f360309a = file;
        }

        public final String toString() {
            return "Files.asByteSource(" + this.f360309a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Files.java */
    public static abstract class d implements com.google.common.base.N<File> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ d[] f360310b = {new a("IS_DIRECTORY", 0, null), new b("IS_FILE", 1, null)};

        /* JADX INFO: Fake field, exist only in values array */
        d EF7;

        /* compiled from: Files.java */
        public enum a extends d {
            @Override // com.google.common.base.N
            public final boolean apply(File file) {
                return file.isDirectory();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Files.isDirectory()";
            }
        }

        /* compiled from: Files.java */
        public enum b extends d {
            @Override // com.google.common.base.N
            public final boolean apply(File file) {
                return file.isFile();
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Files.isFile()";
            }
        }

        public d() {
            throw null;
        }

        public d(String str, int i12, B b12) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f360310b.clone();
        }
    }

    static {
        new a();
    }
}

package com.google.common.io;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.common.base.h0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.io.T;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: TempFileCreator.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* loaded from: classes6.dex */
abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final T f360319a;

    /* compiled from: TempFileCreator.java */
    public static final class b extends T {
        public b() {
            super();
        }

        @Override // com.google.common.io.T
        public final File a() {
            return File.createTempFile("FileBackedOutputStream", null, null);
        }
    }

    /* compiled from: TempFileCreator.java */
    @E
    public static final class c extends T {

        /* renamed from: b, reason: collision with root package name */
        public static final a f360320b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f360321c = null;

        /* compiled from: TempFileCreator.java */
        @E
        public interface a {
            FileAttribute<?> get();
        }

        static {
            a aVar;
            Set<String> setSupportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
            if (setSupportedFileAttributeViews.contains("posix")) {
                final int i12 = 0;
                f360320b = new a() { // from class: com.google.common.io.U
                    @Override // com.google.common.io.T.c.a
                    public final FileAttribute get() throws IOException {
                        switch (i12) {
                            case 0:
                                T.c.a aVar2 = T.c.f360320b;
                                return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
                            default:
                                T.c.a aVar3 = T.c.f360320b;
                                throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
                        }
                    }
                };
                return;
            }
            if (!setSupportedFileAttributeViews.contains("acl")) {
                final int i13 = 1;
                f360320b = new a() { // from class: com.google.common.io.U
                    @Override // com.google.common.io.T.c.a
                    public final FileAttribute get() throws IOException {
                        switch (i13) {
                            case 0:
                                T.c.a aVar2 = T.c.f360320b;
                                return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
                            default:
                                T.c.a aVar3 = T.c.f360320b;
                                throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
                        }
                    }
                };
                return;
            }
            try {
                final W w12 = new W(AbstractC37401r1.E(AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(b())).setPermissions(EnumSet.allOf(AclEntryPermission.class)).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build()));
                final int i14 = 0;
                aVar = new a() { // from class: com.google.common.io.V
                    @Override // com.google.common.io.T.c.a
                    public final FileAttribute get() throws IOException {
                        Object obj = w12;
                        switch (i14) {
                            case 0:
                                T.c.a aVar2 = T.c.f360320b;
                                return (FileAttribute) obj;
                            default:
                                T.c.a aVar3 = T.c.f360320b;
                                throw new IOException("Could not find user", (IOException) obj);
                        }
                    }
                };
            } catch (IOException e12) {
                final int i15 = 1;
                aVar = new a() { // from class: com.google.common.io.V
                    @Override // com.google.common.io.T.c.a
                    public final FileAttribute get() throws IOException {
                        Object obj = e12;
                        switch (i15) {
                            case 0:
                                T.c.a aVar2 = T.c.f360320b;
                                return (FileAttribute) obj;
                            default:
                                T.c.a aVar3 = T.c.f360320b;
                                throw new IOException("Could not find user", (IOException) obj);
                        }
                    }
                };
            }
            f360320b = aVar;
        }

        public c() {
            super();
        }

        public static String b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            String property = System.getProperty("user.name");
            Objects.requireNonNull(property);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", new Class[0]);
                Method method2 = cls.getMethod(RequestReviewResultKt.INFO_TYPE, new Class[0]);
                Object objInvoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod(ChannelContext.UserToUser.TYPE, new Class[0]).invoke(method2.invoke(method.invoke(null, new Object[0]), new Object[0]), new Object[0]), property);
                Objects.requireNonNull(objInvoke);
                return (String) objInvoke;
            } catch (ClassNotFoundException unused) {
                return property;
            } catch (IllegalAccessException | NoSuchMethodException unused2) {
                return property;
            } catch (InvocationTargetException e12) {
                h0.a(e12.getCause());
                return property;
            }
        }

        @Override // com.google.common.io.T
        public final File a() {
            return Files.createTempFile(Paths.get(System.getProperty("java.io.tmpdir"), new String[0]), "FileBackedOutputStream", null, f360320b.get()).toFile();
        }
    }

    /* compiled from: TempFileCreator.java */
    public static final class d extends T {
        public d() {
            super();
        }

        @Override // com.google.common.io.T
        public final File a() throws IOException {
            throw new IOException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }
    }

    static {
        T dVar;
        try {
            try {
                dVar = new c();
            } catch (ClassNotFoundException unused) {
                dVar = ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new d() : new b();
            }
        } catch (ClassNotFoundException unused2) {
            dVar = new d();
        } catch (IllegalAccessException unused3) {
            dVar = new d();
        } catch (NoSuchFieldException unused4) {
            dVar = new d();
        }
        f360319a = dVar;
    }

    public abstract File a();

    public T() {
    }
}

package net.bytebuddy.utility;

import java.security.AccessController;
import net.bytebuddy.ClassFileVersion;

/* compiled from: OpenedClassReader.java */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f418980a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f418981b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f418982c;

    static {
        boolean z12 = false;
        try {
            Class.forName("java.security.AccessController", false, null);
            f418982c = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
        } catch (ClassNotFoundException unused) {
            f418982c = false;
        } catch (SecurityException unused2) {
            f418982c = true;
        }
        try {
            z12 = Boolean.parseBoolean((String) (f418982c ? AccessController.doPrivileged(new net.bytebuddy.utility.privilege.b("net.bytebuddy.experimental")) : System.getProperty("net.bytebuddy.experimental")));
        } catch (Exception unused3) {
        }
        f418980a = z12;
        f418981b = 589824;
    }

    public e() {
        throw new UnsupportedOperationException("This class is a utility class and not supposed to be instantiated");
    }

    public static net.bytebuddy.jar.asm.e a(byte[] bArr) {
        ClassFileVersion classFileVersion = ClassFileVersion.f415291c;
        if (bArr.length < 7) {
            throw new IllegalArgumentException(AK.c.i(bArr.length, " byte", new StringBuilder("Supplied byte array is too short to be a class file with ")));
        }
        ClassFileVersion classFileVersionF = ClassFileVersion.f((bArr[6] << 8) | (bArr[7] & 255));
        ClassFileVersion classFileVersion2 = ClassFileVersion.f415309u;
        if (!(classFileVersionF.compareTo(classFileVersion2) > 0)) {
            return new net.bytebuddy.jar.asm.e(bArr, true);
        }
        if (f418980a) {
            bArr[6] = (byte) (classFileVersion2.b() >>> 8);
            bArr[7] = (byte) classFileVersion2.b();
            net.bytebuddy.jar.asm.e eVar = new net.bytebuddy.jar.asm.e(bArr, true);
            bArr[6] = (byte) (classFileVersionF.b() >>> 8);
            bArr[7] = (byte) classFileVersionF.b();
            return eVar;
        }
        throw new IllegalArgumentException(classFileVersionF + " is not supported by the current version of Byte Buddy which officially supports " + classFileVersion2 + " - update Byte Buddy or set net.bytebuddy.experimental as a VM property");
    }
}

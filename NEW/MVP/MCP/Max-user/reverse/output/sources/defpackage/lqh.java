package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Base64;
import android.util.Pair;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class lqh {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public lqh(hk4 hk4Var, sa9 sa9Var, aqc aqcVar, kp1 kp1Var, boolean z) {
        this.b = hk4Var;
        this.c = sa9Var;
        this.d = aqcVar;
        this.e = kp1Var;
        this.a = z;
    }

    public static int j(fz0 fz0Var, int i) {
        int iHashCode = fz0Var.b.hashCode() + (fz0Var.a * 31);
        if (i < 2) {
            long jA = h34.a(fz0Var.e);
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return fz0Var.e.hashCode() + (iHashCode * 31);
    }

    public static fz0 s(int i, DataInputStream dataInputStream) throws IOException {
        uk4 uk4Var;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            j34 j34Var = new j34();
            j34Var.b(Long.valueOf(j), "exo_len");
            uk4Var = uk4.c.b(j34Var);
        } else {
            int i3 = dataInputStream.readInt();
            HashMap map = new HashMap();
            for (int i4 = 0; i4 < i3; i4++) {
                String utf2 = dataInputStream.readUTF();
                int i5 = dataInputStream.readInt();
                if (i5 < 0) {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value size: ");
                    sb.append(i5);
                    throw new IOException(sb.toString());
                }
                int iMin = Math.min(i5, 10485760);
                byte[] bArrCopyOf = xxg.f;
                int i6 = 0;
                while (i6 != i5) {
                    int i7 = i6 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                    dataInputStream.readFully(bArrCopyOf, i6, iMin);
                    iMin = Math.min(i5 - i7, 10485760);
                    i6 = i7;
                }
                map.put(utf2, bArrCopyOf);
            }
            uk4Var = new uk4(map);
        }
        return new fz0(i2, utf, uk4Var);
    }

    public boolean a(boolean z, String str, Cipher cipher) throws InvalidKeyException {
        String str2 = (String) this.c;
        if (str != null) {
            try {
                if (str.length() == 0) {
                    h().init(1, i());
                } else {
                    d(str, cipher);
                }
            } catch (UserNotAuthenticatedException e) {
                if (z) {
                    wqi.e(str2, "Failure check key. Need auth but we already authenticated, clear key.", e);
                    c();
                } else {
                    wqi.q(str2, "Failure check key. Need auth.", new Object[0]);
                }
                return !z;
            } catch (Exception e2) {
                wqi.e(str2, "Failure check key. Maybe biometry changed, should clear", e2);
                c();
                return false;
            }
        } else {
            h().init(1, i());
        }
        wqi.c(str2, "Success check key.", new Object[0]);
        return true;
    }

    public void c() {
        Object ipdVar;
        try {
            ((KeyStore) ((bwf) this.d).getValue()).deleteEntry((String) this.b);
            ipdVar = qqg.a;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (kpd.a(ipdVar) != null) {
            wqi.q((String) this.c, "Can't remove secret key", new Object[0]);
        }
    }

    public String d(String str, Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipherH = cipher == null ? h() : cipher;
        byte[] bArrDecode = Base64.decode(str, 0);
        if (cipher == null) {
            cipherH.init(2, i(), new IvParameterSpec(ys.o(0, bArrDecode, cipherH.getBlockSize())));
        } else {
            wqi.c((String) this.c, "Decrypt with external cipher", new Object[0]);
        }
        return new String(cipherH.doFinal(ys.o(cipherH.getBlockSize(), bArrDecode, bArrDecode.length)), lb2.a);
    }

    public String e(String str, Cipher cipher) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
        Cipher cipherH = cipher == null ? h() : cipher;
        if (cipher == null) {
            cipherH.init(1, i());
        } else {
            wqi.c((String) this.c, "Encrypt with external cipher", new Object[0]);
        }
        byte[] bArrDoFinal = cipherH.doFinal(str.getBytes(lb2.a));
        byte[] iv = cipherH.getIV();
        byte[] bArr = new byte[iv.length + bArrDoFinal.length];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(bArrDoFinal, 0, bArr, iv.length, bArrDoFinal.length);
        return Base64.encodeToString(bArr, 0);
    }

    public boolean f() {
        s7c s7cVar = (s7c) this.d;
        return ((File) s7cVar.a).exists() || ((File) s7cVar.b).exists();
    }

    public void g() {
        ((y6d) this.d).log("Condition", "Condition # " + ((String) this.b) + " - 🔥 " + ((AtomicLong) this.e).incrementAndGet());
        synchronized (this) {
            try {
                if (this.a) {
                    throw new IllegalStateException("Is already fired");
                }
                this.a = true;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Pair pair = (Pair) obj;
                    ((y6d) this.d).log("Condition", "Condition # " + ((String) this.b) + " - executing from queue " + ((String) pair.first) + " " + ((AtomicLong) this.e).incrementAndGet());
                    ((Runnable) pair.second).run();
                }
                ((ArrayList) this.c).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Cipher h() {
        return (Cipher) ((bwf) this.e).getValue();
    }

    public SecretKey i() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        SecretKey secretKey;
        KeyStore keyStore = (KeyStore) ((bwf) this.d).getValue();
        String str = (String) this.b;
        KeyStore.Entry entry = keyStore.getEntry(str, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null && (secretKey = secretKeyEntry.getSecretKey()) != null) {
            return secretKey;
        }
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding");
        if (this.a) {
            encryptionPaddings.setUserAuthenticationRequired(true);
            if (Build.VERSION.SDK_INT >= 30) {
                encryptionPaddings.setUserAuthenticationParameters(120, 2);
            }
        } else {
            encryptionPaddings.setUserAuthenticationRequired(false);
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = encryptionPaddings.setRandomizedEncryptionRequired(true).build();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpecBuild);
        return keyGenerator.generateKey();
    }

    public void k(long j) {
    }

    public boolean l() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: all -> 0x007e, IOException -> 0x0081, LOOP:0: B:36:0x0093->B:37:0x0095, LOOP_END, TryCatch #4 {IOException -> 0x0081, all -> 0x007e, blocks: (B:13:0x0045, B:18:0x004f, B:24:0x005f, B:25:0x0069, B:26:0x0072, B:33:0x0086, B:34:0x008b, B:35:0x008c, B:37:0x0095, B:38:0x00ab), top: B:61:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(java.util.HashMap r13, android.util.SparseArray r14) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqh.m(java.util.HashMap, android.util.SparseArray):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(org.json.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqh.n(org.json.JSONObject):void");
    }

    public void o(JSONObject jSONObject) {
        ije ijeVarA;
        if (this.a) {
            hk4 hk4Var = (hk4) this.b;
            try {
                ijeVarA = hk4Var.a(jSONObject);
            } catch (JSONException e) {
                ((y6d) hk4Var.a).logException("SessionRoomParser", "Can't parse room update notification", e);
                ijeVarA = null;
            }
            if (ijeVarA == null) {
                return;
            }
            ((kp1) this.e).d(ijeVarA);
        }
    }

    public void p(JSONObject jSONObject) {
        jz7 jz7VarC;
        if (this.a) {
            hk4 hk4Var = (hk4) this.b;
            try {
                jz7VarC = hk4Var.c(jSONObject);
            } catch (JSONException e) {
                ((y6d) hk4Var.a).logException("SessionRoomParser", "Can't parse rooms update notification", e);
                jz7VarC = null;
            }
            if (jz7VarC == null) {
                return;
            }
            kp1 kp1Var = (kp1) this.e;
            Iterator it = jz7VarC.a.iterator();
            while (it.hasNext()) {
                kp1Var.d((ije) it.next());
            }
        }
    }

    public void q(fz0 fz0Var) {
        this.a = true;
    }

    public go0 r(String str, boolean z) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (z) {
            h().init(1, i());
        } else {
            h().init(2, i(), new IvParameterSpec(ys.o(0, Base64.decode(str, 0), h().getBlockSize())));
        }
        return new go0(h());
    }

    public void t(HashMap map) {
        DataOutputStream dataOutputStream;
        s7c s7cVar = (s7c) this.d;
        DataOutputStream dataOutputStream2 = null;
        try {
            ty tyVarD = s7cVar.D();
            xpd xpdVar = (xpd) this.e;
            if (xpdVar == null) {
                this.e = new xpd(tyVarD, 0);
            } else {
                xpdVar.c(tyVarD);
            }
            dataOutputStream = new DataOutputStream((xpd) this.e);
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(map.size());
            int iJ = 0;
            for (fz0 fz0Var : map.values()) {
                dataOutputStream.writeInt(fz0Var.a);
                dataOutputStream.writeUTF(fz0Var.b);
                r30.g(fz0Var.e, dataOutputStream);
                iJ += j(fz0Var, 2);
            }
            dataOutputStream.writeInt(iJ);
            dataOutputStream.close();
            ((File) s7cVar.b).delete();
            int i = xxg.a;
            this.a = false;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            xxg.g(dataOutputStream2);
            throw th;
        }
    }

    public lqh(String str, y6d y6dVar) {
        this.a = false;
        this.c = new ArrayList();
        this.e = new AtomicLong();
        this.b = str;
        this.d = y6dVar;
    }

    public lqh(String str, boolean z) {
        this.b = str;
        this.a = z;
        this.c = lqh.class.getName();
        this.d = new bwf(new q8g(22));
        this.e = new bwf(new q8g(23));
    }

    public lqh(File file) {
        this.b = null;
        this.c = null;
        s7c s7cVar = new s7c();
        s7cVar.a = file;
        s7cVar.b = new File(String.valueOf(file.getPath()).concat(".bak"));
        this.d = s7cVar;
    }
}

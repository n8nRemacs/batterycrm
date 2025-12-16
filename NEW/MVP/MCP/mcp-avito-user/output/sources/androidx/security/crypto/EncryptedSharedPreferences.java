package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.appcompat.app.r;
import androidx.collection.C20203c;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplates;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.daead.DeterministicAeadConfig;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.subtle.Base64;
import j.N;
import j.P;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f54439a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f54440b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final String f54441c;

    /* renamed from: d, reason: collision with root package name */
    public final Aead f54442d;

    /* renamed from: e, reason: collision with root package name */
    public final DeterministicAead f54443e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PrefKeyEncryptionScheme {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PrefKeyEncryptionScheme[] f54444b = {new PrefKeyEncryptionScheme()};

        /* JADX INFO: Fake field, exist only in values array */
        PrefKeyEncryptionScheme EF2;

        public static PrefKeyEncryptionScheme valueOf(String str) {
            return (PrefKeyEncryptionScheme) Enum.valueOf(PrefKeyEncryptionScheme.class, str);
        }

        public static PrefKeyEncryptionScheme[] values() {
            return (PrefKeyEncryptionScheme[]) f54444b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PrefValueEncryptionScheme {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PrefValueEncryptionScheme[] f54445b = {new PrefValueEncryptionScheme()};

        /* JADX INFO: Fake field, exist only in values array */
        PrefValueEncryptionScheme EF2;

        public static PrefValueEncryptionScheme valueOf(String str) {
            return (PrefValueEncryptionScheme) Enum.valueOf(PrefValueEncryptionScheme.class, str);
        }

        public static PrefValueEncryptionScheme[] values() {
            return (PrefValueEncryptionScheme[]) f54445b.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54446a;

        static {
            int[] iArr = new int[c.values().length];
            f54446a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54446a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54446a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54446a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54446a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54446a[1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final EncryptedSharedPreferences f54447a;

        /* renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f54448b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f54450d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f54449c = new CopyOnWriteArrayList();

        public b(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.f54447a = encryptedSharedPreferences;
            this.f54448b = editor;
        }

        public final void a() {
            if (this.f54450d.getAndSet(false)) {
                EncryptedSharedPreferences encryptedSharedPreferences = this.f54447a;
                for (String str : ((HashMap) encryptedSharedPreferences.getAll()).keySet()) {
                    if (!this.f54449c.contains(str) && !EncryptedSharedPreferences.d(str)) {
                        this.f54448b.remove(encryptedSharedPreferences.b(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a();
            this.f54448b.apply();
            b();
            this.f54449c.clear();
        }

        public final void b() {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f54447a;
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = encryptedSharedPreferences.f54440b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator it2 = this.f54449c.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(encryptedSharedPreferences, (String) it2.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f54447a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.d(str)) {
                throw new SecurityException(r.q(str, " is a reserved key for the encryption keyset."));
            }
            this.f54449c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String strB = encryptedSharedPreferences.b(str);
                Pair pair = new Pair(strB, Base64.encode(encryptedSharedPreferences.f54442d.encrypt(bArr, strB.getBytes(StandardCharsets.UTF_8))));
                this.f54448b.putString((String) pair.first, (String) pair.second);
            } catch (GeneralSecurityException e12) {
                throw new SecurityException("Could not encrypt data: " + e12.getMessage(), e12);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @N
        public final SharedPreferences.Editor clear() {
            this.f54450d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f54449c;
            a();
            try {
                return this.f54448b.commit();
            } finally {
                b();
                copyOnWriteArrayList.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @N
        public final SharedPreferences.Editor putBoolean(@P String str, boolean z12) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(5);
            byteBufferAllocate.put(z12 ? (byte) 1 : (byte) 0);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @N
        public final SharedPreferences.Editor putFloat(@P String str, float f12) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(4);
            byteBufferAllocate.putFloat(f12);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @N
        public final SharedPreferences.Editor putInt(@P String str, int i12) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(2);
            byteBufferAllocate.putInt(i12);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @N
        public final SharedPreferences.Editor putLong(@P String str, long j12) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(3);
            byteBufferAllocate.putLong(j12);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @N
        public final SharedPreferences.Editor putString(@P String str, @P String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @N
        public final SharedPreferences.Editor putStringSet(@P String str, @P Set<String> set) {
            Set<String> set2 = set;
            if (set == null) {
                C20203c c20203c = new C20203c();
                c20203c.add("__NULL__");
                set2 = c20203c;
            }
            ArrayList arrayList = new ArrayList(set2.size());
            int size = set2.size() * 4;
            Iterator<String> it = set2.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(1);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr = (byte[]) it2.next();
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            c(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @N
        public final SharedPreferences.Editor remove(@P String str) {
            EncryptedSharedPreferences encryptedSharedPreferences = this.f54447a;
            encryptedSharedPreferences.getClass();
            if (EncryptedSharedPreferences.d(str)) {
                throw new SecurityException(r.q(str, " is a reserved key for the encryption keyset."));
            }
            this.f54448b.remove(encryptedSharedPreferences.b(str));
            this.f54449c.add(str);
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f54451b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f54452c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f54453d;

        /* renamed from: e, reason: collision with root package name */
        public static final c f54454e;

        /* renamed from: f, reason: collision with root package name */
        public static final c f54455f;

        /* renamed from: g, reason: collision with root package name */
        public static final c f54456g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ c[] f54457h;

        static {
            c cVar = new c("STRING", 0);
            f54451b = cVar;
            c cVar2 = new c("STRING_SET", 1);
            f54452c = cVar2;
            c cVar3 = new c("INT", 2);
            f54453d = cVar3;
            c cVar4 = new c("LONG", 3);
            f54454e = cVar4;
            c cVar5 = new c("FLOAT", 4);
            f54455f = cVar5;
            c cVar6 = new c("BOOLEAN", 5);
            f54456g = cVar6;
            f54457h = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f54457h.clone();
        }
    }

    public EncryptedSharedPreferences(@N String str, @N SharedPreferences sharedPreferences, @N Aead aead, @N DeterministicAead deterministicAead) {
        this.f54441c = str;
        this.f54439a = sharedPreferences;
        this.f54442d = aead;
        this.f54443e = deterministicAead;
    }

    @N
    public static EncryptedSharedPreferences a(@N Context context, @N String str, @N MasterKey masterKey) {
        String str2 = masterKey.f54458a;
        DeterministicAeadConfig.register();
        AeadConfig.register();
        Context applicationContext = context.getApplicationContext();
        KeysetHandle keysetHandle = new AndroidKeysetManager.Builder().withKeyTemplate(KeyTemplates.get("AES256_SIV")).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        KeysetHandle keysetHandle2 = new AndroidKeysetManager.Builder().withKeyTemplate(KeyTemplates.get("AES256_GCM")).withSharedPref(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + str2).build().getKeysetHandle();
        return new EncryptedSharedPreferences(str, applicationContext.getSharedPreferences(str, 0), (Aead) keysetHandle2.getPrimitive(Aead.class), (DeterministicAead) keysetHandle.getPrimitive(DeterministicAead.class));
    }

    public static boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return Base64.encode(this.f54443e.encryptDeterministically(str.getBytes(StandardCharsets.UTF_8), this.f54441c.getBytes()));
        } catch (GeneralSecurityException e12) {
            throw new SecurityException("Could not encrypt key. " + e12.getMessage(), e12);
        }
    }

    public final Object c(String str) {
        if (d(str)) {
            throw new SecurityException(r.q(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strB = b(str);
            String string = this.f54439a.getString(strB, null);
            if (string == null) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(string, 0);
            Aead aead = this.f54442d;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(aead.decrypt(bArrDecode, strB.getBytes(charset)));
            byteBufferWrap.position(0);
            int i12 = byteBufferWrap.getInt();
            c cVar = i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? null : c.f54456g : c.f54455f : c.f54454e : c.f54453d : c.f54452c : c.f54451b;
            if (cVar == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i12);
            }
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                int i13 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                byteBufferWrap.limit(i13);
                String string2 = charset.decode(byteBufferSlice).toString();
                if (string2.equals("__NULL__")) {
                    return null;
                }
                return string2;
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return Integer.valueOf(byteBufferWrap.getInt());
                }
                if (iOrdinal == 3) {
                    return Long.valueOf(byteBufferWrap.getLong());
                }
                if (iOrdinal == 4) {
                    return Float.valueOf(byteBufferWrap.getFloat());
                }
                if (iOrdinal == 5) {
                    return Boolean.valueOf(byteBufferWrap.get() != 0);
                }
                throw new SecurityException("Unhandled type for encrypted pref value: " + cVar);
            }
            C20203c c20203c = new C20203c();
            while (byteBufferWrap.hasRemaining()) {
                int i14 = byteBufferWrap.getInt();
                ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                byteBufferSlice2.limit(i14);
                byteBufferWrap.position(byteBufferWrap.position() + i14);
                c20203c.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
            }
            if (c20203c.f25687d == 1 && "__NULL__".equals(c20203c.f25686c[0])) {
                return null;
            }
            return c20203c;
        } catch (GeneralSecurityException e12) {
            throw new SecurityException("Could not decrypt value. " + e12.getMessage(), e12);
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(@P String str) {
        if (d(str)) {
            throw new SecurityException(r.q(str, " is a reserved key for the encryption keyset."));
        }
        return this.f54439a.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    @N
    public final SharedPreferences.Editor edit() {
        return new b(this, this.f54439a.edit());
    }

    @Override // android.content.SharedPreferences
    @N
    public final Map<String, ?> getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f54439a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.f54443e.decryptDeterministically(Base64.decode(entry.getKey(), 0), this.f54441c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    map.put(str, c(str));
                } catch (GeneralSecurityException e12) {
                    throw new SecurityException("Could not decrypt key. " + e12.getMessage(), e12);
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(@P String str, boolean z12) {
        Object objC = c(str);
        return objC instanceof Boolean ? ((Boolean) objC).booleanValue() : z12;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(@P String str, float f12) {
        Object objC = c(str);
        return objC instanceof Float ? ((Float) objC).floatValue() : f12;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(@P String str, int i12) {
        Object objC = c(str);
        return objC instanceof Integer ? ((Integer) objC).intValue() : i12;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(@P String str, long j12) {
        Object objC = c(str);
        return objC instanceof Long ? ((Long) objC).longValue() : j12;
    }

    @Override // android.content.SharedPreferences
    @P
    public final String getString(@P String str, @P String str2) {
        Object objC = c(str);
        return objC instanceof String ? (String) objC : str2;
    }

    @Override // android.content.SharedPreferences
    @P
    public final Set<String> getStringSet(@P String str, @P Set<String> set) {
        Object objC = c(str);
        Set<String> c20203c = objC instanceof Set ? (Set) objC : new C20203c<>();
        return c20203c.size() > 0 ? c20203c : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(@N SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f54440b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(@N SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f54440b.remove(onSharedPreferenceChangeListener);
    }
}

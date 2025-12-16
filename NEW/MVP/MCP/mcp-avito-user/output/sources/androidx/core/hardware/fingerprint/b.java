package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.core.os.C22778f;
import j.N;
import j.P;
import j.X;
import j.a0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: FingerprintManagerCompat.java */
@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f44787a;

    /* compiled from: FingerprintManagerCompat.java */
    @X
    public static class a {
    }

    /* compiled from: FingerprintManagerCompat.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f44788a;

        public c(@N d dVar) {
            this.f44788a = dVar;
        }
    }

    public b(Context context) {
        this.f44787a = context;
    }

    @P
    @X
    public static FingerprintManager b(@N Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    @RestrictTo
    @a0
    @Deprecated
    public final void a(@P d dVar, @P C22778f c22778f, @N AbstractC1732b abstractC1732b) {
        FingerprintManager.CryptoObject cryptoObject = null;
        CancellationSignal cancellationSignal = c22778f != null ? (CancellationSignal) c22778f.b() : null;
        FingerprintManager fingerprintManagerB = b(this.f44787a);
        if (fingerprintManagerB != null) {
            if (dVar != null) {
                Cipher cipher = dVar.f44790b;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else {
                    Signature signature = dVar.f44789a;
                    if (signature != null) {
                        cryptoObject = new FingerprintManager.CryptoObject(signature);
                    } else {
                        Mac mac = dVar.f44791c;
                        if (mac != null) {
                            cryptoObject = new FingerprintManager.CryptoObject(mac);
                        }
                    }
                }
            }
            fingerprintManagerB.authenticate(cryptoObject, cancellationSignal, 0, new androidx.core.hardware.fingerprint.a(abstractC1732b), null);
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Signature f44789a;

        /* renamed from: b, reason: collision with root package name */
        public final Cipher f44790b;

        /* renamed from: c, reason: collision with root package name */
        public final Mac f44791c;

        public d(@N Signature signature) {
            this.f44789a = signature;
            this.f44790b = null;
            this.f44791c = null;
        }

        public d(@N Cipher cipher) {
            this.f44790b = cipher;
            this.f44789a = null;
            this.f44791c = null;
        }

        public d(@N Mac mac) {
            this.f44791c = mac;
            this.f44790b = null;
            this.f44789a = null;
        }
    }

    /* compiled from: FingerprintManagerCompat.java */
    /* renamed from: androidx.core.hardware.fingerprint.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC1732b {
        public void b() {
        }

        public void c(@N CharSequence charSequence) {
        }

        public void d(@N c cVar) {
        }

        public void a(int i12, @N CharSequence charSequence) {
        }
    }
}

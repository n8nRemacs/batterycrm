package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.FileOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tech.kwik.agent15.alert.HandshakeFailureAlert;

/* loaded from: classes.dex */
public abstract class ds4 implements pl9 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public ds4() {
        this.d = new kme(10, this);
    }

    public static int q(jbg jbgVar) {
        int iOrdinal = jbgVar.ordinal();
        if (iOrdinal == 0) {
            return 32;
        }
        if (iOrdinal == 1) {
            return 48;
        }
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return 32;
        }
        throw new RuntimeException();
    }

    public static void s() {
        throw new RuntimeException(System.getProperty("java.vendor") != null && System.getProperty("java.vendor").contains("Android") ? "Missing RSASSA-PSS support. Did you set PlatformMapping.usePlatformMapping(PlatformMapping.Platform.Android)?" : "Missing RSASSA-PSS support");
    }

    public static void u(FrameLayout frameLayout) {
        tv6 tv6Var = tv6.d;
        Context context = frameLayout.getContext();
        int iC = tv6Var.c(context, uv6.a);
        String strC = abi.c(context, iC);
        String strB = abi.b(context, iC);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentB = tv6Var.b(context, null, iC);
        if (intentB != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new iu1(context, 4, intentB));
        }
    }

    public Object i(p5b p5bVar) {
        ((AtomicReference) this.b).set(hd5.a);
        Object objI = svi.i(((q2b) ((lzf) ((k18) this.a).getValue())).b(), new u0a(this, null), p5bVar);
        return objI == g84.a ? objI : qqg.a;
    }

    public byte[] j(byte[] bArr, byte[] bArr2) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        pbg pbgVar = (pbg) this.c;
        short s = pbgVar.e;
        pbgVar.getClass();
        byte[] bArrB = pbgVar.b(bArr2, "finished", "".getBytes(pbg.u), s);
        String strF = ho7.f(s * 8, "HmacSHA");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrB, strF);
        try {
            Mac mac = Mac.getInstance(strF);
            mac.init(secretKeySpec);
            mac.update(bArr);
            return mac.doFinal();
        } catch (InvalidKeyException unused) {
            throw new RuntimeException();
        } catch (NoSuchAlgorithmException unused2) {
            throw new RuntimeException(ho7.i("Missing ", strF, " support"));
        }
    }

    public abstract fl9 k();

    public abstract void l(kme kmeVar);

    public b89 m() {
        pv8 pv8Var = ((k89) this.d).X;
        if (pv8Var != null) {
            return pv8Var.d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }

    public abstract vy n();

    public Signature o(obg obgVar) throws NoSuchAlgorithmException, HandshakeFailureAlert, InvalidAlgorithmParameterException {
        wc wcVar = (wc) this.d;
        if (obgVar.equals(obg.rsa_pss_rsae_sha256)) {
            try {
                Signature signature = Signature.getInstance(wcVar.get(256));
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
                return signature;
            } catch (InvalidAlgorithmParameterException e) {
                throw new RuntimeException(e);
            } catch (NoSuchAlgorithmException unused) {
                s();
                throw null;
            }
        }
        if (obgVar.equals(obg.rsa_pss_rsae_sha384)) {
            try {
                Signature signature2 = Signature.getInstance(wcVar.get(384));
                signature2.setParameter(new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
                return signature2;
            } catch (InvalidAlgorithmParameterException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchAlgorithmException unused2) {
                s();
                throw null;
            }
        }
        if (obgVar.equals(obg.rsa_pss_rsae_sha512)) {
            try {
                Signature signature3 = Signature.getInstance(wcVar.get(512));
                signature3.setParameter(new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
                return signature3;
            } catch (InvalidAlgorithmParameterException e3) {
                throw new RuntimeException(e3);
            } catch (NoSuchAlgorithmException unused3) {
                s();
                throw null;
            }
        }
        if (obgVar.equals(obg.ecdsa_secp256r1_sha256)) {
            try {
                return Signature.getInstance("SHA256withECDSA");
            } catch (NoSuchAlgorithmException unused4) {
                throw new RuntimeException("Missing SHA256withECDSA support");
            }
        }
        if (obgVar.equals(obg.ecdsa_secp384r1_sha384)) {
            try {
                return Signature.getInstance("SHA384withECDSA");
            } catch (NoSuchAlgorithmException unused5) {
                throw new RuntimeException("Missing SHA384withECDSA support");
            }
        }
        if (obgVar.equals(obg.ecdsa_secp521r1_sha512)) {
            try {
                return Signature.getInstance("SHA512withECDSA");
            } catch (NoSuchAlgorithmException unused6) {
                throw new RuntimeException("Missing SHA512withECDSA support");
            }
        }
        throw new HandshakeFailureAlert("Signature algorithm not supported " + obgVar);
    }

    public String p() {
        return (String) ((bwf) this.c).getValue();
    }

    public abstract boolean r(byte[] bArr);

    public void t() throws InterruptedException {
        try {
            fl9 fl9VarK = k();
            int serializedSize = fl9VarK.getSerializedSize();
            if (serializedSize == 0) {
                vy vyVarN = n();
                if (vyVarN.c.delete() && vyVarN.d.delete()) {
                    vyVarN.e.delete();
                    return;
                }
                return;
            }
            if (((byte[]) this.d).length < serializedSize) {
                this.d = new byte[serializedSize];
            }
            fl9.toByteArray(fl9VarK, (byte[]) this.d, 0, serializedSize);
            String strP = p();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, strP, "saveProtoToFile " + ((List) ((AtomicReference) this.b).get()).size() + ", " + serializedSize + "bytes", null);
                }
            }
            vy vyVarN2 = n();
            FileOutputStream fileOutputStreamF = vyVarN2.f();
            if (fileOutputStreamF == null) {
                return;
            }
            try {
                fileOutputStreamF.write((byte[]) this.d, 0, serializedSize);
                vyVarN2.b(fileOutputStreamF);
            } catch (Throwable th) {
                vyVarN2.a(fileOutputStreamF);
                throw th;
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th2) {
            wqi.e(p(), "failed to save state", th2);
        }
    }

    public void v(int i) {
        while (!((LinkedList) this.c).isEmpty() && ((vbi) ((LinkedList) this.c).getLast()).a() >= i) {
            ((LinkedList) this.c).removeLast();
        }
    }

    public void w(Bundle bundle, vbi vbiVar) {
        if (((y38) this.a) != null) {
            vbiVar.b();
            return;
        }
        if (((LinkedList) this.c) == null) {
            this.c = new LinkedList();
        }
        ((LinkedList) this.c).add(vbiVar);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        l((kme) this.d);
    }

    public ds4(k18 k18Var) {
        this.a = k18Var;
        this.b = new AtomicReference(hd5.a);
        this.c = new bwf(new t0a(this));
        this.d = new byte[1];
    }
}

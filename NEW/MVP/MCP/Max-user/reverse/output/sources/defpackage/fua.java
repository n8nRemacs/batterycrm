package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class fua implements qy, et0, zua {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public static final byte[] o = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] X = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    public fua(Context context) {
        this.a = 9;
        this.c = 0;
        this.d = context;
    }

    public static void g(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(uni.a(i2));
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        View view2 = (View) this.d;
        int i = g4iVar.a.f(7).b;
        int i2 = this.b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return g4iVar;
    }

    @Override // defpackage.qy, defpackage.et0
    public int a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.qy, defpackage.et0
    public int b() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.qy, defpackage.et0
    public int c() {
        switch (this.a) {
            case 2:
                int i = this.b;
                return i == -1 ? ((qyg) this.d).v() : i;
            default:
                int i2 = this.b;
                return i2 == -1 ? ((umb) this.d).B() : i2;
        }
    }

    public void d(kqb kqbVar) throws IOException {
        File file = (File) this.d;
        int i = this.c + 1;
        this.c = i;
        if (i > this.b) {
            return;
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                nbj.b(parentFile);
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)));
            try {
                wha.e(dataOutputStream, kqbVar);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public void e(int i) {
        ut3 ut3Var = (ut3) this.d;
        int i2 = this.c;
        int i3 = this.b;
        pt3 pt3VarG = ut3Var.g(i2);
        switch (i3) {
            case 1:
                pt3VarG.d.F = i;
                return;
            case 2:
                pt3VarG.d.G = i;
                return;
            case 3:
                pt3VarG.d.H = i;
                return;
            case 4:
                pt3VarG.d.I = i;
                return;
            case 5:
                pt3VarG.d.L = i;
                return;
            case 6:
                pt3VarG.d.K = i;
                return;
            case 7:
                pt3VarG.d.J = i;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public long f() {
        long jRemaining = 0;
        for (int i = 0; i < this.c; i++) {
            jRemaining += ((ByteBuffer[]) this.d)[i].remaining();
        }
        return jRemaining;
    }

    public synchronized int h() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = k6i.a((Context) this.d).a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public synchronized int i() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (k6i.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.c = 2;
        return 2;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ByteBufferSet[" + Arrays.toString((ByteBuffer[]) this.d) + ":0:" + this.b + "]";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fua(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.d = obj;
        this.c = i2;
    }

    public fua(ByteBuffer[] byteBufferArr) {
        this.a = 4;
        int length = byteBufferArr.length;
        this.d = byteBufferArr;
        this.b = length;
        this.c = length;
        if (byteBufferArr.length < length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public fua(File file) {
        this.a = 1;
        this.d = file;
        feg fegVar = feg.a;
        Object obj = feg.c().get(t6d.a);
        irb irbVar = obj instanceof irb ? (irb) obj : null;
        this.b = (irbVar == null ? new irb(new bj(12)) : irbVar).b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fua(ByteBuffer byteBuffer) {
        this(new ByteBuffer[]{byteBuffer});
        this.a = 4;
    }

    public fua(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.a = 6;
        this.d = new ArrayList();
        this.c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), h6d.State);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == h6d.State_android_id) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == h6d.State_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new ut3().c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public fua(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.d = new fua[256];
                this.b = 0;
                this.c = 0;
                break;
        }
    }

    public fua(int i, int i2) {
        this.a = 7;
        this.d = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }

    public fua(ny nyVar, gf6 gf6Var) {
        this.a = 2;
        qyg qygVar = nyVar.c;
        this.d = qygVar;
        qygVar.E(12);
        int iV = qygVar.v();
        if ("audio/raw".equals(gf6Var.v0)) {
            int iU = xxg.u(gf6Var.K0, gf6Var.I0);
            if (iV == 0 || iV % iU != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(iU);
                sb.append(", stsz sample size: ");
                sb.append(iV);
                Log.w("AtomParsers", sb.toString());
                iV = iU;
            }
        }
        this.b = iV == 0 ? -1 : iV;
        this.c = qygVar.v();
    }

    public fua(q3a q3aVar, hf6 hf6Var) {
        this.a = 3;
        umb umbVar = q3aVar.c;
        this.d = umbVar;
        umbVar.J(12);
        int iB = umbVar.B();
        if ("audio/raw".equals(hf6Var.n)) {
            int iT = zxg.t(hf6Var.H) * hf6Var.F;
            if (iB == 0 || iB % iT != 0) {
                a8i.l("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iT + ", stsz sample size: " + iB);
                iB = iT;
            }
        }
        this.b = iB == 0 ? -1 : iB;
        this.c = umbVar.B();
    }
}

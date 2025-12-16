package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class cjb {
    public static final qt5[] a = new qt5[0];
    public static final qt5 b;
    public static final bei c;
    public static final bei d;

    static {
        qt5 qt5Var = new qt5("vision.barcode", 1L);
        b = qt5Var;
        qt5 qt5Var2 = new qt5("vision.custom.ica", 1L);
        qt5 qt5Var3 = new qt5("vision.face", 1L);
        qt5 qt5Var4 = new qt5("vision.ica", 1L);
        qt5 qt5Var5 = new qt5("vision.ocr", 1L);
        qt5 qt5Var6 = new qt5("mlkit.langid", 1L);
        qt5 qt5Var7 = new qt5("mlkit.nlclassifier", 1L);
        qt5 qt5Var8 = new qt5("tflite_dynamite", 1L);
        qt5 qt5Var9 = new qt5("mlkit.barcode.ui", 1L);
        qt5 qt5Var10 = new qt5("mlkit.smartreply", 1L);
        lk6 lk6Var = new lk6(27, (byte) 0);
        lk6Var.a0("barcode", qt5Var);
        lk6Var.a0("custom_ica", qt5Var2);
        lk6Var.a0("face", qt5Var3);
        lk6Var.a0("ica", qt5Var4);
        lk6Var.a0("ocr", qt5Var5);
        lk6Var.a0("langid", qt5Var6);
        lk6Var.a0("nlclassifier", qt5Var7);
        lk6Var.a0("tflite_dynamite", qt5Var8);
        lk6Var.a0("barcode_ui", qt5Var9);
        lk6Var.a0("smart_reply", qt5Var10);
        cdi cdiVar = (cdi) lk6Var.d;
        if (cdiVar != null) {
            throw cdiVar.a();
        }
        bei beiVarA = bei.a(lk6Var.b, (Object[]) lk6Var.c, lk6Var);
        cdi cdiVar2 = (cdi) lk6Var.d;
        if (cdiVar2 != null) {
            throw cdiVar2.a();
        }
        c = beiVarA;
        lk6 lk6Var2 = new lk6(27, (byte) 0);
        lk6Var2.a0("com.google.android.gms.vision.barcode", qt5Var);
        lk6Var2.a0("com.google.android.gms.vision.custom.ica", qt5Var2);
        lk6Var2.a0("com.google.android.gms.vision.face", qt5Var3);
        lk6Var2.a0("com.google.android.gms.vision.ica", qt5Var4);
        lk6Var2.a0("com.google.android.gms.vision.ocr", qt5Var5);
        lk6Var2.a0("com.google.android.gms.mlkit.langid", qt5Var6);
        lk6Var2.a0("com.google.android.gms.mlkit.nlclassifier", qt5Var7);
        lk6Var2.a0("com.google.android.gms.tflite_dynamite", qt5Var8);
        lk6Var2.a0("com.google.android.gms.mlkit_smartreply", qt5Var10);
        cdi cdiVar3 = (cdi) lk6Var2.d;
        if (cdiVar3 != null) {
            throw cdiVar3.a();
        }
        bei beiVarA2 = bei.a(lk6Var2.b, (Object[]) lk6Var2.c, lk6Var2);
        cdi cdiVar4 = (cdi) lk6Var2.d;
        if (cdiVar4 != null) {
            throw cdiVar4.a();
        }
        d = beiVarA2;
    }

    public static void a(Context context, List list) {
        ybj ybjVarB;
        uv6.b.getClass();
        if (uv6.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        qt5[] qt5VarArrB = b(c, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new l3j(qt5VarArrB, 0));
        s5j.a("APIs must not be empty.", !arrayList.isEmpty());
        bci bciVar = new bci(context, bci.l, el.e, rv6.c);
        bm bmVarB = bm.b(arrayList, true);
        if (bmVarB.a.isEmpty()) {
            ybjVarB = n5e.f(new b2a(0, false));
        } else {
            rs0 rs0VarE = mg7.e();
            rs0VarE.e = new qt5[]{koi.a};
            rs0VarE.c = true;
            rs0VarE.b = 27304;
            rs0VarE.d = new nud(bciVar, bmVarB);
            ybjVarB = bciVar.b(0, rs0VarE.e());
        }
        ybjVarB.j(new slf());
    }

    public static qt5[] b(bei beiVar, List list) {
        qt5[] qt5VarArr = new qt5[list.size()];
        for (int i = 0; i < list.size(); i++) {
            qt5 qt5Var = (qt5) beiVar.get(list.get(i));
            s5j.g(qt5Var);
            qt5VarArr[i] = qt5Var;
        }
        return qt5VarArr;
    }
}

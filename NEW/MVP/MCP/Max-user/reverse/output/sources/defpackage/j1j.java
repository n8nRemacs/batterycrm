package defpackage;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j1j implements r0j {
    public final l18 a;
    public final o0j b;

    public j1j(Context context, o0j o0jVar) {
        this.b = o0jVar;
        dy0 dy0Var = dy0.e;
        mig.b(context);
        jig jigVarC = mig.a().c(dy0Var);
        if (dy0.d.contains(new gf5("json"))) {
            new l18(new f1j(jigVarC, 0));
        }
        this.a = new l18(new f1j(jigVarC, 1));
    }

    @Override // defpackage.r0j
    public final void a(wib wibVar) {
        qdi qdiVar;
        pqa pqaVar;
        kig kigVar = (kig) this.a.get();
        rha rhaVar = rha.C0;
        u5i u5iVar = (u5i) wibVar.b;
        ((cyi) wibVar.c).h = false;
        cyi cyiVar = (cyi) wibVar.c;
        cyiVar.f = Boolean.FALSE;
        u5iVar.a = new lyi(cyiVar);
        try {
            u1j.v();
            qti qtiVar = new qti(u5iVar);
            sa9 sa9Var = new sa9(19);
            rhaVar.m(sa9Var);
            HashMap map = new HashMap((HashMap) sa9Var.a);
            HashMap map2 = new HashMap((HashMap) sa9Var.b);
            odi odiVar = (odi) sa9Var.c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                qdiVar = new qdi(byteArrayOutputStream, map, map2, odiVar);
                pqaVar = (pqa) map.get(qti.class);
            } catch (IOException unused) {
            }
            if (pqaVar == null) {
                throw new EncodingException("No encoder for ".concat(String.valueOf(qti.class)));
            }
            pqaVar.a(qtiVar, qdiVar);
            kigVar.a(new aa0(byteArrayOutputStream.toByteArray(), l9c.b, null));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}

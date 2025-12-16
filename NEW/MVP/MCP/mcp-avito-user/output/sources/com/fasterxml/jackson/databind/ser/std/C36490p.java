package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.net.InetAddress;

/* compiled from: InetAddressSerializer.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36490p extends L<InetAddress> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f342385d;

    public C36490p(boolean z12) {
        super(InetAddress.class);
        this.f342385d = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // com.fasterxml.jackson.databind.ser.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A r2, com.fasterxml.jackson.databind.c r3) {
        /*
            r1 = this;
            java.lang.Class<T> r0 = r1.f342353b
            com.fasterxml.jackson.annotation.JsonFormat$b r2 = com.fasterxml.jackson.databind.ser.std.M.l(r2, r3, r0)
            if (r2 == 0) goto L16
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.f340948c
            boolean r3 = r2.a()
            if (r3 != 0) goto L14
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.f340935e
            if (r2 != r3) goto L16
        L14:
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            boolean r3 = r1.f342385d
            if (r2 == r3) goto L21
            com.fasterxml.jackson.databind.ser.std.p r3 = new com.fasterxml.jackson.databind.ser.std.p
            r3.<init>(r2)
            return r3
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.C36490p.a(com.fasterxml.jackson.databind.A, com.fasterxml.jackson.databind.c):com.fasterxml.jackson.databind.l");
    }

    @Override // com.fasterxml.jackson.databind.l
    public final /* bridge */ /* synthetic */ void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        p((InetAddress) obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        InetAddress inetAddress = (InetAddress) obj;
        WritableTypeId writableTypeIdD = oVar.d(JsonToken.VALUE_STRING, inetAddress);
        writableTypeIdD.f341265b = InetAddress.class;
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, writableTypeIdD);
        p(inetAddress, jsonGenerator);
        oVar.f(jsonGenerator, writableTypeIdE);
    }

    public final void p(InetAddress inetAddress, JsonGenerator jsonGenerator) {
        String strTrim;
        if (this.f342385d) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : strTrim.substring(0, iIndexOf);
            }
        }
        jsonGenerator.i0(strTrim);
    }

    public C36490p() {
        this(false);
    }
}

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* compiled from: InetSocketAddressSerializer.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36491q extends L<InetSocketAddress> {
    public C36491q() {
        super(InetSocketAddress.class);
    }

    public static void p(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator) {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = "[" + hostName.substring(1) + "]";
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        StringBuilder sbZ = androidx.appcompat.app.r.z(hostName, ":");
        sbZ.append(inetSocketAddress.getPort());
        jsonGenerator.i0(sbZ.toString());
    }

    @Override // com.fasterxml.jackson.databind.l
    public final /* bridge */ /* synthetic */ void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        p((InetSocketAddress) obj, jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
        WritableTypeId writableTypeIdD = oVar.d(JsonToken.VALUE_STRING, inetSocketAddress);
        writableTypeIdD.f341265b = InetSocketAddress.class;
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, writableTypeIdD);
        p(inetSocketAddress, jsonGenerator);
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}

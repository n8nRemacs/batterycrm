package com.fasterxml.jackson.databind.type;

import androidx.media3.common.C23088b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* compiled from: TypeParser.java */
/* loaded from: classes4.dex */
public class p implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final n f342508b;

    /* compiled from: TypeParser.java */
    public static final class a extends StringTokenizer {

        /* renamed from: b, reason: collision with root package name */
        public final String f342509b;

        /* renamed from: c, reason: collision with root package name */
        public int f342510c;

        /* renamed from: d, reason: collision with root package name */
        public String f342511d;

        public a(String str) {
            super(str, "<,>", true);
            this.f342509b = str;
        }

        @Override // java.util.StringTokenizer
        public final boolean hasMoreTokens() {
            return this.f342511d != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public final String nextToken() {
            String str = this.f342511d;
            if (str != null) {
                this.f342511d = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this.f342510c = strNextToken.length() + this.f342510c;
            return strNextToken.trim();
        }
    }

    public p(n nVar) {
        this.f342508b = nVar;
    }

    public static IllegalArgumentException a(a aVar, String str) {
        int i12 = aVar.f342510c;
        String str2 = aVar.f342509b;
        StringBuilder sbB = C23088b.b("Failed to parse type '", str2, "' (remaining: '", str2.substring(i12), "'): ");
        sbB.append(str);
        return new IllegalArgumentException(sbB.toString());
    }

    public final com.fasterxml.jackson.databind.h b(a aVar) {
        n nVar = this.f342508b;
        if (!aVar.hasMoreTokens()) {
            throw a(aVar, "Unexpected end-of-string");
        }
        String strNextToken = aVar.nextToken();
        try {
            Class<?> clsM = n.m(strNextToken);
            if (aVar.hasMoreTokens()) {
                String strNextToken2 = aVar.nextToken();
                if ("<".equals(strNextToken2)) {
                    ArrayList arrayList = new ArrayList();
                    while (aVar.hasMoreTokens()) {
                        arrayList.add(b(aVar));
                        if (!aVar.hasMoreTokens()) {
                            break;
                        }
                        String strNextToken3 = aVar.nextToken();
                        if (">".equals(strNextToken3)) {
                            com.fasterxml.jackson.databind.h[] hVarArr = m.f342468g;
                            if (!arrayList.isEmpty()) {
                                hVarArr = (com.fasterxml.jackson.databind.h[]) arrayList.toArray(hVarArr);
                            }
                            return nVar.c(null, clsM, m.c(clsM, hVarArr));
                        }
                        if (!",".equals(strNextToken3)) {
                            throw a(aVar, "Unexpected token '" + strNextToken3 + "', expected ',' or '>')");
                        }
                    }
                    throw a(aVar, "Unexpected end-of-string");
                }
                aVar.f342511d = strNextToken2;
            }
            return nVar.c(null, clsM, m.f342469h);
        } catch (Exception e12) {
            com.fasterxml.jackson.databind.util.g.F(e12);
            throw a(aVar, "Cannot locate class '" + strNextToken + "', problem: " + e12.getMessage());
        }
    }
}

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;

/* compiled from: MinimalClassNameIdResolver.java */
/* loaded from: classes4.dex */
public class m extends k {

    /* renamed from: d, reason: collision with root package name */
    public final String f342150d;

    /* renamed from: e, reason: collision with root package name */
    public final String f342151e;

    public m(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.type.n nVar, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(hVar, nVar, polymorphicTypeValidator);
        String name = hVar.f341930b.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.f342150d = "";
            this.f342151e = ".";
        } else {
            this.f342151e = name.substring(0, iLastIndexOf + 1);
            this.f342150d = name.substring(0, iLastIndexOf);
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.k, com.fasterxml.jackson.databind.jsontype.m
    public final String a(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.f342151e) ? name.substring(r0.length() - 1) : name;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.k
    public final com.fasterxml.jackson.databind.h g(com.fasterxml.jackson.databind.f fVar, String str) {
        if (str.startsWith(".")) {
            int length = str.length();
            String str2 = this.f342150d;
            StringBuilder sb2 = new StringBuilder(str2.length() + length);
            if (str2.isEmpty()) {
                sb2.append(str.substring(1));
            } else {
                sb2.append(str2);
                sb2.append(str);
            }
            str = sb2.toString();
        }
        return super.g(fVar, str);
    }
}

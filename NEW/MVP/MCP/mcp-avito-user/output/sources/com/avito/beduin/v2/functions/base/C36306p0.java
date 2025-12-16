package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import kotlin.Metadata;

/* compiled from: NumbersOnlyFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/p0;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.functions.base.p0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36306p0 extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C36306p0 f337109a = new C36306p0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f337110b = "NumbersOnly";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) throws BeduinPropertyException {
        String strW = mVar.w(zVar, "value");
        String strSubstring = "";
        if (strW == null) {
            strW = "";
        }
        StringBuilder sb2 = new StringBuilder();
        int length = strW.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = strW.charAt(i13);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        int length2 = string.length();
        while (true) {
            if (i12 >= length2) {
                break;
            }
            if (string.charAt(i12) != '0') {
                strSubstring = string.substring(i12);
                break;
            }
            i12++;
        }
        if (strSubstring.length() <= 0) {
            strSubstring = null;
        }
        if (strSubstring == null) {
            strSubstring = "0";
        }
        return C36273j.e(zVar, strSubstring);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    public final String getType() {
        return f337110b;
    }
}

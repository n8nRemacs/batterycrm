package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.C39173uf;
import java.util.Currency;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.h3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38843h3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final T21.b f380676a;

    public C38843h3(@j.N T21.b bVar) {
        this.f380676a = bVar;
    }

    @j.N
    public byte[] a() {
        String currencyCode;
        T21.b bVar = this.f380676a;
        C39173uf c39173uf = new C39173uf();
        c39173uf.f381936a = bVar.f15325c;
        c39173uf.f381942g = bVar.f15326d;
        try {
            currencyCode = Currency.getInstance(bVar.f15327e).getCurrencyCode();
        } catch (Throwable unused) {
            currencyCode = "";
        }
        c39173uf.f381938c = currencyCode.getBytes();
        c39173uf.f381939d = bVar.f15324b.getBytes();
        C39173uf.a aVar = new C39173uf.a();
        aVar.f381948a = bVar.f15336n.getBytes();
        aVar.f381949b = bVar.f15332j.getBytes();
        c39173uf.f381941f = aVar;
        c39173uf.f381943h = true;
        c39173uf.f381944i = 1;
        com.yandex.metrica.billing_interface.e eVar = bVar.f15323a;
        c39173uf.f381945j = eVar.ordinal() == 1 ? 2 : 1;
        C39173uf.c cVar = new C39173uf.c();
        cVar.f381959a = bVar.f15333k.getBytes();
        cVar.f381960b = TimeUnit.MILLISECONDS.toSeconds(bVar.f15334l);
        c39173uf.f381946k = cVar;
        if (eVar == com.yandex.metrica.billing_interface.e.f377620c) {
            C39173uf.b bVar2 = new C39173uf.b();
            bVar2.f381950a = bVar.f15335m;
            com.yandex.metrica.billing_interface.c cVar2 = bVar.f15331i;
            if (cVar2 != null) {
                bVar2.f381951b = a(cVar2);
            }
            C39173uf.b.a aVar2 = new C39173uf.b.a();
            aVar2.f381953a = bVar.f15328f;
            com.yandex.metrica.billing_interface.c cVar3 = bVar.f15329g;
            if (cVar3 != null) {
                aVar2.f381954b = a(cVar3);
            }
            aVar2.f381955c = bVar.f15330h;
            bVar2.f381952c = aVar2;
            c39173uf.f381947l = bVar2;
        }
        return MessageNano.toByteArray(c39173uf);
    }

    @j.N
    private C39173uf.b.C10963b a(@j.N com.yandex.metrica.billing_interface.c cVar) {
        C39173uf.b.C10963b c10963b = new C39173uf.b.C10963b();
        c10963b.f381957a = cVar.f377611a;
        int iOrdinal = cVar.f377612b.ordinal();
        int i12 = 1;
        if (iOrdinal != 1) {
            i12 = 2;
            if (iOrdinal != 2) {
                i12 = 3;
                if (iOrdinal != 3) {
                    i12 = 4;
                    if (iOrdinal != 4) {
                        i12 = 0;
                    }
                }
            }
        }
        c10963b.f381958b = i12;
        return c10963b;
    }
}

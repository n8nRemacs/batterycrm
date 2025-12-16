package com.avito.android.select.sectioned_multiselect.core;

import cE.C27025b;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: SectionedMultiselectDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZp0/e;", "it", "Lkotlin/G0;", "accept", "(LZp0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.sectioned_multiselect.core.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34663m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f266675b;

    public C34663m(K k12) {
        this.f266675b = k12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C34656f c34656f;
        Zp0.e eVar = (Zp0.e) obj;
        K k12 = this.f266675b;
        boolean f266525r = k12.f266482g.getF266525R();
        C27025b c27025b = k12.f266488m;
        c27025b.getClass();
        kotlin.reflect.n<Object> nVar = C27025b.f57796d[1];
        boolean zBooleanValue = ((Boolean) c27025b.f57798c.a().invoke()).booleanValue();
        List<ParcelableEntity<String>> list = eVar.f20507a;
        if (zBooleanValue && C43066x.K(k12.f266491p) && !f266525r) {
            ArrayList arrayListC = k12.f266481f.c(list);
            P p12 = k12.f266482g;
            p12.T4(eVar.f20508b);
            p12.G6(arrayListC);
        }
        k12.f266492q = k12.f266491p;
        C34656f c34656f2 = k12.f266489n;
        if (c34656f2 != null) {
            c34656f2.b(false);
        }
        if (C43066x.K(k12.f266491p)) {
            C34656f c34656f3 = k12.f266489n;
            if (c34656f3 != null) {
                c34656f3.c(false);
            }
            C34656f c34656f4 = k12.f266489n;
            if (c34656f4 != null) {
                D6.w(c34656f4.f266647h);
            }
            C34656f c34656f5 = k12.f266489n;
            if (c34656f5 != null) {
                c34656f5.a(true);
            }
        } else {
            K.g(k12, eVar);
        }
        if (!list.isEmpty() || (c34656f = k12.f266489n) == null) {
            return;
        }
        c34656f.b(true);
    }
}

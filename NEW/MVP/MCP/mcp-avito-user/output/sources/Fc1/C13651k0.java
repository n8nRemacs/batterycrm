package Fc1;

import Fc1.W4;
import android.app.Application;
import javax.inject.Inject;

/* renamed from: Fc1.k0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13651k0 implements Cb1.j {

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public final C13641j f5621b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public final C13729s7 f5622c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public final Q f5623d;

    /* JADX WARN: Multi-variable type inference failed */
    public C13651k0(@Y61.k Application application, @Y61.k String str, @Y61.k Cb1.h hVar, @Y61.l com.avito.android.ux.feedback.impl.q qVar) {
        if (W4.a.f5280a == null) {
            C13757w c13757w = new C13757w(hVar);
            C13729s7 c13729s7 = new C13729s7();
            c13729s7.f5825a = qVar;
            W4.a.f5280a = new X6(new U5(), application, str, c13757w, c13729s7, new K7());
        }
        X6 x62 = W4.a.f5280a;
        x62 = x62 == null ? null : x62;
        this.f5621b = (C13641j) x62.f5327i.get();
        this.f5622c = x62.f5320b;
        this.f5623d = (Q) x62.f5323e.get();
    }
}

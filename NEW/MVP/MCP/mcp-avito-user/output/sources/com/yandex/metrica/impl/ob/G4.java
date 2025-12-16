package com.yandex.metrica.impl.ob;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public class G4 extends K4<M4> {

    /* renamed from: a, reason: collision with root package name */
    private final C39163u5 f378173a;

    public G4(F3 f32) {
        this.f378173a = new C39163u5(f32);
    }

    @Override // com.yandex.metrica.impl.ob.K4
    public H4 a(int i12) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC38666a1.a(i12).ordinal();
        if (iOrdinal == 16) {
            arrayList.add(this.f378173a.a());
        } else if (iOrdinal == 24) {
            arrayList.add(this.f378173a.b());
        } else if (iOrdinal == 47) {
            arrayList.add(this.f378173a.c());
        }
        return new H4(arrayList);
    }
}

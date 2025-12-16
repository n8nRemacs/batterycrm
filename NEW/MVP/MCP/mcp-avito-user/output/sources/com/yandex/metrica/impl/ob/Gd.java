package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class Gd implements Ad {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f378184a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f378185b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38987mn f378186c;

    public Gd(@j.N Context context, @j.N String str, @j.N C38987mn c38987mn) {
        this.f378184a = context;
        this.f378185b = str;
        this.f378186c = c38987mn;
    }

    @Override // com.yandex.metrica.impl.ob.Ad
    @j.N
    public List<Bd> a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo packageInfoB = this.f378186c.b(this.f378184a, this.f378185b, 4096);
        if (packageInfoB != null) {
            for (String str : packageInfoB.requestedPermissions) {
                arrayList.add(new Bd(str, true));
            }
        }
        return arrayList;
    }
}

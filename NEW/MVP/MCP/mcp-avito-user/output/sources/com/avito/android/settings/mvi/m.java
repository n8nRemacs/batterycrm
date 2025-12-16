package com.avito.android.settings.mvi;

import com.avito.android.remote.H;
import com.avito.android.remote.model.Location;
import com.avito.android.settings.adapter.i0;
import com.avito.android.util.C;
import jJ.InterfaceC42261a;
import java.util.ArrayList;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import ur.InterfaceC49101b;

/* compiled from: SettingsItemsProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/mvi/m;", "Lcom/avito/android/settings/mvi/l;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.settings.k f280939a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.util.darkTheme.a f280940b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f280941c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H f280942d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C f280943e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f280944f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42261a f280945g;

    @Inject
    public m(@Y61.k com.avito.android.settings.k kVar, @Y61.k com.avito.android.lib.util.darkTheme.a aVar, @Y61.k String str, @Y61.k H h12, @Y61.k C c12, @Y61.k InterfaceC49101b interfaceC49101b, @Y61.k InterfaceC42261a interfaceC42261a) {
        this.f280939a = kVar;
        this.f280940b = aVar;
        this.f280941c = str;
        this.f280942d = h12;
        this.f280943e = c12;
        this.f280944f = interfaceC49101b;
        this.f280945g = interfaceC42261a;
    }

    public static final void b(ArrayList arrayList, l0.f fVar) {
        StringBuilder sb2 = new StringBuilder("divider_");
        int i12 = fVar.f406840b;
        fVar.f406840b = i12 + 1;
        sb2.append(i12);
        arrayList.add(new i0.c(sb2.toString()));
    }

    @Override // com.avito.android.settings.mvi.l
    @Y61.k
    public final ArrayList a(@Y61.l Location location, boolean z12, boolean z13, @Y61.l com.avito.android.replace_main.toggle.d dVar) {
        String strV;
        ArrayList arrayList = new ArrayList();
        l0.f fVar = new l0.f();
        fVar.f406840b = 1;
        com.avito.android.settings.k kVar = this.f280939a;
        arrayList.add(new i0.i("location", kVar.a(), location != null ? location.getTitle() : null));
        if (dVar != null) {
            b(arrayList, fVar);
            arrayList.add(new i0.h(dVar));
        }
        b(arrayList, fVar);
        arrayList.add(new i0.d("notifications", kVar.j()));
        b(arrayList, fVar);
        arrayList.add(new i0.e(kVar.h(), z12));
        b(arrayList, fVar);
        arrayList.add(new i0.f("uiTheme", kVar.f(), kVar.e(this.f280940b.a())));
        if (this.f280944f.c()) {
            b(arrayList, fVar);
            String strM = kVar.m();
            String displayLanguage = this.f280945g.P4().getDisplayLanguage();
            if (displayLanguage.length() > 0) {
                displayLanguage = ((Object) String.valueOf(displayLanguage.charAt(0)).toUpperCase(Locale.ROOT)) + displayLanguage.substring(1);
            }
            arrayList.add(new i0.f("languageSelector", strM, displayLanguage));
        }
        b(arrayList, fVar);
        arrayList.add(new i0.d("b2b_hub", kVar.q()));
        b(arrayList, fVar);
        arrayList.add(new i0.d("avitoCare", kVar.p()));
        b(arrayList, fVar);
        arrayList.add(new i0.a("about", kVar.g()));
        arrayList.add(new i0.d("helpCenter", kVar.d()));
        b(arrayList, fVar);
        arrayList.add(new i0.a("licenceAndAgreements", kVar.s()));
        arrayList.add(new i0.d("userAgreement", kVar.y()));
        arrayList.add(new i0.d("offer", kVar.t()));
        arrayList.add(new i0.d("appsLicence", kVar.l()));
        arrayList.add(new i0.d("osLicences", kVar.n()));
        arrayList.add(new i0.d("recTechnologies", kVar.k()));
        if (z13) {
            strV = kVar.b(this.f280942d.getF253025a());
        } else {
            C c12 = this.f280943e;
            int iA2 = c12.getF125492l();
            String str = c12.d().f318563a;
            if (str == null) {
                str = "";
            }
            strV = kVar.v(iA2, this.f280941c, str);
        }
        arrayList.add(new i0.g(strV));
        return arrayList;
    }
}

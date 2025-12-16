package com.avito.android.profile_settings_extended.carousel;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile_settings_extended.adapter.carousel.ExtendedSettingsCarouselItem;
import com.avito.android.profile_settings_extended.analytics.ExtendedProfileCarouselWarningShowEvent;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.android.remote.D0;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ExtendedProfileSettingsCarouselInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/carousel/c;", "Lcom/avito/android/profile_settings_extended/carousel/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<D0> f230014a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<Gson> f230015b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f230016c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashSet f230017d = new LinkedHashSet();

    @Inject
    public c(@k h31.e<D0> eVar, @k h31.e<Gson> eVar2, @k InterfaceC28373a interfaceC28373a) {
        this.f230014a = eVar;
        this.f230015b = eVar2;
        this.f230016c = interfaceC28373a;
    }

    @Override // com.avito.android.profile_settings_extended.carousel.a
    public final void a(@k List<ExtendedSettingsCarouselItem> list) {
        for (ExtendedSettingsCarouselItem extendedSettingsCarouselItem : list) {
            ExtendedSettingsCarouselItem.Carousel carousel = extendedSettingsCarouselItem.f229286g;
            if (carousel != null) {
                LinkedHashSet linkedHashSet = this.f230017d;
                if (!linkedHashSet.contains(carousel.f229289b)) {
                    int i12 = extendedSettingsCarouselItem.f229285f.f230260h;
                    ExtendedSettingsCarouselItem.Carousel carousel2 = extendedSettingsCarouselItem.f229286g;
                    Iterator<T> it = carousel2.f229292e.iterator();
                    int i13 = 0;
                    while (it.hasNext()) {
                        ExtendedProfileSettingsAdvert.Status status = ((ExtendedProfileSettingsAdvert) it.next()).f230273h;
                        if (status.f230278b < 10) {
                            if (!L.f(status.f230280d, Boolean.TRUE)) {
                                i13++;
                            }
                        }
                    }
                    InterfaceC28373a interfaceC28373a = this.f230016c;
                    if (i13 < i12) {
                        ExtendedProfileCarouselWarningShowEvent.f229979c.getClass();
                        interfaceC28373a.c(new ExtendedProfileCarouselWarningShowEvent(ExtendedProfileCarouselWarningShowEvent.WarningType.f229982d, null));
                    } else if (i13 < carousel2.f229292e.size()) {
                        ExtendedProfileCarouselWarningShowEvent.f229979c.getClass();
                        interfaceC28373a.c(new ExtendedProfileCarouselWarningShowEvent(ExtendedProfileCarouselWarningShowEvent.WarningType.f229981c, null));
                    }
                    linkedHashSet.add(carousel2.f229289b);
                }
            }
        }
    }

    @Override // com.avito.android.profile_settings_extended.carousel.a
    public final void b() {
        this.f230017d.clear();
    }

    @Override // com.avito.android.profile_settings_extended.carousel.a
    @k
    public final InterfaceC43160i c(@k String str, @k String str2, int i12, @k ArrayList arrayList, boolean z12) {
        return C43175k.G(new b(str, z12, this, str2, i12, arrayList, null));
    }
}

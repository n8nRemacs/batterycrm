package com.avito.android.remote.di;

import com.avito.android.remote.model.ExtendedProfileBannerElement;
import com.avito.android.remote.model.ExtendedProfileBeduin;
import com.avito.android.remote.model.ExtendedProfileElement;
import com.avito.android.remote.model.ExtendedProfileGalleryElement;
import com.avito.android.remote.model.ExtendedProfileResultOk;
import com.avito.android.remote.parse.adapter.ExtendedProfileBannerElementTypeAdapter;
import com.avito.android.remote.parse.adapter.ExtendedProfileBeduinDeserializer;
import com.avito.android.remote.parse.adapter.ExtendedProfileElementTypeAdapter;
import com.avito.android.remote.parse.adapter.ExtendedProfileGalleryElementTypeAdapter;
import com.avito.android.remote.parse.adapter.ExtendedProfileTypeTypeAdapter;
import com.avito.android.util.X5;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ExtendedProfileJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/di/j;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class j implements dagger.internal.h<Set<X5>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final j f253369a = new j();

    @Override // javax.inject.Provider
    public final Object get() {
        h.f253367a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new X5(ExtendedProfileElement.class, new ExtendedProfileElementTypeAdapter()));
        linkedHashSet.add(new X5(ExtendedProfileGalleryElement.class, new ExtendedProfileGalleryElementTypeAdapter()));
        linkedHashSet.add(new X5(ExtendedProfileBannerElement.class, new ExtendedProfileBannerElementTypeAdapter()));
        linkedHashSet.add(new X5(ExtendedProfileResultOk.class, new ExtendedProfileTypeTypeAdapter()));
        linkedHashSet.add(new X5(ExtendedProfileBeduin.class, new ExtendedProfileBeduinDeserializer()));
        return linkedHashSet;
    }
}

package com.avito.android.location;

import com.avito.android.location.C31498b;
import com.avito.android.remote.model.CaseText;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SimpleLocation;
import kotlin.Metadata;

/* compiled from: FileLocation.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-location_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31499c {
    @Y61.k
    public static final Location a(@Y61.k C31498b c31498b) {
        SimpleLocation simpleLocation;
        CaseText caseText = new CaseText(c31498b.f181730b);
        C31498b.a aVar = c31498b.f181735g;
        if (aVar == null) {
            simpleLocation = null;
        } else {
            simpleLocation = new SimpleLocation(aVar.f181738a, new CaseText(aVar.f181739b));
        }
        return new Location(c31498b.f181729a, caseText, c31498b.f181731c, c31498b.f181732d, c31498b.f181733e, c31498b.f181734f, simpleLocation, null, false, c31498b.f181736h, c31498b.f181737i, null, 2432, null);
    }
}

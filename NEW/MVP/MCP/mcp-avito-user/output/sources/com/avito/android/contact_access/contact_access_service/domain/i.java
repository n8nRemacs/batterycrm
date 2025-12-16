package com.avito.android.contact_access.contact_access_service.domain;

import com.avito.android.remote.model.Profile;
import kotlin.Metadata;
import l41.o;

/* compiled from: IncompleteSocialInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/Profile;", "apply", "(Lcom/avito/android/remote/model/Profile;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class i<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final i<T, R> f125977b = new i<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Profile) obj).isIncomplete());
    }
}

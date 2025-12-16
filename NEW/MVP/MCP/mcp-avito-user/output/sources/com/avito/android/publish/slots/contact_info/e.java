package com.avito.android.publish.slots.contact_info;

import com.avito.android.remote.model.AuthResult;
import com.avito.android.remote.model.Profile;
import com.avito.android.util.C35783e4;
import kotlin.Metadata;
import l41.o;

/* compiled from: ContactInfoSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/AuthResult;", "authResult", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/Profile;", "apply", "(Lcom/avito/android/remote/model/AuthResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f243250b;

    public e(d dVar) {
        this.f243250b = dVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        d dVar = this.f243250b;
        dVar.f243238p = false;
        Profile profile = ((AuthResult) obj).getProfile();
        return dVar.f243229g.h(C35783e4.a(profile), null).B(profile).F();
    }
}

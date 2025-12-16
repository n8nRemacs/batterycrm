package com.avito.android.profile.edit;

import com.avito.android.remote.model.Profile;
import kotlin.Metadata;

/* compiled from: EditProfileInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/edit/V$b;", "it", "Lcom/avito/android/remote/model/Profile;", "apply", "(Lcom/avito/android/profile/edit/V$b;)Lcom/avito/android/remote/model/Profile;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.profile.edit.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33326g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33339t f222208b;

    public C33326g(C33339t c33339t) {
        this.f222208b = c33339t;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Profile profileA = this.f222208b.f222293a.getF222071e();
        if (profileA != null) {
            return profileA;
        }
        throw new IllegalStateException();
    }
}

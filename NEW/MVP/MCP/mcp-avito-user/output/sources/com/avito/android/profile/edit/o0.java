package com.avito.android.profile.edit;

import com.avito.android.profile.edit.h0;
import kotlin.Metadata;

/* compiled from: SaveProfileInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isConfirmedPhoneNumber", "Lcom/avito/android/profile/edit/h0;", "apply", "(Z)Lcom/avito/android/profile/edit/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class o0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f222232b;

    public o0(String str) {
        this.f222232b = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? new h0.a() : new h0.e(this.f222232b);
    }
}

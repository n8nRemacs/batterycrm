package com.avito.android.profile.edit.avatar;

import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.rx3.Q;
import l41.o;
import okhttp3.MultipartBody;

/* compiled from: AvatarInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lokhttp3/MultipartBody$Part;", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/Avatar;", "apply", "(Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f222063b;

    public g(d dVar) {
        this.f222063b = dVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return Q.a(EmptyCoroutineContext.INSTANCE, new f(this.f222063b, (MultipartBody.Part) obj, null));
    }
}

package com.avito.android.advert_core.messenger;

import com.avito.android.util.UnauthorizedException;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import kotlin.Metadata;
import l41.o;

/* compiled from: AdvertMessengerInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isAuthorized", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/Channel;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f83779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f83780c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f83781d;

    public b(f fVar, String str, String str2) {
        this.f83779b = fVar;
        this.f83780c = str;
        this.f83781d = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return I.l(new UnauthorizedException(null, 1, null));
        }
        return new C42007e(new c(this.f83779b, this.f83780c, this.f83781d, 1));
    }
}

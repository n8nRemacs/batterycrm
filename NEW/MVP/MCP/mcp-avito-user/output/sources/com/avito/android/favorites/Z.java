package com.avito.android.favorites;

import Ag.CallableC13028a;
import android.os.Bundle;
import com.avito.android.service.short_task.ShortTask;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoriteAdvertsTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/Z;", "Lcom/avito/android/service/short_task/ShortTask;", "a", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Z implements ShortTask {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f156339b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Bundle f156340c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final Bundle f156341d;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30704y f156342a;

    /* compiled from: FavoriteAdvertsTask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/favorites/Z$a;", "", "<init>", "()V", "", "KEY_UPLOAD_ONLY", "Ljava/lang/String;", "KEY_WIPE_LOCAL_ONLY", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FavoriteAdvertsTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/service/short_task/ShortTask$Status;", "apply", "(Lkotlin/G0;)Lcom/avito/android/service/short_task/ShortTask$Status;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f156343b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ShortTask.Status.f274030b;
        }
    }

    static {
        Bundle bundle = new Bundle();
        bundle.putBoolean("upload_only", true);
        f156340c = bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("wipe_local_only", true);
        f156341d = bundle2;
    }

    @Inject
    public Z(@Y61.k InterfaceC30704y interfaceC30704y) {
        this.f156342a = interfaceC30704y;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ShortTask.Status> start(@Y61.k Bundle bundle) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC13028a(13, this, bundle)).r(b.f156343b);
    }
}

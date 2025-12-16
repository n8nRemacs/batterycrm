package com.avito.android.app.task;

import android.net.Uri;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: MessengerPhotosCleaner.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/H0;", "Lcom/avito/android/app/task/G0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class H0 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f91455a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32200a f91456b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f91457c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f91458d;

    /* compiled from: MessengerPhotosCleaner.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/photo_cache/PhotoUpload;", "it", "Lcom/avito/android/remote/model/CloseableDataSource;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f91459b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return com.avito.android.util.Y.a((CloseableDataSource) obj);
        }
    }

    /* compiled from: MessengerPhotosCleaner.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photoUploads", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            H0 h02 = H0.this;
            long jNow = h02.f91455a.now() - TimeUnit.DAYS.toMillis(29L);
            InterfaceC32200a interfaceC32200a = h02.f91456b;
            interfaceC32200a.a(jNow);
            for (PhotoUpload photoUpload : (List) obj) {
                Uri uri = photoUpload.f216305g;
                if (uri == null || !interfaceC32200a.c(uri)) {
                    boolean zB2 = h02.f91457c.b(String.valueOf(photoUpload.f216300b));
                    V2.f318762a.i("MessengerPhotosCleaner", "Deleted invalid upload (" + zB2 + "): " + photoUpload.f216305g, null);
                }
            }
        }
    }

    /* compiled from: MessengerPhotosCleaner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f91461b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("MessengerPhotosCleaner", "Failed to clear photo storage", (Throwable) obj);
        }
    }

    @Inject
    public H0(@Y61.k com.avito.android.server_time.h hVar, @Y61.k InterfaceC32200a interfaceC32200a, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f91455a = hVar;
        this.f91456b = interfaceC32200a;
        this.f91457c = bVar;
        this.f91458d = interfaceC35745a5;
    }

    @Override // com.avito.android.app.task.G0
    public final void a() {
        io.reactivex.rxjava3.core.z<CloseableDataSource<? extends PhotoUpload>> zVarE = this.f91457c.e(NotificationsSettings.Section.SECTION_MESSENGER);
        InterfaceC35745a5 interfaceC35745a5 = this.f91458d;
        zVarE.j0(interfaceC35745a5.a()).d0(a.f91459b).P(C42784z0.f406748b).z(interfaceC35745a5.a()).x(new b(), c.f91461b);
    }
}

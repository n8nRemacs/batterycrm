package com.avito.android.publish.photo_picker;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ImageUploadResult;
import io.reactivex.rxjava3.core.I;
import java.io.File;
import kotlin.Metadata;
import kotlin.text.C43066x;
import l41.o;
import n80.InterfaceC44212a;
import okhttp3.MultipartBody;
import t80.InterfaceC48515a;

/* compiled from: PublishImageUploadInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/photo_picker/d;", "Ln80/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements InterfaceC44212a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC48515a f238257a;

    /* compiled from: PublishImageUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "it", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/ImageUploadResult;", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            File file = (File) obj;
            InterfaceC48515a interfaceC48515a = d.this.f238257a;
            MultipartBody.Part partA = com.avito.http.b.a(file, 3);
            String str = (String) N70.e.a(new androidx.exifinterface.media.a(file)).get("UserComment");
            return interfaceC48515a.c(partA, str != null ? C43066x.A0(str).toString() : null);
        }
    }

    /* compiled from: PublishImageUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/ImageUploadResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f238259b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((ImageUploadResult) obj).getUploadId();
        }
    }

    public d(@k InterfaceC48515a interfaceC48515a) {
        this.f238257a = interfaceC48515a;
    }

    @Override // n80.InterfaceC44212a
    @k
    public final I a(@k File file, @k String str) {
        return I.q(file).n(new a()).r(b.f238259b);
    }
}

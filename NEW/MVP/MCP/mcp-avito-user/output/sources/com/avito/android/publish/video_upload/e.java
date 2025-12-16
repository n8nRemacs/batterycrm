package com.avito.android.publish.video_upload;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.feature.OptionSet;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import zZ.C50528b;

/* compiled from: VideoUploadInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/video_upload/e;", "Lcom/avito/android/publish/video_upload/c;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements InterfaceC34148c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f245544e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H0 f245545a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245546b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f245547c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Q1 f245548d;

    /* compiled from: VideoUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/video_upload/e$a;", "", "<init>", "()V", "", "THROTTLE_DURATION_SM", "J", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@Y61.k H0 h02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ContentResolver contentResolver, @Y61.k Q1 q12) {
        this.f245545a = h02;
        this.f245546b = interfaceC35745a5;
        this.f245547c = contentResolver;
        this.f245548d = q12;
    }

    @Override // com.avito.android.publish.video_upload.InterfaceC34148c
    @Y61.k
    public final W d() {
        return this.f245545a.d().z(this.f245546b.a());
    }

    @Override // com.avito.android.publish.video_upload.InterfaceC34148c
    @Y61.k
    public final C41982q1 e(@Y61.k Uri uri, @Y61.k String str) {
        io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
        MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", uri.getLastPathSegment(), new C50528b(uri, this.f245547c, 0, "video/*", new h(eVar), 4, null));
        Q1 q12 = this.f245548d;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[12];
        I<ResponseBody> iJ2 = this.f245545a.j(((OptionSet) q12.f67500n.a().getValue()).f318873b, str, partCreateFormData);
        InterfaceC35745a5 interfaceC35745a5 = this.f245546b;
        return eVar.C0(100L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).J(new com.avito.android.beduin.common.component.file_uploader.data.f((io.reactivex.rxjava3.internal.observers.m) iJ2.s(interfaceC35745a5.e()).z(interfaceC35745a5.a()).x(new f(eVar), new g(eVar)), 1), io.reactivex.rxjava3.internal.functions.a.f401994d).x0(interfaceC35745a5.a());
    }

    @Override // com.avito.android.publish.video_upload.InterfaceC34148c
    @Y61.k
    public final G f(@Y61.k final Uri uri) {
        return new G(new Callable() { // from class: com.avito.android.publish.video_upload.d
            @Override // java.util.concurrent.Callable
            public final Object call() throws FileNotFoundException {
                int iAvailable;
                InputStream inputStreamOpenInputStream = this.f245542b.f245547c.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        iAvailable = inputStreamOpenInputStream.available();
                        kotlin.io.c.a(inputStreamOpenInputStream, null);
                    } finally {
                    }
                } else {
                    iAvailable = 0;
                }
                return Integer.valueOf(iAvailable);
            }
        });
    }
}

package com.avito.android.publish;

import android.net.Uri;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.StsRecognitionResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.imei_recognition.ImeiRecognitionResult;
import com.avito.android.util.P2;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.MultipartBody;

/* compiled from: ScannerInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/S0;", "Lcom/avito/android/publish/R0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class S0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.H0 f232072a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.W f232073b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.scanner.i f232074c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f232075d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f232076e;

    /* compiled from: ScannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/MultipartBody$Part;", "it", "Ljava/io/File;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f232077b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return com.avito.http.b.a((File) obj, 3);
        }
    }

    /* compiled from: ScannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lokhttp3/MultipartBody$Part;", "file", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StsRecognitionResult;", "apply", "(Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Navigation f232079c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f232080d;

        public b(Navigation navigation2, Map<String, String> map) {
            this.f232079c = navigation2;
            this.f232080d = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            S0 s02 = S0.this;
            return s02.f232072a.O((MultipartBody.Part) obj, (String) s02.f232073b.get(), s02.f232075d.convertToFieldMap(this.f232079c), this.f232080d);
        }
    }

    /* compiled from: ScannerInteractor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/StsRecognitionResult;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f232081b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new P2.b(((TypedResult.Success) typedResult).getResult());
            }
            if (typedResult instanceof TypedResult.Error) {
                return new P2.a(((TypedResult.Error) typedResult).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ScannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lokhttp3/MultipartBody$Part;", "it", "Ljava/io/File;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T, R> f232082b = new d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return com.avito.http.b.a((File) obj, 3);
        }
    }

    /* compiled from: ScannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lokhttp3/MultipartBody$Part;", "file", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult;", "apply", "(Lokhttp3/MultipartBody$Part;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Navigation f232084c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f232085d;

        public e(Navigation navigation2, Map<String, String> map) {
            this.f232084c = navigation2;
            this.f232085d = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            S0 s02 = S0.this;
            return s02.f232072a.R((MultipartBody.Part) obj, (String) s02.f232073b.get(), s02.f232075d.convertToFieldMap(this.f232084c), this.f232085d);
        }
    }

    /* compiled from: ScannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T, R> f232086b = new f<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b((ImeiRecognitionResult) obj);
        }
    }

    /* compiled from: ScannerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/imei_recognition/ImeiRecognitionResult;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements l41.o {
        public g() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.a(S0.this.f232076e.a((Throwable) obj));
        }
    }

    public S0(@Y61.k com.avito.android.remote.H0 h02, @Y61.k kotlin.jvm.internal.W w12, @Y61.k com.avito.android.publish.scanner.i iVar, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k com.avito.android.remote.error.f fVar) {
        this.f232072a = h02;
        this.f232073b = w12;
        this.f232074c = iVar;
        this.f232075d = categoryParametersConverter;
        this.f232076e = fVar;
    }

    @Override // com.avito.android.publish.R0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<StsRecognitionResult>> a(@Y61.k Uri uri, @Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters) {
        return new io.reactivex.rxjava3.internal.operators.mixed.x(this.f232074c.a(uri).d0(a.f232077b), new b(navigation2, this.f232075d.convertToFieldMap(categoryParameters.getParametersExceptOwnedBySlots()))).d0(c.f232081b).r0(P2.c.f318721a);
    }

    @Override // com.avito.android.publish.R0
    @Y61.k
    public final io.reactivex.rxjava3.core.z<P2<ImeiRecognitionResult>> b(@Y61.k Uri uri, @Y61.k Navigation navigation2, @Y61.k CategoryParameters categoryParameters) {
        return new io.reactivex.rxjava3.internal.operators.mixed.x(this.f232074c.a(uri).d0(d.f232082b), new e(navigation2, this.f232075d.convertToFieldMap(categoryParameters.getParametersExceptOwnedBySlots()))).d0(f.f232086b).m0(new g()).r0(P2.c.f318721a);
    }
}

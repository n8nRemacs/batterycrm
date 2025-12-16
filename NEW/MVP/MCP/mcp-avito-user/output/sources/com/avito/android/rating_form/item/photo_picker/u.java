package com.avito.android.rating_form.item.photo_picker;

import Vg0.InterfaceC15675a;
import com.avito.android.rating_form.item.photo_picker.s;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import n80.InterfaceC44212a;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: RatingSellerFormUploadInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/u;", "Ln80/a;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u implements InterfaceC44212a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15675a f248563a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f248564b;

    /* compiled from: RatingSellerFormUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/u$a;", "", "<init>", "()V", "", "REQUEST_PARAM_FID", "Ljava/lang/String;", "REQUEST_PARAM_FILE", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingSellerFormUploadInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/s$a;", "imageUploadParams", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lcom/avito/android/rating_form/item/photo_picker/s$a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f248566c;

        public b(File file) {
            this.f248566c = file;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            s.a aVar = (s.a) obj;
            Map<String, Object> map = aVar.f248561b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), RequestBody.Companion.create$default(RequestBody.INSTANCE, entry.getValue().toString(), (MediaType) null, 1, (Object) null));
            }
            return g1.a(u.this.f248563a.a(com.avito.http.b.a(this.f248566c, 2), MultipartBody.Part.INSTANCE.createFormData("fid", aVar.f248560a), linkedHashMap)).r(v.f248567b);
        }
    }

    static {
        new a(null);
    }

    public u(@Y61.k InterfaceC15675a interfaceC15675a, @Y61.k r rVar) {
        this.f248563a = interfaceC15675a;
        this.f248564b = rVar;
    }

    @Override // n80.InterfaceC44212a
    @Y61.k
    public final I a(@Y61.k File file, @Y61.k String str) {
        s.a aVarB = this.f248564b.b(str);
        C42026y c42026yN = aVarB != null ? I.q(aVarB).n(new b(file)) : null;
        return c42026yN == null ? I.l(new IllegalArgumentException("imageUploadParamsStorage is null")) : c42026yN;
    }
}

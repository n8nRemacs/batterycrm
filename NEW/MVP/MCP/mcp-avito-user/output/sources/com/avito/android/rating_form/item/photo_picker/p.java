package com.avito.android.rating_form.item.photo_picker;

import Vg0.InterfaceC15675a;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import n80.InterfaceC44212a;
import okhttp3.MultipartBody;

/* compiled from: RatingModelFormUploadInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/p;", "Ln80/a;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements InterfaceC44212a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15675a f248554a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f248555b;

    /* compiled from: RatingModelFormUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/p$a;", "", "<init>", "()V", "", "REQUEST_PARAM_CATEGORY_ID", "Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingModelFormUploadInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "categoryId", "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ File f248557c;

        public b(File file) {
            this.f248557c = file;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return g1.a(p.this.f248554a.b(com.avito.http.b.a(this.f248557c, 3), MultipartBody.Part.INSTANCE.createFormData("categoryId", (String) obj))).r(q.f248558b);
        }
    }

    static {
        new a(null);
    }

    public p(@Y61.k InterfaceC15675a interfaceC15675a, @Y61.k m mVar) {
        this.f248554a = interfaceC15675a;
        this.f248555b = mVar;
    }

    @Override // n80.InterfaceC44212a
    @Y61.k
    public final I a(@Y61.k File file, @Y61.k String str) {
        String strB = this.f248555b.b(str);
        C42026y c42026yN = strB != null ? I.q(strB).n(new b(file)) : null;
        return c42026yN == null ? I.l(new IllegalArgumentException("categoryId is null")) : c42026yN;
    }
}

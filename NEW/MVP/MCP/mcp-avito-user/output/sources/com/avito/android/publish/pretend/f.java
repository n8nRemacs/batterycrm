package com.avito.android.publish.pretend;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.error.z;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.adverts.PretendAdvertResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.u1;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;
import yc.C50213a;

/* compiled from: PretendInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/pretend/f;", "Lcom/avito/android/publish/pretend/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u1 f238365b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f238366c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CategoryParametersConverter f238367d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C50213a f238368e;

    /* compiled from: PretendInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/PretendResult;", "result", "Lcom/avito/android/remote/model/adverts/PretendAdvertResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f238369b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            PretendAdvertResult pretendAdvertResult = (PretendAdvertResult) obj;
            if (pretendAdvertResult instanceof PretendAdvertResult.Ok) {
                return new PretendResult(true, null, 2, null);
            }
            if (pretendAdvertResult instanceof PretendAdvertResult.InputErrors) {
                return ((PretendAdvertResult.InputErrors) pretendAdvertResult).getMessages();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PretendInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/PretendResult;", "result", "Lcom/avito/android/util/h3;", "apply", "(Lcom/avito/android/remote/model/PretendResult;)Lcom/avito/android/util/h3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f238370b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new AbstractC35806h3.d((PretendResult) obj);
        }
    }

    /* compiled from: PretendInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/PretendResult;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/h3;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f238371b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new AbstractC35806h3.a(z.n((Throwable) obj));
        }
    }

    @Inject
    public f(@k u1 u1Var, @k InterfaceC35745a5 interfaceC35745a5, @k CategoryParametersConverter categoryParametersConverter, @k C50213a c50213a) {
        this.f238365b = u1Var;
        this.f238366c = interfaceC35745a5;
        this.f238367d = categoryParametersConverter;
        this.f238368e = c50213a;
    }

    @Override // com.avito.android.publish.pretend.e
    @k
    public final I<PretendResult> a(@k Navigation navigation2, @k CategoryParameters categoryParameters) {
        CategoryParametersConverter categoryParametersConverter = this.f238367d;
        return g1.a(this.f238365b.a(categoryParametersConverter.convertToFieldMap(navigation2), null, null, categoryParametersConverter.convertToFieldMap(categoryParameters.getParametersExceptOwnedBySlots()), this.f238368e.b())).r(a.f238369b).z(this.f238366c.a());
    }

    @Override // com.avito.android.publish.pretend.e
    @k
    public final io.reactivex.rxjava3.core.z<AbstractC35806h3<PretendResult>> m(@k Navigation navigation2, @k CategoryParameters categoryParameters) {
        return a(navigation2, categoryParameters).F().d0(b.f238370b).r0(AbstractC35806h3.c.f318892a).m0(c.f238371b);
    }
}

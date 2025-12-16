package com.avito.android.select;

import Zp0.InterfaceC19587b;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.GroupSection;
import com.avito.android.remote.model.category_parameters.SectionTitle;
import com.avito.android.select.C;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;

/* compiled from: SelectDialogInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/C;", "Lcom/avito/android/select/g;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<ParcelableEntity<String>> f264964a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f264965b;

    /* compiled from: SelectDialogInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "invoke", "(Lcom/avito/android/remote/model/ParcelableEntity;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<ParcelableEntity<String>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f264966l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(ParcelableEntity<String> parcelableEntity) {
            return Boolean.valueOf(parcelableEntity instanceof SectionTitle);
        }
    }

    /* compiled from: SelectDialogInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<ParcelableEntity<String>, List<? extends ParcelableEntity<String>>> {
        @Override // Y41.l
        public final List<? extends ParcelableEntity<String>> invoke(ParcelableEntity<String> parcelableEntity) {
            ParcelableEntity<String> parcelableEntity2 = parcelableEntity;
            ((C) this.receiver).getClass();
            return parcelableEntity2 instanceof GroupSection ? ((GroupSection) parcelableEntity2).getAllParcelableEntities() : Collections.singletonList(parcelableEntity2);
        }
    }

    /* compiled from: SelectDialogInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "invoke", "(Lcom/avito/android/remote/model/ParcelableEntity;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.l<ParcelableEntity<String>, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f264967l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f264967l = str;
        }

        @Override // Y41.l
        public final Boolean invoke(ParcelableEntity<String> parcelableEntity) {
            ParcelableEntity<String> parcelableEntity2 = parcelableEntity;
            String f201827c = parcelableEntity2.getF201827c();
            return Boolean.valueOf((f201827c != null && C43066x.q(h.a(f201827c), this.f264967l, true)) || (L.f(parcelableEntity2.getF201827c(), "Популярные") || L.f(parcelableEntity2.getF201827c(), "Все")));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(@Y61.k List<? extends ParcelableEntity<String>> list, @Y61.l String str) {
        this.f264964a = list;
        this.f264965b = str;
    }

    @Override // com.avito.android.select.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Zp0.e> a(@Y61.k InterfaceC19587b interfaceC19587b) {
        return io.reactivex.rxjava3.core.z.c0(new Zp0.e(C42784z0.f406748b, null));
    }

    @Override // com.avito.android.select.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Zp0.e> b(@Y61.k final String str) {
        return io.reactivex.rxjava3.core.z.W(new Callable() { // from class: com.avito.android.select.B
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                Object next;
                String str2 = str;
                boolean zK2 = C43066x.K(str2);
                C c12 = this;
                List<ParcelableEntity<String>> list = c12.f264964a;
                if (zK2) {
                    return new Zp0.e(list, null);
                }
                List<ParcelableEntity<String>> list2 = list;
                C43025h c43025hI = C43033p.i(C43033p.p(C43033p.l(new C42770s0(list2), C.a.f264966l), new C.b(1, c12, C.class, "mapGroupSectionToParcelableEntitiesIfNeeded", "mapGroupSectionToParcelableEntitiesIfNeeded(Lcom/avito/android/remote/model/ParcelableEntity;)Ljava/util/List;", 0)), new C.c(h.a(str2)));
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((ParcelableEntity) next).getId(), c12.f264965b)) {
                        break;
                    }
                }
                ParcelableEntity parcelableEntity = (ParcelableEntity) next;
                List listD = C43033p.D(c43025hI);
                if (listD.isEmpty() && parcelableEntity != null) {
                    listD = Collections.singletonList(parcelableEntity);
                }
                return new Zp0.e(listD, null);
            }
        });
    }

    public /* synthetic */ C(List list, String str, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : str);
    }
}

package com.avito.android.publish.premoderation;

import android.os.Bundle;
import androidx.view.InterfaceC23040h0;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;

/* compiled from: WrongCategoryFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p {

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertProactiveModerationResult.WrongCategorySuggest f238330l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
            super(1);
            this.f238330l = wrongCategorySuggest;
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            bundle.putParcelable("key_wrong_category_data", this.f238330l);
            return G0.f406611a;
        }
    }

    /* compiled from: WrongCategoryFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f238331b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f238331b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f238331b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f238331b;
        }

        public final int hashCode() {
            return this.f238331b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f238331b.invoke(obj);
        }
    }

    @Y61.k
    public static final WrongCategoryFragment a(@Y61.k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
        WrongCategoryFragment wrongCategoryFragment = new WrongCategoryFragment();
        C35966w1.a(wrongCategoryFragment, 1, new a(wrongCategorySuggest));
        return wrongCategoryFragment;
    }
}

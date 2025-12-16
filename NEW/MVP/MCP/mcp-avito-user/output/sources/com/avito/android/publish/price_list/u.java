package com.avito.android.publish.price_list;

import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectPriceListRouter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/u;", "Lcom/avito/android/publish/price_list/t;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f238931a;

    /* compiled from: SelectPriceListRouter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/price_list/u$a;", "", "<init>", "()V", "", "SELECT_PRICE_LIST_FRAGMENT_TAG", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public u(@Y61.k FragmentManager fragmentManager) {
        this.f238931a = fragmentManager;
    }

    @Override // com.avito.android.publish.price_list.t
    public final void a(@Y61.k String str) {
        SelectPriceListFragment.f238386A0.getClass();
        SelectPriceListFragment selectPriceListFragment = new SelectPriceListFragment();
        selectPriceListFragment.setArguments(C22777e.b(new Q("select_price_list_param_key", str)));
        H hE2 = this.f238931a.e();
        hE2.n(R.id.fragment_container, selectPriceListFragment, "select_price_list_fragment_tag");
        hE2.c("select_price_list_fragment_tag");
        hE2.e();
    }
}

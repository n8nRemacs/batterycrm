package com.avito.android.user_advert.advert.delegate.multi_items;

import Y61.k;
import Y61.l;
import com.avito.android.advert_multi_items.model.ModificationItem;
import fH0.InterfaceC40292b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiItemsPresenterDelegateAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_items/f;", "LfH0/b;", "a", "b", "Lcom/avito/android/user_advert/advert/delegate/multi_items/f$a;", "Lcom/avito/android/user_advert/advert/delegate/multi_items/f$b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface f extends InterfaceC40292b {

    /* compiled from: MultiItemsPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_items/f$a;", "Lcom/avito/android/user_advert/advert/delegate/multi_items/f;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ModificationItem f308681a;

        public a(@k ModificationItem modificationItem) {
            this.f308681a = modificationItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f308681a, ((a) obj).f308681a);
        }

        public final int hashCode() {
            return this.f308681a.hashCode();
        }

        @k
        public final String toString() {
            return "LoadAdvertModification(item=" + this.f308681a + ')';
        }
    }

    /* compiled from: MultiItemsPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_items/f$b;", "Lcom/avito/android/user_advert/advert/delegate/multi_items/f;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f308682a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -220734011;
        }

        @k
        public final String toString() {
            return "TrackMultiItemsShown";
        }
    }
}

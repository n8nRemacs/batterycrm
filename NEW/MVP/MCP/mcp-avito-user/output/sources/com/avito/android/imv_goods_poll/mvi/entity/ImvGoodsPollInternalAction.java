package com.avito.android.imv_goods_poll.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.ImvGoodsPollLinkBodyOption;
import com.avito.android.remote.error.ApiError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImvGoodsPollInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ShowError", "ShowLoaded", "ShowLoading", "UpdateItems", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction$ShowError;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction$ShowLoaded;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction$ShowLoading;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction$UpdateItems;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ImvGoodsPollInternalAction extends n {

    /* compiled from: ImvGoodsPollInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction$ShowError;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements ImvGoodsPollInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f170693b;

        public ShowError(@k ApiError apiError) {
            this.f170693b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f170693b, ((ShowError) obj).f170693b);
        }

        public final int hashCode() {
            return this.f170693b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f170693b, ')');
        }
    }

    /* compiled from: ImvGoodsPollInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction$ShowLoaded;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoaded implements ImvGoodsPollInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoaded f170694b = new ShowLoaded();

        private ShowLoaded() {
        }
    }

    /* compiled from: ImvGoodsPollInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction$ShowLoading;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "()V", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading implements ImvGoodsPollInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoading f170695b = new ShowLoading();

        private ShowLoading() {
        }
    }

    /* compiled from: ImvGoodsPollInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction$UpdateItems;", "Lcom/avito/android/imv_goods_poll/mvi/entity/ImvGoodsPollInternalAction;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItems implements ImvGoodsPollInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ImvGoodsPollLinkBodyOption> f170696b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f170697c;

        public UpdateItems(@k List<ImvGoodsPollLinkBodyOption> list, @l String str) {
            this.f170696b = list;
            this.f170697c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateItems)) {
                return false;
            }
            UpdateItems updateItems = (UpdateItems) obj;
            return L.f(this.f170696b, updateItems.f170696b) && L.f(this.f170697c, updateItems.f170697c);
        }

        public final int hashCode() {
            int iHashCode = this.f170696b.hashCode() * 31;
            String str = this.f170697c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateItems(options=");
            sb2.append(this.f170696b);
            sb2.append(", error=");
            return C22026a.c(sb2, this.f170697c, ')');
        }

        public /* synthetic */ UpdateItems(List list, String str, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? null : str);
        }
    }
}

package com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;

/* compiled from: ImmutableInfoDescriptionInternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "SelectTab", "Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction$Close;", "Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction$SelectTab;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ImmutableInfoDescriptionInternalAction extends n {

    /* compiled from: ImmutableInfoDescriptionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction$Close;", "Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ImmutableInfoDescriptionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f202620b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1302468554;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ImmutableInfoDescriptionInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction$SelectTab;", "Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectTab implements ImmutableInfoDescriptionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f202621b;

        public SelectTab(int i12) {
            this.f202621b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectTab) && this.f202621b == ((SelectTab) obj).f202621b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f202621b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("SelectTab(tabIdx="), this.f202621b, ')');
        }
    }
}

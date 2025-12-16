package com.avito.android.publish.price_list.mvi.entity;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPriceListAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Lcom/avito/android/publish/price_list/mvi/entity/a$a;", "Lcom/avito/android/publish/price_list/mvi/entity/a$b;", "Lcom/avito/android/publish/price_list/mvi/entity/a$c;", "Lcom/avito/android/publish/price_list/mvi/entity/a$d;", "Lcom/avito/android/publish/price_list/mvi/entity/a$e;", "Lcom/avito/android/publish/price_list/mvi/entity/a$f;", "Lcom/avito/android/publish/price_list/mvi/entity/a$g;", "Lcom/avito/android/publish/price_list/mvi/entity/a$h;", "Lcom/avito/android/publish/price_list/mvi/entity/a$i;", "Lcom/avito/android/publish/price_list/mvi/entity/a$j;", "Lcom/avito/android/publish/price_list/mvi/entity/a$k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$a;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.price_list.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7174a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f238820a;

        public C7174a(@Y61.k String str) {
            this.f238820a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7174a) && L.f(this.f238820a, ((C7174a) obj).f238820a);
        }

        public final int hashCode() {
            return this.f238820a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeInputText(searchText="), this.f238820a, ')');
        }
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$b;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<com.avito.conveyor_item.a> f238821a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k List<? extends com.avito.conveyor_item.a> list) {
            this.f238821a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f238821a, ((b) obj).f238821a);
        }

        public final int hashCode() {
            return this.f238821a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("ChangeSearchItems(items="), this.f238821a, ')');
        }
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$c;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f238822a = new c();
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$d;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f238823a = new d();
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$e;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f238824a = new e();
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$f;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f238825a = new f();
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$g;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.publish.price_list.items.group.a f238826a;

        public g(@Y61.k com.avito.android.publish.price_list.items.group.a aVar) {
            this.f238826a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f238826a, ((g) obj).f238826a);
        }

        public final int hashCode() {
            return this.f238826a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ClickSelectPriceListGroupItem(item=" + this.f238826a + ')';
        }
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$h;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.publish.price_list.items.selectable.d f238827a;

        public h(@Y61.k com.avito.android.publish.price_list.items.selectable.d dVar) {
            this.f238827a = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f238827a, ((h) obj).f238827a);
        }

        public final int hashCode() {
            return this.f238827a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ClickSelectableItem(item=" + this.f238827a + ')';
        }
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$i;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f238828a;

        public i(int i12) {
            this.f238828a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f238828a == ((i) obj).f238828a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f238828a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("ClickSelectedItem(position="), this.f238828a, ')');
        }
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$j;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f238829a = new j();
    }

    /* compiled from: SelectPriceListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/a$k;", "Lcom/avito/android/publish/price_list/mvi/entity/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f238830a;

        public k(@Y61.k String str) {
            this.f238830a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f238830a, ((k) obj).f238830a);
        }

        public final int hashCode() {
            return this.f238830a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ResultChangeObjectsParameter(parameterId="), this.f238830a, ')');
        }
    }
}

package com.avito.beduin.v2.avito.component.items_controller;

import androidx.compose.foundation.H;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemsControllerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/items_controller/h;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface h {

    /* compiled from: ItemsControllerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/items_controller/h$a;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f334557a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f334558b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36249i f334559c;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k InterfaceC36249i interfaceC36249i) {
            this.f334557a = str;
            this.f334558b = str2;
            this.f334559c = interfaceC36249i;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f334557a, aVar.f334557a) && L.f(this.f334558b, aVar.f334558b) && L.f(this.f334559c, aVar.f334559c);
        }

        public final int hashCode() {
            return this.f334559c.hashCode() + H.d(this.f334557a.hashCode() * 31, 31, this.f334558b);
        }

        @Y61.k
        public final String toString() {
            return "Item(itemId=" + this.f334557a + ", itemViewType=" + this.f334558b + ", component=" + this.f334559c + ')';
        }
    }

    @Y61.k
    Map<String, a> getItems();
}

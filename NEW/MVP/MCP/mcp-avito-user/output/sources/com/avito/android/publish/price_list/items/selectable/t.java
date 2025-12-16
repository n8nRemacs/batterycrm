package com.avito.android.publish.price_list.items.selectable;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectablePriceListItem.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/price_list/items/selectable/t;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/publish/price_list/items/selectable/t$a;", "Lcom/avito/android/publish/price_list/items/selectable/t$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class t {

    /* compiled from: SelectablePriceListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/selectable/t$a;", "Lcom/avito/android/publish/price_list/items/selectable/t;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends t {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f238701a;

        /* renamed from: b, reason: collision with root package name */
        public final int f238702b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i12, int i13, C42822w c42822w) {
            super(null);
            i12 = (i13 & 2) != 0 ? R.drawable.common_ic_add_thin_16 : i12;
            this.f238701a = str;
            this.f238702b = i12;
        }

        @Override // com.avito.android.publish.price_list.items.selectable.t
        /* renamed from: a, reason: from getter */
        public final int getF238704b() {
            return this.f238702b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f238701a, aVar.f238701a) && this.f238702b == aVar.f238702b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f238702b) + (this.f238701a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Add(paramId=");
            sb2.append(this.f238701a);
            sb2.append(", drawableResId=");
            return androidx.appcompat.app.r.t(sb2, this.f238702b, ')');
        }
    }

    /* compiled from: SelectablePriceListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/selectable/t$b;", "Lcom/avito/android/publish/price_list/items/selectable/t;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends t {

        /* renamed from: a, reason: collision with root package name */
        public final int f238703a;

        /* renamed from: b, reason: collision with root package name */
        public final int f238704b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, int i13, int i14, C42822w c42822w) {
            super(null);
            i13 = (i14 & 2) != 0 ? R.drawable.common_ic_edit_16 : i13;
            this.f238703a = i12;
            this.f238704b = i13;
        }

        @Override // com.avito.android.publish.price_list.items.selectable.t
        /* renamed from: a, reason: from getter */
        public final int getF238704b() {
            return this.f238704b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f238703a == bVar.f238703a && this.f238704b == bVar.f238704b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f238704b) + (Integer.hashCode(this.f238703a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Edit(position=");
            sb2.append(this.f238703a);
            sb2.append(", drawableResId=");
            return androidx.appcompat.app.r.t(sb2, this.f238704b, ')');
        }
    }

    public /* synthetic */ t(C42822w c42822w) {
        this();
    }

    /* renamed from: a */
    public abstract int getF238704b();

    public t() {
    }
}

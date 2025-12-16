package com.avito.android.lib.beduin_v2.beduin_item;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.avito.component.items_controller.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinItemsState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/beduin_v2/beduin_item/a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/lib/beduin_v2/beduin_item/a$a;", "Lcom/avito/android/lib/beduin_v2/beduin_item/a$b;", "_design-modules_beduin-v2_beduin-item_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class a {

    /* compiled from: BeduinItemsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/beduin_item/a$a;", "Lcom/avito/android/lib/beduin_v2/beduin_item/a;", "_design-modules_beduin-v2_beduin-item_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.beduin_item.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5176a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final i.a f175437a;

        public C5176a(@k i.a aVar) {
            super(null);
            this.f175437a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5176a) && L.f(this.f175437a, ((C5176a) obj).f175437a);
        }

        public final int hashCode() {
            return this.f175437a.f334562a.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(itemsController=" + this.f175437a + ')';
        }
    }

    /* compiled from: BeduinItemsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/beduin_item/a$b;", "Lcom/avito/android/lib/beduin_v2/beduin_item/a;", "<init>", "()V", "_design-modules_beduin-v2_beduin-item_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f175438a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 872464493;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}

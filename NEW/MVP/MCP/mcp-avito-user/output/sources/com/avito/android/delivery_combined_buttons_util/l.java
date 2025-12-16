package com.avito.android.delivery_combined_buttons_util;

import androidx.appcompat.app.r;
import com.avito.android.delivery_combined_buttons_public.WidthStrategy;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryCombinedButtonsView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_util/l;", "", "a", "b", "c", "Lcom/avito/android/delivery_combined_buttons_util/l$a;", "Lcom/avito/android/delivery_combined_buttons_util/l$c;", "_avito_delivery-combined-buttons_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f134997a = b.f135001a;

    /* compiled from: DeliveryCombinedButtonsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_util/l$a;", "Lcom/avito/android/delivery_combined_buttons_util/l;", "_avito_delivery-combined-buttons_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements l {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final WidthStrategy f134998b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f134999c;

        /* compiled from: DeliveryCombinedButtonsView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.delivery_combined_buttons_util.l$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C4078a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f135000a;

            static {
                int[] iArr = new int[WidthStrategy.values().length];
                try {
                    WidthStrategy widthStrategy = WidthStrategy.f134963b;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f135000a = iArr;
            }
        }

        public a(@Y61.l WidthStrategy widthStrategy, boolean z12) {
            this.f134998b = widthStrategy;
            this.f134999c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f134998b == aVar.f134998b && this.f134999c == aVar.f134999c;
        }

        public final int hashCode() {
            WidthStrategy widthStrategy = this.f134998b;
            return Boolean.hashCode(this.f134999c) + ((widthStrategy == null ? 0 : widthStrategy.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BuyAndAddToCart(widthStrategy=");
            sb2.append(this.f134998b);
            sb2.append(", isAddToCartOnLeftAndStepperOnRightSide=");
            return r.x(sb2, this.f134999c, ')');
        }
    }

    /* compiled from: DeliveryCombinedButtonsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_util/l$b;", "", "<init>", "()V", "_avito_delivery-combined-buttons_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f135001a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f135002b = y6.d(140);
    }

    /* compiled from: DeliveryCombinedButtonsView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_util/l$c;", "Lcom/avito/android/delivery_combined_buttons_util/l;", "_avito_delivery-combined-buttons_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements l {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f135003b;

        public c(boolean z12) {
            this.f135003b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f135003b == ((c) obj).f135003b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f135003b);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("GoToCartWithStepper(isAddToCartOnLeftAndStepperOnRightSide="), this.f135003b, ')');
        }
    }
}

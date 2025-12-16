package com.avito.android.beduin.view.recyclerview;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.C23434z;
import com.avito.android.beduin_shared.model.action.custom.BeduinScrollPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SmoothScroller.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/view/recyclerview/g;", "Landroidx/recyclerview/widget/z;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends C23434z {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f105210r = new a(null);

    /* renamed from: p, reason: collision with root package name */
    @k
    public final BeduinScrollPosition f105211p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final Float f105212q;

    /* compiled from: SmoothScroller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/view/recyclerview/g$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SmoothScroller.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.view.recyclerview.g$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3142a {
            static {
                int[] iArr = new int[BeduinScrollPosition.values().length];
                try {
                    iArr[4] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    BeduinScrollPosition beduinScrollPosition = BeduinScrollPosition.f105279b;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static int a(@k BeduinScrollPosition beduinScrollPosition, int i12, int i13, int i14, int i15) {
            int iOrdinal = beduinScrollPosition.ordinal();
            return iOrdinal != 0 ? iOrdinal != 4 ? i15 - i13 : r.f(i15, i14, 2, i14) - (((i13 - i12) / 2) + i12) : i14 - i12;
        }

        public a() {
        }
    }

    public /* synthetic */ g(Context context, BeduinScrollPosition beduinScrollPosition, Float f12, int i12, C42822w c42822w) {
        this(context, beduinScrollPosition, (i12 & 4) != 0 ? null : f12);
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int g(int i12, int i13, int i14, int i15, int i16) {
        f105210r.getClass();
        return a.a(this.f105211p, i12, i13, i14, i15);
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final float j(@k DisplayMetrics displayMetrics) {
        Float f12 = this.f105212q;
        return (f12 != null ? f12.floatValue() : 25.0f) / displayMetrics.densityDpi;
    }

    public g(@k Context context, @k BeduinScrollPosition beduinScrollPosition, @l Float f12) {
        super(context);
        this.f105211p = beduinScrollPosition;
        this.f105212q = f12;
    }
}

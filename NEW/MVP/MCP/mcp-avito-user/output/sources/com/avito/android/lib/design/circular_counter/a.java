package com.avito.android.lib.design.circular_counter;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CircularCounterState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/circular_counter/a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC5261a f178828a;

    /* renamed from: b, reason: collision with root package name */
    public final int f178829b;

    /* renamed from: c, reason: collision with root package name */
    public final int f178830c;

    /* compiled from: CircularCounterState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/design/circular_counter/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/lib/design/circular_counter/a$a$a;", "Lcom/avito/android/lib/design/circular_counter/a$a$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.circular_counter.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC5261a {

        /* compiled from: CircularCounterState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/circular_counter/a$a$a;", "Lcom/avito/android/lib/design/circular_counter/a$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.circular_counter.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5262a extends AbstractC5261a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Drawable f178831a;

            public C5262a(@k Drawable drawable) {
                super(null);
                this.f178831a = drawable;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5262a) && L.f(this.f178831a, ((C5262a) obj).f178831a);
            }

            public final int hashCode() {
                return this.f178831a.hashCode();
            }

            @k
            public final String toString() {
                return "ContentImage(icon=" + this.f178831a + ')';
            }
        }

        /* compiled from: CircularCounterState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/circular_counter/a$a$b;", "Lcom/avito/android/lib/design/circular_counter/a$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.circular_counter.a$a$b */
        public static final /* data */ class b extends AbstractC5261a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f178832a;

            public b(@k String str) {
                super(null);
                this.f178832a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f178832a, ((b) obj).f178832a);
            }

            public final int hashCode() {
                return this.f178832a.hashCode();
            }

            @k
            public final String toString() {
                return "ContentText(text=" + ((Object) this.f178832a) + ')';
            }
        }

        public /* synthetic */ AbstractC5261a(C42822w c42822w) {
            this();
        }

        public AbstractC5261a() {
        }
    }

    public a(AbstractC5261a abstractC5261a, int i12, int i13, int i14, C42822w c42822w) {
        i13 = (i14 & 4) != 0 ? 100 : i13;
        this.f178828a = abstractC5261a;
        this.f178829b = i12;
        this.f178830c = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f178828a, aVar.f178828a) && this.f178829b == aVar.f178829b && this.f178830c == aVar.f178830c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f178830c) + r.e(this.f178829b, this.f178828a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CircularCounterState(contentText=");
        sb2.append(this.f178828a);
        sb2.append(", progressIndicatorPercent=");
        sb2.append(this.f178829b);
        sb2.append(", progressIndicatorPercentMax=");
        return r.t(sb2, this.f178830c, ')');
    }
}

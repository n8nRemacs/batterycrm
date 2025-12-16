package com.avito.android.lib.design.chips;

import android.graphics.drawable.Drawable;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChipImage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/lib/design/chips/e;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/lib/design/chips/e$a;", "Lcom/avito/android/lib/design/chips/e$b;", "Lcom/avito/android/lib/design/chips/e$c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class e {

    /* compiled from: ChipImage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/e$a;", "Lcom/avito/android/lib/design/chips/e;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Drawable f178737a;

        public a(@Y61.k Drawable drawable) {
            super(null);
            this.f178737a = drawable;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f178737a, ((a) obj).f178737a);
        }

        public final int hashCode() {
            return this.f178737a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AsDrawable(value=" + this.f178737a + ')';
        }
    }

    /* compiled from: ChipImage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/e$b;", "Lcom/avito/android/lib/design/chips/e;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final int f178738a;

        public b(@InterfaceC42150f int i12) {
            super(null);
            this.f178738a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f178738a == ((b) obj).f178738a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f178738a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Attr(res="), this.f178738a, ')');
        }
    }

    /* compiled from: ChipImage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/e$c;", "Lcom/avito/android/lib/design/chips/e;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* renamed from: a, reason: collision with root package name */
        public final int f178739a;

        public c(@InterfaceC42165v int i12) {
            super(null);
            this.f178739a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f178739a == ((c) obj).f178739a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f178739a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Resource(res="), this.f178739a, ')');
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    public e() {
    }
}

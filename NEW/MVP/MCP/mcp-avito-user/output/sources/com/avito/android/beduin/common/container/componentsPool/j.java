package com.avito.android.beduin.common.container.componentsPool;

import Y61.l;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.r;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LayoutParams.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/j;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/beduin/common/container/componentsPool/j$a;", "Lcom/avito/android/beduin/common/container/componentsPool/j$b;", "Lcom/avito/android/beduin/common/container/componentsPool/j$c;", "Lcom/avito/android/beduin/common/container/componentsPool/j$d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class j {

    /* compiled from: LayoutParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/j$a;", "Lcom/avito/android/beduin/common/container/componentsPool/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends j {

        /* renamed from: a, reason: collision with root package name */
        public final int f103006a;

        /* renamed from: b, reason: collision with root package name */
        public final int f103007b;

        public a() {
            super(null);
            this.f103006a = -2;
            this.f103007b = -2;
        }

        @Override // com.avito.android.beduin.common.container.componentsPool.j
        @Y61.k
        public final ViewGroup.LayoutParams a() {
            return new FlexboxLayout.LayoutParams(this.f103006a, this.f103007b);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f103006a == aVar.f103006a && this.f103007b == aVar.f103007b;
        }

        @Override // com.avito.android.beduin.common.container.componentsPool.j
        public final int hashCode() {
            return Integer.hashCode(this.f103007b) + (Integer.hashCode(this.f103006a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FlexboxLayoutParams(width=");
            sb2.append(this.f103006a);
            sb2.append(", height=");
            return r.t(sb2, this.f103007b, ')');
        }
    }

    /* compiled from: LayoutParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/j$b;", "Lcom/avito/android/beduin/common/container/componentsPool/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends j {

        /* renamed from: a, reason: collision with root package name */
        public final int f103008a;

        /* renamed from: b, reason: collision with root package name */
        public final int f103009b;

        /* renamed from: c, reason: collision with root package name */
        public final int f103010c;

        public /* synthetic */ b(int i12, int i13, int i14, int i15, C42822w c42822w) {
            this(i12, i13, (i15 & 4) != 0 ? -1 : i14);
        }

        @Override // com.avito.android.beduin.common.container.componentsPool.j
        @Y61.k
        public final ViewGroup.LayoutParams a() {
            return new FrameLayout.LayoutParams(this.f103008a, this.f103009b, this.f103010c);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f103008a == bVar.f103008a && this.f103009b == bVar.f103009b && this.f103010c == bVar.f103010c;
        }

        @Override // com.avito.android.beduin.common.container.componentsPool.j
        public final int hashCode() {
            return Integer.hashCode(this.f103010c) + r.e(this.f103009b, Integer.hashCode(this.f103008a) * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FrameLayoutParams(width=");
            sb2.append(this.f103008a);
            sb2.append(", height=");
            sb2.append(this.f103009b);
            sb2.append(", gravity=");
            return r.t(sb2, this.f103010c, ')');
        }

        public b(int i12, int i13, int i14) {
            super(null);
            this.f103008a = i12;
            this.f103009b = i13;
            this.f103010c = i14;
        }
    }

    /* compiled from: LayoutParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/j$c;", "Lcom/avito/android/beduin/common/container/componentsPool/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public final int f103011a;

        /* renamed from: b, reason: collision with root package name */
        public final int f103012b;

        public c(int i12, int i13) {
            super(null);
            this.f103011a = i12;
            this.f103012b = i13;
        }

        @Override // com.avito.android.beduin.common.container.componentsPool.j
        @Y61.k
        public final ViewGroup.LayoutParams a() {
            return new LinearLayout.LayoutParams(this.f103011a, this.f103012b);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f103011a == cVar.f103011a && this.f103012b == cVar.f103012b;
        }

        @Override // com.avito.android.beduin.common.container.componentsPool.j
        public final int hashCode() {
            return Integer.hashCode(this.f103012b) + (Integer.hashCode(this.f103011a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LinearLayoutParams(width=");
            sb2.append(this.f103011a);
            sb2.append(", height=");
            return r.t(sb2, this.f103012b, ')');
        }
    }

    /* compiled from: LayoutParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/componentsPool/j$d;", "Lcom/avito/android/beduin/common/container/componentsPool/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends j {

        /* renamed from: a, reason: collision with root package name */
        public final int f103013a;

        /* renamed from: b, reason: collision with root package name */
        public final int f103014b;

        public d() {
            super(null);
            this.f103013a = -2;
            this.f103014b = -2;
        }

        @Override // com.avito.android.beduin.common.container.componentsPool.j
        @Y61.k
        public final ViewGroup.LayoutParams a() {
            return new ViewGroup.MarginLayoutParams(this.f103013a, this.f103014b);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f103013a == dVar.f103013a && this.f103014b == dVar.f103014b;
        }

        @Override // com.avito.android.beduin.common.container.componentsPool.j
        public final int hashCode() {
            return Integer.hashCode(this.f103014b) + (Integer.hashCode(this.f103013a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MarginLayoutParams(width=");
            sb2.append(this.f103013a);
            sb2.append(", height=");
            return r.t(sb2, this.f103014b, ')');
        }
    }

    public /* synthetic */ j(C42822w c42822w) {
        this();
    }

    @Y61.k
    public abstract ViewGroup.LayoutParams a();

    public abstract int hashCode();

    public j() {
    }
}

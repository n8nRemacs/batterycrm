package com.avito.android.beduin.common.utils;

import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTextMeasurer.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/utils/n;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/beduin/common/utils/n$b;", "Lcom/avito/android/beduin/common/utils/n$c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f103532a = new a(null);

    /* compiled from: BeduinTextMeasurer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/utils/n$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinTextMeasurer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/utils/n$b;", "Lcom/avito/android/beduin/common/utils/n;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends n {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BeduinModel f103533b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f103534c;

        public b(@Y61.k BeduinModel beduinModel, @Y61.k String str) {
            super(null);
            this.f103533b = beduinModel;
            this.f103534c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f103533b, bVar.f103533b) && L.f(this.f103534c, bVar.f103534c);
        }

        public final int hashCode() {
            return this.f103534c.hashCode() + (this.f103533b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Model(model=");
            sb2.append(this.f103533b);
            sb2.append(", groupName=");
            return C22026a.c(sb2, this.f103534c, ')');
        }
    }

    /* compiled from: BeduinTextMeasurer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/utils/n$c;", "Lcom/avito/android/beduin/common/utils/n;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends n {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f103535b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f103536c;

        public c(@Y61.k String str, @Y61.k String str2) {
            super(null);
            this.f103535b = str;
            this.f103536c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f103535b, cVar.f103535b) && L.f(this.f103536c, cVar.f103536c);
        }

        public final int hashCode() {
            return this.f103536c.hashCode() + (this.f103535b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ModelId(id=");
            sb2.append(this.f103535b);
            sb2.append(", groupName=");
            return C22026a.c(sb2, this.f103536c, ')');
        }
    }

    public /* synthetic */ n(C42822w c42822w) {
        this();
    }

    public n() {
    }
}

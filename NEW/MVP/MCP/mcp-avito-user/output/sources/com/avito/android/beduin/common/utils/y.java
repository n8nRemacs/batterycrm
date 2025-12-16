package com.avito.android.beduin.common.utils;

import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ModelId.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/utils/y;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/beduin/common/utils/y$a;", "Lcom/avito/android/beduin/common/utils/y$b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f103550a = new c(null);

    /* compiled from: ModelId.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/utils/y$a;", "Lcom/avito/android/beduin/common/utils/y;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends y {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f103551b;

        public a(@Y61.k String str) {
            super(null);
            this.f103551b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f103551b, ((a) obj).f103551b);
        }

        public final int hashCode() {
            return this.f103551b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ById(id="), this.f103551b, ')');
        }
    }

    /* compiled from: ModelId.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/utils/y$b;", "Lcom/avito/android/beduin/common/utils/y;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends y {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BeduinModel f103552b;

        public b(@Y61.k BeduinModel beduinModel) {
            super(null);
            this.f103552b = beduinModel;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f103552b, ((b) obj).f103552b);
        }

        public final int hashCode() {
            return this.f103552b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ByInstance(model=" + this.f103552b + ')';
        }
    }

    /* compiled from: ModelId.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/utils/y$c;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static y a(@Y61.k BeduinModel beduinModel) {
            String id2 = beduinModel.getId();
            return id2 != null ? new a(id2) : new b(beduinModel);
        }

        public c() {
        }
    }

    public /* synthetic */ y(C42822w c42822w) {
        this();
    }

    public y() {
    }
}

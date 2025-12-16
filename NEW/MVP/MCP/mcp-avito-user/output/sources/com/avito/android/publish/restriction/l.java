package com.avito.android.publish.restriction;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.restriction.RestrictionCustomResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RestrictionResult.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/restriction/l;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/publish/restriction/l$a;", "Lcom/avito/android/publish/restriction/l$b;", "Lcom/avito/android/publish/restriction/l$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class l {

    /* compiled from: RestrictionResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/restriction/l$a;", "Lcom/avito/android/publish/restriction/l;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f239104a = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1039018423;
        }

        @Y61.k
        public final String toString() {
            return "Allowed";
        }
    }

    /* compiled from: RestrictionResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/restriction/l$b;", "Lcom/avito/android/publish/restriction/l;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f239105a;

        public b(@Y61.k Throwable th2) {
            super(null);
            this.f239105a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f239105a, ((b) obj).f239105a);
        }

        public final int hashCode() {
            return this.f239105a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(throwable="), this.f239105a, ')');
        }
    }

    /* compiled from: RestrictionResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/restriction/l$c;", "Lcom/avito/android/publish/restriction/l;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RestrictionCustomResponse f239106a;

        public c(@Y61.k RestrictionCustomResponse restrictionCustomResponse) {
            super(null);
            this.f239106a = restrictionCustomResponse;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f239106a, ((c) obj).f239106a);
        }

        public final int hashCode() {
            return this.f239106a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Forbidden(content=" + this.f239106a + ')';
        }
    }

    public /* synthetic */ l(C42822w c42822w) {
        this();
    }

    public l() {
    }
}

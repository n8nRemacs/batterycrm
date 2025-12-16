package androidx.datastore.preferences.core;

import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/datastore/preferences/core/f;", "", "<init>", "()V", "a", "b", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class f {

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/f$a;", "T", "", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f45565a;

        public a(@Y61.k String str) {
            this.f45565a = str;
        }

        public final boolean equals(@l Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return L.f(this.f45565a, ((a) obj).f45565a);
        }

        public final int hashCode() {
            return this.f45565a.hashCode();
        }

        @Y61.k
        /* renamed from: toString, reason: from getter */
        public final String getF45565a() {
            return this.f45565a;
        }
    }

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/f$b;", "T", "", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b<T> {
    }

    @Y61.k
    public abstract Map<a<?>, Object> a();

    @l
    public abstract <T> T b(@Y61.k a<T> aVar);
}

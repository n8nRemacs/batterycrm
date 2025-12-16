package DE0;

import Y61.k;
import Y61.l;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;

/* compiled from: Feature.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"LDE0/a;", "T", "", "a", "_common_features_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a<T> {

    /* compiled from: Feature.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDE0/a$a;", "", "<init>", "()V", "_common_features_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: DE0.a$a, reason: collision with other inner class name */
    public static final class C0161a {
        static {
            new C0161a();
        }
    }

    /* compiled from: Feature.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @l
    String getApiToggleId();

    @k
    String getDescription();

    @k
    String getKey();

    T getOriginalValue();

    @l
    Owners getOwner();

    int getPriority();

    T getValue();

    T invoke();

    boolean isRemote();
}

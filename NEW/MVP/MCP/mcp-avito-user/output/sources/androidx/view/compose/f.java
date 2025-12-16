package androidx.view.compose;

import Y41.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActivityResultRegistry.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f extends N implements a<String> {
    static {
        new f();
    }

    public f() {
        super(0);
    }

    @Override // Y41.a
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}

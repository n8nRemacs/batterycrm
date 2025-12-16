package androidx.room;

import androidx.view.AbstractC22991Y;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: InvalidationLiveDataContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/X;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RoomDatabase f54340a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<AbstractC22991Y<?>> f54341b = Collections.newSetFromMap(new IdentityHashMap());

    public X(@Y61.k RoomDatabase roomDatabase) {
        this.f54340a = roomDatabase;
    }
}

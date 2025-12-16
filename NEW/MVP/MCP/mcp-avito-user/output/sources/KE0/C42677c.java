package ke0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.M0;
import com.avito.android.publish.PublishActivity;
import com.avito.android.server_time.h;
import kotlin.Metadata;

/* compiled from: PublishIdempotencyKeyHolder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lke0/c;", "Landroidx/lifecycle/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ke0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C42677c extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f406524d;

    public C42677c(@k PublishActivity publishActivity, @k h hVar) {
        super(publishActivity, null);
        this.f406524d = hVar;
    }

    @Override // androidx.view.AbstractC22993a
    @k
    public final <T extends M0> T create(@k String str, @k Class<T> cls, @k C23060r0 c23060r0) {
        if (cls.isAssignableFrom(C42676b.class)) {
            return new C42676b(c23060r0, this.f406524d);
        }
        throw new IllegalArgumentException(cls.toString());
    }
}

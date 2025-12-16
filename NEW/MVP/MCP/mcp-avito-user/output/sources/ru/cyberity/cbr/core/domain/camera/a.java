package ru.cyberity.cbr.core.domain.camera;

import Y61.k;
import Y61.l;
import androidx.camera.core.InterfaceC20120j0;
import java.io.File;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CameraX.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\rJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u000eJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0005\u0010\u0012ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/domain/camera/a;", "", "Ljava/io/File;", "file", "Lkotlin/G0;", "a", "(Ljava/io/File;)V", "c", "b", "Landroidx/camera/core/j0;", "image", "Lru/cyberity/cbr/core/domain/camera/b;", "exposure", "(Landroidx/camera/core/j0;Lru/cyberity/cbr/core/domain/camera/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "(Ljava/lang/Exception;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface a {
    @l
    default Object a(@k InterfaceC20120j0 interfaceC20120j0, @k b bVar, @k Continuation<? super G0> continuation) {
        return a(this, interfaceC20120j0, bVar, continuation);
    }

    default void a() {
    }

    default void a(@k File file) {
    }

    default void a(@k Exception e12) {
    }

    static /* synthetic */ Object a(a aVar, InterfaceC20120j0 interfaceC20120j0, b bVar, Continuation continuation) {
        return G0.f406611a;
    }

    default void b(@k File file) {
    }

    default void c(@k File file) {
    }
}

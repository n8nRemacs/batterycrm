package com.avito.android.photo_download.feature.mvi;

import J70.b;
import J70.c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PhotoDownloadOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_download/feature/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "LJ70/b;", "LJ70/c;", "<init>", "()V", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements t<J70.b, J70.c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final J70.c b(J70.b bVar) {
        J70.b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            return new c.a(((b.a) bVar2).f8788a);
        }
        if (bVar2 instanceof b.C0507b) {
            return new c.b(((b.C0507b) bVar2).f8789a);
        }
        throw new NoWhenBranchMatchedException();
    }
}

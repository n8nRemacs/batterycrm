package com.avito.android.publish.start_publish;

import com.avito.android.remote.model.PublishStartInfo;
import jz.InterfaceC42451b;
import kotlin.Metadata;

/* compiled from: StartPublishInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/PublishStartInfo;", "startInfo", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f245445b;

    public y(u uVar) {
        this.f245445b = uVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        PublishStartInfo publishStartInfo = (PublishStartInfo) obj;
        return ((publishStartInfo instanceof PublishStartInfo.UserDraft) && kotlin.jvm.internal.L.f(this.f245445b.f245440e.a(), InterfaceC42451b.C11596b.f405967a)) ? PublishStartInfo.Publish.INSTANCE : publishStartInfo;
    }
}

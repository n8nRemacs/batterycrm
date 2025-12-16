package com.avito.android.publish.details.iac;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: IacPermissionRequestHelper.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000f\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkv/a;", "it", "Ljava/util/Optional;", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "Lj41/e;", "apply", "(Lkv/a;)Ljava/util/Optional;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f234767b;

    public m(String str) {
        this.f234767b = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.deeplink_handler.handler.bundle.a aVar = ((C43501a) obj).f413260a;
        DeepLink deepLink = aVar.f134520a;
        return (L.f(aVar.f134521b, this.f234767b) && (deepLink instanceof ChainEventLink)) ? Optional.of(deepLink) : Optional.empty();
    }
}

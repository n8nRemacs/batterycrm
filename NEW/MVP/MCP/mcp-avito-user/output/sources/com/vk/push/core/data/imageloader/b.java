package com.vk.push.core.data.imageloader;

import Y61.k;
import Y61.l;
import cb1.C27166e;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;

/* compiled from: ImageDownloaderImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/push/core/data/imageloader/b;", "Lcom/vk/push/core/data/imageloader/a;", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b implements com.vk.push.core.data.imageloader.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42726C f367017a;

    /* compiled from: ImageDownloaderImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/push/core/data/imageloader/b$a;", "", "<init>", "()V", "", "ONE_MEGABYTE", "J", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public b(@k C27166e c27166e) {
        this.f367017a = C42727D.c(new d(c27166e));
    }

    @l
    public final Object a(@k String str, @k lb1.e eVar) {
        return C43259k.g(C43262l0.f411947c, new c(str, this, null), eVar);
    }
}

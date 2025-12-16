package com.avito.android.gallery.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.android.gallery.deeplink.OpenGalleryDeeplink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OpenGalleryDeeplinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gallery/deeplink/f;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "a", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes13.dex */
public final class f implements com.avito.android.lib.beduin_v2.feature.launchclient.g {

    /* compiled from: OpenGalleryDeeplinkResultConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/gallery/deeplink/f$a;", "", "<init>", "()V", "", "KEY", "Ljava/lang/String;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Inject
    public f() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (!(bVar instanceof OpenGalleryDeeplink.b)) {
            return new com.avito.beduin.v2.interaction.launch.flow.j(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
        }
        OpenGalleryDeeplink.b bVar2 = (OpenGalleryDeeplink.b) bVar;
        if (bVar2 instanceof OpenGalleryDeeplink.b.C4653b) {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[]{new com.avito.beduin.v2.interaction.launch.flow.k("index", String.valueOf(((OpenGalleryDeeplink.b.C4653b) bVar).f159210b))};
        } else {
            if (!(bVar2 instanceof OpenGalleryDeeplink.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kVarArr = null;
        }
        if (kVarArr == null) {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new com.avito.beduin.v2.interaction.launch.flow.j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        if (!(bVar instanceof OpenGalleryDeeplink.b)) {
            return ResultStatus.f337440d;
        }
        OpenGalleryDeeplink.b bVar2 = (OpenGalleryDeeplink.b) bVar;
        if (bVar2 instanceof OpenGalleryDeeplink.b.C4653b) {
            return ResultStatus.f337439c;
        }
        if (bVar2 instanceof OpenGalleryDeeplink.b.a) {
            return ResultStatus.f337440d;
        }
        throw new NoWhenBranchMatchedException();
    }
}

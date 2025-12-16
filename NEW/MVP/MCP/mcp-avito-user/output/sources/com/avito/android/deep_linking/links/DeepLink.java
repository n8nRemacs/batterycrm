package com.avito.android.deep_linking.links;

import Iu.C14159a;
import aW.InterfaceC19825c;
import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: DeepLink.kt */
@InterfaceC19825c
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/p;", "<init>", "()V", "", "version$delegate", "Lkotlin/C;", "getVersion", "()I", "version", "", "path$delegate", "getPath", "()Ljava/lang/String;", "path", "Landroid/net/Uri;", "uri$delegate", "getUri", "()Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "_common_network-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeepLink implements Parcelable, p {

    /* renamed from: version$delegate, reason: from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C version = C42727D.c(new c());

    /* renamed from: path$delegate, reason: from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C path = C42727D.c(new a());

    /* renamed from: uri$delegate, reason: from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C uri = C42727D.c(new b());

    /* compiled from: DeepLink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<String> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final String invoke() {
            return com.avito.android.deep_linking.links.storage.a.f134018a.b(DeepLink.this.getClass());
        }
    }

    /* compiled from: DeepLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Uri> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Uri invoke() {
            Uri.Builder builderScheme = new Uri.Builder().scheme("ru.avito");
            DeepLink deepLink = DeepLink.this;
            return builderScheme.authority(String.valueOf(deepLink.getVersion())).path(deepLink.getPath()).build();
        }
    }

    /* compiled from: DeepLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            C14159a c14159a = com.avito.android.deep_linking.links.storage.a.f134018a.getClassesToMetaInfo().get(DeepLink.this.getClass());
            return Integer.valueOf(c14159a != null ? c14159a.f8594a : 1);
        }
    }

    @Y61.k
    public final String getPath() {
        return (String) this.path.getValue();
    }

    @Y61.k
    public final Uri getUri() {
        return (Uri) this.uri.getValue();
    }

    public final int getVersion() {
        return ((Number) this.version.getValue()).intValue();
    }
}

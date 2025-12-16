package ru.cyberity.input.infoproviders;

import Y61.k;
import Y61.l;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import ru.cyberity.input.tools.threading.safe.c;

/* compiled from: CodecInfoProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lru/cyberity/fingerprint/infoproviders/h;", "Lru/cyberity/fingerprint/infoproviders/g;", "", "Lru/cyberity/fingerprint/infoproviders/w;", "b", "a", "Landroid/media/MediaCodecList;", "Landroid/media/MediaCodecList;", "codecList", "<init>", "(Landroid/media/MediaCodecList;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final MediaCodecList codecList;

    /* compiled from: CodecInfoProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lru/cyberity/fingerprint/infoproviders/w;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<List<? extends w>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<w> invoke() {
            return h.this.b();
        }
    }

    public h(@l MediaCodecList mediaCodecList) {
        this.codecList = mediaCodecList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public final List<w> b() {
        String name;
        ?? arrayList;
        MediaCodecInfo[] codecInfos = this.codecList.getCodecInfos();
        ArrayList arrayList2 = new ArrayList(codecInfos.length);
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo == null || (name = mediaCodecInfo.getName()) == null) {
                name = "";
            }
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (supportedTypes != null) {
                arrayList = new ArrayList();
                for (String str : supportedTypes) {
                    arrayList.add(String.valueOf(str));
                }
            } else {
                arrayList = C42784z0.f406748b;
            }
            arrayList2.add(new w(name, arrayList));
        }
        return arrayList2;
    }

    @Override // ru.cyberity.input.infoproviders.g
    @k
    public List<w> a() {
        Object objA = c.a(0L, new a(), 1, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        int i12 = Z.f406624c;
        if (objA instanceof Z.b) {
            objA = c42784z0;
        }
        return (List) objA;
    }
}

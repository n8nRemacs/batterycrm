package DW0;

import aX0.C19831b;

/* compiled from: ImageOriginRequestListener.java */
/* loaded from: classes.dex */
public class f extends C19831b {

    /* renamed from: a, reason: collision with root package name */
    public String f3223a;

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public final e f3224b;

    public f(String str, @I41.h e eVar) {
        this.f3224b = eVar;
        this.f3223a = str;
    }

    @Override // aX0.C19831b, com.facebook.imagepipeline.producers.n0
    public final void c(String str, String str2, boolean z12) {
        int i12 = 7;
        e eVar = this.f3224b;
        if (eVar != null) {
            String str3 = this.f3223a;
            str2.getClass();
            switch (str2) {
                case "QualifiedResourceFetchProducer":
                case "LocalResourceFetchProducer":
                case "LocalFileFetchProducer":
                case "VideoThumbnailProducer":
                case "LocalAssetFetchProducer":
                case "DataFetchProducer":
                case "LocalContentUriThumbnailFetchProducer":
                case "LocalContentUriFetchProducer":
                    break;
                case "BitmapMemoryCacheGetProducer":
                case "BitmapMemoryCacheProducer":
                case "PostprocessedBitmapMemoryCacheProducer":
                    i12 = 5;
                    break;
                case "EncodedMemoryCacheProducer":
                    i12 = 4;
                    break;
                case "NetworkFetchProducer":
                    i12 = 2;
                    break;
                case "DiskCacheProducer":
                case "PartialDiskCacheProducer":
                    i12 = 3;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            eVar.a(i12, str3, str2, z12);
        }
    }
}

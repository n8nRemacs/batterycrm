package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.y;
import j.N;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: DecodePath.java */
/* loaded from: classes5.dex */
public class k<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<DataType> f339082a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends com.bumptech.glide.load.l<DataType, ResourceType>> f339083b;

    /* renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> f339084c;

    /* renamed from: d, reason: collision with root package name */
    public final y.a<List<Throwable>> f339085d;

    /* renamed from: e, reason: collision with root package name */
    public final String f339086e;

    /* compiled from: DecodePath.java */
    public interface a<ResourceType> {
    }

    public k(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.l<DataType, ResourceType>> list, com.bumptech.glide.load.resource.transcode.e<ResourceType, Transcode> eVar, y.a<List<Throwable>> aVar) {
        this.f339082a = cls;
        this.f339083b = list;
        this.f339084c = eVar;
        this.f339085d = aVar;
        this.f339086e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @N
    public final w<ResourceType> a(com.bumptech.glide.load.data.e<DataType> eVar, int i12, int i13, @N com.bumptech.glide.load.k kVar, List<Throwable> list) throws GlideException {
        List<? extends com.bumptech.glide.load.l<DataType, ResourceType>> list2 = this.f339083b;
        int size = list2.size();
        w<ResourceType> wVarB = null;
        for (int i14 = 0; i14 < size; i14++) {
            com.bumptech.glide.load.l<DataType, ResourceType> lVar = list2.get(i14);
            try {
                if (lVar.a(eVar.a(), kVar)) {
                    wVarB = lVar.b(eVar.a(), i12, i13, kVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e12) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(lVar);
                }
                list.add(e12);
            }
            if (wVarB != null) {
                break;
            }
        }
        if (wVarB != null) {
            return wVarB;
        }
        throw new GlideException(this.f339086e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f339082a + ", decoders=" + this.f339083b + ", transcoder=" + this.f339084c + '}';
    }
}

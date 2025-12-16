package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes10.dex */
public class o extends g<DocumentData> {

    /* compiled from: TextKeyframeAnimation.java */
    public class a extends com.airbnb.lottie.value.j<DocumentData> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.value.b f59354c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.value.j f59355d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ DocumentData f59356e;

        public a(com.airbnb.lottie.value.b bVar, com.airbnb.lottie.value.j jVar, DocumentData documentData) {
            this.f59354c = bVar;
            this.f59355d = jVar;
            this.f59356e = documentData;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
        @Override // com.airbnb.lottie.value.j
        public final DocumentData a(com.airbnb.lottie.value.b<DocumentData> bVar) {
            float f12 = bVar.f60149a;
            float f13 = bVar.f60150b;
            ?? r22 = bVar.f60151c.f59616a;
            ?? r32 = bVar.f60152d.f59616a;
            float f14 = bVar.f60153e;
            float f15 = bVar.f60154f;
            float f16 = bVar.f60155g;
            com.airbnb.lottie.value.b bVar2 = this.f59354c;
            bVar2.f60149a = f12;
            bVar2.f60150b = f13;
            bVar2.f60151c = r22;
            bVar2.f60152d = r32;
            bVar2.f60153e = f14;
            bVar2.f60154f = f15;
            bVar2.f60155g = f16;
            String str = (String) this.f59355d.f60158b;
            DocumentData documentData = bVar.f60154f == 1.0f ? bVar.f60152d : bVar.f60151c;
            String str2 = documentData.f59617b;
            float f17 = documentData.f59618c;
            DocumentData.Justification justification = documentData.f59619d;
            int i12 = documentData.f59620e;
            float f18 = documentData.f59621f;
            float f19 = documentData.f59622g;
            int i13 = documentData.f59623h;
            int i14 = documentData.f59624i;
            float f22 = documentData.f59625j;
            boolean z12 = documentData.f59626k;
            PointF pointF = documentData.f59627l;
            PointF pointF2 = documentData.f59628m;
            DocumentData documentData2 = this.f59356e;
            documentData2.f59616a = str;
            documentData2.f59617b = str2;
            documentData2.f59618c = f17;
            documentData2.f59619d = justification;
            documentData2.f59620e = i12;
            documentData2.f59621f = f18;
            documentData2.f59622g = f19;
            documentData2.f59623h = i13;
            documentData2.f59624i = i14;
            documentData2.f59625j = f22;
            documentData2.f59626k = z12;
            documentData2.f59627l = pointF;
            documentData2.f59628m = pointF2;
            return documentData2;
        }
    }

    public o() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    public final Object g(com.airbnb.lottie.value.a aVar, float f12) {
        T t12;
        com.airbnb.lottie.value.j<A> jVar = this.f59311e;
        T t13 = aVar.f60134b;
        if (jVar == 0) {
            return (f12 != 1.0f || (t12 = aVar.f60135c) == 0) ? (DocumentData) t13 : (DocumentData) t12;
        }
        Float f13 = aVar.f60140h;
        float fFloatValue = f13 == null ? Float.MAX_VALUE : f13.floatValue();
        DocumentData documentData = (DocumentData) t13;
        T t14 = aVar.f60135c;
        return (DocumentData) jVar.b(aVar.f60139g, fFloatValue, documentData, t14 == 0 ? documentData : (DocumentData) t14, f12, d(), this.f59310d);
    }

    public final void m(com.airbnb.lottie.value.j<String> jVar) {
        k(new a(new com.airbnb.lottie.value.b(), jVar, new DocumentData()));
    }
}

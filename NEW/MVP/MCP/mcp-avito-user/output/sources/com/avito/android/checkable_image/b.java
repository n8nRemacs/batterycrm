package com.avito.android.checkable_image;

import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.E;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class b implements E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f118068b;

    public /* synthetic */ b(Object obj, int i12) {
        this.f118067a = i12;
        this.f118068b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.airbnb.lottie.k] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.airbnb.lottie.k] */
    @Override // com.airbnb.lottie.E
    public final void onResult(Object obj) {
        switch (this.f118067a) {
            case 0:
                ((l0.h) this.f118068b).f406842b = (C27291k) obj;
                break;
            case 1:
                ((l0.h) this.f118068b).f406842b = (C27291k) obj;
                break;
            default:
                AnimationView.e.a aVar = new AnimationView.e.a((Throwable) obj);
                com.avito.android.lib.design.animation.d dVar = (com.avito.android.lib.design.animation.d) this.f118068b;
                AnimationView.e eVar = dVar.f178341c;
                dVar.f178341c = aVar;
                com.avito.android.lib.design.animation.a aVar2 = dVar.f178345g;
                if (aVar2 != null) {
                    aVar2.a(eVar, aVar);
                    break;
                }
                break;
        }
    }
}

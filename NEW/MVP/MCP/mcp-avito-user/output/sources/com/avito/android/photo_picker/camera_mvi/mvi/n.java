package com.avito.android.photo_picker.camera_mvi.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.a;
import com.avito.android.photo_picker.camera_mvi.mvi.entity.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CameraOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_picker/camera_mvi/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/a;", "Lcom/avito/android/photo_picker/camera_mvi/mvi/entity/b;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements t<com.avito.android.photo_picker.camera_mvi.mvi.entity.a, com.avito.android.photo_picker.camera_mvi.mvi.entity.b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final com.avito.android.photo_picker.camera_mvi.mvi.entity.b b(com.avito.android.photo_picker.camera_mvi.mvi.entity.a aVar) {
        com.avito.android.photo_picker.camera_mvi.mvi.entity.b jVar;
        com.avito.android.photo_picker.camera_mvi.mvi.entity.a aVar2 = aVar;
        if (aVar2 instanceof a.q) {
            return b.m.f219218a;
        }
        if (aVar2 instanceof a.k) {
            jVar = new b.g(((a.k) aVar2).f219192a);
        } else if (aVar2 instanceof a.c) {
            jVar = new b.C6588b(((a.c) aVar2).f219182a);
        } else if (aVar2 instanceof a.b) {
            jVar = new b.a(((a.b) aVar2).f219181a);
        } else if (aVar2 instanceof a.l) {
            a.l lVar = (a.l) aVar2;
            jVar = new b.i(lVar.f219193a, lVar.f219194b);
        } else {
            if (aVar2 instanceof a.p) {
                return b.k.f219216a;
            }
            if (aVar2 instanceof a.i) {
                return b.f.f219209a;
            }
            if (aVar2 instanceof a.h) {
                return b.e.f219208a;
            }
            if (aVar2 instanceof a.e) {
                return b.c.f219206a;
            }
            if (!(aVar2 instanceof a.d)) {
                if (aVar2 instanceof a.g) {
                    return b.l.f219217a;
                }
                if (aVar2 instanceof a.o) {
                    return b.h.f219211a;
                }
                if (aVar2 instanceof a.f) {
                    return b.d.f219207a;
                }
                return null;
            }
            a.d dVar = (a.d) aVar2;
            jVar = new b.j(dVar.f219184b, dVar.f219185c);
        }
        return jVar;
    }
}

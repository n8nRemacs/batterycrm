package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.photo_cache.q;
import com.avito.android.publish.C0;
import com.avito.android.publish.details.C33794u1;
import com.avito.android.publish.details.K1;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameterKt;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/photo_cache/q;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/photo_cache/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class L extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.photo_cache.q, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241146l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set<com.avito.android.category_parameters.j<? extends Slot<?>>> f241147m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f241148n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f241149o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(C34076c c34076c, Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set, Y41.a<G0> aVar, Y41.l<? super K1.C33667a, G0> lVar) {
        super(1);
        this.f241146l = c34076c;
        this.f241147m = set;
        this.f241148n = (kotlin.jvm.internal.N) aVar;
        this.f241149o = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(com.avito.android.photo_cache.q qVar) {
        com.avito.android.photo_cache.q qVar2 = qVar;
        C34076c c34076c = this.f241146l;
        PhotoParameter photoParameter = (PhotoParameter) c34076c.q().getFirstParameterOfType(PhotoParameter.class);
        boolean z12 = qVar2 instanceof q.c;
        ?? r32 = this.f241148n;
        ?? r42 = this.f241149o;
        Set<com.avito.android.category_parameters.j<? extends Slot<?>>> set = this.f241147m;
        C33794u1 c33794u1 = c34076c.f241195j;
        C0 c02 = c34076c.f241188c;
        if (z12) {
            if (c02.Be() && ((q.c) qVar2).f216338a.isEmpty()) {
                c34076c.f241194i.I();
            }
            if (photoParameter != null) {
                photoParameter.setValue(new PhotoParameter.ImageUploadListWrapper(C42745f0.E0(((q.c) qVar2).f216338a, PhotoParameterKt.maxPhotos(photoParameter))));
            }
            c33794u1.b(set, r32, r42);
        } else if (c02.Be()) {
            c34076c.x(r42, photoParameter);
        } else {
            c33794u1.b(set, r32, r42);
        }
        return G0.f406611a;
    }
}

package com.avito.android.image.enhancement;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ImageEnhanceViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/image/enhancement/h;", "it", "invoke", "(Lcom/avito/android/image/enhancement/h;)Lcom/avito/android/image/enhancement/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class G extends kotlin.jvm.internal.N implements Y41.l<C30977h, C30977h> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30977h f169337l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f169338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C30977h c30977h, ArrayList arrayList) {
        super(1);
        this.f169337l = c30977h;
        this.f169338m = arrayList;
    }

    @Override // Y41.l
    public final C30977h invoke(C30977h c30977h) {
        C30977h c30977h2 = c30977h;
        if (c30977h2 == null) {
            c30977h2 = this.f169337l;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(c30977h2.f169377e);
        linkedHashSetO0.addAll(this.f169338m);
        return C30977h.a(c30977h2, false, false, linkedHashSetO0, 15);
    }
}

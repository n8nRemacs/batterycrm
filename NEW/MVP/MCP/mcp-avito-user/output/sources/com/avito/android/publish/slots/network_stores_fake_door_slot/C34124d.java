package com.avito.android.publish.slots.network_stores_fake_door_slot;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InformationCard.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.slots.network_stores_fake_door_slot.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34124d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f244613l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UniversalImage f244614m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f244615n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f244616o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f244617p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34124d(String str, UniversalImage universalImage, boolean z12, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f244613l = str;
        this.f244614m = universalImage;
        this.f244615n = z12;
        this.f244616o = vVar;
        this.f244617p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f244617p | 1);
        g.a(this.f244613l, this.f244614m, this.f244615n, a12, iA2);
        return G0.f406611a;
    }
}

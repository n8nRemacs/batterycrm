package androidx.view;

import Y41.l;
import android.os.Bundle;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: NavController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/u;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/navigation/u;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23289G extends N implements l<C23395u, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f52778l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C23397v f52779m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C23317W f52780n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f52781o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23289G(l0.a aVar, C23397v c23397v, C23317W c23317w, Bundle bundle) {
        super(1);
        this.f52778l = aVar;
        this.f52779m = c23397v;
        this.f52780n = c23317w;
        this.f52781o = bundle;
    }

    @Override // Y41.l
    public final G0 invoke(C23395u c23395u) {
        this.f52778l.f406838b = true;
        boolean z12 = C23397v.f53198G;
        C42784z0 c42784z0 = C42784z0.f406748b;
        C23317W c23317w = this.f52780n;
        Bundle bundle = this.f52781o;
        this.f52779m.a(c23317w, bundle, c23395u, c42784z0);
        return G0.f406611a;
    }
}

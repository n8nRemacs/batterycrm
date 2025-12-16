package androidx.compose.material;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21220j5 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<androidx.compose.ui.unit.h> f33715l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33716m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f33717n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f33718o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21220j5(List list, androidx.compose.ui.v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f33715l = list;
        this.f33716m = vVar;
        this.f33717n = c22096n;
        this.f33718o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f33718o | 1);
        C22096n c22096n = this.f33717n;
        C21311q5.a(this.f33715l, this.f33716m, c22096n, a12, iA2);
        return kotlin.G0.f406611a;
    }
}

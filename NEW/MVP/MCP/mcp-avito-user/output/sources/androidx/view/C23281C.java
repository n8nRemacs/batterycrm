package androidx.view;

import Y41.l;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: NavController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/u;", "entry", "Lkotlin/G0;", "invoke", "(Landroidx/navigation/u;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23281C extends N implements l<C23395u, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.a f52762l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f52763m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.f f52764n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C23397v f52765o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bundle f52766p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23281C(l0.a aVar, ArrayList arrayList, l0.f fVar, C23397v c23397v, Bundle bundle) {
        super(1);
        this.f52762l = aVar;
        this.f52763m = arrayList;
        this.f52764n = fVar;
        this.f52765o = c23397v;
        this.f52766p = bundle;
    }

    @Override // Y41.l
    public final G0 invoke(C23395u c23395u) {
        List<C23395u> listSubList;
        C23395u c23395u2 = c23395u;
        this.f52762l.f406838b = true;
        ArrayList arrayList = this.f52763m;
        int iIndexOf = arrayList.indexOf(c23395u2);
        if (iIndexOf != -1) {
            l0.f fVar = this.f52764n;
            int i12 = iIndexOf + 1;
            listSubList = arrayList.subList(fVar.f406840b, i12);
            fVar.f406840b = i12;
        } else {
            listSubList = C42784z0.f406748b;
        }
        C23317W c23317w = c23395u2.f53182c;
        boolean z12 = C23397v.f53198G;
        this.f52765o.a(c23317w, this.f52766p, c23395u2, listSubList);
        return G0.f406611a;
    }
}

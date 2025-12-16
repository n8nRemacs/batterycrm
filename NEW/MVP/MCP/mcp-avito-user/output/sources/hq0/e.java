package HQ0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.q;
import kotlin.Metadata;

/* compiled from: AvitoRe23Theme.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHQ0/e;", "Lcom/avito/beduin/v2/theme/q;", "re23_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends q {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f7086a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f7087b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f7088c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f7089d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final IQ0.c f7090e;

    public e(@k b bVar, @k d dVar, @k c cVar, @k a aVar, @k IQ0.c cVar2) {
        this.f7086a = bVar;
        this.f7087b = dVar;
        this.f7088c = cVar;
        this.f7089d = aVar;
        this.f7090e = cVar2;
    }

    @Override // com.avito.beduin.v2.theme.q
    @l
    public final <T> T a(@k String str) {
        return (T) this.f7090e.a(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:787:0x0c37  */
    @Override // com.avito.beduin.v2.theme.q
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 3936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: HQ0.e.b(java.lang.String):java.lang.Object");
    }

    @Override // com.avito.beduin.v2.theme.q
    @k
    public final Object c(@k String str) {
        return this.f7086a.rf(str);
    }

    @Override // com.avito.beduin.v2.theme.q
    @k
    public final Object d(@k String str) {
        return this.f7087b.j4(str);
    }

    @Override // com.avito.beduin.v2.theme.q
    @k
    public final <T extends m> com.avito.beduin.v2.theme.c<T> e(@k String str) {
        return this.f7088c.t5(str);
    }
}

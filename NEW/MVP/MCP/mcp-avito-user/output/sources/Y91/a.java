package Y91;

import Y41.p;
import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class a extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public Context f19371q;

    /* renamed from: r, reason: collision with root package name */
    public Collection f19372r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f19373s;

    /* renamed from: t, reason: collision with root package name */
    public ru.mts.biometry.api.dataSource.a f19374t;

    /* renamed from: u, reason: collision with root package name */
    public Collection f19375u;

    /* renamed from: v, reason: collision with root package name */
    public int f19376v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f19377w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f19378x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f19379y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, List list, Context context, Continuation continuation) {
        super(2, continuation);
        this.f19377w = bVar;
        this.f19378x = list;
        this.f19379y = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f19377w, this.f19378x, this.f19379y, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:17:0x006e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f19376v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.C42729a0.b(r11)
            goto L8a
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            java.util.Collection r1 = r10.f19375u
            ru.mts.biometry.api.dataSource.a r4 = r10.f19374t
            java.util.Iterator r5 = r10.f19373s
            java.util.Collection r6 = r10.f19372r
            android.content.Context r7 = r10.f19371q
            kotlin.C42729a0.b(r11)
            goto L6e
        L29:
            kotlin.C42729a0.b(r11)
            Y91.b r11 = r10.f19377w
            ru.mts.biometry.api.dataSource.j r11 = r11.f19380a
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r4 = r10.f19378x
            r5 = 10
            int r5 = kotlin.collections.C42745f0.q(r4, r5)
            r1.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
            android.content.Context r5 = r10.f19379y
            r7 = r5
            r5 = r4
            r4 = r11
        L46:
            boolean r11 = r5.hasNext()
            r6 = 0
            if (r11 == 0) goto L75
            java.lang.Object r11 = r5.next()
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            r10.f19371q = r7
            r10.f19372r = r1
            r10.f19373s = r5
            r10.f19374t = r4
            r10.f19375u = r1
            r10.f19376v = r3
            kotlinx.coroutines.scheduling.b r8 = kotlinx.coroutines.C43262l0.f411947c
            Ba1.g r9 = new Ba1.g
            r9.<init>(r7, r11, r6)
            java.lang.Object r11 = kotlinx.coroutines.C43259k.g(r8, r9, r10)
            if (r11 != r0) goto L6d
            return r0
        L6d:
            r6 = r1
        L6e:
            java.io.File r11 = (java.io.File) r11
            r1.add(r11)
            r1 = r6
            goto L46
        L75:
            java.util.List r1 = (java.util.List) r1
            r10.f19371q = r6
            r10.f19372r = r6
            r10.f19373s = r6
            r10.f19374t = r6
            r10.f19375u = r6
            r10.f19376v = r2
            java.lang.Object r11 = r4.a(r1, r10)
            if (r11 != r0) goto L8a
            return r0
        L8a:
            C91.a r11 = C91.a.f2014a
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y91.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

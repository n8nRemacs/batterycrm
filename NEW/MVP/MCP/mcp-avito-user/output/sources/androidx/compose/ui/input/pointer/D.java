package androidx.compose.ui.input.pointer;

import androidx.collection.C20204c0;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PointerInputEventProcessor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/D;", "", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20204c0<a> f40132a = new C20204c0<>(0, 1, null);

    /* compiled from: PointerInputEventProcessor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/input/pointer/D$a;", "", "", "uptime", "Ll0/g;", "positionOnScreen", "", "down", "<init>", "(JJZLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f40133a;

        /* renamed from: b, reason: collision with root package name */
        public final long f40134b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f40135c;

        public a(long j12, long j13, boolean z12, C42822w c42822w) {
            this.f40133a = j12;
            this.f40134b = j13;
            this.f40135c = z12;
        }
    }

    @Y61.k
    public final C22333k a(@Y61.k E e12, @Y61.k AndroidComposeView androidComposeView) {
        boolean z12;
        long j12;
        long j13;
        ArrayList arrayList;
        int i12;
        int i13;
        ArrayList arrayList2 = e12.f40136a;
        C20204c0 c20204c0 = new C20204c0(arrayList2.size());
        int size = arrayList2.size();
        int i14 = 0;
        while (i14 < size) {
            F f12 = (F) arrayList2.get(i14);
            long j14 = f12.f40138a;
            C20204c0<a> c20204c02 = this.f40132a;
            a aVarF = c20204c02.f(j14);
            if (aVarF == null) {
                j13 = f12.f40139b;
                j12 = f12.f40141d;
                z12 = false;
            } else {
                long jM2 = androidComposeView.M(aVarF.f40134b);
                long j15 = aVarF.f40133a;
                z12 = aVarF.f40135c;
                j12 = jM2;
                j13 = j15;
            }
            long j16 = f12.f40147j;
            long j17 = f12.f40148k;
            long j18 = f12.f40138a;
            c20204c0.l(j18, new C(j18, f12.f40139b, f12.f40141d, f12.f40142e, f12.f40143f, j13, j12, z12, false, f12.f40144g, f12.f40146i, j16, j17, null));
            long j19 = f12.f40138a;
            boolean z13 = f12.f40142e;
            if (z13) {
                i13 = i14;
                arrayList = arrayList2;
                i12 = size;
                c20204c02.l(j19, new a(f12.f40139b, f12.f40140c, z13, null));
            } else {
                arrayList = arrayList2;
                i12 = size;
                i13 = i14;
                c20204c02.m(j19);
            }
            i14 = i13 + 1;
            arrayList2 = arrayList;
            size = i12;
        }
        return new C22333k(c20204c0, e12);
    }
}

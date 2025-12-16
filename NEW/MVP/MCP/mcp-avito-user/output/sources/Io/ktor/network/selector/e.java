package io.ktor.network.selector;

import io.ktor.network.selector.SelectInterest;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlinx.coroutines.InterfaceC43271q;

/* compiled from: InterestSuspensionsMap.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\u0003R$\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\t\u0010\u0007\u0012\u0004\b\n\u0010\u0003R$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u0012\u0004\b\f\u0010\u0003R$\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010\u0007\u0012\u0004\b\u000e\u0010\u0003¨\u0006\u0010"}, d2 = {"Lio/ktor/network/selector/e;", "", "<init>", "()V", "Lkotlinx/coroutines/q;", "Lkotlin/G0;", "readHandlerReference", "Lkotlinx/coroutines/q;", "getReadHandlerReference$annotations", "writeHandlerReference", "getWriteHandlerReference$annotations", "connectHandlerReference", "getConnectHandlerReference$annotations", "acceptHandlerReference", "getAcceptHandlerReference$annotations", "e", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C11414e f400168a = new C11414e(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final AtomicReferenceFieldUpdater<e, InterfaceC43271q<G0>>[] f400169b;

    @Y61.l
    private volatile InterfaceC43271q<? super G0> acceptHandlerReference;

    @Y61.l
    private volatile InterfaceC43271q<? super G0> connectHandlerReference;

    @Y61.l
    private volatile InterfaceC43271q<? super G0> readHandlerReference;

    @Y61.l
    private volatile InterfaceC43271q<? super G0> writeHandlerReference;

    /* compiled from: InterestSuspensionsMap.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/network/selector/e$e;", "", "<init>", "()V", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: io.ktor.network.selector.e$e, reason: collision with other inner class name */
    public static final class C11414e {
        public /* synthetic */ C11414e(C42822w c42822w) {
            this();
        }

        public C11414e() {
        }
    }

    /* compiled from: InterestSuspensionsMap.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class f {
        static {
            int[] iArr = new int[SelectInterest.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SelectInterest.a aVar = SelectInterest.f400131c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SelectInterest.a aVar2 = SelectInterest.f400131c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SelectInterest.a aVar3 = SelectInterest.f400131c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kotlin.reflect.c cVar;
        SelectInterest.f400131c.getClass();
        SelectInterest[] selectInterestArr = SelectInterest.f400132d;
        ArrayList arrayList = new ArrayList(selectInterestArr.length);
        for (SelectInterest selectInterest : selectInterestArr) {
            int iOrdinal = selectInterest.ordinal();
            if (iOrdinal == 0) {
                cVar = new Y() { // from class: io.ktor.network.selector.e.a
                    @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
                    public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                        ((e) obj).readHandlerReference = (InterfaceC43271q) obj2;
                    }

                    @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
                    @Y61.l
                    public final Object get(@Y61.l Object obj) {
                        return ((e) obj).readHandlerReference;
                    }
                };
            } else if (iOrdinal == 1) {
                cVar = new Y() { // from class: io.ktor.network.selector.e.b
                    @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
                    public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                        ((e) obj).writeHandlerReference = (InterfaceC43271q) obj2;
                    }

                    @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
                    @Y61.l
                    public final Object get(@Y61.l Object obj) {
                        return ((e) obj).writeHandlerReference;
                    }
                };
            } else if (iOrdinal == 2) {
                cVar = new Y() { // from class: io.ktor.network.selector.e.c
                    @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
                    public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                        ((e) obj).acceptHandlerReference = (InterfaceC43271q) obj2;
                    }

                    @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
                    @Y61.l
                    public final Object get(@Y61.l Object obj) {
                        return ((e) obj).acceptHandlerReference;
                    }
                };
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new Y() { // from class: io.ktor.network.selector.e.d
                    @Override // kotlin.jvm.internal.Y, kotlin.reflect.l
                    public final void e(@Y61.l Object obj, @Y61.l Object obj2) {
                        ((e) obj).connectHandlerReference = (InterfaceC43271q) obj2;
                    }

                    @Override // kotlin.jvm.internal.Y, kotlin.reflect.p
                    @Y61.l
                    public final Object get(@Y61.l Object obj) {
                        return ((e) obj).connectHandlerReference;
                    }
                };
            }
            arrayList.add(AtomicReferenceFieldUpdater.newUpdater(e.class, InterfaceC43271q.class, cVar.getF407039i()));
        }
        f400169b = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    @Y61.l
    public final InterfaceC43271q<G0> i(@Y61.k SelectInterest selectInterest) {
        f400168a.getClass();
        return f400169b[selectInterest.ordinal()].getAndSet(this, null);
    }

    @Y61.k
    public final String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
